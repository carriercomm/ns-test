/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.config.ssl.sslcrl_serialnumber_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslcrl_binding_response extends base_response
{
	public sslcrl_binding[] sslcrl_binding;
}
/**
	* Binding class showing the resources that can be bound to sslcrl_binding. 
	*/

public class sslcrl_binding extends base_resource
{
	private String crlname;
	private sslcrl_serialnumber_binding	sslcrl_serialnumber_binding[] = null;

	/**
	* <pre>
	* The CRL object name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_crlname(String crlname) throws Exception{
		this.crlname = crlname;
	}

	/**
	* <pre>
	* The CRL object name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_crlname() throws Exception {
		return this.crlname;
	}

	/**
	* <pre>
	* serialnumber that can be bound to sslcrl.
	* </pre>
	*/
	public sslcrl_serialnumber_binding[] get_sslcrl_serialnumber_bindings() throws Exception {
		return this.sslcrl_serialnumber_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslcrl_binding_response result = (sslcrl_binding_response) service.get_payload_formatter().string_to_resource(sslcrl_binding_response.class, response);
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
		return result.sslcrl_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.crlname;
	}

	/**
	* Use this API to fetch sslcrl_binding resource of given name .
	*/
	public static sslcrl_binding get(nitro_service service, String crlname) throws Exception{
		sslcrl_binding obj = new sslcrl_binding();
		obj.set_crlname(crlname);
		sslcrl_binding response = (sslcrl_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslcrl_binding resources of given names .
	*/
	public static sslcrl_binding[] get(nitro_service service, String crlname[]) throws Exception{
		if (crlname !=null && crlname.length>0) {
			sslcrl_binding response[] = new sslcrl_binding[crlname.length];
			sslcrl_binding obj[] = new sslcrl_binding[crlname.length];
			for (int i=0;i<crlname.length;i++) {
				obj[i] = new sslcrl_binding();
				obj[i].set_crlname(crlname[i]);
				response[i] = (sslcrl_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}