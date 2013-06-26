/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.network;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class ptp_response extends base_response
{
	public ptp ptp;
}
/**
* Configuration for Precision Time Protocol resource.
*/

public class ptp extends base_resource
{
	private String state;

	/**
	* <pre>
	* Running State of Precision Time Protocol (PTP) on the cluster. When enabled, PTP synchronizes the time on the cluster nodes. Otherwise, you can configure NTP (on the cluster IP address) to synchronize the time on the cluster nodes.<br> Default value: NSA_PTP_ENABLE<br> Possible values = 
	* </pre>
	*/
	public void set_state(String state) throws Exception{
		this.state = state;
	}

	/**
	* <pre>
	* Running State of Precision Time Protocol (PTP) on the cluster. When enabled, PTP synchronizes the time on the cluster nodes. Otherwise, you can configure NTP (on the cluster IP address) to synchronize the time on the cluster nodes.<br> Default value: NSA_PTP_ENABLE<br> Possible values = 
	* </pre>
	*/
	public String get_state() throws Exception {
		return this.state;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		ptp[] resources = new ptp[1];
		ptp_response result = (ptp_response) service.get_payload_formatter().string_to_resource(ptp_response.class, response);
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
		resources[0] = result.ptp;
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
	* Use this API to update ptp.
	*/
	public static base_response update(nitro_service client, ptp resource) throws Exception {
		ptp updateresource = new ptp();
		updateresource.state = resource.state;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to fetch all the ptp resources that are configured on netscaler.
	*/
	public static ptp get(nitro_service service) throws Exception{
		ptp obj = new ptp();
		ptp[] response = (ptp[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the ptp resources that are configured on netscaler.
	*/
	public static ptp get(nitro_service service,  options option) throws Exception{
		ptp obj = new ptp();
		ptp[] response = (ptp[])obj.get_resources(service,option);
		return response[0];
	}

}
