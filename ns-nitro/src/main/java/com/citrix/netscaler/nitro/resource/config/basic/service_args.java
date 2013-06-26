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
	* Provides additional arguments required for fetching the service resource.
	*/

public class service_args 
{
	private Boolean all;
	private Boolean Internal;

	/**
	* <pre>
	* Display both configured and dynamically learned services. If you do not use this option, only the configured services are displayed.
	* </pre>
	*/
	public void set_all(boolean all) throws Exception {
		this.all = new Boolean(all);
	}

	/**
	* <pre>
	* Display both configured and dynamically learned services. If you do not use this option, only the configured services are displayed.
	* </pre>
	*/
	public void set_all(Boolean all) throws Exception{
		this.all = all;
	}

	/**
	* <pre>
	* Display both configured and dynamically learned services. If you do not use this option, only the configured services are displayed.
	* </pre>
	*/
	public Boolean get_all() throws Exception {
		return this.all;
	}

	/**
	* <pre>
	* Display internally created named services.
	* </pre>
	*/
	public void set_Internal(boolean Internal) throws Exception {
		this.Internal = new Boolean(Internal);
	}

	/**
	* <pre>
	* Display internally created named services.
	* </pre>
	*/
	public void set_Internal(Boolean Internal) throws Exception{
		this.Internal = Internal;
	}

	/**
	* <pre>
	* Display internally created named services.
	* </pre>
	*/
	public Boolean get_Internal() throws Exception {
		return this.Internal;
	}

}
