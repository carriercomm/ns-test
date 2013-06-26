/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.transform;

import com.citrix.netscaler.nitro.resource.config.transform.transformglobal_transformpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class transformglobal_binding_response extends base_response
{
	public transformglobal_binding[] transformglobal_binding;
}
/**
	* Binding class showing the resources that can be bound to transformglobal_binding. 
	*/

public class transformglobal_binding extends base_resource
{
	private transformglobal_transformpolicy_binding	transformglobal_transformpolicy_binding[] = null;

	/**
	* <pre>
	* transformpolicy that can be bound to transformglobal.
	* </pre>
	*/
	public transformglobal_transformpolicy_binding[] get_transformglobal_transformpolicy_bindings() throws Exception {
		return this.transformglobal_transformpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		transformglobal_binding_response result = (transformglobal_binding_response) service.get_payload_formatter().string_to_resource(transformglobal_binding_response.class, response);
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
		return result.transformglobal_binding;
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
	* Use this API to fetch a transformglobal_binding resource .
	*/
	public static transformglobal_binding get(nitro_service service) throws Exception{
		transformglobal_binding obj = new transformglobal_binding();
		transformglobal_binding response = (transformglobal_binding) obj.get_resource(service);
		return response;
	}


}