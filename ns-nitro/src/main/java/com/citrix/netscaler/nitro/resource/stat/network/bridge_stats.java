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

class bridge_response extends base_response
{
	public bridge_stats bridge;
}
/**
* Statistics for bridge resource.
*/

public class bridge_stats extends base_resource
{
	private Long tcptotbdgmacmoved;
	private Long tcpbdgmacmovedrate;
	private Long tcptotbdgcollisions;
	private Long tcpbdgcollisionsrate;
	private Long tcperrbdgmuted;
	private Long tcperrbdgmutedrate;
	private Long totbdgpkts;
	private Long bdgpktsrate;
	private Long totbdgmbits;
	private Long bdgmbitsrate;

	/**
	* <pre>
	* The number of bridging table collisions
	* </pre>
	*/
	public Long get_tcpbdgcollisionsrate() throws Exception {
		return this.tcpbdgcollisionsrate;
	}

	/**
	* <pre>
	* The number of bridging table collisions
	* </pre>
	*/
	public Long get_tcptotbdgcollisions() throws Exception {
		return this.tcptotbdgcollisions;
	}

	/**
	* <pre>
	* The total number of bridged packets
	* </pre>
	*/
	public Long get_bdgpktsrate() throws Exception {
		return this.bdgpktsrate;
	}

	/**
	* <pre>
	* The total number of bridged Mbits
	* </pre>
	*/
	public Long get_totbdgmbits() throws Exception {
		return this.totbdgmbits;
	}

	/**
	* <pre>
	* The number of bridging related interface mutes
	* </pre>
	*/
	public Long get_tcperrbdgmutedrate() throws Exception {
		return this.tcperrbdgmutedrate;
	}

	/**
	* <pre>
	* The number of times bridging registered MAC moved
	* </pre>
	*/
	public Long get_tcpbdgmacmovedrate() throws Exception {
		return this.tcpbdgmacmovedrate;
	}

	/**
	* <pre>
	* The total number of bridged Mbits
	* </pre>
	*/
	public Long get_bdgmbitsrate() throws Exception {
		return this.bdgmbitsrate;
	}

	/**
	* <pre>
	* The total number of bridged packets
	* </pre>
	*/
	public Long get_totbdgpkts() throws Exception {
		return this.totbdgpkts;
	}

	/**
	* <pre>
	* The number of bridging related interface mutes
	* </pre>
	*/
	public Long get_tcperrbdgmuted() throws Exception {
		return this.tcperrbdgmuted;
	}

	/**
	* <pre>
	* The number of times bridging registered MAC moved
	* </pre>
	*/
	public Long get_tcptotbdgmacmoved() throws Exception {
		return this.tcptotbdgmacmoved;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		bridge_stats[] resources = new bridge_stats[1];
		bridge_response result = (bridge_response) service.get_payload_formatter().string_to_resource(bridge_response.class, response);
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
		resources[0] = result.bridge;
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
	* Use this API to fetch the statistics of all bridge_stats resources that are configured on netscaler.
	*/
	public static bridge_stats get(nitro_service service) throws Exception{
		bridge_stats obj = new bridge_stats();
		bridge_stats[] response = (bridge_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all bridge_stats resources that are configured on netscaler.
	*/
	public static bridge_stats get(nitro_service service,  options option) throws Exception{
		bridge_stats obj = new bridge_stats();
		bridge_stats[] response = (bridge_stats[])obj.stat_resources(service,option);
		return response[0];
	}

}
