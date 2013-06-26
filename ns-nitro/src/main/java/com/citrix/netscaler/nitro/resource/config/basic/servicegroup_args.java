/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.basic;

/**
	* Provides additional arguments required for fetching the servicegroup resource.
	*/

public class servicegroup_args 
{
	private Boolean includemembers;

	/**
	* <pre>
	* Include a summary of the members in a group too.
	* </pre>
	*/
	public void set_includemembers(boolean includemembers) throws Exception {
		this.includemembers = new Boolean(includemembers);
	}

	/**
	* <pre>
	* Include a summary of the members in a group too.
	* </pre>
	*/
	public void set_includemembers(Boolean includemembers) throws Exception{
		this.includemembers = includemembers;
	}

	/**
	* <pre>
	* Include a summary of the members in a group too.
	* </pre>
	*/
	public Boolean get_includemembers() throws Exception {
		return this.includemembers;
	}

}
