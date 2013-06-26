/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.dns;

/**
	* Provides additional arguments required for fetching the dnssoarec resource.
	*/

public class dnssoarec_args 
{
	private String type;

	/**
	* <pre>
	* The SOA record type. The type can take 3 values :
ADNS -  If this is specified, all of the authoritative SOA records will be displayed.
PROXY - If this is specified, all the proxy SOA records will be displayed.
ALL  -  If this is specified, all the SOA records will be displayed.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* The SOA record type. The type can take 3 values :
ADNS -  If this is specified, all of the authoritative SOA records will be displayed.
PROXY - If this is specified, all the proxy SOA records will be displayed.
ALL  -  If this is specified, all the SOA records will be displayed.<br> Possible values = ALL, ADNS, PROXY
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	public static class typeEnum {
		public static final String ALL = "ALL";
		public static final String ADNS = "ADNS";
		public static final String PROXY = "PROXY";
	}
}
