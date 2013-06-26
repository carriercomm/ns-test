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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nsrollbackcmd_response extends base_response
{
	public nsrollbackcmd nsrollbackcmd;
}
/**
* Configuration for Generate rollback commands resource.
*/

public class nsrollbackcmd extends base_resource
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

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nsrollbackcmd[] resources = new nsrollbackcmd[1];
		nsrollbackcmd_response result = (nsrollbackcmd_response) service.get_payload_formatter().string_to_resource(nsrollbackcmd_response.class, response);
		if(result.errorcode != 0) {
			if (result.errorcode == 444) {
				service.clear_session();
			}
			if(result.severity != null)
			{
				if (result.severity.equals("ERROR"))
					throw new nitro_exception(result.message,result.errorcode);
			}
			else
			{
				throw new nitro_exception(result.message,result.errorcode);
			}
		}
		resources[0] = result.nsrollbackcmd;
		return resources;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to fetch all the nsrollbackcmd resources that are configured on netscaler.
	*/
	public static nsrollbackcmd get(nitro_service service) throws Exception{
		nsrollbackcmd obj = new nsrollbackcmd();
		nsrollbackcmd[] response = (nsrollbackcmd[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nsrollbackcmd resources that are configured on netscaler.
	*/
	public static nsrollbackcmd get(nitro_service service,  options option) throws Exception{
		nsrollbackcmd obj = new nsrollbackcmd();
		nsrollbackcmd[] response = (nsrollbackcmd[])obj.get_resources(service,option);
		return response[0];
	}

	/**
	* Use this API to fetch all the nsrollbackcmd resources that are configured on netscaler.
	* This uses nsrollbackcmd_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static nsrollbackcmd[] get(nitro_service service, nsrollbackcmd_args args) throws Exception{
		nsrollbackcmd obj = new nsrollbackcmd();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		nsrollbackcmd[] response = (nsrollbackcmd[])obj.get_resources(service, option);
		return response;
	}

	public static class outtypeEnum {
		public static final String cli = "cli";
		public static final String xml = "xml";
	}
}
