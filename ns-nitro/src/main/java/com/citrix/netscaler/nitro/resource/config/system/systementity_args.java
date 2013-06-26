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
	* Provides additional arguments required for fetching the systementity resource.
	*/

public class systementity_args 
{
	private String type;
	private String datasource;
	private Integer core;

	/**
	* <pre>
	* Specify the entity type.
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Specify the entity type.
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
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

	/**
	* <pre>
	* Specify core.
	* </pre>
	*/
	public void set_core(int core) throws Exception {
		this.core = new Integer(core);
	}

	/**
	* <pre>
	* Specify core.
	* </pre>
	*/
	public void set_core(Integer core) throws Exception{
		this.core = core;
	}

	/**
	* <pre>
	* Specify core.
	* </pre>
	*/
	public Integer get_core() throws Exception {
		return this.core;
	}

}
