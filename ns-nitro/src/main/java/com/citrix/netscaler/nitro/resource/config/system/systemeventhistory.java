/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.system;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class systemeventhistory_response extends base_response
{
	public systemeventhistory systemeventhistory;
}
/**
* Configuration for event history resource.
*/

public class systemeventhistory extends base_resource
{
	private String starttime;
	private String endtime;
	private Integer last;
	private String unit;
	private String datasource;

	//------- Read only Parameter ---------;

	private String response;

	/**
	* <pre>
	* Specify start time in mmddyyyyhhmm.
	* </pre>
	*/
	public void set_starttime(String starttime) throws Exception{
		this.starttime = starttime;
	}

	/**
	* <pre>
	* Specify start time in mmddyyyyhhmm.
	* </pre>
	*/
	public String get_starttime() throws Exception {
		return this.starttime;
	}

	/**
	* <pre>
	* Specify end time in mmddyyyyhhmm.
	* </pre>
	*/
	public void set_endtime(String endtime) throws Exception{
		this.endtime = endtime;
	}

	/**
	* <pre>
	* Specify end time in mmddyyyyhhmm.
	* </pre>
	*/
	public String get_endtime() throws Exception {
		return this.endtime;
	}

	/**
	* <pre>
	* Specify the  counters.<br> Default value: 1
	* </pre>
	*/
	public void set_last(int last) throws Exception {
		this.last = new Integer(last);
	}

	/**
	* <pre>
	* Specify the  counters.<br> Default value: 1
	* </pre>
	*/
	public void set_last(Integer last) throws Exception{
		this.last = last;
	}

	/**
	* <pre>
	* Specify the  counters.<br> Default value: 1
	* </pre>
	*/
	public Integer get_last() throws Exception {
		return this.last;
	}

	/**
	* <pre>
	* Specify the  Units.<br> Possible values = HOURS, DAYS, MONTHS
	* </pre>
	*/
	public void set_unit(String unit) throws Exception{
		this.unit = unit;
	}

	/**
	* <pre>
	* Specify the  Units.<br> Possible values = HOURS, DAYS, MONTHS
	* </pre>
	*/
	public String get_unit() throws Exception {
		return this.unit;
	}

	/**
	* <pre>
	* Specify Data source name.
	* </pre>
	*/
	public void set_datasource(String datasource) throws Exception{
		this.datasource = datasource;
	}

	/**
	* <pre>
	* Specify Data source name.
	* </pre>
	*/
	public String get_datasource() throws Exception {
		return this.datasource;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_response() throws Exception {
		return this.response;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		systemeventhistory[] resources = new systemeventhistory[1];
		systemeventhistory_response result = (systemeventhistory_response) service.get_payload_formatter().string_to_resource(systemeventhistory_response.class, response);
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
		resources[0] = result.systemeventhistory;
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
	* Use this API to fetch a systemeventhistory resource.
	*/
	public static systemeventhistory get(nitro_service service, systemeventhistory obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		systemeventhistory response = (systemeventhistory) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch all the systemeventhistory resources that are configured on netscaler.
	* This uses systemeventhistory_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static systemeventhistory[] get(nitro_service service, systemeventhistory_args args) throws Exception{
		systemeventhistory obj = new systemeventhistory();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		systemeventhistory[] response = (systemeventhistory[])obj.get_resources(service, option);
		return response;
	}

	public static class unitEnum {
		public static final String HOURS = "HOURS";
		public static final String DAYS = "DAYS";
		public static final String MONTHS = "MONTHS";
	}
}
