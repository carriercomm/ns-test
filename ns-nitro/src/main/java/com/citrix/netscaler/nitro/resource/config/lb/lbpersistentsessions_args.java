/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.lb;

/**
	* Provides additional arguments required for fetching the lbpersistentsessions resource.
	*/

public class lbpersistentsessions_args 
{
	private String vserver;

	/**
	* <pre>
	* The name of the virtual server.
	* </pre>
	*/
	public void set_vserver(String vserver) throws Exception{
		this.vserver = vserver;
	}

	/**
	* <pre>
	* The name of the virtual server.
	* </pre>
	*/
	public String get_vserver() throws Exception {
		return this.vserver;
	}

}
