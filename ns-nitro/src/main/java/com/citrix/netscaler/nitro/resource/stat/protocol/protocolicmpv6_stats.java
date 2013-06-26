/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.stat.protocol;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class protocolicmpv6_response extends base_response
{
	public protocolicmpv6_stats protocolicmpv6;
}
/**
* Statistics for icmpv6 resource.
*/

public class protocolicmpv6_stats extends base_resource
{
	private Long icmpv6totrxpkts;
	private Long icmpv6rxpktsrate;
	private Long icmpv6totrxbytes;
	private Long icmpv6rxbytesrate;
	private Long icmpv6tottxpkts;
	private Long icmpv6txpktsrate;
	private Long icmpv6tottxbytes;
	private Long icmpv6txbytesrate;
	private Long icmpv6totrxna;
	private Long icmpv6rxnarate;
	private Long icmpv6totrxns;
	private Long icmpv6rxnsrate;
	private Long icmpv6totrxra;
	private Long icmpv6rxrarate;
	private Long icmpv6totrxrs;
	private Long icmpv6rxrsrate;
	private Long icmpv6totrxechoreq;
	private Long icmpv6rxechoreqrate;
	private Long icmpv6totrxechoreply;
	private Long icmpv6rxechoreplyrate;
	private Long icmpv6tottxna;
	private Long icmpv6txnarate;
	private Long icmpv6tottxns;
	private Long icmpv6txnsrate;
	private Long icmpv6tottxra;
	private Long icmpv6txrarate;
	private Long icmpv6tottxrs;
	private Long icmpv6txrsrate;
	private Long icmpv6tottxechoreq;
	private Long icmpv6txechoreqrate;
	private Long icmpv6tottxechoreply;
	private Long icmpv6txechoreplyrate;
	private Long icmpv6errra;
	private Long icmpv6errna;
	private Long icmpv6errns;
	private Long icmpv6badchecksums;
	private Long icmpv6unspt;
	private Long icmpv6rtthsld;

	/**
	* <pre>
	* ICMPv6 neighbor solicitation packets transmitted. These packets are sent to get the link layer addresses of neighboring nodes or to confirm that they are reachable.
	* </pre>
	*/
	public Long get_icmpv6tottxns() throws Exception {
		return this.icmpv6tottxns;
	}

	/**
	* <pre>
	* ICMPv6 packets transmitted.
	* </pre>
	*/
	public Long get_icmpv6txpktsrate() throws Exception {
		return this.icmpv6txpktsrate;
	}

	/**
	* <pre>
	* ICMPv6 packets received that are not supported by the NetScaler.
	* </pre>
	*/
	public Long get_icmpv6unspt() throws Exception {
		return this.icmpv6unspt;
	}

	/**
	* <pre>
	* ICMPv6 Ping Echo Reply packets received.
	* </pre>
	*/
	public Long get_icmpv6totrxechoreply() throws Exception {
		return this.icmpv6totrxechoreply;
	}

	/**
	* <pre>
	* ICMPv6 router advertisement packets transmitted. These packets are sent at regular intervals or in response to a router solicitation packet from a neighbor.
	* </pre>
	*/
	public Long get_icmpv6tottxra() throws Exception {
		return this.icmpv6tottxra;
	}

	/**
	* <pre>
	* ICMP Ping Echo Reply packets transmitted.
	* </pre>
	*/
	public Long get_icmpv6tottxechoreply() throws Exception {
		return this.icmpv6tottxechoreply;
	}

	/**
	* <pre>
	* Packets received with an ICMPv6 checksum error.
	* </pre>
	*/
	public Long get_icmpv6badchecksums() throws Exception {
		return this.icmpv6badchecksums;
	}

	/**
	* <pre>
	* ICMPv6 neighbor advertisement packets transmitted. These packets are sent in response to a neighbor solicitation packet, or if the link layer address of this node has changed.
	* </pre>
	*/
	public Long get_icmpv6txnarate() throws Exception {
		return this.icmpv6txnarate;
	}

	/**
	* <pre>
	* ICMPv6 router solicitation packets transmitted. These packets are sent to request neighboring routers to generate router advertisements immediately rather than wait for the next defined time.
	* </pre>
	*/
	public Long get_icmpv6txrsrate() throws Exception {
		return this.icmpv6txrsrate;
	}

