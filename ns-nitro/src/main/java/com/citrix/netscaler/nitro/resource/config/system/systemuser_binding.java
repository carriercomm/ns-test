/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.system;

import com.citrix.netscaler.nitro.resource.config.system.systemuser_systemgroup_binding;
import com.citrix.netscaler.nitro.resource.config.system.systemuser_systemcmdpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class systemuser_binding_response extends base_response
{
	public systemuser_binding[] systemuser_binding;
}
/**
	* Binding class showing the resources that can be bound to systemuser_binding. 
	*/

public class systemuser_binding extends base_resource
{
	private String username;
	private systemuser_systemgroup_binding	systemuser_systemgroup_binding[] = null;
	private systemuser_systemcmdpolicy_binding	systemuser_systemcmdpolicy_binding[] = null;

	/**
	* <pre>
	* The name of a system user.<br> Minimum length =  1
	* </pre>
	*/
	public void set_username(String username) throws Exception{
		this.username = username;
	}

	/**
	* <pre>
	* The name of a system user.<br> Minimum length =  1
	* </pre>
	*/
	public String get_username() throws Exception {
		return this.username;
	}

	/**
	* <pre>
	* systemgroup that can be bound to systemuser.
	* </pre>
	*/
	public systemuser_systemgroup_binding[] get_systemuser_systemgroup_bindings() throws Exception {
		return this.systemuser_systemgroup_binding;
	}

	/**
	* <pre>
	* systemcmdpolicy that can be bound to systemuser.
	* </pre>
	*/
	public systemuser_systemcmdpolicy_binding[] get_systemuser_systemcmdpolicy_bindings() throws Exception {
		return this.systemuser_systemcmdpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		systemuser_binding_response result = (systemuser_binding_response) service.get_payload_formatter().string_to_resource(systemuser_binding_response.class, response);
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
		return result.systemuser_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.username;
	}

	/**
	* Use this API to fetch systemuser_binding resource of given name .
	*/
	public static systemuser_binding get(nitro_service service, String username) throws Exception{
		systemuser_binding obj = new systemuser_binding();
		obj.set_username(username);
		systemuser_binding response = (systemuser_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch systemuser_binding resources of given names .
	*/
	public static systemuser_binding[] get(nitro_service service, String username[]) throws Exception{
		if (username !=null && username.length>0) {
			systemuser_binding response[] = new systemuser_binding[username.length];
			systemuser_binding obj[] = new systemuser_binding[username.length];
			for (int i=0;i<username.length;i++) {
				obj[i] = new systemuser_binding();
				obj[i].set_username(username[i]);
				response[i] = (systemuser_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}