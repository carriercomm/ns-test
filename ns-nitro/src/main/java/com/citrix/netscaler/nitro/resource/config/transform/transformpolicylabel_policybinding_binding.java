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

package com.citrix.netscaler.nitro.resource.config.transform;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class transformpolicylabel_policybinding_binding_response extends base_response
{
	public transformpolicylabel_policybinding_binding[] transformpolicylabel_policybinding_binding;
}
/**
	* Binding class showing the policybinding that can be bound to transformpolicylabel.
	*/

public class transformpolicylabel_policybinding_binding extends base_resource
{
	private String policyname;
	private Long priority;
	private String gotopriorityexpression;
	private Boolean invoke;
	private String labeltype;
	private String invoke_labelname;
	private String labelname;
	private Long __count;

	/**
	* <pre>
	* Specifies the priority of the policy.
	* </pre>
	*/
	public void set_priority(long priority) throws Exception {
		this.priority = new Long(priority);
	}

	/**
	* <pre>
	* Specifies the priority of the policy.
	* </pre>
	*/
	public void set_priority(Long priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* Specifies the priority of the policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
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
	* Name of the URL Transformation policy to bind to the policy label.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* Name of the URL Transformation policy to bind to the policy label.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Type of invocation. Available settings function as follows:
* reqvserver - Forward the request to the specified request virtual server.
* policylabel - Invoke the specified policy label.<br> Possible values = reqvserver, policylabel
	* </pre>
	*/
	public void set_labeltype(String labeltype) throws Exception{
		this.labeltype = labeltype;
	}

	/**
	* <pre>
	* Type of invocation. Available settings function as follows:
* reqvserver - Forward the request to the specified request virtual server.
* policylabel - Invoke the specified policy label.<br> Possible values = reqvserver, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* Name of the URL Transformation policy label to which to bind the policy.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the URL Transformation policy label to which to bind the policy.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* Name of the policy label.
	* </pre>
	*/
	public void set_invoke_labelname(String invoke_labelname) throws Exception{
		this.invoke_labelname = invoke_labelname;
	}

	/**
	* <pre>
	* Name of the policy label.
	* </pre>
	*/
	public String get_invoke_labelname() throws Exception {
		return this.invoke_labelname;
	}

	/**
	* <pre>
	* If the current policy evaluates to TRUE, terminate evaluation of policies bound to the current policy label, and then forward the request to the specified virtual server or evaluate the specified policy label.
	* </pre>
	*/
	public void set_invoke(boolean invoke) throws Exception {
		this.invoke = new Boolean(invoke);
	}

	/**
	* <pre>
	* If the current policy evaluates to TRUE, terminate evaluation of policies bound to the current policy label, and then forward the request to the specified virtual server or evaluate the specified policy label.
	* </pre>
	*/
	public void set_invoke(Boolean invoke) throws Exception{
		this.invoke = invoke;
	}

	/**
	* <pre>
	* If the current policy evaluates to TRUE, terminate evaluation of policies bound to the current policy label, and then forward the request to the specified virtual server or evaluate the specified policy label.
	* </pre>
	*/
	public Boolean get_invoke() throws Exception {
		return this.invoke;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		transformpolicylabel_policybinding_binding_response result = (transformpolicylabel_policybinding_binding_response) service.get_payload_formatter().string_to_resource(transformpolicylabel_policybinding_binding_response.class, response);
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
		return result.transformpolicylabel_policybinding_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.labelname;
	}

	/**
	* Use this API to fetch transformpolicylabel_policybinding_binding resources of given name .
	*/
	public static transformpolicylabel_policybinding_binding[] get(nitro_service service, String labelname) throws Exception{
		transformpolicylabel_policybinding_binding obj = new transformpolicylabel_policybinding_binding();
		obj.set_labelname(labelname);
		transformpolicylabel_policybinding_binding response[] = (transformpolicylabel_policybinding_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of transformpolicylabel_policybinding_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static transformpolicylabel_policybinding_binding[] get_filtered(nitro_service service, String labelname, String filter) throws Exception{
		transformpolicylabel_policybinding_binding obj = new transformpolicylabel_policybinding_binding();
		obj.set_labelname(labelname);
		options option = new options();
		option.set_filter(filter);
		transformpolicylabel_policybinding_binding[] response = (transformpolicylabel_policybinding_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of transformpolicylabel_policybinding_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static transformpolicylabel_policybinding_binding[] get_filtered(nitro_service service, String labelname, filtervalue[] filter) throws Exception{
		transformpolicylabel_policybinding_binding obj = new transformpolicylabel_policybinding_binding();
		obj.set_labelname(labelname);
		options option = new options();
		option.set_filter(filter);
		transformpolicylabel_policybinding_binding[] response = (transformpolicylabel_policybinding_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count transformpolicylabel_policybinding_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String labelname) throws Exception{
		transformpolicylabel_policybinding_binding obj = new transformpolicylabel_policybinding_binding();
		obj.set_labelname(labelname);
		options option = new options();
		option.set_count(true);
		transformpolicylabel_policybinding_binding response[] = (transformpolicylabel_policybinding_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of transformpolicylabel_policybinding_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String labelname, String filter) throws Exception{
		transformpolicylabel_policybinding_binding obj = new transformpolicylabel_policybinding_binding();
		obj.set_labelname(labelname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		transformpolicylabel_policybinding_binding[] response = (transformpolicylabel_policybinding_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of transformpolicylabel_policybinding_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String labelname, filtervalue[] filter) throws Exception{
		transformpolicylabel_policybinding_binding obj = new transformpolicylabel_policybinding_binding();
		obj.set_labelname(labelname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		transformpolicylabel_policybinding_binding[] response = (transformpolicylabel_policybinding_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class labeltypeEnum {
		public static final String reqvserver = "reqvserver";
		public static final String policylabel = "policylabel";
	}

}