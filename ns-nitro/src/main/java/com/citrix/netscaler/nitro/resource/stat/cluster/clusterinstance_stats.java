/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.stat.cluster;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class clusterinstance_response extends base_response
{
	public clusterinstance_stats[] clusterinstance;
}
/**
* Statistics for cluster instance resource.
*/

public class clusterinstance_stats extends base_resource
{
	private Long clid;
	private Long clnumnodes;
	private String clcurstatus;
	private String clviewleader;
	private Long totsteeredpkts;
	private Long clbkplanerx;
	private Long clbkplanerxrate;
	private Long clbkplanetx;
	private Long clbkplanetxrate;
	private Long numdfddroppkts;
	private Long totpropagationtimeout;

	/**
	* <pre>
	* The ID of the cluster instance whose statistics must be displayed.
	* </pre>
	*/
	public void set_clid(long clid) throws Exception {
		this.clid = new Long(clid);
	}

	/**
	* <pre>
	* The ID of the cluster instance whose statistics must be displayed.
	* </pre>
	*/
	public void set_clid(Long clid) throws Exception{
		this.clid = clid;
	}

	/**
	* <pre>
	* The ID of the cluster instance whose statistics must be displayed.<br> Minimum value =  1<br> Maximum value =  16
	* </pre>
	*/
	public Long get_clid() throws Exception {
		return this.clid;
	}

	/**
	* <pre>
	* Number of times the update to the client timed-out.
	* </pre>
	*/
	public Long get_totpropagationtimeout() throws Exception {
		return this.totpropagationtimeout;
	}

	/**
	* <pre>
	* Traffic transmitted from backplane (in mbits)
	* </pre>
	*/
	public Long get_clbkplanetx() throws Exception {
		return this.clbkplanetx;
	}

	/**
	* <pre>
	* Traffic transmitted from backplane (in mbits)
	* </pre>
	*/
	public Long get_clbkplanetxrate() throws Exception {
		return this.clbkplanetxrate;
	}

	/**
	* <pre>
	* Total number of packets steered on the cluster backplane.
	* </pre>
	*/
	public Long get_totsteeredpkts() throws Exception {
		return this.totsteeredpkts;
	}

	/**
	* <pre>
	* Number of steered packets that are dropped.
	* </pre>
	*/
	public Long get_numdfddroppkts() throws Exception {
		return this.numdfddroppkts;
	}

	/**
	* <pre>
	* NSIP address of the Configuration Coordinator of the cluster.
	* </pre>
	*/
	public String get_clviewleader() throws Exception {
		return this.clviewleader;
	}

	/**
	* <pre>
	* Traffic received on backplane (in mbits)
	* </pre>
	*/
	public Long get_clbkplanerx() throws Exception {
		return this.clbkplanerx;
	}

	/**
	* <pre>
	* State of the cluster.
	* </pre>
	*/
	public String get_clcurstatus() throws Exception {
		return this.clcurstatus;
	}

	/**
	* <pre>
	* Number of nodes in the cluster.
	* </pre>
	*/
	public Long get_clnumnodes() throws Exception {
		return this.clnumnodes;
	}

	/**
	* <pre>
	* Traffic received on backplane (in mbits)
	* </pre>
	*/
	public Long get_clbkplanerxrate() throws Exception {
		return this.clbkplanerxrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		clusterinstance_response result = (clusterinstance_response) service.get_payload_formatter().string_to_resource(clusterinstance_response.class, response);
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
		return result.clusterinstance;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.clid != null) {
			return this.clid.toString();
		}
		return null;
	}

	/**
	* Use this API to fetch the statistics of all clusterinstance_stats resources that are configured on netscaler.
	*/
	public static clusterinstance_stats[] get(nitro_service service) throws Exception{
		clusterinstance_stats obj = new clusterinstance_stats();
		clusterinstance_stats[] response = (clusterinstance_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all clusterinstance_stats resources that are configured on netscaler.
	*/
	public static clusterinstance_stats[] get(nitro_service service, options option) throws Exception{
		clusterinstance_stats obj = new clusterinstance_stats();
		clusterinstance_stats[] response = (clusterinstance_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of clusterinstance_stats resource of given name .
	*/
	public static clusterinstance_stats get(nitro_service service, Long clid) throws Exception{
		clusterinstance_stats obj = new clusterinstance_stats();
		obj.set_clid(clid);
		clusterinstance_stats response = (clusterinstance_stats) obj.stat_resource(service);
		return response;
	}

}
