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
	* Provides additional arguments required for fetching the server resource.
	*/

public class server_args 
{
	private Boolean Internal;

	/**
	* <pre>
	* Display internally created named servers.
	* </pre>
	*/
	public void set_Internal(boolean Internal) throws Exception {
		this.Internal = new Boolean(Internal);
	}

	/**
	* <pre>
	* Display internally created named servers.
	* </pre>
	*/
	public void set_Internal(Boolean Internal) throws Exception{
		this.Internal = Internal;
	}

	/**
	* <pre>
	* Display internally created named servers.
	* </pre>
	*/
	public Boolean get_Internal() throws Exception {
		return this.Internal;
	}

}
