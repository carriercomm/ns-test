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

/**
	* Provides additional arguments required for fetching the nsip resource.
	*/

public class nsip_args 
{
	private String type;

	/**
	* <pre>
	* The type of this IP.<br> Possible values = SNIP, VIP, MIP, NSIP, GSLBsiteIP, CLIP
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* The type of this IP.<br> Possible values = SNIP, VIP, MIP, NSIP, GSLBsiteIP, CLIP
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	public static class typeEnum {
		public static final String SNIP = "SNIP";
		public static final String VIP = "VIP";
		public static final String MIP = "MIP";
		public static final String NSIP = "NSIP";
		public static final String GSLBsiteIP = "GSLBsiteIP";
		public static final String CLIP = "CLIP";
	}
}
