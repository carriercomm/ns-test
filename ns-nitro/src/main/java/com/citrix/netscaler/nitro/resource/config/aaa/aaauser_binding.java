/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.aaa;

import com.citrix.netscaler.nitro.resource.config.aaa.aaauser_auditnslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaauser_vpnsessionpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaauser_authorizationpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaauser_intranetip_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaauser_auditsyslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaauser_aaagroup_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaauser_vpnurl_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaauser_vpntrafficpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaauser_vpnintranetapplication_binding;
import com.citrix.netscaler.nitro.resource.config.aaa.aaauser_tmsessionpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaauser_binding_response extends base_response
{
	public aaauser_binding[] aaauser_binding;
}
/**
	* Binding class showing the resources that can be bound to aaauser_binding. 
	*/

public class aaauser_binding extends base_resource
{
	private String username;
	private aaauser_auditnslogpolicy_binding	aaauser_auditnslogpolicy_binding[] = null;
	private aaauser_vpnsessionpolicy_binding	aaauser_vpnsessionpolicy_binding[] = null;
	private aaauser_authorizationpolicy_binding	aaauser_authorizationpolicy_binding[] = null;
	private aaauser_intranetip_binding	aaauser_intranetip_binding[] = null;
	private aaauser_auditsyslogpolicy_binding	aaauser_auditsyslogpolicy_binding[] = null;
	private aaauser_aaagroup_binding	aaauser_aaagroup_binding[] = null;
	private aaauser_vpnurl_binding	aaauser_vpnurl_binding[] = null;
	private aaauser_vpntrafficpolicy_binding	aaauser_vpntrafficpolicy_binding[] = null;
	private aaauser_vpnintranetapplication_binding	aaauser_vpnintranetapplication_binding[] = null;
	private aaauser_tmsessionpolicy_binding	aaauser_tmsessionpolicy_binding[] = null;

	/**
	* <pre>
	* The user name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_username(String username) throws Exception{
		this.username = username;
	}

	/**
	* <pre>
	* The user name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_username() throws Exception {
		return this.username;
	}

	/**
	* <pre>
	* intranetip that can be bound to aaauser.
	* </pre>
	*/
	public aaauser_intranetip_binding[] get_aaauser_intranetip_bindings() throws Exception {
		return this.aaauser_intranetip_binding;
	}

	/**
	* <pre>
	* auditsyslogpolicy that can be bound to aaauser.
	* </pre>
	*/
	public aaauser_auditsyslogpolicy_binding[] get_aaauser_auditsyslogpolicy_bindings() throws Exception {
		return this.aaauser_auditsyslogpolicy_binding;
	}

	/**
	* <pre>
	* vpnintranetapplication that can be bound to aaauser.
	* </pre>
	*/
	public aaauser_vpnintranetapplication_binding[] get_aaauser_vpnintranetapplication_bindings() throws Exception {
		return this.aaauser_vpnintranetapplication_binding;
	}

	/**
	* <pre>
	* authorizationpolicy that can be bound to aaauser.
	* </pre>
	*/
	public aaauser_authorizationpolicy_binding[] get_aaauser_authorizationpolicy_bindings() throws Exception {
		return this.aaauser_authorizationpolicy_binding;
	}

	/**
	* <pre>
	* vpnurl that can be bound to aaauser.
	* </pre>
	*/
	public aaauser_vpnurl_binding[] get_aaauser_vpnurl_bindings() throws Exception {
		return this.aaauser_vpnurl_binding;
	}

	/**
	* <pre>
	* vpntrafficpolicy that can be bound to aaauser.
	* </pre>
	*/
	public aaauser_vpntrafficpolicy_binding[] get_aaauser_vpntrafficpolicy_bindings() throws Exception {
		return this.aaauser_vpntrafficpolicy_binding;
	}

	/**
	* <pre>
	* aaagroup that can be bound to aaauser.
	* </pre>
	*/
	public aaauser_aaagroup_binding[] get_aaauser_aaagroup_bindings() throws Exception {
		return this.aaauser_aaagroup_binding;
	}

	/**
	* <pre>
	* vpnsessionpolicy that can be bound to aaauser.
	* </pre>
	*/
	public aaauser_vpnsessionpolicy_binding[] get_aaauser_vpnsessionpolicy_bindings() throws Exception {
		return this.aaauser_vpnsessionpolicy_binding;
	}

	/**
	* <pre>
	* tmsessionpolicy that can be bound to aaauser.
	* </pre>
	*/
	public aaauser_tmsessionpolicy_binding[] get_aaauser_tmsessionpolicy_bindings() throws Exception {
		return this.aaauser_tmsessionpolicy_binding;
	}

	/**
	* <pre>
	* auditnslogpolicy that can be bound to aaauser.
	* </pre>
	*/
	public aaauser_auditnslogpolicy_binding[] get_aaauser_auditnslogpolicy_bindings() throws Exception {
		return this.aaauser_auditnslogpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		aaauser_binding_response result = (aaauser_binding_response) service.get_payload_formatter().string_to_resource(aaauser_binding_response.class, response);
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
		return result.aaauser_binding;
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
	* Use this API to fetch aaauser_binding resource of given name .
	*/
	public static aaauser_binding get(nitro_service service, String username) throws Exception{
		aaauser_binding obj = new aaauser_binding();
		obj.set_username(username);
		aaauser_binding response = (aaauser_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch aaauser_binding resources of given names .
	*/
	public static aaauser_binding[] get(nitro_service service, String username[]) throws Exception{
		if (username !=null && username.length>0) {
			aaauser_binding response[] = new aaauser_binding[username.length];
			aaauser_binding obj[] = new aaauser_binding[username.length];
			for (int i=0;i<username.length;i++) {
				obj[i] = new aaauser_binding();
				obj[i].set_username(username[i]);
				response[i] = (aaauser_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}