/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.tm;

import com.citrix.netscaler.nitro.resource.config.tm.tmtrafficpolicy_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.tm.tmtrafficpolicy_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.config.tm.tmtrafficpolicy_tmglobal_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class tmtrafficpolicy_binding_response extends base_response
{
	public tmtrafficpolicy_binding[] tmtrafficpolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to tmtrafficpolicy_binding. 
	*/

public class tmtrafficpolicy_binding extends base_resource
{
	private String name;
	private tmtrafficpolicy_csvserver_binding	tmtrafficpolicy_csvserver_binding[] = null;
	private tmtrafficpolicy_lbvserver_binding	tmtrafficpolicy_lbvserver_binding[] = null;
	private tmtrafficpolicy_tmglobal_binding	tmtrafficpolicy_tmglobal_binding[] = null;

	/**
	* <pre>
	* The name of the vpn trafiic policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the vpn trafiic policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* csvserver that can be bound to tmtrafficpolicy.
	* </pre>
	*/
	public tmtrafficpolicy_csvserver_binding[] get_tmtrafficpolicy_csvserver_bindings() throws Exception {
		return this.tmtrafficpolicy_csvserver_binding;
	}

	/**
	* <pre>
	* lbvserver that can be bound to tmtrafficpolicy.
	* </pre>
	*/
	public tmtrafficpolicy_lbvserver_binding[] get_tmtrafficpolicy_lbvserver_bindings() throws Exception {
		return this.tmtrafficpolicy_lbvserver_binding;
	}

	/**
	* <pre>
	* tmglobal that can be bound to tmtrafficpolicy.
	* </pre>
	*/
	public tmtrafficpolicy_tmglobal_binding[] get_tmtrafficpolicy_tmglobal_bindings() throws Exception {
		return this.tmtrafficpolicy_tmglobal_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		tmtrafficpolicy_binding_response result = (tmtrafficpolicy_binding_response) service.get_payload_formatter().string_to_resource(tmtrafficpolicy_binding_response.class, response);
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
		return result.tmtrafficpolicy_binding;
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
	* Use this API to fetch tmtrafficpolicy_binding resource of given name .
	*/
	public static tmtrafficpolicy_binding get(nitro_service service, String name) throws Exception{
		tmtrafficpolicy_binding obj = new tmtrafficpolicy_binding();
		obj.set_name(name);
		tmtrafficpolicy_binding response = (tmtrafficpolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch tmtrafficpolicy_binding resources of given names .
	*/
	public static tmtrafficpolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			tmtrafficpolicy_binding response[] = new tmtrafficpolicy_binding[name.length];
			tmtrafficpolicy_binding obj[] = new tmtrafficpolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new tmtrafficpolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (tmtrafficpolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}