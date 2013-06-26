/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.responder;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class responderparam_response extends base_response
{
	public responderparam responderparam;
}
/**
* Configuration for responser parameter resource.
*/

public class responderparam extends base_resource
{
	private String undefaction;

	/**
	* <pre>
	* can be NOOP, RESET or DROP.<br> Default value: "NOOP"
	* </pre>
	*/
	public void set_undefaction(String undefaction) throws Exception{
		this.undefaction = undefaction;
	}

	/**
	* <pre>
	* can be NOOP, RESET or DROP.<br> Default value: "NOOP"
	* </pre>
	*/
	public String get_undefaction() throws Exception {
		return this.undefaction;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		responderparam[] resources = new responderparam[1];
		responderparam_response result = (responderparam_response) service.get_payload_formatter().string_to_resource(responderparam_response.class, response);
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
		resources[0] = result.responderparam;
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
	* Use this API to update responderparam.
	*/
	public static base_response update(nitro_service client, responderparam resource) throws Exception {
		responderparam updateresource = new responderparam();
		updateresource.undefaction = resource.undefaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of responderparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, responderparam resource, String[] args) throws Exception{
		responderparam unsetresource = new responderparam();
		unsetresource.undefaction = resource.undefaction;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the responderparam resources that are configured on netscaler.
	*/
	public static responderparam get(nitro_service service) throws Exception{
		responderparam obj = new responderparam();
		responderparam[] response = (responderparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the responderparam resources that are configured on netscaler.
	*/
	public static responderparam get(nitro_service service,  options option) throws Exception{
		responderparam obj = new responderparam();
		responderparam[] response = (responderparam[])obj.get_resources(service,option);
		return response[0];
	}

}
