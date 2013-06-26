/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.wi;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class wipackage_response extends base_response
{
	public wipackage wipackage;
}
/**
* Configuration for Web Interface resource.
*/

public class wipackage extends base_resource
{
	private String jre;
	private String wi;
	private String maxsites;

	/**
	* <pre>
	* The location from where to get the java runtime package. Java package can be downloaded from http://ftp.riken.jp/pub/FreeBSD/ports/amd64/packages-6-stable/java/openjdk6-b17_2.tbz or http://www.freebsdfoundation.org/cgi-bin/download?download=diablo-jdk-freebsd6.amd64.1.6.0.07.02.tbz.<br> Default value: "file://tmp/diablo-jdk-freebsd6.amd64.1.6.0.07.02.tbz"<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_jre(String jre) throws Exception{
		this.jre = jre;
	}

	/**
	* <pre>
	* The location from where to get the java runtime package. Java package can be downloaded from http://ftp.riken.jp/pub/FreeBSD/ports/amd64/packages-6-stable/java/openjdk6-b17_2.tbz or http://www.freebsdfoundation.org/cgi-bin/download?download=diablo-jdk-freebsd6.amd64.1.6.0.07.02.tbz.<br> Default value: "file://tmp/diablo-jdk-freebsd6.amd64.1.6.0.07.02.tbz"<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_jre() throws Exception {
		return this.jre;
	}

	/**
	* <pre>
	* The location from where to get the web interface package.<br> Default value: "http://citrix.com/downloads/nswi-1.5.tgz"<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public void set_wi(String wi) throws Exception{
		this.wi = wi;
	}

	/**
	* <pre>
	* The location from where to get the web interface package.<br> Default value: "http://citrix.com/downloads/nswi-1.5.tgz"<br> Minimum length =  1<br> Maximum length =  255
	* </pre>
	*/
	public String get_wi() throws Exception {
		return this.wi;
	}

	/**
	* <pre>
	* Maximum number of WI sites that can be created; changes the amount of RAM reserved for WI usage; changing its value results in restart of Tomcat & invalidates any existing WI session.<br> Possible values = 3, 25, 50, 100, 200, 500
	* </pre>
	*/
	public void set_maxsites(String maxsites) throws Exception{
		this.maxsites = maxsites;
	}

	/**
	* <pre>
	* Maximum number of WI sites that can be created; changes the amount of RAM reserved for WI usage; changing its value results in restart of Tomcat & invalidates any existing WI session.<br> Possible values = 3, 25, 50, 100, 200, 500
	* </pre>
	*/
	public String get_maxsites() throws Exception {
		return this.maxsites;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		wipackage[] resources = new wipackage[1];
		wipackage_response result = (wipackage_response) service.get_payload_formatter().string_to_resource(wipackage_response.class, response);
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
		resources[0] = result.wipackage;
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
	* Use this API to Install wipackage.
	*/
	public static base_response Install(nitro_service client, wipackage resource) throws Exception {
		wipackage Installresource = new wipackage();
		Installresource.jre = resource.jre;
		Installresource.wi = resource.wi;
		Installresource.maxsites = resource.maxsites;
		return Installresource.perform_operation(client);
	}

	public static class maxsitesEnum {
		public static final String _3 = "3";
		public static final String _25 = "25";
		public static final String _50 = "50";
		public static final String _100 = "100";
		public static final String _200 = "200";
		public static final String _500 = "500";
	}
}
