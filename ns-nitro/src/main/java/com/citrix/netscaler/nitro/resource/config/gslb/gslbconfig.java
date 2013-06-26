/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.gslb;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class gslbconfig_response extends base_response
{
	public gslbconfig gslbconfig;
}
/**
* Configuration for gslb config resource.
*/

public class gslbconfig extends base_resource
{
	private Boolean preview;
	private Boolean debug;
	private String forcesync;
	private Boolean nowarn;
	private Boolean saveconfig;
	private String command;

	/**
	* <pre>
	* Preview of the commands that are applied on the slave node. This won't initiate the gslb auto sync.
	* </pre>
	*/
	public void set_preview(boolean preview) throws Exception {
		this.preview = new Boolean(preview);
	}

	/**
	* <pre>
	* Preview of the commands that are applied on the slave node. This won't initiate the gslb auto sync.
	* </pre>
	*/
	public void set_preview(Boolean preview) throws Exception{
		this.preview = preview;
	}

	/**
	* <pre>
	* Preview of the commands that are applied on the slave node. This won't initiate the gslb auto sync.
	* </pre>
	*/
	public Boolean get_preview() throws Exception {
		return this.preview;
	}

	/**
	* <pre>
	* A more verbose output of gslb auto sync.
	* </pre>
	*/
	public void set_debug(boolean debug) throws Exception {
		this.debug = new Boolean(debug);
	}

	/**
	* <pre>
	* A more verbose output of gslb auto sync.
	* </pre>
	*/
	public void set_debug(Boolean debug) throws Exception{
		this.debug = debug;
	}

	/**
	* <pre>
	* A more verbose output of gslb auto sync.
	* </pre>
	*/
	public Boolean get_debug() throws Exception {
		return this.debug;
	}

	/**
	* <pre>
	* Forcibly sync the config from master to slave. The slave is identified with the sitename supplied as part of the argument.  If the supplied argument is "all-sites", the config will be pushed to all slave nodes.
	* </pre>
	*/
	public void set_forcesync(String forcesync) throws Exception{
		this.forcesync = forcesync;
	}

	/**
	* <pre>
	* Forcibly sync the config from master to slave. The slave is identified with the sitename supplied as part of the argument.  If the supplied argument is "all-sites", the config will be pushed to all slave nodes.
	* </pre>
	*/
	public String get_forcesync() throws Exception {
		return this.forcesync;
	}

	/**
	* <pre>
	* Suppresses warning and confirmation prompt.
	* </pre>
	*/
	public void set_nowarn(boolean nowarn) throws Exception {
		this.nowarn = new Boolean(nowarn);
	}

	/**
	* <pre>
	* Suppresses warning and confirmation prompt.
	* </pre>
	*/
	public void set_nowarn(Boolean nowarn) throws Exception{
		this.nowarn = nowarn;
	}

	/**
	* <pre>
	* Suppresses warning and confirmation prompt.
	* </pre>
	*/
	public Boolean get_nowarn() throws Exception {
		return this.nowarn;
	}

	/**
	* <pre>
	* Executes saveconfig on master prior to sync and after successful sync on slaves.
	* </pre>
	*/
	public void set_saveconfig(boolean saveconfig) throws Exception {
		this.saveconfig = new Boolean(saveconfig);
	}

	/**
	* <pre>
	* Executes saveconfig on master prior to sync and after successful sync on slaves.
	* </pre>
	*/
	public void set_saveconfig(Boolean saveconfig) throws Exception{
		this.saveconfig = saveconfig;
	}

	/**
	* <pre>
	* Executes saveconfig on master prior to sync and after successful sync on slaves.
	* </pre>
	*/
	public Boolean get_saveconfig() throws Exception {
		return this.saveconfig;
	}

	/**
	* <pre>
	* Execute the command on master and then on all the slaves.
	* </pre>
	*/
	public void set_command(String command) throws Exception{
		this.command = command;
	}

	/**
	* <pre>
	* Execute the command on master and then on all the slaves.
	* </pre>
	*/
	public String get_command() throws Exception {
		return this.command;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		gslbconfig[] resources = new gslbconfig[1];
		gslbconfig_response result = (gslbconfig_response) service.get_payload_formatter().string_to_resource(gslbconfig_response.class, response);
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
		resources[0] = result.gslbconfig;
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
	* Use this API to sync gslbconfig.
	*/
	public static base_response sync(nitro_service client, gslbconfig resource) throws Exception {
		gslbconfig syncresource = new gslbconfig();
		syncresource.preview = resource.preview;
		syncresource.debug = resource.debug;
		syncresource.forcesync = resource.forcesync;
		syncresource.nowarn = resource.nowarn;
		syncresource.saveconfig = resource.saveconfig;
		syncresource.command = resource.command;
		return syncresource.perform_operation(client,"sync");
	}

}
