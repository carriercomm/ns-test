/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.policy;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class policyexpression_response extends base_response
{
	public policyexpression[] policyexpression;
}
/**
* Configuration for expression resource.
*/

public class policyexpression extends base_resource
{
	private String name;
	private String value;
	private String description;
	private String comment;
	private String clientsecuritymessage;
	private String type;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long pihits;
	private String type1;
	private Boolean isdefault;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* The name of the expression that will be created.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the expression that will be created.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	*  The expression string.
	* </pre>
	*/
	public void set_value(String value) throws Exception{
		this.value = value;
	}

	/**
	* <pre>
	*  The expression string.
	* </pre>
	*/
	public String get_value() throws Exception {
		return this.value;
	}

	/**
	* <pre>
	* Description for the expression.
	* </pre>
	*/
	public void set_description(String description) throws Exception{
		this.description = description;
	}

	/**
	* <pre>
	* Description for the expression.
	* </pre>
	*/
	public String get_description() throws Exception {
		return this.description;
	}

	/**
	* <pre>
	* Comments associated with this expression.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comments associated with this expression.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* The client security message that will be displayed on failure of this expression.Only relevant for end point check expressions.<br> Minimum length =  1
	* </pre>
	*/
	public void set_clientsecuritymessage(String clientsecuritymessage) throws Exception{
		this.clientsecuritymessage = clientsecuritymessage;
	}

	/**
	* <pre>
	* The client security message that will be displayed on failure of this expression.Only relevant for end point check expressions.<br> Minimum length =  1
	* </pre>
	*/
	public String get_clientsecuritymessage() throws Exception {
		return this.clientsecuritymessage;
	}

	/**
	* <pre>
	* The type of expression. This is for input only.<br> Possible values = CLASSIC, ADVANCED
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* The type of expression. This is for input only.<br> Possible values = CLASSIC, ADVANCED
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* The total number of hits.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* The total number of hits.
	* </pre>
	*/
	public Long get_pihits() throws Exception {
		return this.pihits;
	}

	/**
	* <pre>
	* The type of expression. This is for output only.<br> Possible values = CLASSIC, ADVANCED
	* </pre>
	*/
	public String get_type1() throws Exception {
		return this.type1;
	}

	/**
	* <pre>
	* A value of true is returned if it is a default policy expression.
	* </pre>
	*/
	public Boolean get_isdefault() throws Exception {
		return this.isdefault;
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
		policyexpression_response result = (policyexpression_response) service.get_payload_formatter().string_to_resource(policyexpression_response.class, response);
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
		return result.policyexpression;
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
	* Use this API to add policyexpression.
	*/
	public static base_response add(nitro_service client, policyexpression resource) throws Exception {
		policyexpression addresource = new policyexpression();
		addresource.name = resource.name;
		addresource.value = resource.value;
		addresource.description = resource.description;
		addresource.comment = resource.comment;
		addresource.clientsecuritymessage = resource.clientsecuritymessage;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add policyexpression resources.
	*/
	public static base_responses add(nitro_service client, policyexpression resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policyexpression addresources[] = new policyexpression[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new policyexpression();
				addresources[i].name = resources[i].name;
				addresources[i].value = resources[i].value;
				addresources[i].description = resources[i].description;
				addresources[i].comment = resources[i].comment;
				addresources[i].clientsecuritymessage = resources[i].clientsecuritymessage;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete policyexpression of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		policyexpression deleteresource = new policyexpression();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete policyexpression.
	*/
	public static base_response delete(nitro_service client, policyexpression resource) throws Exception {
		policyexpression deleteresource = new policyexpression();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete policyexpression resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			policyexpression deleteresources[] = new policyexpression[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new policyexpression();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete policyexpression resources.
	*/
	public static base_responses delete(nitro_service client, policyexpression resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policyexpression deleteresources[] = new policyexpression[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new policyexpression();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update policyexpression.
	*/
	public static base_response update(nitro_service client, policyexpression resource) throws Exception {
		policyexpression updateresource = new policyexpression();
		updateresource.name = resource.name;
		updateresource.value = resource.value;
		updateresource.description = resource.description;
		updateresource.comment = resource.comment;
		updateresource.clientsecuritymessage = resource.clientsecuritymessage;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update policyexpression resources.
	*/
	public static base_responses update(nitro_service client, policyexpression resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policyexpression updateresources[] = new policyexpression[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new policyexpression();
				updateresources[i].name = resources[i].name;
				updateresources[i].value = resources[i].value;
				updateresources[i].description = resources[i].description;
				updateresources[i].comment = resources[i].comment;
				updateresources[i].clientsecuritymessage = resources[i].clientsecuritymessage;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of policyexpression resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		policyexpression unsetresource = new policyexpression();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of policyexpression resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, policyexpression resource, String[] args) throws Exception{
		policyexpression unsetresource = new policyexpression();
		unsetresource.name = resource.name;
		unsetresource.description = resource.description;
		unsetresource.comment = resource.comment;
		unsetresource.clientsecuritymessage = resource.clientsecuritymessage;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of policyexpression resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			policyexpression unsetresources[] = new policyexpression[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new policyexpression();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of policyexpression resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, policyexpression resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			policyexpression unsetresources[] = new policyexpression[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new policyexpression();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].description = resources[i].description;
				unsetresources[i].comment = resources[i].comment;
				unsetresources[i].clientsecuritymessage = resources[i].clientsecuritymessage;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the policyexpression resources that are configured on netscaler.
	*/
	public static policyexpression[] get(nitro_service service) throws Exception{
		policyexpression obj = new policyexpression();
		policyexpression[] response = (policyexpression[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the policyexpression resources that are configured on netscaler.
	*/
	public static policyexpression[] get(nitro_service service, options option) throws Exception{
		policyexpression obj = new policyexpression();
		policyexpression[] response = (policyexpression[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch all the policyexpression resources that are configured on netscaler.
	* This uses policyexpression_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static policyexpression[] get(nitro_service service, policyexpression_args args) throws Exception{
		policyexpression obj = new policyexpression();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		policyexpression[] response = (policyexpression[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch policyexpression resource of given name .
	*/
	public static policyexpression get(nitro_service service, String name) throws Exception{
		policyexpression obj = new policyexpression();
		obj.set_name(name);
		policyexpression response = (policyexpression) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch policyexpression resources of given names .
	*/
	public static policyexpression[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			policyexpression response[] = new policyexpression[name.length];
			policyexpression obj[] = new policyexpression[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new policyexpression();
				obj[i].set_name(name[i]);
				response[i] = (policyexpression) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of policyexpression resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static policyexpression[] get_filtered(nitro_service service, String filter) throws Exception{
		policyexpression obj = new policyexpression();
		options option = new options();
		option.set_filter(filter);
		policyexpression[] response = (policyexpression[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of policyexpression resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static policyexpression[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		policyexpression obj = new policyexpression();
		options option = new options();
		option.set_filter(filter);
		policyexpression[] response = (policyexpression[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the policyexpression resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		policyexpression obj = new policyexpression();
		options option = new options();
		option.set_count(true);
		policyexpression[] response = (policyexpression[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of policyexpression resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		policyexpression obj = new policyexpression();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		policyexpression[] response = (policyexpression[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of policyexpression resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		policyexpression obj = new policyexpression();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		policyexpression[] response = (policyexpression[]) obj.getfiltered(service, option);
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
	public static class typeEnum {
		public static final String CLASSIC = "CLASSIC";
		public static final String ADVANCED = "ADVANCED";
	}
	public static class type1Enum {
		public static final String CLASSIC = "CLASSIC";
		public static final String ADVANCED = "ADVANCED";
	}
}