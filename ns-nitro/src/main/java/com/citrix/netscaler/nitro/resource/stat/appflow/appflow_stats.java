/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.stat.appflow;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appflow_response extends base_response
{
	public appflow_stats appflow;
}

public class appflow_stats extends base_resource
{
	private Long appflowtotaltxoctets;
	private Long appflowtxoctetsrate;
	private Long appflowtotalflows;
	private Long appflowflowsrate;
	private Long appflowtotaltxmessagess;
	private Long appflowtxmessagessrate;
	private Long appflowtotalignoctets;
	private Long appflowignoctetsrate;
	private Long appflowtotalignpacketss;
	private Long appflowignpacketssrate;
	private Long appflowtotalnotxoctets;
	private Long appflownotxoctetsrate;
	private Long appflowtotalnotxflows;
	private Long appflownotxflowsrate;
	private Long appflowtotalnotxpackets;
	private Long appflownotxpacketsrate;

	/**
	* <pre>
	* The total number of AppFlow (IPFIX) octets that the NetScaler has transmitted.
	* </pre>
	*/
	public Long get_appflowtxoctetsrate() throws Exception {
		return this.appflowtxoctetsrate;
	}

	/**
	* <pre>
	* The total number of AppFlow (IPFIX) messages that the NetScaler has transmitted.
	* </pre>
	*/
	public Long get_appflowtxmessagessrate() throws Exception {
		return this.appflowtxmessagessrate;
	}

	/**
	* <pre>
	* The total number of AppFlow (IPFIX) octets that the NetScaler has not transmitted.
	* </pre>
	*/
	public Long get_appflowtotalnotxoctets() throws Exception {
		return this.appflowtotalnotxoctets;
	}

	/**
	* <pre>
	* The total number of AppFlow (IPFIX) messages that the NetScaler has transmitted.
	* </pre>
	*/
	public Long get_appflowtotaltxmessagess() throws Exception {
		return this.appflowtotaltxmessagess;
	}

	/**
	* <pre>
	* The total number of packets that the NetScaler has ignored for AppFlow (IPFIX).
	* </pre>
	*/
	public Long get_appflowtotalignpacketss() throws Exception {
		return this.appflowtotalignpacketss;
	}

	/**
	* <pre>
	* The total number of AppFlow (IPFIX) flows that the NetScaler has transmitted.
	* </pre>
	*/
	public Long get_appflowtotalflows() throws Exception {
		return this.appflowtotalflows;
	}

	/**
	* <pre>
	* The total number of AppFlow (IPFIX) flows that the NetScaler has not transmitted.
	* </pre>
	*/
	public Long get_appflowtotalnotxflows() throws Exception {
		return this.appflowtotalnotxflows;
	}

	/**
	* <pre>
	* The total number of AppFlow (IPFIX) flows that the NetScaler has not transmitted.
	* </pre>
	*/
	public Long get_appflownotxflowsrate() throws Exception {
		return this.appflownotxflowsrate;
	}

	/**
	* <pre>
	* The total number of octets that the NetScaler has ignored for AppFlow (IPFIX).
	* </pre>
	*/
	public Long get_appflowignoctetsrate() throws Exception {
		return this.appflowignoctetsrate;
	}

	/**
	* <pre>
	* The total number of octets that the NetScaler has ignored for AppFlow (IPFIX).
	* </pre>
	*/
	public Long get_appflowtotalignoctets() throws Exception {
		return this.appflowtotalignoctets;
	}

	/**
	* <pre>
	* The total number of AppFlow (IPFIX) octets that the NetScaler has transmitted.
	* </pre>
	*/
	public Long get_appflowtotaltxoctets() throws Exception {
		return this.appflowtotaltxoctets;
	}

	/**
	* <pre>
	* The total number of AppFlow (IPFIX) packets that the NetScaler has not transmitted.
	* </pre>
	*/
	public Long get_appflowtotalnotxpackets() throws Exception {
		return this.appflowtotalnotxpackets;
	}

	/**
	* <pre>
	* The total number of AppFlow (IPFIX) packets that the NetScaler has not transmitted.
	* </pre>
	*/
	public Long get_appflownotxpacketsrate() throws Exception {
		return this.appflownotxpacketsrate;
	}

	/**
	* <pre>
	* The total number of AppFlow (IPFIX) flows that the NetScaler has transmitted.
	* </pre>
	*/
	public Long get_appflowflowsrate() throws Exception {
		return this.appflowflowsrate;
	}

	/**
	* <pre>
	* The total number of AppFlow (IPFIX) octets that the NetScaler has not transmitted.
	* </pre>
	*/
	public Long get_appflownotxoctetsrate() throws Exception {
		return this.appflownotxoctetsrate;
	}

	/**
	* <pre>
	* The total number of packets that the NetScaler has ignored for AppFlow (IPFIX).
	* </pre>
	*/
	public Long get_appflowignpacketssrate() throws Exception {
		return this.appflowignpacketssrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		appflow_stats[] resources = new appflow_stats[1];
		appflow_response result = (appflow_response) service.get_payload_formatter().string_to_resource(appflow_response.class, response);
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
		resources[0] = result.appflow;
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
	* Use this API to fetch the statistics of all appflow_stats resources that are configured on netscaler.
	*/
	public static appflow_stats get(nitro_service service) throws Exception{
		appflow_stats obj = new appflow_stats();
		appflow_stats[] response = (appflow_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all appflow_stats resources that are configured on netscaler.
	*/
	public static appflow_stats get(nitro_service service,  options option) throws Exception{
		appflow_stats obj = new appflow_stats();
		appflow_stats[] response = (appflow_stats[])obj.stat_resources(service,option);
		return response[0];
	}

}
