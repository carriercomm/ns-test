/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.authentication;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authenticationtacacsaction_response extends base_response
{
	public authenticationtacacsaction[] authenticationtacacsaction;
}
/**
* Configuration for TACACS action resource.
*/

public class authenticationtacacsaction extends base_resource
{
	private String name;
	private String serverip;
	private Integer serverport;
	private Long authtimeout;
	private String tacacssecret;
	private String authorization;
	private String accounting;
	private String auditfailedcmds;

	//------- Read only Parameter ---------;

	private Long success;
	private Long failure;
	private Long __count;

	/**
	* <pre>
	* The name for the new TACACS+ action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name for the new TACACS+ action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The IP address of the TACACS+ server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_serverip(String serverip) throws Exception{
		this.serverip = serverip;
	}

	/**
	* <pre>
	* The IP address of the TACACS+ server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_serverip() throws Exception {
		return this.serverip;
	}

	/**
	* <pre>
	* The port on which the TACACS+ server is running.<br> Default value: 49<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(int serverport) throws Exception {
		this.serverport = new Integer(serverport);
	}

	/**
	* <pre>
	* The port on which the TACACS+ server is running.<br> Default value: 49<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(Integer serverport) throws Exception{
		this.serverport = serverport;
	}

	/**
	* <pre>
	* The port on which the TACACS+ server is running.<br> Default value: 49<br> Minimum value =  1
	* </pre>
	*/
	public Integer get_serverport() throws Exception {
		return this.serverport;
	}