	/**
	* <pre>
	* ICMPv6 neighbor advertisement packets transmitted. These packets are sent in response to a neighbor solicitation packet, or if the link layer address of this node has changed.
	* </pre>
	*/
	public Long get_icmpv6tottxna() throws Exception {
		return this.icmpv6tottxna;
	}

	/**
	* <pre>
	* ICMPv6 router advertisement packets received. These are received at defined intervals or in response to a router solicitation message.
	* </pre>
	*/
	public Long get_icmpv6totrxra() throws Exception {
		return this.icmpv6totrxra;
	}

	/**
	* <pre>
	* ICMPv6 router solicitation packets transmitted. These packets are sent to request neighboring routers to generate router advertisements immediately rather than wait for the next defined time.
	* </pre>
	*/
	public Long get_icmpv6tottxrs() throws Exception {
		return this.icmpv6tottxrs;
	}

	/**
	* <pre>
	* ICMPv6 packets received.
	* </pre>
	*/
	public Long get_icmpv6rxpktsrate() throws Exception {
		return this.icmpv6rxpktsrate;
	}

	/**
	* <pre>
	* ICMPv6 packets received.
	* </pre>
	*/
	public Long get_icmpv6totrxpkts() throws Exception {
		return this.icmpv6totrxpkts;
	}

	/**
	* <pre>
	* ICMPv6 neighbor solicitation packets received. These packets are received if the link layer address of a neighbor has changed, or in response to a neighbor solicitation message sent out by this node.
	* </pre>
	*/
	public Long get_icmpv6totrxns() throws Exception {
		return this.icmpv6totrxns;
	}

	/**
	* <pre>
	* ICMPv6 Ping Echo Reply packets received.
	* </pre>
	*/
	public Long get_icmpv6rxechoreplyrate() throws Exception {
		return this.icmpv6rxechoreplyrate;
	}

	/**
	* <pre>
	* ICMPv6 Ping Echo Request packets transmitted.
	* </pre>
	*/
	public Long get_icmpv6txechoreqrate() throws Exception {
		return this.icmpv6txechoreqrate;
	}

	/**
	* <pre>
	* ICMPv6 router solicitation packets received. These could be sent by a neighboring router to initiate address resolution.
	* </pre>
	*/
	public Long get_icmpv6rxrsrate() throws Exception {
		return this.icmpv6rxrsrate;
	}

	/**
	* <pre>
	* ICMPv6 neighbor advertisement error packets received that contain an error in the header, such as an incorrect source IP address, destination IP address, or packet length.
	* </pre>
	*/
	public Long get_icmpv6errna() throws Exception {
		return this.icmpv6errna;
	}

	/**
	* <pre>
	* ICMPv6 neighbor solicitation packets received. These packets are received if the link layer address of a neighbor has changed, or in response to a neighbor solicitation message sent out by this node.
	* </pre>
	*/
	public Long get_icmpv6rxnsrate() throws Exception {
		return this.icmpv6rxnsrate;
	}

	/**
	* <pre>
	* Bytes of ICMPv6 data received.
	* </pre>
	*/
	public Long get_icmpv6rxbytesrate() throws Exception {
		return this.icmpv6rxbytesrate;
	}

	/**
	* <pre>
	* Packets dropped because the default threshold of 100 requests per 10 milliseconds has been exceeded.
This is a configurable value using the set rateControl command.

	* </pre>
	*/
	public Long get_icmpv6rtthsld() throws Exception {
		return this.icmpv6rtthsld;
	}

	/**
	* <pre>
	* ICMPv6 router solicitation packets received. These could be sent by a neighboring router to initiate address resolution.
	* </pre>
	*/
	public Long get_icmpv6totrxrs() throws Exception {
		return this.icmpv6totrxrs;
	}

	/**
	* <pre>
	* ICMPv6 neighbor advertisement packets received. These packets are received in response to a neighbor solicitation message sent out by this node, or if the link layer address of a neighbor has changed.
	* </pre>
	*/
	public Long get_icmpv6totrxna() throws Exception {
		return this.icmpv6totrxna;
	}

	/**
	* <pre>
	* ICMP Ping Echo Reply packets transmitted.
	* </pre>
	*/
	public Long get_icmpv6txechoreplyrate() throws Exception {
		return this.icmpv6txechoreplyrate;
	}

