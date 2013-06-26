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

class nsdiameter_response extends base_response
{
	public nsdiameter nsdiameter;
}
/**
* Configuration for Diameter Parameters resource.
*/

public class nsdiameter extends base_resource
{
	private String identity;
	private String realm;
	private String serverclosepropagation;

	/**
	* <pre>
	* Diameter Host ID to be used by NS.<br> Minimum length =  1
	* </pre>
	*/
	public void set_identity(String identity) throws Exception{
		this.identity = identity;
	}

	/**
	* <pre>
	* Diameter Host ID to be used by NS.<br> Minimum length =  1
	* </pre>
	*/
	public String get_identity() throws Exception {
		return this.identity;
	}

	/**
	* <pre>
	* Diameter Realm to be used by NS.<br> Minimum length =  1
	* </pre>
	*/
	public void set_realm(String realm) throws Exception{
		this.realm = realm;
	}

	/**
	* <pre>
	* Diameter Realm to be used by NS.<br> Minimum length =  1
	* </pre>
	*/
	public String get_realm() throws Exception {
		return this.realm;
	}

	/**
	* <pre>
	* when a Server connection goes down, whether to close the corresponding client connection if there were requests pending on the server.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_serverclosepropagation(String serverclosepropagation) throws Exception{
		this.serverclosepropagation = serverclosepropagation;
	}

	/**
	* <pre>
	* when a Server connection goes down, whether to close the corresponding client connection if there were requests pending on the server.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_serverclosepropagation() throws Exception {
		return this.serverclosepropagation;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		nsdiameter[] resources = new nsdiameter[1];
		nsdiameter_response result = (nsdiameter_response) service.get_payload_formatter().string_to_resource(nsdiameter_response.class, response);
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
		resources[0] = result.nsdiameter;
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
	* Use this API to update nsdiameter.
	*/
	public static base_response update(nitro_service client, nsdiameter resource) throws Exception {
		nsdiameter updateresource = new nsdiameter();
		updateresource.identity = resource.identity;
		updateresource.realm = resource.realm;
		updateresource.serverclosepropagation = resource.serverclosepropagation;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of nsdiameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nsdiameter resource, String[] args) throws Exception{
		nsdiameter unsetresource = new nsdiameter();
		unsetresource.serverclosepropagation = resource.serverclosepropagation;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the nsdiameter resources that are configured on netscaler.
	*/
	public static nsdiameter get(nitro_service service) throws Exception{
		nsdiameter obj = new nsdiameter();
		nsdiameter[] response = (nsdiameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the nsdiameter resources that are configured on netscaler.
	*/
	public static nsdiameter get(nitro_service service,  options option) throws Exception{
		nsdiameter obj = new nsdiameter();
		nsdiameter[] response = (nsdiameter[])obj.get_resources(service,option);
		return response[0];
	}

	public static class serverclosepropagationEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
