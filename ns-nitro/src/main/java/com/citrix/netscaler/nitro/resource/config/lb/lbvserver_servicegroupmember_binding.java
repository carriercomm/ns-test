/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.lb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class lbvserver_servicegroupmember_binding_response extends base_response
{
	public lbvserver_servicegroupmember_binding[] lbvserver_servicegroupmember_binding;
}
/**
	* Binding class showing the servicegroupmember that can be bound to lbvserver.
	*/

public class lbvserver_servicegroupmember_binding extends base_resource
{
	private String servicegroupname;
	private String ipv46;
	private Integer port;
	private String servicetype;
	private String curstate;
	private Long weight;
	private Long dynamicweight;
	private String cookieipport;
	private String vserverid;
	private String name;
	private Long __count;

	/**
	* <pre>
	* The weight for the specified service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(long weight) throws Exception {
		this.weight = new Long(weight);
	}

	/**
	* <pre>
	* The weight for the specified service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_weight(Long weight) throws Exception{
		this.weight = weight;
	}

	/**
	* <pre>
	* The weight for the specified service.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_weight() throws Exception {
		return this.weight;
	}

	/**
	* <pre>
	* The virtual server name to which the service is bound.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The virtual server name to which the service is bound.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The service group name bound to the selected load balancing virtual server.
	* </pre>
	*/
	public void set_servicegroupname(String servicegroupname) throws Exception{
		this.servicegroupname = servicegroupname;
	}

	/**
	* <pre>
	* The service group name bound to the selected load balancing virtual server.
	* </pre>
	*/
	public String get_servicegroupname() throws Exception {
		return this.servicegroupname;
	}

	/**
	* <pre>
	* Encryped Ip address and port of the service that is inserted into the set-cookie http header.
	* </pre>
	*/
	public String get_cookieipport() throws Exception {
		return this.cookieipport;
	}

	/**
	* <pre>
	* A port number for the virtual server.<br> Range 1 - 65535
	* </pre>
	*/
	public Integer get_port() throws Exception {
		return this.port;
	}

	/**
	* <pre>
	* Current LB vserver state.<br> Possible values = UP, DOWN, UNKNOWN, BUSY, OUT OF SERVICE, GOING OUT OF SERVICE, DOWN WHEN GOING OUT OF SERVICE, NS_EMPTY_STR
	* </pre>
	*/
	public String get_curstate() throws Exception {
		return this.curstate;
	}

	/**
	* <pre>
	* Vserver Id.
	* </pre>
	*/
	public String get_vserverid() throws Exception {
		return this.vserverid;
	}

	/**
	* <pre>
	* The IP address of the virtual server.
	* </pre>
	*/
	public String get_ipv46() throws Exception {
		return this.ipv46;
	}

	/**
	* <pre>
	* Dynamic weight.
	* </pre>
	*/
	public Long get_dynamicweight() throws Exception {
		return this.dynamicweight;
	}

	/**
	* <pre>
	* The service type.<br> Possible values = HTTP, FTP, TCP, UDP, SSL, SSL_BRIDGE, SSL_TCP, NNTP, DNS, DHCPRA, ANY, SIP_UDP, DNS_TCP, RTSP, PUSH, SSL_PUSH, RADIUS, RDP, MYSQL, MSSQL, DIAMETER, SSL_DIAMETER
	* </pre>
	*/
	public String get_servicetype() throws Exception {
		return this.servicetype;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbvserver_servicegroupmember_binding_response result = (lbvserver_servicegroupmember_binding_response) service.get_payload_formatter().string_to_resource(lbvserver_servicegroupmember_binding_response.class, response);
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
		return result.lbvserver_servicegroupmember_binding;
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
	* Use this API to fetch lbvserver_servicegroupmember_binding resources of given name .
	*/
	public static lbvserver_servicegroupmember_binding[] get(nitro_service service, String name) throws Exception{
		lbvserver_servicegroupmember_binding obj = new lbvserver_servicegroupmember_binding();
		obj.set_name(name);
		lbvserver_servicegroupmember_binding response[] = (lbvserver_servicegroupmember_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbvserver_servicegroupmember_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static lbvserver_servicegroupmember_binding[] get_filtered(nitro_service service, String name, String filter) throws Exception{
		lbvserver_servicegroupmember_binding obj = new lbvserver_servicegroupmember_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		lbvserver_servicegroupmember_binding[] response = (lbvserver_servicegroupmember_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of lbvserver_servicegroupmember_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static lbvserver_servicegroupmember_binding[] get_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		lbvserver_servicegroupmember_binding obj = new lbvserver_servicegroupmember_binding();
		obj.set_name(name);
		options option = new options();
		option.set_filter(filter);
		lbvserver_servicegroupmember_binding[] response = (lbvserver_servicegroupmember_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count lbvserver_servicegroupmember_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, String name) throws Exception{
		lbvserver_servicegroupmember_binding obj = new lbvserver_servicegroupmember_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		lbvserver_servicegroupmember_binding response[] = (lbvserver_servicegroupmember_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbvserver_servicegroupmember_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String name, String filter) throws Exception{
		lbvserver_servicegroupmember_binding obj = new lbvserver_servicegroupmember_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbvserver_servicegroupmember_binding[] response = (lbvserver_servicegroupmember_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of lbvserver_servicegroupmember_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, String name, filtervalue[] filter) throws Exception{
		lbvserver_servicegroupmember_binding obj = new lbvserver_servicegroupmember_binding();
		obj.set_name(name);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		lbvserver_servicegroupmember_binding[] response = (lbvserver_servicegroupmember_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class servicetypeEnum {
		public static final String HTTP = "HTTP";
		public static final String FTP = "FTP";
		public static final String TCP = "TCP";
		public static final String UDP = "UDP";
		public static final String SSL = "SSL";
		public static final String SSL_BRIDGE = "SSL_BRIDGE";
		public static final String SSL_TCP = "SSL_TCP";
		public static final String NNTP = "NNTP";
		public static final String DNS = "DNS";
		public static final String DHCPRA = "DHCPRA";
		public static final String ANY = "ANY";
		public static final String SIP_UDP = "SIP_UDP";
		public static final String DNS_TCP = "DNS_TCP";
		public static final String RTSP = "RTSP";
		public static final String PUSH = "PUSH";
		public static final String SSL_PUSH = "SSL_PUSH";
		public static final String RADIUS = "RADIUS";
		public static final String RDP = "RDP";
		public static final String MYSQL = "MYSQL";
		public static final String MSSQL = "MSSQL";
		public static final String DIAMETER = "DIAMETER";
		public static final String SSL_DIAMETER = "SSL_DIAMETER";
	}
	public static class bindpointEnum {
		public static final String REQUEST = "REQUEST";
		public static final String RESPONSE = "RESPONSE";
	}
	public static class labeltypeEnum {
		public static final String reqvserver = "reqvserver";
		public static final String resvserver = "resvserver";
		public static final String policylabel = "policylabel";
	}
	public static class curstateEnum {
		public static final String UP = "UP";
		public static final String DOWN = "DOWN";
		public static final String UNKNOWN = "UNKNOWN";
		public static final String BUSY = "BUSY";
		public static final String OUT_OF_SERVICE = "OUT OF SERVICE";
		public static final String GOING_OUT_OF_SERVICE = "GOING OUT OF SERVICE";
		public static final String DOWN_WHEN_GOING_OUT_OF_SERVICE = "DOWN WHEN GOING OUT OF SERVICE";
		public static final String NS_EMPTY_STR = "NS_EMPTY_STR";
	}

}