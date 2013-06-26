/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.config.ssl.sslglobal_sslpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslglobal_binding_response extends base_response
{
	public sslglobal_binding[] sslglobal_binding;
}
/**
	* Binding class showing the resources that can be bound to sslglobal_binding. 
	*/

public class sslglobal_binding extends base_resource
{
	private sslglobal_sslpolicy_binding	sslglobal_sslpolicy_binding[] = null;

	/**
	* <pre>
	* sslpolicy that can be bound to sslglobal.
	* </pre>
	*/
	public sslglobal_sslpolicy_binding[] get_sslglobal_sslpolicy_bindings() throws Exception {
		return this.sslglobal_sslpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslglobal_binding_response result = (sslglobal_binding_response) service.get_payload_formatter().string_to_resource(sslglobal_binding_response.class, response);
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
		return result.sslglobal_binding;
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
	* Use this API to fetch a sslglobal_binding resource .
	*/
	public static sslglobal_binding get(nitro_service service) throws Exception{
		sslglobal_binding obj = new sslglobal_binding();
		sslglobal_binding response = (sslglobal_binding) obj.get_resource(service);
		return response;
	}


}