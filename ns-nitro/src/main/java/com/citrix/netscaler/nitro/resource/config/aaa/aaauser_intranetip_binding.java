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

package com.citrix.netscaler.nitro.resource.config.aaa;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaauser_intranetip_binding_response extends base_response
{
	public aaauser_intranetip_binding[] aaauser_intranetip_binding;
}
/**
	* Binding class showing the intranetip that can be bound to aaauser.
	*/

public class aaauser_intranetip_binding extends base_resource
{
	private String intranetip;
	private String netmask;
	private String username;
	private Long __count;

	/**
	* <pre>
	* User account to which to bind the policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_username(String username) throws Exception{
		this.username = username;
	}

	/**
	* <pre>
	* User account to which to bind the policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_username() throws Exception {
		return this.username;
	}

	/**
	* <pre>
	* The Intranet IP bound to the user.
	* </pre>
	*/
	public void set_intranetip(String intranetip) throws Exception{
		this.intranetip = intranetip;
	}

	/**
	* <pre>
	* The Intranet IP bound to the user.
	* </pre>
	*/
	public String get_intranetip() throws Exception {
		return this.intranetip;
	}

	/**
	* <pre>
	* The netmask for the Intranet IP.
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* The netmask for the Intranet IP.
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		aaauser_intranetip_binding_response result = (aaauser_intranetip_binding_response) service.get_payload_formatter().string_to_resource(aaauser_intranetip_binding_response.class, response);
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
		return result.aaauser_intranetip_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.username;
	}

	public static base_response add(nitro_service client, aaauser_intranetip_binding resource) throws Exception {
		aaauser_intranetip_binding updateresource = new aaauser_intranetip_binding();
		updateresource.username = resource.username;
		updateresource.intranetip = resource.intranetip;
		updateresource.netmask = resource.netmask;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, aaauser_intranetip_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaauser_intranetip_binding updateresources[] = new aaauser_intranetip_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new aaauser_intranetip_binding();
				updateresources[i].username = resources[i].username;
				updateresources[i].intranetip = resources[i].intranetip;
				updateresources[i].netmask = resources[i].netmask;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, aaauser_intranetip_binding resource) throws Exception {
		aaauser_intranetip_binding deleteresource = new aaauser_intranetip_binding();
		deleteresource.username = resource.username;
		deleteresource.intranetip = resource.intranetip;
		deleteresource.netmask = resource.netmask;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, aaauser_intranetip_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaauser_intranetip_binding deleteresources[] = new aaauser_intranetip_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new aaauser_intranetip_binding();
				deleteresources[i].username = resources[i].username;
				deleteresources[i].intranetip = resources[i].intranetip;
				deleteresources[i].netmask = resources[i].netmask;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch aaauser_intranetip_binding resources of given name .
	*/
	public static aaauser_intranetip_binding[] get(nitro_service service, String username) throws Exception{
		aaauser_intranetip_binding obj = new aaauser_intranetip_binding();
		obj.set_username(username);
		aaauser_intranetip_binding response[] = (aaauser_intranetip_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaauser_intranetip_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static aaauser_intranetip_binding[] get_filtered(nitro_service service, String username, String filter) throws Exception{
		aaauser_intranetip_binding obj = new aaauser_intranetip_binding();
		obj.set_username(username);
		options option = new options();
		option.set_filter(filter);
		aaauser_intranetip_binding[] response = (aaauser_intranetip_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaauser_intranetip_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static aaauser_intranetip_binding[] get_filtered(nitro_service service, String username, filtervalue[] filter) throws Exception{
		aaauser_intranetip_binding obj = new aaauser_intranetip_binding();
		obj.set_username(username);
		options option = new options();
		option.set_filter(filter);
		aaauser_intranetip_binding[] response = (aaauser_intranetip_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count aaauser_intranetip_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String username) throws Exception{
		aaauser_intranetip_binding obj = new aaauser_intranetip_binding();
		obj.set_username(username);
		options option = new options();
		option.set_count(true);
		aaauser_intranetip_binding response[] = (aaauser_intranetip_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of aaauser_intranetip_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String username, String filter) throws Exception{
		aaauser_intranetip_binding obj = new aaauser_intranetip_binding();
		obj.set_username(username);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaauser_intranetip_binding[] response = (aaauser_intranetip_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of aaauser_intranetip_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String username, filtervalue[] filter) throws Exception{
		aaauser_intranetip_binding obj = new aaauser_intranetip_binding();
		obj.set_username(username);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaauser_intranetip_binding[] response = (aaauser_intranetip_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}