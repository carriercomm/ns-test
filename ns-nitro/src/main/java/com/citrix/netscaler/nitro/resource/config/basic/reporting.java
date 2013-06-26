/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.basic;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class reporting_response extends base_response
{
	public reporting reporting;
}
/**
* Configuration for reporting resource.
*/

public class reporting extends base_resource
{

	//------- Read only Parameter ---------;

	private String state;

	/**
	* <pre>
	* The rule associated with the entity.<br> Possible values = ENABLED, DISABLED
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
		reporting[] resources = new reporting[1];
		reporting_response result = (reporting_response) service.get_payload_formatter().string_to_resource(reporting_response.class, response);
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
		resources[0] = result.reporting;
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
	* Use this API to enable reporting.
	*/
	public static base_response enable(nitro_service client) throws Exception {
		reporting enableresource = new reporting();
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to disable reporting.
	*/
	public static base_response disable(nitro_service client) throws Exception {
		reporting disableresource = new reporting();
		return disableresource.perform_operation(client,"disable");
	}

	/**
	* Use this API to fetch all the reporting resources that are configured on netscaler.
	*/
	public static reporting get(nitro_service service) throws Exception{
		reporting obj = new reporting();
		reporting[] response = (reporting[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the reporting resources that are configured on netscaler.
	*/
	public static reporting get(nitro_service service,  options option) throws Exception{
		reporting obj = new reporting();
		reporting[] response = (reporting[])obj.get_resources(service,option);
		return response[0];
	}

	public static class stateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
