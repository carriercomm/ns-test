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

class nspbrs_response extends base_response
{
	public nspbrs nspbrs;
}
/**
* Configuration for Policy based routing resource.
*/

public class nspbrs extends base_resource
{

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nspbrs[] resources = new nspbrs[1];
		nspbrs_response result = (nspbrs_response) service.get_payload_formatter().string_to_resource(nspbrs_response.class, response);
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
		resources[0] = result.nspbrs;
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
	* Use this API to renumber nspbrs.
	*/
	public static base_response renumber(nitro_service client) throws Exception {
		nspbrs renumberresource = new nspbrs();
		return renumberresource.perform_operation(client,"renumber");
	}

	/**
	* Use this API to clear nspbrs.
	*/
	public static base_response clear(nitro_service client) throws Exception {
		nspbrs clearresource = new nspbrs();
		return clearresource.perform_operation(client,"clear");
	}

	/**
	* Use this API to apply nspbrs.
	*/
	public static base_response apply(nitro_service client) throws Exception {
		nspbrs applyresource = new nspbrs();
		return applyresource.perform_operation(client,"apply");
	}

}
