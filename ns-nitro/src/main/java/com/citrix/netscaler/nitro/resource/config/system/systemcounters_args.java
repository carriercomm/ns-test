/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.system;

/**
	* Provides additional arguments required for fetching the systemcounters resource.
	*/

public class systemcounters_args 
{
	private String countergroup;
	private String datasource;

	/**
	* <pre>
	* Specify the group name.
	* </pre>
	*/
	public void set_countergroup(String countergroup) throws Exception{
		this.countergroup = countergroup;
	}

	/**
	* <pre>
	* Specify the group name.
	* </pre>
	*/
	public String get_countergroup() throws Exception {
		return this.countergroup;
	}

	/**
	* <pre>
	* Specify Data source name.
	* </pre>
	*/
	public void set_datasource(String datasource) throws Exception{
		this.datasource = datasource;
	}

	/**
	* <pre>
	* Specify Data source name.
	* </pre>
	*/
	public String get_datasource() throws Exception {
		return this.datasource;
	}

}
