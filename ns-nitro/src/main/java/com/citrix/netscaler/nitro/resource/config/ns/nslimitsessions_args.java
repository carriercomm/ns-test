/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.ns;

/**
	* Provides additional arguments required for fetching the nslimitsessions resource.
	*/

public class nslimitsessions_args 
{
	private String limitidentifier;
	private Boolean detail;

	/**
	* <pre>
	* The name of the rate limit identifer.<br> Minimum length =  1
	* </pre>
	*/
	public void set_limitidentifier(String limitidentifier) throws Exception{
		this.limitidentifier = limitidentifier;
	}

	/**
	* <pre>
	* The name of the rate limit identifer.<br> Minimum length =  1
	* </pre>
	*/
	public String get_limitidentifier() throws Exception {
		return this.limitidentifier;
	}

	/**
	* <pre>
	* Displays the individual hash values.
	* </pre>
	*/
	public void set_detail(boolean detail) throws Exception {
		this.detail = new Boolean(detail);
	}

	/**
	* <pre>
	* Displays the individual hash values.
	* </pre>
	*/
	public void set_detail(Boolean detail) throws Exception{
		this.detail = detail;
	}

	/**
	* <pre>
	* Displays the individual hash values.
	* </pre>
	*/
	public Boolean get_detail() throws Exception {
		return this.detail;
	}

}
