/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.network;

import com.citrix.netscaler.nitro.resource.config.network.netbridge_iptunnel_binding;
import com.citrix.netscaler.nitro.resource.config.network.netbridge_vlan_binding;
import com.citrix.netscaler.nitro.resource.config.network.netbridge_nsip_binding;
import com.citrix.netscaler.nitro.resource.config.network.netbridge_nsip6_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class netbridge_binding_response extends base_response
{
	public netbridge_binding[] netbridge_binding;
}
/**
	* Binding class showing the resources that can be bound to netbridge_binding. 
	*/

public class netbridge_binding extends base_resource
{
	private String name;
	private netbridge_iptunnel_binding	netbridge_iptunnel_binding[] = null;
	private netbridge_vlan_binding	netbridge_vlan_binding[] = null;
	private netbridge_nsip_binding	netbridge_nsip_binding[] = null;
	private netbridge_nsip6_binding	netbridge_nsip6_binding[] = null;

	/**
	* <pre>
	* The name of the network bridge.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the network bridge.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* nsip6 that can be bound to netbridge.
	* </pre>
	*/
	public netbridge_nsip6_binding[] get_netbridge_nsip6_bindings() throws Exception {
		return this.netbridge_nsip6_binding;
	}

	/**
	* <pre>
	* iptunnel that can be bound to netbridge.
	* </pre>
	*/
	public netbridge_iptunnel_binding[] get_netbridge_iptunnel_bindings() throws Exception {
		return this.netbridge_iptunnel_binding;
	}

	/**
	* <pre>
	* vlan that can be bound to netbridge.
	* </pre>
	*/
	public netbridge_vlan_binding[] get_netbridge_vlan_bindings() throws Exception {
		return this.netbridge_vlan_binding;
	}

	/**
	* <pre>
	* nsip that can be bound to netbridge.
	* </pre>
	*/
	public netbridge_nsip_binding[] get_netbridge_nsip_bindings() throws Exception {
		return this.netbridge_nsip_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		netbridge_binding_response result = (netbridge_binding_response) service.get_payload_formatter().string_to_resource(netbridge_binding_response.class, response);
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
		return result.netbridge_binding;
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
	* Use this API to fetch netbridge_binding resource of given name .
	*/
	public static netbridge_binding get(nitro_service service, String name) throws Exception{
		netbridge_binding obj = new netbridge_binding();
		obj.set_name(name);
		netbridge_binding response = (netbridge_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch netbridge_binding resources of given names .
	*/
	public static netbridge_binding[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			netbridge_binding response[] = new netbridge_binding[name.length];
			netbridge_binding obj[] = new netbridge_binding[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new netbridge_binding();
				obj[i].set_name(name[i]);
				response[i] = (netbridge_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}