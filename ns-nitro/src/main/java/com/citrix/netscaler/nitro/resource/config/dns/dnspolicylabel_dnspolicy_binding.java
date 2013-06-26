/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.dns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dnspolicylabel_dnspolicy_binding_response extends base_response
{
	public dnspolicylabel_dnspolicy_binding[] dnspolicylabel_dnspolicy_binding;
}
/**
	* Binding class showing the dnspolicy that can be bound to dnspolicylabel.
	*/

public class dnspolicylabel_dnspolicy_binding extends base_resource
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
	* The dns policy name.
	* </pre>
	*/
	public void set_policyname(String policyname) throws Exception{
		this.policyname = policyname;
	}

	/**
	* <pre>
	* The dns policy name.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
	}

	/**
	* <pre>
	* Type of policy label invocation.<br> Possible values = policylabel
	* </pre>
	*/
	public void set_labeltype(String labeltype) throws Exception{
		this.labeltype = labeltype;
	}

	/**
	* <pre>
	* Type of policy label invocation.<br> Possible values = policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* Name of the dns policy label.
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the dns policy label.
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* Name of the label to invoke if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public void set_invoke_labelname(String invoke_labelname) throws Exception{
		this.invoke_labelname = invoke_labelname;
	}

	/**
	* <pre>
	* Name of the label to invoke if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_invoke_labelname() throws Exception {
		return this.invoke_labelname;
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
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dnspolicylabel_dnspolicy_binding_response result = (dnspolicylabel_dnspolicy_binding_response) service.get_payload_formatter().string_to_resource(dnspolicylabel_dnspolicy_binding_response.class, response);
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
		return result.dnspolicylabel_dnspolicy_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.labelname;
	}

	public static base_response add(nitro_service client, dnspolicylabel_dnspolicy_binding resource) throws Exception {
		dnspolicylabel_dnspolicy_binding updateresource = new dnspolicylabel_dnspolicy_binding();
		updateresource.labelname = resource.labelname;
		updateresource.policyname = resource.policyname;
		updateresource.priority = resource.priority;
		updateresource.gotopriorityexpression = resource.gotopriorityexpression;
		updateresource.invoke = resource.invoke;
		updateresource.labeltype = resource.labeltype;
		updateresource.invoke_labelname = resource.invoke_labelname;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, dnspolicylabel_dnspolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnspolicylabel_dnspolicy_binding updateresources[] = new dnspolicylabel_dnspolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new dnspolicylabel_dnspolicy_binding();
				updateresources[i].labelname = resources[i].labelname;
				updateresources[i].policyname = resources[i].policyname;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].gotopriorityexpression = resources[i].gotopriorityexpression;
				updateresources[i].invoke = resources[i].invoke;
				updateresources[i].labeltype = resources[i].labeltype;
				updateresources[i].invoke_labelname = resources[i].invoke_labelname;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, dnspolicylabel_dnspolicy_binding resource) throws Exception {
		dnspolicylabel_dnspolicy_binding deleteresource = new dnspolicylabel_dnspolicy_binding();
		deleteresource.labelname = resource.labelname;
		deleteresource.policyname = resource.policyname;
		deleteresource.priority = resource.priority;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, dnspolicylabel_dnspolicy_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnspolicylabel_dnspolicy_binding deleteresources[] = new dnspolicylabel_dnspolicy_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnspolicylabel_dnspolicy_binding();
				deleteresources[i].labelname = resources[i].labelname;
				deleteresources[i].policyname = resources[i].policyname;
				deleteresources[i].priority = resources[i].priority;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch dnspolicylabel_dnspolicy_binding resources of given name .
	*/
	public static dnspolicylabel_dnspolicy_binding[] get(nitro_service service, String labelname) throws Exception{
		dnspolicylabel_dnspolicy_binding obj = new dnspolicylabel_dnspolicy_binding();
		obj.set_labelname(labelname);
		dnspolicylabel_dnspolicy_binding response[] = (dnspolicylabel_dnspolicy_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnspolicylabel_dnspolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnspolicylabel_dnspolicy_binding[] get_filtered(nitro_service service, String labelname, String filter) throws Exception{
		dnspolicylabel_dnspolicy_binding obj = new dnspolicylabel_dnspolicy_binding();
		obj.set_labelname(labelname);
		options option = new options();
		option.set_filter(filter);
		dnspolicylabel_dnspolicy_binding[] response = (dnspolicylabel_dnspolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnspolicylabel_dnspolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnspolicylabel_dnspolicy_binding[] get_filtered(nitro_service service, String labelname, filtervalue[] filter) throws Exception{
		dnspolicylabel_dnspolicy_binding obj = new dnspolicylabel_dnspolicy_binding();
		obj.set_labelname(labelname);
		options option = new options();
		option.set_filter(filter);
		dnspolicylabel_dnspolicy_binding[] response = (dnspolicylabel_dnspolicy_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count dnspolicylabel_dnspolicy_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String labelname) throws Exception{
		dnspolicylabel_dnspolicy_binding obj = new dnspolicylabel_dnspolicy_binding();
		obj.set_labelname(labelname);
		options option = new options();
		option.set_count(true);
		dnspolicylabel_dnspolicy_binding response[] = (dnspolicylabel_dnspolicy_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnspolicylabel_dnspolicy_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String labelname, String filter) throws Exception{
		dnspolicylabel_dnspolicy_binding obj = new dnspolicylabel_dnspolicy_binding();
		obj.set_labelname(labelname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnspolicylabel_dnspolicy_binding[] response = (dnspolicylabel_dnspolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnspolicylabel_dnspolicy_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String labelname, filtervalue[] filter) throws Exception{
		dnspolicylabel_dnspolicy_binding obj = new dnspolicylabel_dnspolicy_binding();
		obj.set_labelname(labelname);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnspolicylabel_dnspolicy_binding[] response = (dnspolicylabel_dnspolicy_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class labeltypeEnum {
		public static final String policylabel = "policylabel";
	}

}