/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.ha;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class hafailover_response extends base_response
{
	public hafailover hafailover;
}
/**
* Configuration for failover resource.
*/

public class hafailover extends base_resource
{
	private Boolean force;

	/**
	* <pre>
	* Force a failover without prompting for confirmation.
	* </pre>
	*/
	public void set_force(boolean force) throws Exception {
		this.force = new Boolean(force);
	}

	/**
	* <pre>
	* Force a failover without prompting for confirmation.
	* </pre>
	*/
	public void set_force(Boolean force) throws Exception{
		this.force = force;
	}

	/**
	* <pre>
	* Force a failover without prompting for confirmation.
	* </pre>
	*/
	public Boolean get_force() throws Exception {
		return this.force;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		hafailover[] resources = new hafailover[1];
		hafailover_response result = (hafailover_response) service.get_payload_formatter().string_to_resource(hafailover_response.class, response);
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
		resources[0] = result.hafailover;
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
	* Use this API to Force hafailover.
	*/
	public static base_response Force(nitro_service client, hafailover resource) throws Exception {
		hafailover Forceresource = new hafailover();
		Forceresource.force = resource.force;
		return Forceresource.perform_operation(client,"Force");
	}

}
