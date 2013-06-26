/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.cluster;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class clusterfiles_response extends base_response
{
	public clusterfiles clusterfiles;
}
/**
* Configuration for files resource.
*/

public class clusterfiles extends base_resource
{
	private String[] mode;

	/**
	* <pre>
	* Specifies the directories and files to be synchronized.
Possible values: all, bookmarks, ssl, htmlinjection, imports, misc, dns, all_plus_misc.
Default value: all.<br> Possible values = all, bookmarks, ssl, htmlinjection, imports, misc, dns, all_plus_misc
	* </pre>
	*/
	public void set_mode(String[] mode) throws Exception{
		this.mode = mode;
	}

	/**
	* <pre>
	* Specifies the directories and files to be synchronized.
Possible values: all, bookmarks, ssl, htmlinjection, imports, misc, dns, all_plus_misc.
Default value: all.<br> Possible values = all, bookmarks, ssl, htmlinjection, imports, misc, dns, all_plus_misc
	* </pre>
	*/
	public String[] get_mode() throws Exception {
		return this.mode;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		clusterfiles[] resources = new clusterfiles[1];
		clusterfiles_response result = (clusterfiles_response) service.get_payload_formatter().string_to_resource(clusterfiles_response.class, response);
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
		resources[0] = result.clusterfiles;
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
	* Use this API to sync clusterfiles.
	*/
	public static base_response sync(nitro_service client, clusterfiles resource) throws Exception {
		clusterfiles syncresource = new clusterfiles();
		syncresource.mode = resource.mode;
		return syncresource.perform_operation(client,"sync");
	}

	public static class modeEnum {
		public static final String all = "all";
		public static final String bookmarks = "bookmarks";
		public static final String ssl = "ssl";
		public static final String htmlinjection = "htmlinjection";
		public static final String imports = "imports";
		public static final String misc = "misc";
		public static final String dns = "dns";
		public static final String all_plus_misc = "all_plus_misc";
	}
}
