/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.authentication;

import com.citrix.netscaler.nitro.resource.config.authentication.authenticationradiuspolicy_vpnvserver_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationradiuspolicy_systemglobal_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationradiuspolicy_authenticationvserver_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationradiuspolicy_vpnglobal_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authenticationradiuspolicy_binding_response extends base_response
{
	public authenticationradiuspolicy_binding[] authenticationradiuspolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to authenticationradiuspolicy_binding. 
	*/

public class authenticationradiuspolicy_binding extends base_resource
{
	private String name;
	private authenticationradiuspolicy_vpnvserver_binding	authenticationradiuspolicy_vpnvserver_binding[] = null;
	private authenticationradiuspolicy_systemglobal_binding	authenticationradiuspolicy_systemglobal_binding[] = null;
	private authenticationradiuspolicy_authenticationvserver_binding	authenticationradiuspolicy_authenticationvserver_binding[] = null;
	private authenticationradiuspolicy_vpnglobal_binding	authenticationradiuspolicy_vpnglobal_binding[] = null;

	/**
	* <pre>
	* The name of the policy. If no name is provided, all the configured RADIUS policies will be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the policy. If no name is provided, all the configured RADIUS policies will be displayed.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* authenticationvserver that can be bound to authenticationradiuspolicy.
	* </pre>
	*/
	public authenticationradiuspolicy_authenticationvserver_binding[] get_authenticationradiuspolicy_authenticationvserver_bindings() throws Exception {
		return this.authenticationradiuspolicy_authenticationvserver_binding;
	}

	/**
	* <pre>
	* vpnglobal that can be bound to authenticationradiuspolicy.
	* </pre>
	*/
	public authenticationradiuspolicy_vpnglobal_binding[] get_authenticationradiuspolicy_vpnglobal_bindings() throws Exception {
		return this.authenticationradiuspolicy_vpnglobal_binding;
	}

	/**
	* <pre>
	* systemglobal that can be bound to authenticationradiuspolicy.
	* </pre>
	*/
	public authenticationradiuspolicy_systemglobal_binding[] get_authenticationradiuspolicy_systemglobal_bindings() throws Exception {
		return this.authenticationradiuspolicy_systemglobal_binding;
	}

	/**
	* <pre>
	* vpnvserver that can be bound to authenticationradiuspolicy.
	* </pre>
	*/
	public authenticationradiuspolicy_vpnvserver_binding[] get_authenticationradiuspolicy_vpnvserver_bindings() throws Exception {
		return this.authenticationradiuspolicy_vpnvserver_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationradiuspolicy_binding_response result = (authenticationradiuspolicy_binding_response) service.get_payload_formatter().string_to_resource(authenticationradiuspolicy_binding_response.class, response);
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
		return result.authenticationradiuspolicy_binding;
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
	* Use this API to fetch authenticationradiuspolicy_binding resource of given name .
	*/
	public static authenticationradiuspolicy_binding get(nitro_service service, String name) throws Exception{
		authenticationradiuspolicy_binding obj = new authenticationradiuspolicy_binding();
		obj.set_name(name);
		authenticationradiuspolicy_binding response = (authenticationradiuspolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationradiuspolicy_binding resources of given names .
	*/
	public static authenticationradiuspolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationradiuspolicy_binding response[] = new authenticationradiuspolicy_binding[name.length];
			authenticationradiuspolicy_binding obj[] = new authenticationradiuspolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationradiuspolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (authenticationradiuspolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}