/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nsweblogparam_response extends base_response
{
	public nsweblogparam nsweblogparam;
}
/**
* Configuration for Web log parameters resource.
*/

public class nsweblogparam extends base_resource
{
	private Long buffersizemb;

	/**
	* <pre>
	* The buffer size (in MB) allocated for log transaction data on the system. Maximum value is limited by the memory available in the system.<br> Minimum value =  1<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public void set_buffersizemb(long buffersizemb) throws Exception {
		this.buffersizemb = new Long(buffersizemb);
	}

	/**
	* <pre>
	* The buffer size (in MB) allocated for log transaction data on the system. Maximum value is limited by the memory available in the system.<br> Minimum value =  1<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public void set_buffersizemb(Long buffersizemb) throws Exception{
		this.buffersizemb = buffersizemb;
	}

	/**
	* <pre>
	* The buffer size (in MB) allocated for log transaction data on the system. Maximum value is limited by the memory available in the system.<br> Minimum value =  1<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public Long get_buffersizemb() throws Exception {
		return this.buffersizemb;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nsweblogparam[] resources = new nsweblogparam[1];
		nsweblogparam_response result = (nsweblogparam_response) service.get_payload_formatter().string_to_resource(nsweblogparam_response.class, response);
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
		resources[0] = result.nsweblogparam;
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
	* Use this API to update nsweblogparam.
	*/
	public static base_response update(nitro_service client, nsweblogparam resource) throws Exception {
		nsweblogparam updateresource = new nsweblogparam();
		updateresource.buffersizemb = resource.buffersizemb;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to fetch all the nsweblogparam resources that are configured on netscaler.
	*/
	public static nsweblogparam get(nitro_service service) throws Exception{
		nsweblogparam obj = new nsweblogparam();
		nsweblogparam[] response = (nsweblogparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nsweblogparam resources that are configured on netscaler.
	*/
	public static nsweblogparam get(nitro_service service,  options option) throws Exception{
		nsweblogparam obj = new nsweblogparam();
		nsweblogparam[] response = (nsweblogparam[])obj.get_resources(service,option);
		return response[0];
	}

}
