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

/**
	* Provides additional arguments required for fetching the lbmonitor resource.
	*/

public class lbmonitor_args 
{
	private String type;

	/**
	* <pre>
	* The type of monitor.<br> Possible values = PING, TCP, HTTP, TCP-ECV, HTTP-ECV, UDP-ECV, DNS, FTP, LDNS-PING, LDNS-TCP, LDNS-DNS, RADIUS, USER, HTTP-INLINE, SIP-UDP, LOAD, FTP-EXTENDED, SMTP, SNMP, NNTP, MYSQL, MYSQL-ECV, MSSQL-ECV, LDAP, POP3, CITRIX-XML-SERVICE, CITRIX-WEB-INTERFACE, DNS-TCP, RTSP, ARP, CITRIX-AG, CITRIX-AAC-LOGINPAGE, CITRIX-AAC-LAS, CITRIX-XD-DDC, ND6, CITRIX-WI-EXTENDED, DIAMETER
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* The type of monitor.<br> Possible values = PING, TCP, HTTP, TCP-ECV, HTTP-ECV, UDP-ECV, DNS, FTP, LDNS-PING, LDNS-TCP, LDNS-DNS, RADIUS, USER, HTTP-INLINE, SIP-UDP, LOAD, FTP-EXTENDED, SMTP, SNMP, NNTP, MYSQL, MYSQL-ECV, MSSQL-ECV, LDAP, POP3, CITRIX-XML-SERVICE, CITRIX-WEB-INTERFACE, DNS-TCP, RTSP, ARP, CITRIX-AG, CITRIX-AAC-LOGINPAGE, CITRIX-AAC-LAS, CITRIX-XD-DDC, ND6, CITRIX-WI-EXTENDED, DIAMETER
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	public static class typeEnum {
		public static final String PING = "PING";
		public static final String TCP = "TCP";
		public static final String HTTP = "HTTP";
		public static final String TCP_ECV = "TCP-ECV";
		public static final String HTTP_ECV = "HTTP-ECV";
		public static final String UDP_ECV = "UDP-ECV";
		public static final String DNS = "DNS";
		public static final String FTP = "FTP";
		public static final String LDNS_PING = "LDNS-PING";
		public static final String LDNS_TCP = "LDNS-TCP";
		public static final String LDNS_DNS = "LDNS-DNS";
		public static final String RADIUS = "RADIUS";
		public static final String USER = "USER";
		public static final String HTTP_INLINE = "HTTP-INLINE";
		public static final String SIP_UDP = "SIP-UDP";
		public static final String LOAD = "LOAD";
		public static final String FTP_EXTENDED = "FTP-EXTENDED";
		public static final String SMTP = "SMTP";
		public static final String SNMP = "SNMP";
		public static final String NNTP = "NNTP";
		public static final String MYSQL = "MYSQL";
		public static final String MYSQL_ECV = "MYSQL-ECV";
		public static final String MSSQL_ECV = "MSSQL-ECV";
		public static final String LDAP = "LDAP";
		public static final String POP3 = "POP3";
		public static final String CITRIX_XML_SERVICE = "CITRIX-XML-SERVICE";
		public static final String CITRIX_WEB_INTERFACE = "CITRIX-WEB-INTERFACE";
		public static final String DNS_TCP = "DNS-TCP";
		public static final String RTSP = "RTSP";
		public static final String ARP = "ARP";
		public static final String CITRIX_AG = "CITRIX-AG";
		public static final String CITRIX_AAC_LOGINPAGE = "CITRIX-AAC-LOGINPAGE";
		public static final String CITRIX_AAC_LAS = "CITRIX-AAC-LAS";
		public static final String CITRIX_XD_DDC = "CITRIX-XD-DDC";
		public static final String ND6 = "ND6";
		public static final String CITRIX_WI_EXTENDED = "CITRIX-WI-EXTENDED";
		public static final String DIAMETER = "DIAMETER";
	}
}
