/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.utility;

/**
	* Provides additional arguments required for fetching the techsupport resource.
	*/

public class techsupport_args 
{
	private String scope;

	/**
	* <pre>
	*  Use this option to run showtechsupport on present node or all cluster nodes.<br> Default value: NS_TECH_NODE<br> Possible values = NODE, CLUSTER
	* </pre>
	*/
	public void set_scope(String scope) throws Exception{
		this.scope = scope;
	}

	/**
	* <pre>
	*  Use this option to run showtechsupport on present node or all cluster nodes.<br> Default value: NS_TECH_NODE<br> Possible values = NODE, CLUSTER
	* </pre>
	*/
	public String get_scope() throws Exception {
		return this.scope;
	}

	public static class scopeEnum {
		public static final String NODE = "NODE";
		public static final String CLUSTER = "CLUSTER";
	}
}
