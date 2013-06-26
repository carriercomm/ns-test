/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.cr;

import com.citrix.netscaler.nitro.resource.config.cr.crvserver_filterpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.cr.crvserver_cmppolicy_binding;
import com.citrix.netscaler.nitro.resource.config.cr.crvserver_policymap_binding;
import com.citrix.netscaler.nitro.resource.config.cr.crvserver_cspolicy_binding;
import com.citrix.netscaler.nitro.resource.config.cr.crvserver_crpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class crvserver_binding_response extends base_response
{
	public crvserver_binding[] crvserver_binding;
}
/**
	* Binding class showing the resources that can be bound to crvserver_binding. 
	*/

public class crvserver_binding extends base_resource
{
	private String name;
	private crvserver_filterpolicy_binding	crvserver_filterpolicy_binding[] = null;
	private crvserver_cmppolicy_binding	crvserver_cmppolicy_binding[] = null;
	private crvserver_policymap_binding	crvserver_policymap_binding[] = null;
	private crvserver_cspolicy_binding	crvserver_cspolicy_binding[] = null;
	private crvserver_crpolicy_binding	crvserver_crpolicy_binding[] = null;

	/**
	* <pre>
	* The name of the cache redirection virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the cache redirection virtual server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* policymap that can be bound to crvserver.
	* </pre>
	*/
	public crvserver_policymap_binding[] get_crvserver_policymap_bindings() throws Exception {
		return this.crvserver_policymap_binding;
	}

	/**
	* <pre>
	* filterpolicy that can be bound to crvserver.
	* </pre>
	*/
	public crvserver_filterpolicy_binding[] get_crvserver_filterpolicy_bindings() throws Exception {
		return this.crvserver_filterpolicy_binding;
	}

	/**
	* <pre>
	* cmppolicy that can be bound to crvserver.
	* </pre>
	*/
	public crvserver_cmppolicy_binding[] get_crvserver_cmppolicy_bindings() throws Exception {
		return this.crvserver_cmppolicy_binding;
	}

	/**
	* <pre>
	* cspolicy that can be bound to crvserver.
	* </pre>
	*/
	public crvserver_cspolicy_binding[] get_crvserver_cspolicy_bindings() throws Exception {
		return this.crvserver_cspolicy_binding;
	}

	/**
	* <pre>
	* crpolicy that can be bound to crvserver.
	* </pre>
	*/
	public crvserver_crpolicy_binding[] get_crvserver_crpolicy_bindings() throws Exception {
		return this.crvserver_crpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		crvserver_binding_response result = (crvserver_binding_response) service.get_payload_formatter().string_to_resource(crvserver_binding_response.class, response);
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
		return result.crvserver_binding;
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
	* Use this API to fetch crvserver_binding resource of given name .
	*/
	public static crvserver_binding get(nitro_service service, String name) throws Exception{
		crvserver_binding obj = new crvserver_binding();
		obj.set_name(name);
		crvserver_binding response = (crvserver_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch crvserver_binding resources of given names .
	*/
	public static crvserver_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			crvserver_binding response[] = new crvserver_binding[name.length];
			crvserver_binding obj[] = new crvserver_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new crvserver_binding();
				obj[i].set_name(name[i]);
				response[i] = (crvserver_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}