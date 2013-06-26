/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.stat.ipsec;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class ipseccounters_response extends base_response
{
	public ipseccounters_stats ipseccounters;
}
/**
* Statistics for counters resource.
*/

public class ipseccounters_stats extends base_resource
{
	private Long ipsectotrxbytes;
	private Long ipsecrxbytesrate;
	private Long ipsectottxbytes;
	private Long ipsectxbytesrate;
	private Long ipsectotrxpkts;
	private Long ipsecrxpktsrate;
	private Long ipsectottxpkts;
	private Long ipsectxpktsrate;

	/**
	* <pre>
	* Bytes received during IPsec sessions.
	* </pre>
	*/
	public Long get_ipsecrxbytesrate() throws Exception {
		return this.ipsecrxbytesrate;
	}

	/**
	* <pre>
	* Bytes sent during IPsec sessions.
	* </pre>
	*/
	public Long get_ipsectxbytesrate() throws Exception {
		return this.ipsectxbytesrate;
	}

	/**
	* <pre>
	* Bytes sent during IPsec sessions.
	* </pre>
	*/
	public Long get_ipsectottxbytes() throws Exception {
		return this.ipsectottxbytes;
	}

	/**
	* <pre>
	* Packets received during IPsec sessions.
	* </pre>
	*/
	public Long get_ipsecrxpktsrate() throws Exception {
		return this.ipsecrxpktsrate;
	}

	/**
	* <pre>
	* Packets received during IPsec sessions.
	* </pre>
	*/
	public Long get_ipsectotrxpkts() throws Exception {
		return this.ipsectotrxpkts;
	}

	/**
	* <pre>
	* Packets sent during IPsec sessions.
	* </pre>
	*/
	public Long get_ipsectottxpkts() throws Exception {
		return this.ipsectottxpkts;
	}

	/**
	* <pre>
	* Bytes received during IPsec sessions.
	* </pre>
	*/
	public Long get_ipsectotrxbytes() throws Exception {
		return this.ipsectotrxbytes;
	}

	/**
	* <pre>
	* Packets sent during IPsec sessions.
	* </pre>
	*/
	public Long get_ipsectxpktsrate() throws Exception {
		return this.ipsectxpktsrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		ipseccounters_stats[] resources = new ipseccounters_stats[1];
		ipseccounters_response result = (ipseccounters_response) service.get_payload_formatter().string_to_resource(ipseccounters_response.class, response);
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
		resources[0] = result.ipseccounters;
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
	* Use this API to fetch the statistics of all ipseccounters_stats resources that are configured on netscaler.
	*/
	public static ipseccounters_stats get(nitro_service service) throws Exception{
		ipseccounters_stats obj = new ipseccounters_stats();
		ipseccounters_stats[] response = (ipseccounters_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all ipseccounters_stats resources that are configured on netscaler.
	*/
	public static ipseccounters_stats get(nitro_service service,  options option) throws Exception{
		ipseccounters_stats obj = new ipseccounters_stats();
		ipseccounters_stats[] response = (ipseccounters_stats[])obj.stat_resources(service,option);
		return response[0];
	}

}
