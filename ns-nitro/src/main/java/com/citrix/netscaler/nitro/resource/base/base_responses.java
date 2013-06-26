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

/**
 * 
 * base_response is a abstract base class for all the netscaler config/stat response classes.
 *
 */
public class base_responses
{
	public int errorcode;
	public String message;
	public String severity;
	public String sessionid;
	public base_response[] response;
}
