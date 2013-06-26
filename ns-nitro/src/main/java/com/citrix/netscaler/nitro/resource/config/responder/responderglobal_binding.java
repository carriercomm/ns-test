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

import com.citrix.netscaler.nitro.resource.config.responder.responderglobal_responderpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class responderglobal_binding_response extends base_response
{
	public responderglobal_binding[] responderglobal_binding;
}
/**
	* Binding class showing the resources that can be bound to responderglobal_binding. 
	*/

public class responderglobal_binding extends base_resource
{
	private responderglobal_responderpolicy_binding	responderglobal_responderpolicy_binding[] = null;

	/**
	* <pre>
	* responderpolicy that can be bound to responderglobal.
	* </pre>
	*/
	public responderglobal_responderpolicy_binding[] get_responderglobal_responderpolicy_bindings() throws Exception {
		return this.responderglobal_responderpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		responderglobal_binding_response result = (responderglobal_binding_response) service.get_payload_formatter().string_to_resource(responderglobal_binding_response.class, response);
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
		return result.responderglobal_binding;
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
	* Use this API to fetch a responderglobal_binding resource .
	*/
	public static responderglobal_binding get(nitro_service service) throws Exception{
		responderglobal_binding obj = new responderglobal_binding();
		responderglobal_binding response = (responderglobal_binding) obj.get_resource(service);
		return response;
	}


}