/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.transform;

import com.citrix.netscaler.nitro.resource.config.transform.transformprofile_transformaction_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class transformprofile_binding_response extends base_response
{
	public transformprofile_binding[] transformprofile_binding;
}
/**
	* Binding class showing the resources that can be bound to transformprofile_binding. 
	*/

public class transformprofile_binding extends base_resource
{
	private String name;
	private transformprofile_transformaction_binding	transformprofile_transformaction_binding[] = null;

	/**
	* <pre>
	* URL Transformation profile name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* URL Transformation profile name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* transformaction that can be bound to transformprofile.
	* </pre>
	*/
	public transformprofile_transformaction_binding[] get_transformprofile_transformaction_bindings() throws Exception {
		return this.transformprofile_transformaction_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		transformprofile_binding_response result = (transformprofile_binding_response) service.get_payload_formatter().string_to_resource(transformprofile_binding_response.class, response);
		if(result.errorcode != 0) {
			if (result.errorcode == 444) {
				service.clear_session();
			}
			if(result.severity != null)
			{
				if (result.severity.equals("ERROR"))
					throw new nitro_exception(result.message,result.errorcode);
			}
			else
			{
				throw new nitro_exception(result.message,result.errorcode);
			}
		}
		return result.transformprofile_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to fetch transformprofile_binding resource of given name .
	*/
	public static transformprofile_binding get(nitro_service service, String name) throws Exception{
		transformprofile_binding obj = new transformprofile_binding();
		obj.set_name(name);
		transformprofile_binding response = (transformprofile_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch transformprofile_binding resources of given names .
	*/
	public static transformprofile_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			transformprofile_binding response[] = new transformprofile_binding[name.length];
			transformprofile_binding obj[] = new transformprofile_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new transformprofile_binding();
				obj[i].set_name(name[i]);
				response[i] = (transformprofile_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}