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
	* Provides additional arguments required for fetching the iptunnel resource.
	*/

public class iptunnel_args 
{
	private String remote;
	private String remotesubnetmask;

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

	/**
	* <pre>
	* Subnet mask of the remote IP address of the tunnel. A public IPv4 address of the remote device used to set up the tunnel. For this parameter, you can also specify a network address if you specify IPIP (IP over IP) for the Protocol parameter.
	* </pre>
	*/
	public void set_remotesubnetmask(String remotesubnetmask) throws Exception{
		this.remotesubnetmask = remotesubnetmask;
	}

	/**
	* <pre>
	* Subnet mask of the remote IP address of the tunnel. A public IPv4 address of the remote device used to set up the tunnel. For this parameter, you can also specify a network address if you specify IPIP (IP over IP) for the Protocol parameter.
	* </pre>
	*/
	public String get_remotesubnetmask() throws Exception {
		return this.remotesubnetmask;
	}

}
