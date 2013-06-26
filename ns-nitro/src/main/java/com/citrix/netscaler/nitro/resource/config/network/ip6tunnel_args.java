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
	* Provides additional arguments required for fetching the ip6tunnel resource.
	*/

public class ip6tunnel_args 
{
	private String remote;

	/**
	* <pre>
	* The remote IP address or subnet of the tunnel.<br> Minimum length =  1
	* </pre>
	*/
	public void set_remote(String remote) throws Exception{
		this.remote = remote;
	}

	/**
	* <pre>
	* The remote IP address or subnet of the tunnel.<br> Minimum length =  1
	* </pre>
	*/
	public String get_remote() throws Exception {
		return this.remote;
	}

}
