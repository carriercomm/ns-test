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

class nsacls6_response extends base_response
{
	public nsacls6 nsacls6;
}
/**
* Configuration for ACL6 entry resource.
*/

public class nsacls6 extends base_resource
{

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nsacls6[] resources = new nsacls6[1];
		nsacls6_response result = (nsacls6_response) service.get_payload_formatter().string_to_resource(nsacls6_response.class, response);
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
		resources[0] = result.nsacls6;
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
	* Use this API to clear nsacls6.
	*/
	public static base_response clear(nitro_service client) throws Exception {
		nsacls6 clearresource = new nsacls6();
		return clearresource.perform_operation(client,"clear");
	}

	/**
	* Use this API to apply nsacls6.
	*/
	public static base_response apply(nitro_service client) throws Exception {
		nsacls6 applyresource = new nsacls6();
		return applyresource.perform_operation(client,"apply");
	}

	/**
	* Use this API to renumber nsacls6.
	*/
	public static base_response renumber(nitro_service client) throws Exception {
		nsacls6 renumberresource = new nsacls6();
		return renumberresource.perform_operation(client,"renumber");
	}

}
