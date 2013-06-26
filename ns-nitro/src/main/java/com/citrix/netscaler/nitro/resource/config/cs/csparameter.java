/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.cs;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class csparameter_response extends base_response
{
	public csparameter csparameter;
}
/**
* Configuration for CS parameter resource.
*/

public class csparameter extends base_resource
{
	private String stateupdate;

	/**
	* <pre>
	* enable/disable state update.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_stateupdate(String stateupdate) throws Exception{
		this.stateupdate = stateupdate;
	}

	/**
	* <pre>
	* enable/disable state update.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_stateupdate() throws Exception {
		return this.stateupdate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		csparameter[] resources = new csparameter[1];
		csparameter_response result = (csparameter_response) service.get_payload_formatter().string_to_resource(csparameter_response.class, response);
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
		resources[0] = result.csparameter;
		return resources;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to update csparameter.
	*/
	public static base_response update(nitro_service client, csparameter resource) throws Exception {
		csparameter updateresource = new csparameter();
		updateresource.stateupdate = resource.stateupdate;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of csparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, csparameter resource, String[] args) throws Exception{
		csparameter unsetresource = new csparameter();
		unsetresource.stateupdate = resource.stateupdate;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the csparameter resources that are configured on netscaler.
	*/
	public static csparameter get(nitro_service service) throws Exception{
		csparameter obj = new csparameter();
		csparameter[] response = (csparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the csparameter resources that are configured on netscaler.
	*/
	public static csparameter get(nitro_service service,  options option) throws Exception{
		csparameter obj = new csparameter();
		csparameter[] response = (csparameter[])obj.get_resources(service,option);
		return response[0];
	}

	public static class stateupdateEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
