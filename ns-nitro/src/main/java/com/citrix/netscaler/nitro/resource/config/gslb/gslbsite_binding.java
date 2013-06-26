/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.gslb;

import com.citrix.netscaler.nitro.resource.config.gslb.gslbsite_gslbservice_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class gslbsite_binding_response extends base_response
{
	public gslbsite_binding[] gslbsite_binding;
}
/**
	* Binding class showing the resources that can be bound to gslbsite_binding. 
	*/

public class gslbsite_binding extends base_resource
{
	private String sitename;
	private gslbsite_gslbservice_binding	gslbsite_gslbservice_binding[] = null;

	/**
	* <pre>
	* The name of the site. If sitename is specified, all the services created under that site will be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_sitename(String sitename) throws Exception{
		this.sitename = sitename;
	}

	/**
	* <pre>
	* The name of the site. If sitename is specified, all the services created under that site will be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_sitename() throws Exception {
		return this.sitename;
	}

	/**
	* <pre>
	* gslbservice that can be bound to gslbsite.
	* </pre>
	*/
	public gslbsite_gslbservice_binding[] get_gslbsite_gslbservice_bindings() throws Exception {
		return this.gslbsite_gslbservice_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		gslbsite_binding_response result = (gslbsite_binding_response) service.get_payload_formatter().string_to_resource(gslbsite_binding_response.class, response);
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
		return result.gslbsite_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.sitename;
	}

	/**
	* Use this API to fetch gslbsite_binding resource of given name .
	*/
	public static gslbsite_binding get(nitro_service service, String sitename) throws Exception{
		gslbsite_binding obj = new gslbsite_binding();
		obj.set_sitename(sitename);
		gslbsite_binding response = (gslbsite_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch gslbsite_binding resources of given names .
	*/
	public static gslbsite_binding[] get(nitro_service service, String sitename[]) throws Exception{
		if (sitename !=null && sitename.length>0) {
			gslbsite_binding response[] = new gslbsite_binding[sitename.length];
			gslbsite_binding obj[] = new gslbsite_binding[sitename.length];
			for (int i=0;i<sitename.length;i++) {
				obj[i] = new gslbsite_binding();
				obj[i].set_sitename(sitename[i]);
				response[i] = (gslbsite_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}