	/**
	* <pre>
	* The maximum number of seconds the system will wait for a response from the TACACS+ server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public void set_authtimeout(long authtimeout) throws Exception {
		this.authtimeout = new Long(authtimeout);
	}

	/**
	* <pre>
	* The maximum number of seconds the system will wait for a response from the TACACS+ server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public void set_authtimeout(Long authtimeout) throws Exception{
		this.authtimeout = authtimeout;
	}

	/**
	* <pre>
	* The maximum number of seconds the system will wait for a response from the TACACS+ server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public Long get_authtimeout() throws Exception {
		return this.authtimeout;
	}

	/**
	* <pre>
	* The key shared between the client and the server. This information is required for the system to communicate with the TACACS+ server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_tacacssecret(String tacacssecret) throws Exception{
		this.tacacssecret = tacacssecret;
	}

	/**
	* <pre>
	* The key shared between the client and the server. This information is required for the system to communicate with the TACACS+ server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_tacacssecret() throws Exception {
		return this.tacacssecret;
	}

	/**
	* <pre>
	* The state of the TACACS+ server that will be used for streaming authorization.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_authorization(String authorization) throws Exception{
		this.authorization = authorization;
	}

	/**
	* <pre>
	* The state of the TACACS+ server that will be used for streaming authorization.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_authorization() throws Exception {
		return this.authorization;
	}

	/**
	* <pre>
	* The state of the TACACS+ server that will receive accounting messages.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_accounting(String accounting) throws Exception{
		this.accounting = accounting;
	}

	/**
	* <pre>
	* The state of the TACACS+ server that will receive accounting messages.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_accounting() throws Exception {
		return this.accounting;
	}

	/**
	* <pre>
	* The state of the TACACS+ server that will receive accounting messages.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_auditfailedcmds(String auditfailedcmds) throws Exception{
		this.auditfailedcmds = auditfailedcmds;
	}

	/**
	* <pre>
	* The state of the TACACS+ server that will receive accounting messages.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_auditfailedcmds() throws Exception {
		return this.auditfailedcmds;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_success() throws Exception {
		return this.success;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_failure() throws Exception {
		return this.failure;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationtacacsaction_response result = (authenticationtacacsaction_response) service.get_payload_formatter().string_to_resource(authenticationtacacsaction_response.class, response);
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
		return result.authenticationtacacsaction;
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
	* Use this API to add authenticationtacacsaction.
	*/
	public static base_response add(nitro_service client, authenticationtacacsaction resource) throws Exception {
		authenticationtacacsaction addresource = new authenticationtacacsaction();
		addresource.name = resource.name;
		addresource.serverip = resource.serverip;
		addresource.serverport = resource.serverport;
		addresource.authtimeout = resource.authtimeout;
		addresource.tacacssecret = resource.tacacssecret;
		addresource.authorization = resource.authorization;
		addresource.accounting = resource.accounting;
		addresource.auditfailedcmds = resource.auditfailedcmds;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add authenticationtacacsaction resources.
	*/
	public static base_responses add(nitro_service client, authenticationtacacsaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationtacacsaction addresources[] = new authenticationtacacsaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new authenticationtacacsaction();
				addresources[i].name = resources[i].name;
				addresources[i].serverip = resources[i].serverip;
				addresources[i].serverport = resources[i].serverport;
				addresources[i].authtimeout = resources[i].authtimeout;
				addresources[i].tacacssecret = resources[i].tacacssecret;
				addresources[i].authorization = resources[i].authorization;
				addresources[i].accounting = resources[i].accounting;
				addresources[i].auditfailedcmds = resources[i].auditfailedcmds;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationtacacsaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		authenticationtacacsaction deleteresource = new authenticationtacacsaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationtacacsaction.
	*/
	public static base_response delete(nitro_service client, authenticationtacacsaction resource) throws Exception {
		authenticationtacacsaction deleteresource = new authenticationtacacsaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationtacacsaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationtacacsaction deleteresources[] = new authenticationtacacsaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new authenticationtacacsaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationtacacsaction resources.
	*/
	public static base_responses delete(nitro_service client, authenticationtacacsaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationtacacsaction deleteresources[] = new authenticationtacacsaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new authenticationtacacsaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update authenticationtacacsaction.
	*/
	public static base_response update(nitro_service client, authenticationtacacsaction resource) throws Exception {
		authenticationtacacsaction updateresource = new authenticationtacacsaction();
		updateresource.name = resource.name;
		updateresource.serverip = resource.serverip;
		updateresource.serverport = resource.serverport;
		updateresource.authtimeout = resource.authtimeout;
		updateresource.tacacssecret = resource.tacacssecret;
		updateresource.authorization = resource.authorization;
		updateresource.accounting = resource.accounting;
		updateresource.auditfailedcmds = resource.auditfailedcmds;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update authenticationtacacsaction resources.
	*/
	public static base_responses update(nitro_service client, authenticationtacacsaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationtacacsaction updateresources[] = new authenticationtacacsaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new authenticationtacacsaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].serverip = resources[i].serverip;
				updateresources[i].serverport = resources[i].serverport;
				updateresources[i].authtimeout = resources[i].authtimeout;
				updateresources[i].tacacssecret = resources[i].tacacssecret;
				updateresources[i].authorization = resources[i].authorization;
				updateresources[i].accounting = resources[i].accounting;
				updateresources[i].auditfailedcmds = resources[i].auditfailedcmds;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationtacacsaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		authenticationtacacsaction unsetresource = new authenticationtacacsaction();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of authenticationtacacsaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, authenticationtacacsaction resource, String[] args) throws Exception{
		authenticationtacacsaction unsetresource = new authenticationtacacsaction();
		unsetresource.name = resource.name;
		unsetresource.serverip = resource.serverip;
		unsetresource.serverport = resource.serverport;
		unsetresource.authtimeout = resource.authtimeout;
		unsetresource.tacacssecret = resource.tacacssecret;
		unsetresource.authorization = resource.authorization;
		unsetresource.accounting = resource.accounting;
		unsetresource.auditfailedcmds = resource.auditfailedcmds;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of authenticationtacacsaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationtacacsaction unsetresources[] = new authenticationtacacsaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new authenticationtacacsaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationtacacsaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, authenticationtacacsaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationtacacsaction unsetresources[] = new authenticationtacacsaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new authenticationtacacsaction();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].serverip = resources[i].serverip;
				unsetresources[i].serverport = resources[i].serverport;
				unsetresources[i].authtimeout = resources[i].authtimeout;
				unsetresources[i].tacacssecret = resources[i].tacacssecret;
				unsetresources[i].authorization = resources[i].authorization;
				unsetresources[i].accounting = resources[i].accounting;
				unsetresources[i].auditfailedcmds = resources[i].auditfailedcmds;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the authenticationtacacsaction resources that are configured on netscaler.
	*/
	public static authenticationtacacsaction[] get(nitro_service service) throws Exception{
		authenticationtacacsaction obj = new authenticationtacacsaction();
		authenticationtacacsaction[] response = (authenticationtacacsaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the authenticationtacacsaction resources that are configured on netscaler.
	*/
	public static authenticationtacacsaction[] get(nitro_service service, options option) throws Exception{
		authenticationtacacsaction obj = new authenticationtacacsaction();
		authenticationtacacsaction[] response = (authenticationtacacsaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch authenticationtacacsaction resource of given name .
	*/
	public static authenticationtacacsaction get(nitro_service service, String name) throws Exception{
		authenticationtacacsaction obj = new authenticationtacacsaction();
		obj.set_name(name);
		authenticationtacacsaction response = (authenticationtacacsaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationtacacsaction resources of given names .
	*/
	public static authenticationtacacsaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationtacacsaction response[] = new authenticationtacacsaction[name.length];
			authenticationtacacsaction obj[] = new authenticationtacacsaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationtacacsaction();
				obj[i].set_name(name[i]);
				response[i] = (authenticationtacacsaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of authenticationtacacsaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authenticationtacacsaction[] get_filtered(nitro_service service, String filter) throws Exception{
		authenticationtacacsaction obj = new authenticationtacacsaction();
		options option = new options();
		option.set_filter(filter);
		authenticationtacacsaction[] response = (authenticationtacacsaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationtacacsaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authenticationtacacsaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationtacacsaction obj = new authenticationtacacsaction();
		options option = new options();
		option.set_filter(filter);
		authenticationtacacsaction[] response = (authenticationtacacsaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the authenticationtacacsaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		authenticationtacacsaction obj = new authenticationtacacsaction();
		options option = new options();
		option.set_count(true);
		authenticationtacacsaction[] response = (authenticationtacacsaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of authenticationtacacsaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		authenticationtacacsaction obj = new authenticationtacacsaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationtacacsaction[] response = (authenticationtacacsaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationtacacsaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationtacacsaction obj = new authenticationtacacsaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationtacacsaction[] response = (authenticationtacacsaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class auditfailedcmdsEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class authorizationEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class accountingEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
}
