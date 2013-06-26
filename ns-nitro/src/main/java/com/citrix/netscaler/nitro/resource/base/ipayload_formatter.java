/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/
/**
 * Provides classes necessary to create base_resource,base_response,Json,
 * login,logout and reboot objects.
 */
package com.citrix.netscaler.nitro.resource.base;

import com.citrix.netscaler.nitro.service.options;

/**
 * 
 * ipayload_formatter is the interface class for Json.
 * This includes methods for converting Json to nitro resource and vice versa.
 *
 */
public interface ipayload_formatter 
{
	public String resource_to_string(base_resource resrc);
	public String resource_to_string(base_resource resrc, String id, options option, Boolean warning, String onerror);
	public String unset_string(base_resource resrc, String id, options option, String args[], Boolean warning) throws Exception;
	public String unset_string(base_resource[] resrc, String id, options option, String args[], Boolean warning, String onerror) throws Exception;
	public String resource_to_string(base_resource resrc[], String id, options option, Boolean warning, String onerror);
	public Object string_to_resource(Class<?> responseClass, String response);
}
