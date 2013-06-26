/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.stat.responder;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class responderpolicy_response extends base_response
{
	public responderpolicy_stats[] responderpolicy;
}
/**
* Statistics for responder policy resource.
*/

public class responderpolicy_stats extends base_resource
{
	private String name;
	private Long pipolicyhits;
	private Long pipolicyhitsrate;
	private Long pipolicyundefhits;
	private Long pipolicyundefhitsrate;

	/**
	* <pre>
	* The name of the responder policy for which statistics will be displayed.  If not given statistics are shown for all responder policies.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the responder policy for which statistics will be displayed.  If not given statistics are shown for all responder policies.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Number of undef hits on the policy
	* </pre>
	*/
	public Long get_pipolicyundefhitsrate() throws Exception {
		return this.pipolicyundefhitsrate;
	}

	/**
	* <pre>
	* Number of undef hits on the policy
	* </pre>
	*/
	public Long get_pipolicyundefhits() throws Exception {
		return this.pipolicyundefhits;
	}

	/**
	* <pre>
	* Number of hits on the policy
	* </pre>
	*/
	public Long get_pipolicyhitsrate() throws Exception {
		return this.pipolicyhitsrate;
	}

	/**
	* <pre>
	* Number of hits on the policy
	* </pre>
	*/
	public Long get_pipolicyhits() throws Exception {
		return this.pipolicyhits;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		responderpolicy_response result = (responderpolicy_response) service.get_payload_formatter().string_to_resource(responderpolicy_response.class, response);
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
		return result.responderpolicy;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to fetch the statistics of all responderpolicy_stats resources that are configured on netscaler.
	*/
	public static responderpolicy_stats[] get(nitro_service service) throws Exception{
		responderpolicy_stats obj = new responderpolicy_stats();
		responderpolicy_stats[] response = (responderpolicy_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all responderpolicy_stats resources that are configured on netscaler.
	*/
	public static responderpolicy_stats[] get(nitro_service service, options option) throws Exception{
		responderpolicy_stats obj = new responderpolicy_stats();
		responderpolicy_stats[] response = (responderpolicy_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of responderpolicy_stats resource of given name .
	*/
	public static responderpolicy_stats get(nitro_service service, String name) throws Exception{
		responderpolicy_stats obj = new responderpolicy_stats();
		obj.set_name(name);
		responderpolicy_stats response = (responderpolicy_stats) obj.stat_resource(service);
		return response;
	}

}
