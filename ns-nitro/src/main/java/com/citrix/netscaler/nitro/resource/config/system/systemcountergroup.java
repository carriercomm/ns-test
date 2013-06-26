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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class systemcountergroup_response extends base_response
{
	public systemcountergroup systemcountergroup;
}
/**
* Configuration for counter group resource.
*/

public class systemcountergroup extends base_resource
{
	private String datasource;

	//------- Read only Parameter ---------;

	private String response;

	/**
	* <pre>
	* Specify Data source name.
	* </pre>
	*/
	public void set_datasource(String datasource) throws Exception{
		this.datasource = datasource;
	}

	/**
	* <pre>
	* Specify Data source name.
	* </pre>
	*/
	public String get_datasource() throws Exception {
		return this.datasource;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_response() throws Exception {
		return this.response;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		systemcountergroup[] resources = new systemcountergroup[1];
		systemcountergroup_response result = (systemcountergroup_response) service.get_payload_formatter().string_to_resource(systemcountergroup_response.class, response);
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
		resources[0] = result.systemcountergroup;
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
	* Use this API to fetch all the systemcountergroup resources that are configured on netscaler.
	*/
	public static systemcountergroup get(nitro_service service) throws Exception{
		systemcountergroup obj = new systemcountergroup();
		systemcountergroup[] response = (systemcountergroup[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the systemcountergroup resources that are configured on netscaler.
	*/
	public static systemcountergroup get(nitro_service service,  options option) throws Exception{
		systemcountergroup obj = new systemcountergroup();
		systemcountergroup[] response = (systemcountergroup[])obj.get_resources(service,option);
		return response[0];
	}

	/**
	* Use this API to fetch all the systemcountergroup resources that are configured on netscaler.
	* This uses systemcountergroup_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static systemcountergroup[] get(nitro_service service, systemcountergroup_args args) throws Exception{
		systemcountergroup obj = new systemcountergroup();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		systemcountergroup[] response = (systemcountergroup[])obj.get_resources(service, option);
		return response;
	}

}
