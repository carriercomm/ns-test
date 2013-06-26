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
	* Provides additional arguments required for fetching the aaauser resource.
	*/

public class aaauser_args 
{
	private Boolean loggedin;

	/**
	* <pre>
	* The loggedin flag. When this flag is turned on, the system displays the names of all logged-in users. If a user name is included, the system displays whether the user is logged in or not. .
	* </pre>
	*/
	public void set_loggedin(boolean loggedin) throws Exception {
		this.loggedin = new Boolean(loggedin);
	}

	/**
	* <pre>
	* The loggedin flag. When this flag is turned on, the system displays the names of all logged-in users. If a user name is included, the system displays whether the user is logged in or not. .
	* </pre>
	*/
	public void set_loggedin(Boolean loggedin) throws Exception{
		this.loggedin = loggedin;
	}

	/**
	* <pre>
	* The loggedin flag. When this flag is turned on, the system displays the names of all logged-in users. If a user name is included, the system displays whether the user is logged in or not. .
	* </pre>
	*/
	public Boolean get_loggedin() throws Exception {
		return this.loggedin;
	}

}
