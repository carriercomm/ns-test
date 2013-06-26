/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.stat.system;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class systemcpu_response extends base_response
{
	public systemcpu_stats[] systemcpu;
}
/**
* Statistics for cpu resource.
*/

public class systemcpu_stats extends base_resource
{
	private Long id;
	private Long percpuuse;

	/**
	* <pre>
	* Specifies the  CPU ID.
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* Specifies the  CPU ID.
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* Specifies the  CPU ID.<br> Default value: 65535<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* CPU utilization percentage.
	* </pre>
	*/
	public Long get_percpuuse() throws Exception {
		return this.percpuuse;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		systemcpu_response result = (systemcpu_response) service.get_payload_formatter().string_to_resource(systemcpu_response.class, response);
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
		return result.systemcpu;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.id != null) {
			return this.id.toString();
		}
		return null;
	}

	/**
	* Use this API to fetch the statistics of all systemcpu_stats resources that are configured on netscaler.
	*/
	public static systemcpu_stats[] get(nitro_service service) throws Exception{
		systemcpu_stats obj = new systemcpu_stats();
		systemcpu_stats[] response = (systemcpu_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all systemcpu_stats resources that are configured on netscaler.
	*/
	public static systemcpu_stats[] get(nitro_service service, options option) throws Exception{
		systemcpu_stats obj = new systemcpu_stats();
		systemcpu_stats[] response = (systemcpu_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of systemcpu_stats resource of given name .
	*/
	public static systemcpu_stats get(nitro_service service, Long id) throws Exception{
		systemcpu_stats obj = new systemcpu_stats();
		obj.set_id(id);
		systemcpu_stats response = (systemcpu_stats) obj.stat_resource(service);
		return response;
	}

}
