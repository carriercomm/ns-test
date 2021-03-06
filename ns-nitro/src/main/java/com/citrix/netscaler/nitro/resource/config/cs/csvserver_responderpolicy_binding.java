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

package com.citrix.netscaler.nitro.resource.config.cs;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class csvserver_responderpolicy_binding_response extends base_response
{
	public csvserver_responderpolicy_binding[] csvserver_responderpolicy_binding;
}
/**
	* Binding class showing the responderpolicy that can be bound to csvserver.
	*/

public class csvserver_responderpolicy_binding extends base_resource
{
	private String policyname;
	private Long priority;
	private String gotopriorityexpression;
	private Boolean invoke;
	private String labeltype;
	private String labelname;
	private String name;
	private String targetlbvserver;
	private String bindpoint;
	private Long __count;

	/**
	* <pre>
	* Priority for the policy.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* Priority for the policy.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* Priority for the policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* For a rewrite policy, the bind point to which to bind the policy. Note: This parameter applies only to rewrite policies, because content switching policies are evaluated only at request time.<br> Possible values = REQUEST, RESPONSE
	* </pre>
	*/
	public void set_bindpoint(String bindpoint) throws Exception{
		this.bindpoint = bindpoint;
	}

	/**
	* <pre>
	* For a rewrite policy, the bind point to which to bind the policy. Note: This parameter applies only to rewrite policies, because content switching policies are evaluated only at request time.<br> Possible values = REQUEST, RESPONSE
	* </pre>
	*/
	public String get_bindpoint() throws Exception {
		return this.bindpoint;
	}

	/**
	* <pre>
	* Policies bound to this vserver.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* Policies bound to this vserver.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Name of the label invoked.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the label invoked.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* Name of the content switching virtual server to which the content switching policy applies.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name of the content switching virtual server to which the content switching policy applies.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Name of the Load Balancing virtual server to which the content is switched, if policy rule is evaluated to be TRUE.
Example: bind cs vs cs1 -policyname pol1 -priority 101 -targetLBVserver lb1
Note: Use this parameter only in case of Content Switching policy bind operations to a CS vserver.<br> Minimum length =  1
	* </pre>
	*/
	public void set_targetlbvserver(String targetlbvserver) throws Exception{
		this.targetlbvserver = targetlbvserver;
	}

	/**
	* <pre>
	* Name of the Load Balancing virtual server to which the content is switched, if policy rule is evaluated to be TRUE.
Example: bind cs vs cs1 -policyname pol1 -priority 101 -targetLBVserver lb1
Note: Use this parameter only in case of Content Switching policy bind operations to a CS vserver.<br> Minimum length =  1
	* </pre>
	*/
	public String get_targetlbvserver() throws Exception {
		return this.targetlbvserver;
	}

	/**
	* <pre>
	* Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public void set_gotopriorityexpression(String gotopriorityexpression) throws Exception{
		this.gotopriorityexpression = gotopriorityexpression;
	}

	/**
	* <pre>
	* Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_gotopriorityexpression() throws Exception {
		return this.gotopriorityexpression;
	}

	/**
	* <pre>
	* Invoke flag.
	* </pre>
	*/
	public void set_invoke(boolean invoke) throws Exception {
		this.invoke = new Boolean(invoke);
	}

	/**
	* <pre>
	* Invoke flag.
	* </pre>
	*/
	public void set_invoke(Boolean invoke) throws Exception{
		this.invoke = invoke;
	}

	/**
	* <pre>
	* Invoke flag.
	* </pre>
	*/
	public Boolean get_invoke() throws Exception {
		return this.invoke;
	}

	/**
	* <pre>
	* The invocation type.<br> Possible values = reqvserver, resvserver, policylabel
	* </pre>
	*/
	public void set_labeltype(String labeltype) throws Exception{
		this.labeltype = labeltype;
	}

	/**
	* <pre>
	* The invocation type.<br> Possible values = reqvserver, resvserver, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		csvserver_responderpolicy_binding_response result = (csvserver_responderpolicy_binding_response) service.get_payload_formatter().string_to_resource(csvserver_responderpolicy_binding_response.class, response);
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
		return result.csvserver_responderpolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	public static base_response add(nitro_service client, csvserver_responderpolicy_binding resource) throws Exception {
		csvserver_responderpolicy_binding updateresource = new csvserver_responderpolicy_binding();
		updateresource.name = resource.name;
		updateresource.policyname = resource.policyname;
		updateresource.targetlbvserver = resource.targetlbvserver;
		updateresource.priority = resource.priority;
		updateresource.gotopriorityexpression = resource.gotopriorityexpression;
		updateresource.bindpoint = resource.bindpoint;
		updateresource.invoke = resource.invoke;
		updateresource.labeltype = resource.labeltype;
		updateresource.labelname = resource.labelname;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, csvserver_responderpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			csvserver_responderpolicy_binding updateresources[] = new csvserver_responderpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new csvserver_responderpolicy_binding();
				updateresources[i].name = resources[i].name;
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].targetlbvserver = resources[i].targetlbvserver;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].gotopriorityexpression = resources[i].gotopriorityexpression;
				updateresources[i].bindpoint = resources[i].bindpoint;
				updateresources[i].invoke = resources[i].invoke;
				updateresources[i].labeltype = resources[i].labeltype;
				updateresources[i].labelname = resources[i].labelname;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, csvserver_responderpolicy_binding resource) throws Exception {
		csvserver_responderpolicy_binding deleteresource = new csvserver_responderpolicy_binding();
		deleteresource.name = resource.name;
		deleteresource.policyname = resource.policyname;
		deleteresource.bindpoint = resource.bindpoint;
		deleteresource.priority = resource.priority;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, csvserver_responderpolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			csvserver_responderpolicy_binding deleteresources[] = new csvserver_responderpolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new csvserver_responderpolicy_binding();
				deleteresources[i].name = resources[i].name;
				deleteresources[i].policyname = resources[i].policyname;
				deleteresources[i].bindpoint = resources[i].bindpoint;
				deleteresources[i].priority = resources[i].priority;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch csvserver_responderpolicy_binding resources of given name .
	*/
	public static csvserver_responderpolicy_binding[] get(nitro_service service, String name) throws Exception{
		csvserver_responderpolicy_binding obj = new csvserver_responderpolicy_binding();
		obj.set_name(name);
		csvserver_responderpolicy_binding response[] = (csvserver_responderpolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of csvserver_responderpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static csvserver_responderpolicy_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		csvserver_responderpolicy_binding obj = new csvserver_responderpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		csvserver_responderpolicy_binding[] response = (csvserver_responderpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of csvserver_responderpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static csvserver_responderpolicy_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		csvserver_responderpolicy_binding obj = new csvserver_responderpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		csvserver_responderpolicy_binding[] response = (csvserver_responderpolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count csvserver_responderpolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		csvserver_responderpolicy_binding obj = new csvserver_responderpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		csvserver_responderpolicy_binding response[] = (csvserver_responderpolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of csvserver_responderpolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		csvserver_responderpolicy_binding obj = new csvserver_responderpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		csvserver_responderpolicy_binding[] response = (csvserver_responderpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of csvserver_responderpolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		csvserver_responderpolicy_binding obj = new csvserver_responderpolicy_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		csvserver_responderpolicy_binding[] response = (csvserver_responderpolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class bindpointEnum {
		public static final String REQUEST = "REQUEST";
		public static final String RESPONSE = "RESPONSE";
	}
	public static class labeltypeEnum {
		public static final String reqvserver = "reqvserver";
		public static final String resvserver = "resvserver";
		public static final String policylabel = "policylabel";
	}

}