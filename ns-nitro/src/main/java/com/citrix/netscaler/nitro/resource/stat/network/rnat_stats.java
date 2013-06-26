/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.stat.network;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class rnat_response extends base_response
{
	public rnat_stats rnat;
}
/**
* Statistics for RNAT configured route resource.
*/

public class rnat_stats extends base_resource
{
	private Long rnattotrxbytes;
	private Long rnatrxbytesrate;
	private Long rnattottxbytes;
	private Long rnattxbytesrate;
	private Long rnattotrxpkts;
	private Long rnatrxpktsrate;
	private Long rnattottxpkts;
	private Long rnattxpktsrate;
	private Long rnattottxsyn;
	private Long rnattxsynrate;
	private Long rnatcursessions;

	/**
	* <pre>
	* Packets sent during RNAT sessions.
	* </pre>
	*/
	public Long get_rnattottxpkts() throws Exception {
		return this.rnattottxpkts;
	}

	/**
	* <pre>
	* Bytes received during RNAT sessions.
	* </pre>
	*/
	public Long get_rnatrxbytesrate() throws Exception {
		return this.rnatrxbytesrate;
	}

	/**
	* <pre>
	* Requests for connections sent during RNAT sessions.
	* </pre>
	*/
	public Long get_rnattxsynrate() throws Exception {
		return this.rnattxsynrate;
	}

	/**
	* <pre>
	* Packets sent during RNAT sessions.
	* </pre>
	*/
	public Long get_rnattxpktsrate() throws Exception {
		return this.rnattxpktsrate;
	}

	/**
	* <pre>
	* Requests for connections sent during RNAT sessions.
	* </pre>
	*/
	public Long get_rnattottxsyn() throws Exception {
		return this.rnattottxsyn;
	}

	/**
	* <pre>
	* Bytes sent during RNAT sessions.
	* </pre>
	*/
	public Long get_rnattxbytesrate() throws Exception {
		return this.rnattxbytesrate;
	}

	/**
	* <pre>
	* Packets received during RNAT sessions.
	* </pre>
	*/
	public Long get_rnatrxpktsrate() throws Exception {
		return this.rnatrxpktsrate;
	}

	/**
	* <pre>
	* Currently active RNAT sessions.
	* </pre>
	*/
	public Long get_rnatcursessions() throws Exception {
		return this.rnatcursessions;
	}

	/**
	* <pre>
	* Packets received during RNAT sessions.
	* </pre>
	*/
	public Long get_rnattotrxpkts() throws Exception {
		return this.rnattotrxpkts;
	}

	/**
	* <pre>
	* Bytes received during RNAT sessions.
	* </pre>
	*/
	public Long get_rnattotrxbytes() throws Exception {
		return this.rnattotrxbytes;
	}

	/**
	* <pre>
	* Bytes sent during RNAT sessions.
	* </pre>
	*/
	public Long get_rnattottxbytes() throws Exception {
		return this.rnattottxbytes;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		rnat_stats[] resources = new rnat_stats[1];
		rnat_response result = (rnat_response) service.get_payload_formatter().string_to_resource(rnat_response.class, response);
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
		resources[0] = result.rnat;
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
	* Use this API to fetch the statistics of all rnat_stats resources that are configured on netscaler.
	*/
	public static rnat_stats get(nitro_service service) throws Exception{
		rnat_stats obj = new rnat_stats();
		rnat_stats[] response = (rnat_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all rnat_stats resources that are configured on netscaler.
	*/
	public static rnat_stats get(nitro_service service,  options option) throws Exception{
		rnat_stats obj = new rnat_stats();
		rnat_stats[] response = (rnat_stats[])obj.stat_resources(service,option);
		return response[0];
	}

}
