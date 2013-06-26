/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.snmp;

/**
	* Provides additional arguments required for fetching the snmpoid resource.
	*/

public class snmpoid_args 
{
	private String entitytype;

	/**
	* <pre>
	* The type of entity whose SNMP OIDs you want the NetScaler appliance to display.<br> Possible values = VSERVER, SERVICE, SERVICEGROUP
	* </pre>
	*/
	public void set_entitytype(String entitytype) throws Exception{
		this.entitytype = entitytype;
	}

	/**
	* <pre>
	* The type of entity whose SNMP OIDs you want the NetScaler appliance to display.<br> Possible values = VSERVER, SERVICE, SERVICEGROUP
	* </pre>
	*/
	public String get_entitytype() throws Exception {
		return this.entitytype;
	}

	public static class entitytypeEnum {
		public static final String VSERVER = "VSERVER";
		public static final String SERVICE = "SERVICE";
		public static final String SERVICEGROUP = "SERVICEGROUP";
	}
}
