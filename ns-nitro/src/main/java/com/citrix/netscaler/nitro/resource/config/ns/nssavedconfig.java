/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nssavedconfig_response extends base_response
{
	public nssavedconfig nssavedconfig;
}
/**
* Configuration for last saved configuration resource.
*/

public class nssavedconfig extends base_resource
{

	//------- Read only Parameter ---------;

	private String textblob;

	/**
	* <pre>
	* Text of the last saved configuration.
	* </pre>
	*/
	public String get_textblob() throws Exception {
		return this.textblob;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nssavedconfig[] resources = new nssavedconfig[1];
		nssavedconfig_response result = (nssavedconfig_response) service.get_payload_formatter().string_to_resource(nssavedconfig_response.class, response);
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
		resources[0] = result.nssavedconfig;
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
	* Use this API to fetch all the nssavedconfig resources that are configured on netscaler.
	*/
	public static nssavedconfig get(nitro_service service) throws Exception{
		nssavedconfig obj = new nssavedconfig();
		nssavedconfig[] response = (nssavedconfig[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nssavedconfig resources that are configured on netscaler.
	*/
	public static nssavedconfig get(nitro_service service,  options option) throws Exception{
		nssavedconfig obj = new nssavedconfig();
		nssavedconfig[] response = (nssavedconfig[])obj.get_resources(service,option);
		return response[0];
	}

}
