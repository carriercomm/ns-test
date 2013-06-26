/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.policy;

/**
	* Provides additional arguments required for fetching the policyexpression resource.
	*/

public class policyexpression_args 
{
	private String type;

	/**
	* <pre>
	* The type of expression. This is for input only.<br> Possible values = CLASSIC, ADVANCED
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* The type of expression. This is for input only.<br> Possible values = CLASSIC, ADVANCED
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	public static class typeEnum {
		public static final String CLASSIC = "CLASSIC";
		public static final String ADVANCED = "ADVANCED";
	}
}
