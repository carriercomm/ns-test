/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.tm;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class tmtrafficaction_response extends base_response
{
	public tmtrafficaction[] tmtrafficaction;
}
/**
* Configuration for TM traffic action resource.
*/

public class tmtrafficaction extends base_resource
{
	private String name;
	private Long apptimeout;
	private String sso;
	private String formssoaction;
	private String persistentcookie;
	private String initiatelogout;
	private Long __count;

	/**
	* <pre>
	* The name for the action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name for the action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The inactivity timeout after which the system closes a connection.<br> Minimum value =  1<br> Maximum value =  715827
	* </pre>
	*/
	public void set_apptimeout(long apptimeout) throws Exception {
		this.apptimeout = new Long(apptimeout);
	}

	/**
	* <pre>
	* The inactivity timeout after which the system closes a connection.<br> Minimum value =  1<br> Maximum value =  715827
	* </pre>
	*/
	public void set_apptimeout(Long apptimeout) throws Exception{
		this.apptimeout = apptimeout;
	}

	/**
	* <pre>
	* The inactivity timeout after which the system closes a connection.<br> Minimum value =  1<br> Maximum value =  715827
	* </pre>
	*/
	public Long get_apptimeout() throws Exception {
		return this.apptimeout;
	}

	/**
	* <pre>
	* Enable or disable Single Sign-On.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_sso(String sso) throws Exception{
		this.sso = sso;
	}

	/**
	* <pre>
	* Enable or disable Single Sign-On.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_sso() throws Exception {
		return this.sso;
	}

	/**
	* <pre>
	* Name of configured tm formssoaction.
	* </pre>
	*/
	public void set_formssoaction(String formssoaction) throws Exception{
		this.formssoaction = formssoaction;
	}

	/**
	* <pre>
	* Name of configured tm formssoaction.
	* </pre>
	*/
	public String get_formssoaction() throws Exception {
		return this.formssoaction;
	}

