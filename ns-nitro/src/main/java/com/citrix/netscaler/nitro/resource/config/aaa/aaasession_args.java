/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.aaa;

/**
	* Provides additional arguments required for fetching the aaasession resource.
	*/

public class aaasession_args 
{
	private String username;
	private String groupname;
	private String iip;
	private String netmask;

	/**
	* <pre>
	* The user name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_username(String username) throws Exception{
		this.username = username;
	}

	/**
	* <pre>
	* The user name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_username() throws Exception {
		return this.username;
	}

	/**
	* <pre>
	* The group name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_groupname(String groupname) throws Exception{
		this.groupname = groupname;
	}

	/**
	* <pre>
	* The group name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_groupname() throws Exception {
		return this.groupname;
	}

	/**
	* <pre>
	* Intranet IP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_iip(String iip) throws Exception{
		this.iip = iip;
	}

	/**
	* <pre>
	* Intranet IP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_iip() throws Exception {
		return this.iip;
	}

	/**
	* <pre>
	* The netmask associated with the intranet IP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_netmask(String netmask) throws Exception{
		this.netmask = netmask;
	}

	/**
	* <pre>
	* The netmask associated with the intranet IP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_netmask() throws Exception {
		return this.netmask;
	}

}
