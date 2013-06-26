/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.aaa;

import com.citrix.netscaler.nitro.resource.config.aaa.aaaglobal_aaapreauthenticationpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaaglobal_binding_response extends base_response
{
	public aaaglobal_binding[] aaaglobal_binding;
}
/**
	* Binding class showing the resources that can be bound to aaaglobal_binding. 
	*/

public class aaaglobal_binding extends base_resource
{
	private aaaglobal_aaapreauthenticationpolicy_binding	aaaglobal_aaapreauthenticationpolicy_binding[] = null;

	/**
	* <pre>
	* aaapreauthenticationpolicy that can be bound to aaaglobal.
	* </pre>
	*/
	public aaaglobal_aaapreauthenticationpolicy_binding[] get_aaaglobal_aaapreauthenticationpolicy_bindings() throws Exception {
		return this.aaaglobal_aaapreauthenticationpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		aaaglobal_binding_response result = (aaaglobal_binding_response) service.get_payload_formatter().string_to_resource(aaaglobal_binding_response.class, response);
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
		return result.aaaglobal_binding;
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
	* Use this API to fetch a aaaglobal_binding resource .
	*/
	public static aaaglobal_binding get(nitro_service service) throws Exception{
		aaaglobal_binding obj = new aaaglobal_binding();
		aaaglobal_binding response = (aaaglobal_binding) obj.get_resource(service);
		return response;
	}


}