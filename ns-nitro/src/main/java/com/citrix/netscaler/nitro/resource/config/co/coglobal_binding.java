/*
* Copyright (c) 2008-2015 Citrix Systems, Inc.
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*       http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/

package com.citrix.netscaler.nitro.resource.config.co;

import com.citrix.netscaler.nitro.resource.config.co.coglobal_copolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class coglobal_binding_response extends base_response
{
	public coglobal_binding[] coglobal_binding;
}
/**
	* Binding class showing the resources that can be bound to coglobal_binding. 
	*/

public class coglobal_binding extends base_resource
{
	private coglobal_copolicy_binding	coglobal_copolicy_binding[] = null;

	/**
	* <pre>
	* copolicy that can be bound to coglobal.
	* </pre>
	*/
	public coglobal_copolicy_binding[] get_coglobal_copolicy_bindings() throws Exception {
		return this.coglobal_copolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		coglobal_binding_response result = (coglobal_binding_response) service.get_payload_formatter().string_to_resource(coglobal_binding_response.class, response);
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
		return result.coglobal_binding;
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
	* Use this API to fetch a coglobal_binding resource .
	*/
	public static coglobal_binding get(nitro_service service) throws Exception{
		coglobal_binding obj = new coglobal_binding();
		coglobal_binding response = (coglobal_binding) obj.get_resource(service);
		return response;
	}


}