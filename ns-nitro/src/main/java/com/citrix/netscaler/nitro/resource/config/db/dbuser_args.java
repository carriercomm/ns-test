/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.db;

/**
	* Provides additional arguments required for fetching the dbuser resource.
	*/

public class dbuser_args 
{
	private Boolean loggedin;

	/**
	* <pre>
	* Display the names of all database users that are logged on to the NetScaler appliance.
	* </pre>
	*/
	public void set_loggedin(boolean loggedin) throws Exception {
		this.loggedin = new Boolean(loggedin);
	}

	/**
	* <pre>
	* Display the names of all database users that are logged on to the NetScaler appliance.
	* </pre>
	*/
	public void set_loggedin(Boolean loggedin) throws Exception{
		this.loggedin = loggedin;
	}

	/**
	* <pre>
	* Display the names of all database users that are logged on to the NetScaler appliance.
	* </pre>
	*/
	public Boolean get_loggedin() throws Exception {
		return this.loggedin;
	}

}
