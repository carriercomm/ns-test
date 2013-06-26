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

import com.citrix.netscaler.nitro.resource.config.ssl.sslcipher_individualcipher_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslcipher_sslciphersuite_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslcipher_binding_response extends base_response
{
	public sslcipher_binding[] sslcipher_binding;
}
/**
	* Binding class showing the resources that can be bound to sslcipher_binding. 
	*/

public class sslcipher_binding extends base_resource
{
	private String ciphergroupname;
	private sslcipher_individualcipher_binding	sslcipher_individualcipher_binding[] = null;
	private sslcipher_sslciphersuite_binding	sslcipher_sslciphersuite_binding[] = null;

	/**
	* <pre>
	* The name of cipher group/alias/individual cipher name.<br> Minimum length =  1
	* </pre>
	*/
	public void set_ciphergroupname(String ciphergroupname) throws Exception{
		this.ciphergroupname = ciphergroupname;
	}

	/**
	* <pre>
	* The name of cipher group/alias/individual cipher name.<br> Minimum length =  1
	* </pre>
	*/
	public String get_ciphergroupname() throws Exception {
		return this.ciphergroupname;
	}

	/**
	* <pre>
	* sslciphersuite that can be bound to sslcipher.
	* </pre>
	*/
	public sslcipher_sslciphersuite_binding[] get_sslcipher_sslciphersuite_bindings() throws Exception {
		return this.sslcipher_sslciphersuite_binding;
	}

	/**
	* <pre>
	* individualcipher that can be bound to sslcipher.
	* </pre>
	*/
	public sslcipher_individualcipher_binding[] get_sslcipher_individualcipher_bindings() throws Exception {
		return this.sslcipher_individualcipher_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		sslcipher_binding_response result = (sslcipher_binding_response) service.get_payload_formatter().string_to_resource(sslcipher_binding_response.class, response);
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
		return result.sslcipher_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.ciphergroupname;
	}

	/**
	* Use this API to fetch sslcipher_binding resource of given name .
	*/
	public static sslcipher_binding get(nitro_service service, String ciphergroupname) throws Exception{
		sslcipher_binding obj = new sslcipher_binding();
		obj.set_ciphergroupname(ciphergroupname);
		sslcipher_binding response = (sslcipher_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch sslcipher_binding resources of given names .
	*/
	public static sslcipher_binding[] get(nitro_service service, String ciphergroupname[]) throws Exception{
		if (ciphergroupname !=null && ciphergroupname.length>0) {
			sslcipher_binding response[] = new sslcipher_binding[ciphergroupname.length];
			sslcipher_binding obj[] = new sslcipher_binding[ciphergroupname.length];
			for (int i=0;i<ciphergroupname.length;i++) {
				obj[i] = new sslcipher_binding();
				obj[i].set_ciphergroupname(ciphergroupname[i]);
				response[i] = (sslcipher_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}