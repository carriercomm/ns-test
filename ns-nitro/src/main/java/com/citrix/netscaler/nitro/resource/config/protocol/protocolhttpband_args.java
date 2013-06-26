/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.protocol;

/**
	* Provides additional arguments required for fetching the protocolhttpband resource.
	*/

public class protocolhttpband_args 
{
	private String type;

	/**
	* <pre>
	* Specify whether to display request/response band statistics.<br> Possible values = REQUEST, RESPONSE
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Specify whether to display request/response band statistics.<br> Possible values = REQUEST, RESPONSE
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	public static class typeEnum {
		public static final String REQUEST = "REQUEST";
		public static final String RESPONSE = "RESPONSE";
	}
}
