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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class aaaglobal_aaapreauthenticationpolicy_binding_response extends base_response
{
	public aaaglobal_aaapreauthenticationpolicy_binding[] aaaglobal_aaapreauthenticationpolicy_binding;
}
/**
	* Binding class showing the aaapreauthenticationpolicy that can be bound to aaaglobal.
	*/

public class aaaglobal_aaapreauthenticationpolicy_binding extends base_resource
{
	private String policy;
	private Long priority;
	private Long bindpolicytype;
	private Long __count;

	/**
	* <pre>
	* Priority of the bound policy.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* Priority of the bound policy.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* Priority of the bound policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* The policy to be unbound to the AAA user.<br> Minimum length =  1
	* </pre>
	*/
	public void set_policy(String policy) throws Exception{
		this.policy = policy;
	}

	/**
	* <pre>
	* The policy to be unbound to the AAA user.<br> Minimum length =  1
	* </pre>
	*/
	public String get_policy() throws Exception {
		return this.policy;
	}

	/**
	* <pre>
	* Bound policy type.
	* </pre>
	*/
	public Long get_bindpolicytype() throws Exception {
		return this.bindpolicytype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		aaaglobal_aaapreauthenticationpolicy_binding_response result = (aaaglobal_aaapreauthenticationpolicy_binding_response) service.get_payload_formatter().string_to_resource(aaaglobal_aaapreauthenticationpolicy_binding_response.class, response);
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
		return result.aaaglobal_aaapreauthenticationpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	public static base_response add(nitro_service client, aaaglobal_aaapreauthenticationpolicy_binding resource) throws Exception {
		aaaglobal_aaapreauthenticationpolicy_binding updateresource = new aaaglobal_aaapreauthenticationpolicy_binding();
		updateresource.policy = resource.policy;
		updateresource.priority = resource.priority;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, aaaglobal_aaapreauthenticationpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaaglobal_aaapreauthenticationpolicy_binding updateresources[] = new aaaglobal_aaapreauthenticationpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new aaaglobal_aaapreauthenticationpolicy_binding();
				updateresources[i].policy = resources[i].policy;
				updateresources[i].priority = resources[i].priority;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, aaaglobal_aaapreauthenticationpolicy_binding resource) throws Exception {
		aaaglobal_aaapreauthenticationpolicy_binding deleteresource = new aaaglobal_aaapreauthenticationpolicy_binding();
		deleteresource.policy = resource.policy;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, aaaglobal_aaapreauthenticationpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaaglobal_aaapreauthenticationpolicy_binding deleteresources[] = new aaaglobal_aaapreauthenticationpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new aaaglobal_aaapreauthenticationpolicy_binding();
				deleteresources[i].policy = resources[i].policy;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch a aaaglobal_aaapreauthenticationpolicy_binding resources.
	*/
	public static aaaglobal_aaapreauthenticationpolicy_binding[] get(nitro_service service) throws Exception{
		aaaglobal_aaapreauthenticationpolicy_binding obj = new aaaglobal_aaapreauthenticationpolicy_binding();
		aaaglobal_aaapreauthenticationpolicy_binding response[] = (aaaglobal_aaapreauthenticationpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaaglobal_aaapreauthenticationpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static aaaglobal_aaapreauthenticationpolicy_binding[] get_filtered(nitro_service service, String filter) throws Exception{
		aaaglobal_aaapreauthenticationpolicy_binding obj = new aaaglobal_aaapreauthenticationpolicy_binding();
		options option = new options();
		option.set_filter(filter);
		aaaglobal_aaapreauthenticationpolicy_binding[] response = (aaaglobal_aaapreauthenticationpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaaglobal_aaapreauthenticationpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static aaaglobal_aaapreauthenticationpolicy_binding[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		aaaglobal_aaapreauthenticationpolicy_binding obj = new aaaglobal_aaapreauthenticationpolicy_binding();
		options option = new options();
		option.set_filter(filter);
		aaaglobal_aaapreauthenticationpolicy_binding[] response = (aaaglobal_aaapreauthenticationpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count aaaglobal_aaapreauthenticationpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		aaaglobal_aaapreauthenticationpolicy_binding obj = new aaaglobal_aaapreauthenticationpolicy_binding();
		options option = new options();
		option.set_count(true);
		aaaglobal_aaapreauthenticationpolicy_binding response[] = (aaaglobal_aaapreauthenticationpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of aaaglobal_aaapreauthenticationpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		aaaglobal_aaapreauthenticationpolicy_binding obj = new aaaglobal_aaapreauthenticationpolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaaglobal_aaapreauthenticationpolicy_binding[] response = (aaaglobal_aaapreauthenticationpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of aaaglobal_aaapreauthenticationpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		aaaglobal_aaapreauthenticationpolicy_binding obj = new aaaglobal_aaapreauthenticationpolicy_binding();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaaglobal_aaapreauthenticationpolicy_binding[] response = (aaaglobal_aaapreauthenticationpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}