	/**
	* <pre>
	* Bytes of ICMPv6 data received.
	* </pre>
	*/
	public Long get_icmpv6totrxbytes() throws Exception {
		return this.icmpv6totrxbytes;
	}

	/**
	* <pre>
	* ICMPv6 router advertisement packets transmitted. These packets are sent at regular intervals or in response to a router solicitation packet from a neighbor.
	* </pre>
	*/
	public Long get_icmpv6txrarate() throws Exception {
		return this.icmpv6txrarate;
	}

	/**
	* <pre>
	* ICMPv6 neighbor solicitation error packets received that contain an error in the header, such as an incorrect source IP address, destination IP address, or packet length.
	* </pre>
	*/
	public Long get_icmpv6errns() throws Exception {
		return this.icmpv6errns;
	}

	/**
	* <pre>
	* ICMPv6 Ping Echo Request packets received.
	* </pre>
	*/
	public Long get_icmpv6totrxechoreq() throws Exception {
		return this.icmpv6totrxechoreq;
	}

	/**
	* <pre>
	* ICMPv6 Ping Echo Request packets transmitted.
	* </pre>
	*/
	public Long get_icmpv6tottxechoreq() throws Exception {
		return this.icmpv6tottxechoreq;
	}

	/**
	* <pre>
	* ICMPv6 router advertisement packets received. These are received at defined intervals or in response to a router solicitation message.
	* </pre>
	*/
	public Long get_icmpv6rxrarate() throws Exception {
		return this.icmpv6rxrarate;
	}

	/**
	* <pre>
	* ICMPv6 Ping Echo Request packets received.
	* </pre>
	*/
	public Long get_icmpv6rxechoreqrate() throws Exception {
		return this.icmpv6rxechoreqrate;
	}

	/**
	* <pre>
	* ICMPv6 packets transmitted.
	* </pre>
	*/
	public Long get_icmpv6tottxpkts() throws Exception {
		return this.icmpv6tottxpkts;
	}

	/**
	* <pre>
	* Bytes of ICMPv6 data transmitted.
	* </pre>
	*/
	public Long get_icmpv6tottxbytes() throws Exception {
		return this.icmpv6tottxbytes;
	}

	/**
	* <pre>
	* ICMPv6 neighbor advertisement packets received. These packets are received in response to a neighbor solicitation message sent out by this node, or if the link layer address of a neighbor has changed.
	* </pre>
	*/
	public Long get_icmpv6rxnarate() throws Exception {
		return this.icmpv6rxnarate;
	}

	/**
	* <pre>
	* ICMPv6 neighbor solicitation packets transmitted. These packets are sent to get the link layer addresses of neighboring nodes or to confirm that they are reachable.
	* </pre>
	*/
	public Long get_icmpv6txnsrate() throws Exception {
		return this.icmpv6txnsrate;
	}

	/**
	* <pre>
	* ICMPv6 router advertisement error packets received that contain an error in the header, such as an incorrect source IP address, destination IP address, or packet length.
	* </pre>
	*/
	public Long get_icmpv6errra() throws Exception {
		return this.icmpv6errra;
	}

	/**
	* <pre>
	* Bytes of ICMPv6 data transmitted.
	* </pre>
	*/
	public Long get_icmpv6txbytesrate() throws Exception {
		return this.icmpv6txbytesrate;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		protocolicmpv6_stats[] resources = new protocolicmpv6_stats[1];
		protocolicmpv6_response result = (protocolicmpv6_response) service.get_payload_formatter().string_to_resource(protocolicmpv6_response.class, response);
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
		resources[0] = result.protocolicmpv6;
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
	* Use this API to fetch the statistics of all protocolicmpv6_stats resources that are configured on netscaler.
	*/
	public static protocolicmpv6_stats get(nitro_service service) throws Exception{
		protocolicmpv6_stats obj = new protocolicmpv6_stats();
		protocolicmpv6_stats[] response = (protocolicmpv6_stats[])obj.stat_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch the statistics of all protocolicmpv6_stats resources that are configured on netscaler.
	*/
	public static protocolicmpv6_stats get(nitro_service service,  options option) throws Exception{
		protocolicmpv6_stats obj = new protocolicmpv6_stats();
		protocolicmpv6_stats[] response = (protocolicmpv6_stats[])obj.stat_resources(service,option);
		return response[0];
	}

}
