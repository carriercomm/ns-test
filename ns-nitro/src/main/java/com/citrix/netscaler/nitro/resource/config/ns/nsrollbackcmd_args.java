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
	* Provides additional arguments required for fetching the nsrollbackcmd resource.
	*/

public class nsrollbackcmd_args 
{
	private String filename;
	private String outtype;

	/**
	* <pre>
	* Input file for generating rollback commands.
	* </pre>
	*/
	public void set_filename(String filename) throws Exception{
		this.filename = filename;
	}

	/**
	* <pre>
	* Input file for generating rollback commands.
	* </pre>
	*/
	public String get_filename() throws Exception {
		return this.filename;
	}

	/**
	* <pre>
	* The format in which result is desired.<br> Possible values = cli, xml
	* </pre>
	*/
	public void set_outtype(String outtype) throws Exception{
		this.outtype = outtype;
	}

	/**
	* <pre>
	* The format in which result is desired.<br> Possible values = cli, xml
	* </pre>
	*/
	public String get_outtype() throws Exception {
		return this.outtype;
	}

	public static class outtypeEnum {
		public static final String cli = "cli";
		public static final String xml = "xml";
	}
}
