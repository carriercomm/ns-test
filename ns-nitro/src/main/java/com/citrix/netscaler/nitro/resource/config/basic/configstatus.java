/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.basic;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class configstatus_response extends base_response
{
	public configstatus[] configstatus;
}
/**
* Configuration for packet engines status resource.
*/

public class configstatus extends base_resource
{

	//------- Read only Parameter ---------;

	private String consistent;
	private Long culpritcore;
	private Long core;
	private String culpritcoreconfstring;
	private String coreconfstring;
	private Long __count;

	/**
	* <pre>
	* State of packet engines.<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_consistent() throws Exception {
		return this.consistent;
	}

	/**
	* <pre>
	* Culprit core id.
	* </pre>
	*/
	public Long get_culpritcore() throws Exception {
		return this.culpritcore;
	}

	/**
	* <pre>
	* Core id.
	* </pre>
	*/
	public Long get_core() throws Exception {
		return this.core;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_culpritcoreconfstring() throws Exception {
		return this.culpritcoreconfstring;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_coreconfstring() throws Exception {
		return this.coreconfstring;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		configstatus_response result = (configstatus_response) service.get_payload_formatter().string_to_resource(configstatus_response.class, response);
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
		return result.configstatus;
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
	* Use this API to fetch all the configstatus resources that are configured on netscaler.
	*/
	public static configstatus[] get(nitro_service service) throws Exception{
		configstatus obj = new configstatus();
		configstatus[] response = (configstatus[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the configstatus resources that are configured on netscaler.
	*/
	public static configstatus[] get(nitro_service service, options option) throws Exception{
		configstatus obj = new configstatus();
		configstatus[] response = (configstatus[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch filtered set of configstatus resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static configstatus[] get_filtered(nitro_service service, String filter) throws Exception{
		configstatus obj = new configstatus();
		options option = new options();
		option.set_filter(filter);
		configstatus[] response = (configstatus[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of configstatus resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static configstatus[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		configstatus obj = new configstatus();
		options option = new options();
		option.set_filter(filter);
		configstatus[] response = (configstatus[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the configstatus resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		configstatus obj = new configstatus();
		options option = new options();
		option.set_count(true);
		configstatus[] response = (configstatus[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of configstatus resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		configstatus obj = new configstatus();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		configstatus[] response = (configstatus[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of configstatus resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		configstatus obj = new configstatus();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		configstatus[] response = (configstatus[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class consistentEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
