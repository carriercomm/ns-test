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
	* Provides additional arguments required for fetching the nsrunningconfig resource.
	*/

public class nsrunningconfig_args 
{
	private Boolean withdefaults;

	/**
	* <pre>
	* .
	* </pre>
	*/
	public void set_withdefaults(boolean withdefaults) throws Exception {
		this.withdefaults = new Boolean(withdefaults);
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public void set_withdefaults(Boolean withdefaults) throws Exception{
		this.withdefaults = withdefaults;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Boolean get_withdefaults() throws Exception {
		return this.withdefaults;
	}

}