	/**
	* <pre>
	* Whether persistent cookie should be allowed on this traffic action.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_persistentcookie(String persistentcookie) throws Exception{
		this.persistentcookie = persistentcookie;
	}

	/**
	* <pre>
	* Whether persistent cookie should be allowed on this traffic action.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_persistentcookie() throws Exception {
		return this.persistentcookie;
	}

	/**
	* <pre>
	* Initiate Logout on this session.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_initiatelogout(String initiatelogout) throws Exception{
		this.initiatelogout = initiatelogout;
	}

	/**
	* <pre>
	* Initiate Logout on this session.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_initiatelogout() throws Exception {
		return this.initiatelogout;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		tmtrafficaction_response result = (tmtrafficaction_response) service.get_payload_formatter().string_to_resource(tmtrafficaction_response.class, response);
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
		return result.tmtrafficaction;
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
	* Use this API to add tmtrafficaction.
	*/
	public static base_response add(nitro_service client, tmtrafficaction resource) throws Exception {
		tmtrafficaction addresource = new tmtrafficaction();
		addresource.name = resource.name;
		addresource.apptimeout = resource.apptimeout;
		addresource.sso = resource.sso;
		addresource.formssoaction = resource.formssoaction;
		addresource.persistentcookie = resource.persistentcookie;
		addresource.initiatelogout = resource.initiatelogout;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add tmtrafficaction resources.
	*/
	public static base_responses add(nitro_service client, tmtrafficaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmtrafficaction addresources[] = new tmtrafficaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new tmtrafficaction();
				addresources[i].name = resources[i].name;
				addresources[i].apptimeout = resources[i].apptimeout;
				addresources[i].sso = resources[i].sso;
				addresources[i].formssoaction = resources[i].formssoaction;
				addresources[i].persistentcookie = resources[i].persistentcookie;
				addresources[i].initiatelogout = resources[i].initiatelogout;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete tmtrafficaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		tmtrafficaction deleteresource = new tmtrafficaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete tmtrafficaction.
	*/
	public static base_response delete(nitro_service client, tmtrafficaction resource) throws Exception {
		tmtrafficaction deleteresource = new tmtrafficaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete tmtrafficaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			tmtrafficaction deleteresources[] = new tmtrafficaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new tmtrafficaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete tmtrafficaction resources.
	*/
	public static base_responses delete(nitro_service client, tmtrafficaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmtrafficaction deleteresources[] = new tmtrafficaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new tmtrafficaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update tmtrafficaction.
	*/
	public static base_response update(nitro_service client, tmtrafficaction resource) throws Exception {
		tmtrafficaction updateresource = new tmtrafficaction();
		updateresource.name = resource.name;
		updateresource.apptimeout = resource.apptimeout;
		updateresource.sso = resource.sso;
		updateresource.formssoaction = resource.formssoaction;
		updateresource.persistentcookie = resource.persistentcookie;
		updateresource.initiatelogout = resource.initiatelogout;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update tmtrafficaction resources.
	*/
	public static base_responses update(nitro_service client, tmtrafficaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmtrafficaction updateresources[] = new tmtrafficaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new tmtrafficaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].apptimeout = resources[i].apptimeout;
				updateresources[i].sso = resources[i].sso;
				updateresources[i].formssoaction = resources[i].formssoaction;
				updateresources[i].persistentcookie = resources[i].persistentcookie;
				updateresources[i].initiatelogout = resources[i].initiatelogout;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of tmtrafficaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		tmtrafficaction unsetresource = new tmtrafficaction();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of tmtrafficaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, tmtrafficaction resource, String[] args) throws Exception{
		tmtrafficaction unsetresource = new tmtrafficaction();
		unsetresource.name = resource.name;
		unsetresource.persistentcookie = resource.persistentcookie;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of tmtrafficaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			tmtrafficaction unsetresources[] = new tmtrafficaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new tmtrafficaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of tmtrafficaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, tmtrafficaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			tmtrafficaction unsetresources[] = new tmtrafficaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new tmtrafficaction();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].persistentcookie = resources[i].persistentcookie;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the tmtrafficaction resources that are configured on netscaler.
	*/
	public static tmtrafficaction[] get(nitro_service service) throws Exception{
		tmtrafficaction obj = new tmtrafficaction();
		tmtrafficaction[] response = (tmtrafficaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the tmtrafficaction resources that are configured on netscaler.
	*/
	public static tmtrafficaction[] get(nitro_service service, options option) throws Exception{
		tmtrafficaction obj = new tmtrafficaction();
		tmtrafficaction[] response = (tmtrafficaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch tmtrafficaction resource of given name .
	*/
	public static tmtrafficaction get(nitro_service service, String name) throws Exception{
		tmtrafficaction obj = new tmtrafficaction();
		obj.set_name(name);
		tmtrafficaction response = (tmtrafficaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch tmtrafficaction resources of given names .
	*/
	public static tmtrafficaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			tmtrafficaction response[] = new tmtrafficaction[name.length];
			tmtrafficaction obj[] = new tmtrafficaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new tmtrafficaction();
				obj[i].set_name(name[i]);
				response[i] = (tmtrafficaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of tmtrafficaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static tmtrafficaction[] get_filtered(nitro_service service, String filter) throws Exception{
		tmtrafficaction obj = new tmtrafficaction();
		options option = new options();
		option.set_filter(filter);
		tmtrafficaction[] response = (tmtrafficaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of tmtrafficaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static tmtrafficaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		tmtrafficaction obj = new tmtrafficaction();
		options option = new options();
		option.set_filter(filter);
		tmtrafficaction[] response = (tmtrafficaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the tmtrafficaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		tmtrafficaction obj = new tmtrafficaction();
		options option = new options();
		option.set_count(true);
		tmtrafficaction[] response = (tmtrafficaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of tmtrafficaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		tmtrafficaction obj = new tmtrafficaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		tmtrafficaction[] response = (tmtrafficaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of tmtrafficaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		tmtrafficaction obj = new tmtrafficaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		tmtrafficaction[] response = (tmtrafficaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class persistentcookieEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class initiatelogoutEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class ssoEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}