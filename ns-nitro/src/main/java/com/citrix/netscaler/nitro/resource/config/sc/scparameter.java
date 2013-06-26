/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.sc;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class scparameter_response extends base_response
{
	public scparameter scparameter;
}
/**
* Configuration for SC parameter resource.
*/

public class scparameter extends base_resource
{
	private Long sessionlife;
	private String vsr;

	/**
	* <pre>
	* The time between the first time and next time the sureconnect alternet window display.The SureConnect alternate content window is displayed only once during a session. For the same browser accessing a configured URL.The value is in seconds.<br> Default value: 300<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_sessionlife(long sessionlife) throws Exception {
		this.sessionlife = new Long(sessionlife);
	}

	/**
	* <pre>
	* The time between the first time and next time the sureconnect alternet window display.The SureConnect alternate content window is displayed only once during a session. For the same browser accessing a configured URL.The value is in seconds.<br> Default value: 300<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_sessionlife(Long sessionlife) throws Exception{
		this.sessionlife = sessionlife;
	}

	/**
	* <pre>
	* The time between the first time and next time the sureconnect alternet window display.The SureConnect alternate content window is displayed only once during a session. For the same browser accessing a configured URL.The value is in seconds.<br> Default value: 300<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_sessionlife() throws Exception {
		return this.sessionlife;
	}

	/**
	* <pre>
	* The file containing the customized response that is to be displayed with ACTION as NS in the SureConnect policy.<br> Default value: "DEFAULT"<br> Minimum length =  1
	* </pre>
	*/
	public void set_vsr(String vsr) throws Exception{
		this.vsr = vsr;
	}

	/**
	* <pre>
	* The file containing the customized response that is to be displayed with ACTION as NS in the SureConnect policy.<br> Default value: "DEFAULT"<br> Minimum length =  1
	* </pre>
	*/
	public String get_vsr() throws Exception {
		return this.vsr;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		scparameter[] resources = new scparameter[1];
		scparameter_response result = (scparameter_response) service.get_payload_formatter().string_to_resource(scparameter_response.class, response);
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
		resources[0] = result.scparameter;
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
	* Use this API to update scparameter.
	*/
	public static base_response update(nitro_service client, scparameter resource) throws Exception {
		scparameter updateresource = new scparameter();
		updateresource.sessionlife = resource.sessionlife;
		updateresource.vsr = resource.vsr;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of scparameter resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, scparameter resource, String[] args) throws Exception{
		scparameter unsetresource = new scparameter();
		unsetresource.sessionlife = resource.sessionlife;
		unsetresource.vsr = resource.vsr;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the scparameter resources that are configured on netscaler.
	*/
	public static scparameter get(nitro_service service) throws Exception{
		scparameter obj = new scparameter();
		scparameter[] response = (scparameter[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the scparameter resources that are configured on netscaler.
	*/
	public static scparameter get(nitro_service service,  options option) throws Exception{
		scparameter obj = new scparameter();
		scparameter[] response = (scparameter[])obj.get_resources(service,option);
		return response[0];
	}

}
