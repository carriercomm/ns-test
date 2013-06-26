/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.utility;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class techsupport_response extends base_response
{
	public techsupport techsupport;
}
/**
* Configuration for tech support resource.
*/

public class techsupport extends base_resource
{
	private String scope;

	//------- Read only Parameter ---------;

	private String servername;

	/**
	* <pre>
	*  Use this option to run showtechsupport on present node or all cluster nodes.<br> Default value: NS_TECH_NODE<br> Possible values = NODE, CLUSTER
	* </pre>
	*/
	public void set_scope(String scope) throws Exception{
		this.scope = scope;
	}

	/**
	* <pre>
	*  Use this option to run showtechsupport on present node or all cluster nodes.<br> Default value: NS_TECH_NODE<br> Possible values = NODE, CLUSTER
	* </pre>
	*/
	public String get_scope() throws Exception {
		return this.scope;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public String get_servername() throws Exception {
		return this.servername;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		techsupport[] resources = new techsupport[1];
		techsupport_response result = (techsupport_response) service.get_payload_formatter().string_to_resource(techsupport_response.class, response);
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
		resources[0] = result.techsupport;
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
	* Use this API to fetch all the techsupport resources that are configured on netscaler.
	*/
	public static techsupport get(nitro_service service) throws Exception{
		techsupport obj = new techsupport();
		techsupport[] response = (techsupport[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the techsupport resources that are configured on netscaler.
	*/
	public static techsupport get(nitro_service service,  options option) throws Exception{
		techsupport obj = new techsupport();
		techsupport[] response = (techsupport[])obj.get_resources(service,option);
		return response[0];
	}

	/**
	* Use this API to fetch all the techsupport resources that are configured on netscaler.
	* This uses techsupport_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static techsupport[] get(nitro_service service, techsupport_args args) throws Exception{
		techsupport obj = new techsupport();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		techsupport[] response = (techsupport[])obj.get_resources(service, option);
		return response;
	}

	public static class scopeEnum {
		public static final String NODE = "NODE";
		public static final String CLUSTER = "CLUSTER";
	}
}
