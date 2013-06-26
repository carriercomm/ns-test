/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.gslb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class gslbrunningconfig_response extends base_response
{
	public gslbrunningconfig gslbrunningconfig;
}
/**
* Configuration for running GSLB configuration resource.
*/

public class gslbrunningconfig extends base_resource
{

	//------- Read only Parameter ---------;

	private String response;

	/**
	* <pre>
	* gslb sync status as text blob.
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
		gslbrunningconfig[] resources = new gslbrunningconfig[1];
		gslbrunningconfig_response result = (gslbrunningconfig_response) service.get_payload_formatter().string_to_resource(gslbrunningconfig_response.class, response);
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
		resources[0] = result.gslbrunningconfig;
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
	* Use this API to fetch all the gslbrunningconfig resources that are configured on netscaler.
	*/
	public static gslbrunningconfig get(nitro_service service) throws Exception{
		gslbrunningconfig obj = new gslbrunningconfig();
		gslbrunningconfig[] response = (gslbrunningconfig[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the gslbrunningconfig resources that are configured on netscaler.
	*/
	public static gslbrunningconfig get(nitro_service service,  options option) throws Exception{
		gslbrunningconfig obj = new gslbrunningconfig();
		gslbrunningconfig[] response = (gslbrunningconfig[])obj.get_resources(service,option);
		return response[0];
	}

}
