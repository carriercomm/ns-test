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

class systemdatasource_response extends base_response
{
	public systemdatasource systemdatasource;
}
/**
* Configuration for historical datasource resource.
*/

public class systemdatasource extends base_resource
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
		systemdatasource[] resources = new systemdatasource[1];
		systemdatasource_response result = (systemdatasource_response) service.get_payload_formatter().string_to_resource(systemdatasource_response.class, response);
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
		resources[0] = result.systemdatasource;
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
	* Use this API to fetch all the systemdatasource resources that are configured on netscaler.
	*/
	public static systemdatasource get(nitro_service service) throws Exception{
		systemdatasource obj = new systemdatasource();
		systemdatasource[] response = (systemdatasource[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the systemdatasource resources that are configured on netscaler.
	*/
	public static systemdatasource get(nitro_service service,  options option) throws Exception{
		systemdatasource obj = new systemdatasource();
		systemdatasource[] response = (systemdatasource[])obj.get_resources(service,option);
		return response[0];
	}

	/**
	* Use this API to fetch all the systemdatasource resources that are configured on netscaler.
	* This uses systemdatasource_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static systemdatasource[] get(nitro_service service, systemdatasource_args args) throws Exception{
		systemdatasource obj = new systemdatasource();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		systemdatasource[] response = (systemdatasource[])obj.get_resources(service, option);
		return response;
	}

}
