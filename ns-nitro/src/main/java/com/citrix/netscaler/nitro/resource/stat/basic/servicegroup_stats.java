/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.stat.basic;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class servicegroup_response extends base_response
{
	public servicegroup_stats[] servicegroup;
}
/**
* Statistics for service group resource.
*/

public class servicegroup_stats extends base_resource
{
	private String servicegroupname;
	private String state;
	private String servicetype;

	/**
	* <pre>
	* The name of a service group
	* </pre>
	*/
	public void set_servicegroupname(String servicegroupname) throws Exception{
		this.servicegroupname = servicegroupname;
	}

	/**
	* <pre>
	* The name of a service group.<br> Minimum length =  1
	* </pre>
	*/
	public String get_servicegroupname() throws Exception {
		return this.servicegroupname;
	}

	/**
	* <pre>
	* The service type of this service.
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* Current state of the server.
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
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		servicegroup_response result = (servicegroup_response) service.get_payload_formatter().string_to_resource(servicegroup_response.class, response);
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
		return result.servicegroup;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.servicegroupname;
	}

	/**
	* Use this API to fetch the statistics of all servicegroup_stats resources that are configured on netscaler.
	*/
	public static servicegroup_stats[] get(nitro_service service) throws Exception{
		servicegroup_stats obj = new servicegroup_stats();
		servicegroup_stats[] response = (servicegroup_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all servicegroup_stats resources that are configured on netscaler.
	*/
	public static servicegroup_stats[] get(nitro_service service, options option) throws Exception{
		servicegroup_stats obj = new servicegroup_stats();
		servicegroup_stats[] response = (servicegroup_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of servicegroup_stats resource of given name .
	*/
	public static servicegroup_stats get(nitro_service service, String servicegroupname) throws Exception{
		servicegroup_stats obj = new servicegroup_stats();
		obj.set_servicegroupname(servicegroupname);
		servicegroup_stats response = (servicegroup_stats) obj.stat_resource(service);
		return response;
	}

}
