/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.network;

/**
	* Provides additional arguments required for fetching the route resource.
	*/

public class route_args 
{
	private String routetype;
	private Boolean detail;

	/**
	* <pre>
	* The type of routes to be shown.<br> Possible values = CONNECTED, STATIC, DYNAMIC, OSPF, ISIS, RIP, BGP
	* </pre>
	*/
	public void set_routetype(String routetype) throws Exception{
		this.routetype = routetype;
	}

	/**
	* <pre>
	* The type of routes to be shown.<br> Possible values = CONNECTED, STATIC, DYNAMIC, OSPF, ISIS, RIP, BGP
	* </pre>
	*/
	public String get_routetype() throws Exception {
		return this.routetype;
	}

	/**
	* <pre>
	* Display a detailed view.
	* </pre>
	*/
	public void set_detail(boolean detail) throws Exception {
		this.detail = new Boolean(detail);
	}

	/**
	* <pre>
	* Display a detailed view.
	* </pre>
	*/
	public void set_detail(Boolean detail) throws Exception{
		this.detail = detail;
	}

	/**
	* <pre>
	* Display a detailed view.
	* </pre>
	*/
	public Boolean get_detail() throws Exception {
		return this.detail;
	}

	public static class routetypeEnum {
		public static final String CONNECTED = "CONNECTED";
		public static final String STATIC = "STATIC";
		public static final String DYNAMIC = "DYNAMIC";
		public static final String OSPF = "OSPF";
		public static final String ISIS = "ISIS";
		public static final String RIP = "RIP";
		public static final String BGP = "BGP";
	}
}
