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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class sslfipssimtarget_response extends base_response
{
	public sslfipssimtarget sslfipssimtarget;
}
/**
* Configuration for FIPS SIM Target resource.
*/

public class sslfipssimtarget extends base_resource
{
	private String keyvector;
	private String sourcesecret;
	private String certfile;
	private String targetsecret;

	/**
	* <pre>
	* The file name and path for storing the target FIPS system's key-vector. The default output path for the secret data is /nsconfig/ssl/.<br> Minimum length =  1
	* </pre>
	*/
	public void set_keyvector(String keyvector) throws Exception{
		this.keyvector = keyvector;
	}

	/**
	* <pre>
	* The file name and path for storing the target FIPS system's key-vector. The default output path for the secret data is /nsconfig/ssl/.<br> Minimum length =  1
	* </pre>
	*/
	public String get_keyvector() throws Exception {
		return this.keyvector;
	}

	/**
	* <pre>
	* The file name and path for the source FIPS system's secret data. The default input path for the secret data is /nsconfig/ssl/.<br> Minimum length =  1
	* </pre>
	*/
	public void set_sourcesecret(String sourcesecret) throws Exception{
		this.sourcesecret = sourcesecret;
	}

	/**
	* <pre>
	* The file name and path for the source FIPS system's secret data. The default input path for the secret data is /nsconfig/ssl/.<br> Minimum length =  1
	* </pre>
	*/
	public String get_sourcesecret() throws Exception {
		return this.sourcesecret;
	}

	/**
	* <pre>
	* The source FIPS system's certificate file name and path. The default input path for the certificate file is /nsconfig/ssl/.<br> Minimum length =  1
	* </pre>
	*/
	public void set_certfile(String certfile) throws Exception{
		this.certfile = certfile;
	}

	/**
	* <pre>
	* The source FIPS system's certificate file name and path. The default input path for the certificate file is /nsconfig/ssl/.<br> Minimum length =  1
	* </pre>
	*/
	public String get_certfile() throws Exception {
		return this.certfile;
	}

	/**
	* <pre>
	* The file name and path for storing the target FIPS system's secret data. The default output path for the secret data is /nsconfig/ssl/.<br> Minimum length =  1
	* </pre>
	*/
	public void set_targetsecret(String targetsecret) throws Exception{
		this.targetsecret = targetsecret;
	}

	/**
	* <pre>
	* The file name and path for storing the target FIPS system's secret data. The default output path for the secret data is /nsconfig/ssl/.<br> Minimum length =  1
	* </pre>
	*/
	public String get_targetsecret() throws Exception {
		return this.targetsecret;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		sslfipssimtarget[] resources = new sslfipssimtarget[1];
		sslfipssimtarget_response result = (sslfipssimtarget_response) service.get_payload_formatter().string_to_resource(sslfipssimtarget_response.class, response);
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
		resources[0] = result.sslfipssimtarget;
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
	* Use this API to enable sslfipssimtarget.
	*/
	public static base_response enable(nitro_service client, sslfipssimtarget resource) throws Exception {
		sslfipssimtarget enableresource = new sslfipssimtarget();
		enableresource.keyvector = resource.keyvector;
		enableresource.sourcesecret = resource.sourcesecret;
		return enableresource.perform_operation(client,"enable");
	}

	/**
	* Use this API to init sslfipssimtarget.
	*/
	public static base_response init(nitro_service client, sslfipssimtarget resource) throws Exception {
		sslfipssimtarget initresource = new sslfipssimtarget();
		initresource.certfile = resource.certfile;
		initresource.keyvector = resource.keyvector;
		initresource.targetsecret = resource.targetsecret;
		return initresource.perform_operation(client,"init");
	}

}
