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

class clusternode_response extends base_response
{
	public clusternode_stats[] clusternode;
}
/**
* Statistics for cluster node resource.
*/

public class clusternode_stats extends base_resource
{
	private Long nodeid;
	private String clsyncstate;
	private String clnodeeffectivehealth;
	private String clnodeip;
	private String clmasterstate;
	private Long cltothbtx;
	private Long cltothbrx;
	private Long nnmcurconn;
	private Long nnmtotconntx;
	private Long nnmtotconnrx;
	private String clptpstate;
	private Long clptprx;
	private Long clptptx;
	private Long nnmerrmsend;
	private String clnodehealth;

	/**
	* <pre>
	* The ID of the cluster node whose statistics must be displayed. If an ID is not provided, statistics of all nodes of the cluster are displayed.
	* </pre>
	*/
	public void set_nodeid(long nodeid) throws Exception {
		this.nodeid = new Long(nodeid);
	}

	/**
	* <pre>
	* The ID of the cluster node whose statistics must be displayed. If an ID is not provided, statistics of all nodes of the cluster are displayed.
	* </pre>
	*/
	public void set_nodeid(Long nodeid) throws Exception{
		this.nodeid = nodeid;
	}

	/**
	* <pre>
	* The ID of the cluster node whose statistics must be displayed. If an ID is not provided, statistics of all nodes of the cluster are displayed.<br> Minimum value =  0<br> Maximum value =  31
	* </pre>
	*/
	public Long get_nodeid() throws Exception {
		return this.nodeid;
	}

	/**
	* <pre>
	* NSIP address of the cluster node.
	* </pre>
	*/
	public String get_clnodeip() throws Exception {
		return this.clnodeip;
	}

	/**
	* <pre>
	* Sync state of the cluster node.
	* </pre>
	*/
	public String get_clsyncstate() throws Exception {
		return this.clsyncstate;
	}

	/**
	* <pre>
	* Health of the node in the cluster.
	* </pre>
	*/
	public String get_clnodehealth() throws Exception {
		return this.clnodehealth;
	}

	/**
	* <pre>
	* Number of connections open for node-to-node communication.
	* </pre>
	*/
	public Long get_nnmcurconn() throws Exception {
		return this.nnmcurconn;
	}

	/**
	* <pre>
	* Number of errors in sending node-to-node multicast/broadcast messages.
	* </pre>
	*/
	public Long get_nnmerrmsend() throws Exception {
		return this.nnmerrmsend;
	}

	/**
	* <pre>
	* Health of the cluster node.
	* </pre>
	*/
	public String get_clnodeeffectivehealth() throws Exception {
		return this.clnodeeffectivehealth;
	}

	/**
	* <pre>
	* Number of node-to-node messages received.
	* </pre>
	*/
	public Long get_nnmtotconnrx() throws Exception {
		return this.nnmtotconnrx;
	}

	/**
	* <pre>
	* Number of heartbeats received.
	* </pre>
	*/
	public Long get_cltothbrx() throws Exception {
		return this.cltothbrx;
	}

	/**
	* <pre>
	* Number of PTP packets received on the node.
	* </pre>
	*/
	public Long get_clptprx() throws Exception {
		return this.clptprx;
	}

	/**
	* <pre>
	* Number of node-to-node messages sent.
	* </pre>
	*/
	public Long get_nnmtotconntx() throws Exception {
		return this.nnmtotconntx;
	}

	/**
	* <pre>
	* Operational state of the cluster node.
	* </pre>
	*/
	public String get_clmasterstate() throws Exception {
		return this.clmasterstate;
	}

	/**
	* <pre>
	* Number of PTP packets transmitted by the node.
	* </pre>
	*/
	public Long get_clptptx() throws Exception {
		return this.clptptx;
	}

	/**
	* <pre>
	* PTP state of the node. This state is Master for one node and Slave for the rest.
	* </pre>
	*/
	public String get_clptpstate() throws Exception {
		return this.clptpstate;
	}

	/**
	* <pre>
	* Number of heartbeats sent.
	* </pre>
	*/
	public Long get_cltothbtx() throws Exception {
		return this.cltothbtx;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		clusternode_response result = (clusternode_response) service.get_payload_formatter().string_to_resource(clusternode_response.class, response);
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
		return result.clusternode;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.nodeid != null) {
			return this.nodeid.toString();
		}
		return null;
	}

	/**
	* Use this API to fetch the statistics of all clusternode_stats resources that are configured on netscaler.
	*/
	public static clusternode_stats[] get(nitro_service service) throws Exception{
		clusternode_stats obj = new clusternode_stats();
		clusternode_stats[] response = (clusternode_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all clusternode_stats resources that are configured on netscaler.
	*/
	public static clusternode_stats[] get(nitro_service service, options option) throws Exception{
		clusternode_stats obj = new clusternode_stats();
		clusternode_stats[] response = (clusternode_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of clusternode_stats resource of given name .
	*/
	public static clusternode_stats get(nitro_service service, Long nodeid) throws Exception{
		clusternode_stats obj = new clusternode_stats();
		obj.set_nodeid(nodeid);
		clusternode_stats response = (clusternode_stats) obj.stat_resource(service);
		return response;
	}

}
