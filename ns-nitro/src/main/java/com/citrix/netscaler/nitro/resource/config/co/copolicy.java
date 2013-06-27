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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class copolicy_response extends base_response
{
	public copolicy[] copolicy;
}
/**
* Configuration for content-optimization policy resource.
*/

public class copolicy extends base_resource
{
	private String name;
	private String rule;
	private String action;

	//------- Read only Parameter ---------;

	private String[] builtin;
	private Long hits;
	private Long undefhits;
	private Long __count;

	/**
	* <pre>
	* The name of the content optimization policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the content optimization policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The rule associated with the content optimization policy.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The rule associated with the content optimization policy.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The content optimization that needs to be performed when the rule matches.<br> Minimum length =  1
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* The content optimization that needs to be performed when the rule matches.<br> Minimum length =  1
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* Flag to determine if co policy is builtin or not.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public String[] get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* Number of hits.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* Number of policy UNDEF hits.
	* </pre>
	*/
	public Long get_undefhits() throws Exception {
		return this.undefhits;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		copolicy_response result = (copolicy_response) service.get_payload_formatter().string_to_resource(copolicy_response.class, response);
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
		return result.copolicy;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to add copolicy.
	*/
	public static base_response add(nitro_service client, copolicy resource) throws Exception {
		copolicy addresource = new copolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.action = resource.action;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add copolicy resources.
	*/
	public static base_responses add(nitro_service client, copolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			copolicy addresources[] = new copolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new copolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].action = resources[i].action;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete copolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		copolicy deleteresource = new copolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete copolicy.
	*/
	public static base_response delete(nitro_service client, copolicy resource) throws Exception {
		copolicy deleteresource = new copolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete copolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			copolicy deleteresources[] = new copolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new copolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete copolicy resources.
	*/
	public static base_responses delete(nitro_service client, copolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			copolicy deleteresources[] = new copolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new copolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update copolicy.
	*/
	public static base_response update(nitro_service client, copolicy resource) throws Exception {
		copolicy updateresource = new copolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update copolicy resources.
	*/
	public static base_responses update(nitro_service client, copolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			copolicy updateresources[] = new copolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new copolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].action = resources[i].action;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of copolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, copolicy resource, String[] args) throws Exception{
		copolicy unsetresource = new copolicy();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of copolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			copolicy unsetresources[] = new copolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new copolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of copolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, copolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			copolicy unsetresources[] = new copolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new copolicy();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the copolicy resources that are configured on netscaler.
	*/
	public static copolicy[] get(nitro_service service) throws Exception{
		copolicy obj = new copolicy();
		copolicy[] response = (copolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the copolicy resources that are configured on netscaler.
	*/
	public static copolicy[] get(nitro_service service, options option) throws Exception{
		copolicy obj = new copolicy();
		copolicy[] response = (copolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch copolicy resource of given name .
	*/
	public static copolicy get(nitro_service service, String name) throws Exception{
		copolicy obj = new copolicy();
		obj.set_name(name);
		copolicy response = (copolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch copolicy resources of given names .
	*/
	public static copolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			copolicy response[] = new copolicy[name.length];
			copolicy obj[] = new copolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new copolicy();
				obj[i].set_name(name[i]);
				response[i] = (copolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of copolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static copolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		copolicy obj = new copolicy();
		options option = new options();
		option.set_filter(filter);
		copolicy[] response = (copolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of copolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static copolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		copolicy obj = new copolicy();
		options option = new options();
		option.set_filter(filter);
		copolicy[] response = (copolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the copolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		copolicy obj = new copolicy();
		options option = new options();
		option.set_count(true);
		copolicy[] response = (copolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of copolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		copolicy obj = new copolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		copolicy[] response = (copolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of copolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		copolicy obj = new copolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		copolicy[] response = (copolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
}
