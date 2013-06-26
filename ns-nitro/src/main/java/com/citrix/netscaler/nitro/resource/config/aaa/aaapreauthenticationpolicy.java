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

class aaapreauthenticationpolicy_response extends base_response
{
	public aaapreauthenticationpolicy[] aaapreauthenticationpolicy;
}
/**
* Configuration for pre authentication policy resource.
*/

public class aaapreauthenticationpolicy extends base_resource
{
	private String name;
	private String rule;
	private String reqaction;

	//------- Read only Parameter ---------;

	private Long hits;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* The name to assign to the new Pre-authentication policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name to assign to the new Pre-authentication policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The name of the rule or expression that the policy will use.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The name of the rule or expression that the policy will use.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The name of the RADIUS action the policy will use.<br> Minimum length =  1
	* </pre>
	*/
	public void set_reqaction(String reqaction) throws Exception{
		this.reqaction = reqaction;
	}

	/**
	* <pre>
	* The name of the RADIUS action the policy will use.<br> Minimum length =  1
	* </pre>
	*/
	public String get_reqaction() throws Exception {
		return this.reqaction;
	}

	/**
	* <pre>
	* No of hits.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* Indicates that a variable is a built-in (SYSTEM INTERNAL) type.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public String[] get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		aaapreauthenticationpolicy_response result = (aaapreauthenticationpolicy_response) service.get_payload_formatter().string_to_resource(aaapreauthenticationpolicy_response.class, response);
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
		return result.aaapreauthenticationpolicy;
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
	* Use this API to add aaapreauthenticationpolicy.
	*/
	public static base_response add(nitro_service client, aaapreauthenticationpolicy resource) throws Exception {
		aaapreauthenticationpolicy addresource = new aaapreauthenticationpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.reqaction = resource.reqaction;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add aaapreauthenticationpolicy resources.
	*/
	public static base_responses add(nitro_service client, aaapreauthenticationpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaapreauthenticationpolicy addresources[] = new aaapreauthenticationpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new aaapreauthenticationpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].reqaction = resources[i].reqaction;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete aaapreauthenticationpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		aaapreauthenticationpolicy deleteresource = new aaapreauthenticationpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete aaapreauthenticationpolicy.
	*/
	public static base_response delete(nitro_service client, aaapreauthenticationpolicy resource) throws Exception {
		aaapreauthenticationpolicy deleteresource = new aaapreauthenticationpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete aaapreauthenticationpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			aaapreauthenticationpolicy deleteresources[] = new aaapreauthenticationpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new aaapreauthenticationpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete aaapreauthenticationpolicy resources.
	*/
	public static base_responses delete(nitro_service client, aaapreauthenticationpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaapreauthenticationpolicy deleteresources[] = new aaapreauthenticationpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new aaapreauthenticationpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update aaapreauthenticationpolicy.
	*/
	public static base_response update(nitro_service client, aaapreauthenticationpolicy resource) throws Exception {
		aaapreauthenticationpolicy updateresource = new aaapreauthenticationpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.reqaction = resource.reqaction;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update aaapreauthenticationpolicy resources.
	*/
	public static base_responses update(nitro_service client, aaapreauthenticationpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			aaapreauthenticationpolicy updateresources[] = new aaapreauthenticationpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new aaapreauthenticationpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].reqaction = resources[i].reqaction;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the aaapreauthenticationpolicy resources that are configured on netscaler.
	*/
	public static aaapreauthenticationpolicy[] get(nitro_service service) throws Exception{
		aaapreauthenticationpolicy obj = new aaapreauthenticationpolicy();
		aaapreauthenticationpolicy[] response = (aaapreauthenticationpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the aaapreauthenticationpolicy resources that are configured on netscaler.
	*/
	public static aaapreauthenticationpolicy[] get(nitro_service service, options option) throws Exception{
		aaapreauthenticationpolicy obj = new aaapreauthenticationpolicy();
		aaapreauthenticationpolicy[] response = (aaapreauthenticationpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch aaapreauthenticationpolicy resource of given name .
	*/
	public static aaapreauthenticationpolicy get(nitro_service service, String name) throws Exception{
		aaapreauthenticationpolicy obj = new aaapreauthenticationpolicy();
		obj.set_name(name);
		aaapreauthenticationpolicy response = (aaapreauthenticationpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch aaapreauthenticationpolicy resources of given names .
	*/
	public static aaapreauthenticationpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			aaapreauthenticationpolicy response[] = new aaapreauthenticationpolicy[name.length];
			aaapreauthenticationpolicy obj[] = new aaapreauthenticationpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new aaapreauthenticationpolicy();
				obj[i].set_name(name[i]);
				response[i] = (aaapreauthenticationpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of aaapreauthenticationpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static aaapreauthenticationpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		aaapreauthenticationpolicy obj = new aaapreauthenticationpolicy();
		options option = new options();
		option.set_filter(filter);
		aaapreauthenticationpolicy[] response = (aaapreauthenticationpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of aaapreauthenticationpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static aaapreauthenticationpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		aaapreauthenticationpolicy obj = new aaapreauthenticationpolicy();
		options option = new options();
		option.set_filter(filter);
		aaapreauthenticationpolicy[] response = (aaapreauthenticationpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the aaapreauthenticationpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		aaapreauthenticationpolicy obj = new aaapreauthenticationpolicy();
		options option = new options();
		option.set_count(true);
		aaapreauthenticationpolicy[] response = (aaapreauthenticationpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of aaapreauthenticationpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		aaapreauthenticationpolicy obj = new aaapreauthenticationpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaapreauthenticationpolicy[] response = (aaapreauthenticationpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of aaapreauthenticationpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		aaapreauthenticationpolicy obj = new aaapreauthenticationpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		aaapreauthenticationpolicy[] response = (aaapreauthenticationpolicy[]) obj.getfiltered(service, option);
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