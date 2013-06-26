/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.vpn;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpntrafficpolicy_response extends base_response
{
	public vpntrafficpolicy[] vpntrafficpolicy;
}
/**
* Configuration for VPN traffic policy resource.
*/

public class vpntrafficpolicy extends base_resource
{
	private String name;
	private String rule;
	private String action;
	private Long __count;

	/**
	* <pre>
	* The name for the new vpn traffic policy.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name for the new vpn traffic policy.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The rule to be used by the vpn traffic policy. Rules are combinations of Expressions. Expressions are simple conditions, such as a test for equality, applied to operands, such as a URL string or an IP address. Expression syntax is described in the Installation and Configuration Guide.
	* </pre>
	*/
	public void set_rule(String rule) throws Exception{
		this.rule = rule;
	}

	/**
	* <pre>
	* The rule to be used by the vpn traffic policy. Rules are combinations of Expressions. Expressions are simple conditions, such as a test for equality, applied to operands, such as a URL string or an IP address. Expression syntax is described in the Installation and Configuration Guide.
	* </pre>
	*/
	public String get_rule() throws Exception {
		return this.rule;
	}

	/**
	* <pre>
	* The action to be applied by the policy if its rule is matched.<br> Minimum length =  1
	* </pre>
	*/
	public void set_action(String action) throws Exception{
		this.action = action;
	}

	/**
	* <pre>
	* The action to be applied by the policy if its rule is matched.<br> Minimum length =  1
	* </pre>
	*/
	public String get_action() throws Exception {
		return this.action;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpntrafficpolicy_response result = (vpntrafficpolicy_response) service.get_payload_formatter().string_to_resource(vpntrafficpolicy_response.class, response);
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
		return result.vpntrafficpolicy;
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
	* Use this API to add vpntrafficpolicy.
	*/
	public static base_response add(nitro_service client, vpntrafficpolicy resource) throws Exception {
		vpntrafficpolicy addresource = new vpntrafficpolicy();
		addresource.name = resource.name;
		addresource.rule = resource.rule;
		addresource.action = resource.action;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add vpntrafficpolicy resources.
	*/
	public static base_responses add(nitro_service client, vpntrafficpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpntrafficpolicy addresources[] = new vpntrafficpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new vpntrafficpolicy();
				addresources[i].name = resources[i].name;
				addresources[i].rule = resources[i].rule;
				addresources[i].action = resources[i].action;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpntrafficpolicy of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		vpntrafficpolicy deleteresource = new vpntrafficpolicy();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpntrafficpolicy.
	*/
	public static base_response delete(nitro_service client, vpntrafficpolicy resource) throws Exception {
		vpntrafficpolicy deleteresource = new vpntrafficpolicy();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpntrafficpolicy resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpntrafficpolicy deleteresources[] = new vpntrafficpolicy[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new vpntrafficpolicy();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpntrafficpolicy resources.
	*/
	public static base_responses delete(nitro_service client, vpntrafficpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpntrafficpolicy deleteresources[] = new vpntrafficpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpntrafficpolicy();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update vpntrafficpolicy.
	*/
	public static base_response update(nitro_service client, vpntrafficpolicy resource) throws Exception {
		vpntrafficpolicy updateresource = new vpntrafficpolicy();
		updateresource.name = resource.name;
		updateresource.rule = resource.rule;
		updateresource.action = resource.action;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update vpntrafficpolicy resources.
	*/
	public static base_responses update(nitro_service client, vpntrafficpolicy resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpntrafficpolicy updateresources[] = new vpntrafficpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vpntrafficpolicy();
				updateresources[i].name = resources[i].name;
				updateresources[i].rule = resources[i].rule;
				updateresources[i].action = resources[i].action;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vpntrafficpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		vpntrafficpolicy unsetresource = new vpntrafficpolicy();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of vpntrafficpolicy resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, vpntrafficpolicy resource, String[] args) throws Exception{
		vpntrafficpolicy unsetresource = new vpntrafficpolicy();
		unsetresource.name = resource.name;
		unsetresource.rule = resource.rule;
		unsetresource.action = resource.action;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of vpntrafficpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpntrafficpolicy unsetresources[] = new vpntrafficpolicy[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new vpntrafficpolicy();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vpntrafficpolicy resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, vpntrafficpolicy resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpntrafficpolicy unsetresources[] = new vpntrafficpolicy[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new vpntrafficpolicy();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].rule = resources[i].rule;
				unsetresources[i].action = resources[i].action;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the vpntrafficpolicy resources that are configured on netscaler.
	*/
	public static vpntrafficpolicy[] get(nitro_service service) throws Exception{
		vpntrafficpolicy obj = new vpntrafficpolicy();
		vpntrafficpolicy[] response = (vpntrafficpolicy[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the vpntrafficpolicy resources that are configured on netscaler.
	*/
	public static vpntrafficpolicy[] get(nitro_service service, options option) throws Exception{
		vpntrafficpolicy obj = new vpntrafficpolicy();
		vpntrafficpolicy[] response = (vpntrafficpolicy[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch vpntrafficpolicy resource of given name .
	*/
	public static vpntrafficpolicy get(nitro_service service, String name) throws Exception{
		vpntrafficpolicy obj = new vpntrafficpolicy();
		obj.set_name(name);
		vpntrafficpolicy response = (vpntrafficpolicy) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vpntrafficpolicy resources of given names .
	*/
	public static vpntrafficpolicy[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			vpntrafficpolicy response[] = new vpntrafficpolicy[name.length];
			vpntrafficpolicy obj[] = new vpntrafficpolicy[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new vpntrafficpolicy();
				obj[i].set_name(name[i]);
				response[i] = (vpntrafficpolicy) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of vpntrafficpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpntrafficpolicy[] get_filtered(nitro_service service, String filter) throws Exception{
		vpntrafficpolicy obj = new vpntrafficpolicy();
		options option = new options();
		option.set_filter(filter);
		vpntrafficpolicy[] response = (vpntrafficpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpntrafficpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpntrafficpolicy[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpntrafficpolicy obj = new vpntrafficpolicy();
		options option = new options();
		option.set_filter(filter);
		vpntrafficpolicy[] response = (vpntrafficpolicy[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vpntrafficpolicy resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vpntrafficpolicy obj = new vpntrafficpolicy();
		options option = new options();
		option.set_count(true);
		vpntrafficpolicy[] response = (vpntrafficpolicy[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of vpntrafficpolicy resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vpntrafficpolicy obj = new vpntrafficpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpntrafficpolicy[] response = (vpntrafficpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpntrafficpolicy resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpntrafficpolicy obj = new vpntrafficpolicy();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpntrafficpolicy[] response = (vpntrafficpolicy[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

}