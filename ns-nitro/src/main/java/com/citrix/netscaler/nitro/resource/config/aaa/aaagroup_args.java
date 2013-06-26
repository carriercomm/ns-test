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
	* Provides additional arguments required for fetching the aaagroup resource.
	*/

public class aaagroup_args 
{
	private Boolean loggedin;

	/**
	* <pre>
	* The loggedin flag. When this flag is turned on, the system displays the names of the users in a group if at least one user in the group is logged in. When used with a group name, the system lists the users in the group who are logged in.
	* </pre>
	*/
	public void set_loggedin(boolean loggedin) throws Exception {
		this.loggedin = new Boolean(loggedin);
	}

	/**
	* <pre>
	* The loggedin flag. When this flag is turned on, the system displays the names of the users in a group if at least one user in the group is logged in. When used with a group name, the system lists the users in the group who are logged in.
	* </pre>
	*/
	public void set_loggedin(Boolean loggedin) throws Exception{
		this.loggedin = loggedin;
	}

	/**
	* <pre>
	* The loggedin flag. When this flag is turned on, the system displays the names of the users in a group if at least one user in the group is logged in. When used with a group name, the system lists the users in the group who are logged in.
	* </pre>
	*/
	public Boolean get_loggedin() throws Exception {
		return this.loggedin;
	}

}
