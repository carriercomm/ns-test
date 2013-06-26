/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.base;

import com.citrix.netscaler.nitro.resource.base.base_resource;
import com.citrix.netscaler.nitro.service.nitro_service;

/**
 * Nitro login resource class.
 */
public class login extends base_resource 
{
	private String username;
	private String password;
	private String ipaddress;
	private String sessionid;
	private Long timeout;
	
	/**
	 * login class constructor specifying username and password for 
	 * logging into Netscaler.
	 * @param username username 
	 * @param password password
	 */
	public login(String username, String password) 
	{
		this.username = username;
		this.password = password;
	}
	
	/**
	 * login class constructor specifying username,password and timeout for 
	 * logging into Netscaler.
	 * @param username username. 
	 * @param password password.
	 * @param timeout session timeout in seconds.default timeout is 1800secs.
	 */
	public login(String username, String password, Long timeout) 
	{
		this.username = username;
		this.password = password;
		if(timeout != null)
			this.timeout = timeout;
	}
	
	/**
	 * 
	 */
	protected String get_object_name() 
	{
		return null;
	}
	
	/**
	 * gets the Nitro responce.
	 */
	protected  base_resource[] get_nitro_response(nitro_service service, String response) 
	{
		return null;
	}
}
