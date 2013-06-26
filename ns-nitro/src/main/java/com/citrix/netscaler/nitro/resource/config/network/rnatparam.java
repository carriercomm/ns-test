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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class rnatparam_response extends base_response
{
	public rnatparam rnatparam;
}
/**
* Configuration for RNAT parameter resource.
*/

public class rnatparam extends base_resource
{
	private String tcpproxy;

	/**
	* <pre>
	* The state of tcpproxy.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_tcpproxy(String tcpproxy) throws Exception{
		this.tcpproxy = tcpproxy;
	}

	/**
	* <pre>
	* The state of tcpproxy.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_tcpproxy() throws Exception {
		return this.tcpproxy;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		rnatparam[] resources = new rnatparam[1];
		rnatparam_response result = (rnatparam_response) service.get_payload_formatter().string_to_resource(rnatparam_response.class, response);
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
		resources[0] = result.rnatparam;
		return resources;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to update rnatparam.
	*/
	public static base_response update(nitro_service client, rnatparam resource) throws Exception {
		rnatparam updateresource = new rnatparam();
		updateresource.tcpproxy = resource.tcpproxy;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of rnatparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, rnatparam resource, String[] args) throws Exception{
		rnatparam unsetresource = new rnatparam();
		unsetresource.tcpproxy = resource.tcpproxy;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the rnatparam resources that are configured on netscaler.
	*/
	public static rnatparam get(nitro_service service) throws Exception{
		rnatparam obj = new rnatparam();
		rnatparam[] response = (rnatparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the rnatparam resources that are configured on netscaler.
	*/
	public static rnatparam get(nitro_service service,  options option) throws Exception{
		rnatparam obj = new rnatparam();
		rnatparam[] response = (rnatparam[])obj.get_resources(service,option);
		return response[0];
	}

	public static class tcpproxyEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
