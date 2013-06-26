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

import com.citrix.netscaler.nitro.resource.config.authentication.authenticationlocalpolicy_vpnvserver_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationlocalpolicy_systemglobal_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationlocalpolicy_authenticationvserver_binding;
import com.citrix.netscaler.nitro.resource.config.authentication.authenticationlocalpolicy_vpnglobal_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authenticationlocalpolicy_binding_response extends base_response
{
	public authenticationlocalpolicy_binding[] authenticationlocalpolicy_binding;
}
/**
	* Binding class showing the resources that can be bound to authenticationlocalpolicy_binding. 
	*/

public class authenticationlocalpolicy_binding extends base_resource
{
	private String name;
	private authenticationlocalpolicy_vpnvserver_binding	authenticationlocalpolicy_vpnvserver_binding[] = null;
	private authenticationlocalpolicy_systemglobal_binding	authenticationlocalpolicy_systemglobal_binding[] = null;
	private authenticationlocalpolicy_authenticationvserver_binding	authenticationlocalpolicy_authenticationvserver_binding[] = null;
	private authenticationlocalpolicy_vpnglobal_binding	authenticationlocalpolicy_vpnglobal_binding[] = null;

	/**
	* <pre>
	* The name of the policy. If a name is not provided, all the configured LOCAL policies will be displayed.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the policy. If a name is not provided, all the configured LOCAL policies will be displayed.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* vpnvserver that can be bound to authenticationlocalpolicy.
	* </pre>
	*/
	public authenticationlocalpolicy_vpnvserver_binding[] get_authenticationlocalpolicy_vpnvserver_bindings() throws Exception {
		return this.authenticationlocalpolicy_vpnvserver_binding;
	}

	/**
	* <pre>
	* vpnglobal that can be bound to authenticationlocalpolicy.
	* </pre>
	*/
	public authenticationlocalpolicy_vpnglobal_binding[] get_authenticationlocalpolicy_vpnglobal_bindings() throws Exception {
		return this.authenticationlocalpolicy_vpnglobal_binding;
	}

	/**
	* <pre>
	* systemglobal that can be bound to authenticationlocalpolicy.
	* </pre>
	*/
	public authenticationlocalpolicy_systemglobal_binding[] get_authenticationlocalpolicy_systemglobal_bindings() throws Exception {
		return this.authenticationlocalpolicy_systemglobal_binding;
	}

	/**
	* <pre>
	* authenticationvserver that can be bound to authenticationlocalpolicy.
	* </pre>
	*/
	public authenticationlocalpolicy_authenticationvserver_binding[] get_authenticationlocalpolicy_authenticationvserver_bindings() throws Exception {
		return this.authenticationlocalpolicy_authenticationvserver_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationlocalpolicy_binding_response result = (authenticationlocalpolicy_binding_response) service.get_payload_formatter().string_to_resource(authenticationlocalpolicy_binding_response.class, response);
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
		return result.authenticationlocalpolicy_binding;
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
	* Use this API to fetch authenticationlocalpolicy_binding resource of given name .
	*/
	public static authenticationlocalpolicy_binding get(nitro_service service, String name) throws Exception{
		authenticationlocalpolicy_binding obj = new authenticationlocalpolicy_binding();
		obj.set_name(name);
		authenticationlocalpolicy_binding response = (authenticationlocalpolicy_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationlocalpolicy_binding resources of given names .
	*/
	public static authenticationlocalpolicy_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationlocalpolicy_binding response[] = new authenticationlocalpolicy_binding[name.length];
			authenticationlocalpolicy_binding obj[] = new authenticationlocalpolicy_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationlocalpolicy_binding();
				obj[i].set_name(name[i]);
				response[i] = (authenticationlocalpolicy_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}