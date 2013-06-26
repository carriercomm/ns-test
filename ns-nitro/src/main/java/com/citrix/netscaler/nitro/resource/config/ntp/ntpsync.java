/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.ntp;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class ntpsync_response extends base_response
{
	public ntpsync ntpsync;
}
/**
* Configuration for NTP sync resource.
*/

public class ntpsync extends base_resource
{

	//------- Read only Parameter ---------;

	private String state;

	/**
	* <pre>
	* Show NTP status.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		ntpsync[] resources = new ntpsync[1];
		ntpsync_response result = (ntpsync_response) service.get_payload_formatter().string_to_resource(ntpsync_response.class, response);
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
		resources[0] = result.ntpsync;
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
	* Use this API to enable ntpsync.
	*/
	public static base_response enable(nitro_service client) throws Exception {
		ntpsync enableresource = new ntpsync();
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to disable ntpsync.
	*/
	public static base_response disable(nitro_service client) throws Exception {
		ntpsync disableresource = new ntpsync();
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to fetch all the ntpsync resources that are configured on netscaler.
	*/
	public static ntpsync get(nitro_service service) throws Exception{
		ntpsync obj = new ntpsync();
		ntpsync[] response = (ntpsync[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the ntpsync resources that are configured on netscaler.
	*/
	public static ntpsync get(nitro_service service,  options option) throws Exception{
		ntpsync obj = new ntpsync();
		ntpsync[] response = (ntpsync[])obj.get_resources(service,option);
		return response[0];
	}

	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
