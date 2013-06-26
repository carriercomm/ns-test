/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.cache;

import com.citrix.netscaler.nitro.resource.config.cache.cacheglobal_cachepolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cacheglobal_binding_response extends base_response
{
	public cacheglobal_binding[] cacheglobal_binding;
}
/**
	* Binding class showing the resources that can be bound to cacheglobal_binding. 
	*/

public class cacheglobal_binding extends base_resource
{
	private cacheglobal_cachepolicy_binding	cacheglobal_cachepolicy_binding[] = null;

	/**
	* <pre>
	* cachepolicy that can be bound to cacheglobal.
	* </pre>
	*/
	public cacheglobal_cachepolicy_binding[] get_cacheglobal_cachepolicy_bindings() throws Exception {
		return this.cacheglobal_cachepolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		cacheglobal_binding_response result = (cacheglobal_binding_response) service.get_payload_formatter().string_to_resource(cacheglobal_binding_response.class, response);
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
		return result.cacheglobal_binding;
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
	* Use this API to fetch a cacheglobal_binding resource .
	*/
	public static cacheglobal_binding get(nitro_service service) throws Exception{
		cacheglobal_binding obj = new cacheglobal_binding();
		cacheglobal_binding response = (cacheglobal_binding) obj.get_resource(service);
		return response;
	}


}