/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.appfw;

/**
	* Provides additional arguments required for fetching the appfwlearningdata resource.
	*/

public class appfwlearningdata_args 
{
	private String profilename;
	private String securitycheck;

	/**
	* <pre>
	* Application Firewall profile name.
	* </pre>
	*/
	public void set_profilename(String profilename) throws Exception{
		this.profilename = profilename;
	}

	/**
	* <pre>
	* Application Firewall profile name.
	* </pre>
	*/
	public String get_profilename() throws Exception {
		return this.profilename;
	}

	/**
	* <pre>
	* Security check.<br> Possible values = startURL, cookieConsistency, fieldConsistency, crossSiteScripting, SQLInjection, fieldFormat, CSRFtag, XMLDoSCheck, XMLWSICheck, XMLAttachmentCheck, TotalXMLRequests
	* </pre>
	*/
	public void set_securitycheck(String securitycheck) throws Exception{
		this.securitycheck = securitycheck;
	}

	/**
	* <pre>
	* Security check.<br> Possible values = startURL, cookieConsistency, fieldConsistency, crossSiteScripting, SQLInjection, fieldFormat, CSRFtag, XMLDoSCheck, XMLWSICheck, XMLAttachmentCheck, TotalXMLRequests
	* </pre>
	*/
	public String get_securitycheck() throws Exception {
		return this.securitycheck;
	}

	public static class securitycheckEnum {
		public static final String startURL = "startURL";
		public static final String cookieConsistency = "cookieConsistency";
		public static final String fieldConsistency = "fieldConsistency";
		public static final String crossSiteScripting = "crossSiteScripting";
		public static final String SQLInjection = "SQLInjection";
		public static final String fieldFormat = "fieldFormat";
		public static final String CSRFtag = "CSRFtag";
		public static final String XMLDoSCheck = "XMLDoSCheck";
		public static final String XMLWSICheck = "XMLWSICheck";
		public static final String XMLAttachmentCheck = "XMLAttachmentCheck";
		public static final String TotalXMLRequests = "TotalXMLRequests";
	}
}
