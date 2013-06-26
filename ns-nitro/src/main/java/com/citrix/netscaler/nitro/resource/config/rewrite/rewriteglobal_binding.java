/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.rewrite;

import com.citrix.netscaler.nitro.resource.config.rewrite.rewriteglobal_rewritepolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class rewriteglobal_binding_response extends base_response
{
	public rewriteglobal_binding[] rewriteglobal_binding;
}
/**
	* Binding class showing the resources that can be bound to rewriteglobal_binding. 
	*/

public class rewriteglobal_binding extends base_resource
{
	private rewriteglobal_rewritepolicy_binding	rewriteglobal_rewritepolicy_binding[] = null;

	/**
	* <pre>
	* rewritepolicy that can be bound to rewriteglobal.
	* </pre>
	*/
	public rewriteglobal_rewritepolicy_binding[] get_rewriteglobal_rewritepolicy_bindings() throws Exception {
		return this.rewriteglobal_rewritepolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		rewriteglobal_binding_response result = (rewriteglobal_binding_response) service.get_payload_formatter().string_to_resource(rewriteglobal_binding_response.class, response);
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
		return result.rewriteglobal_binding;
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
	* Use this API to fetch a rewriteglobal_binding resource .
	*/
	public static rewriteglobal_binding get(nitro_service service) throws Exception{
		rewriteglobal_binding obj = new rewriteglobal_binding();
		rewriteglobal_binding response = (rewriteglobal_binding) obj.get_resource(service);
		return response;
	}


}