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

/**
	* Provides additional arguments required for fetching the sslvserver resource.
	*/

public class sslvserver_args 
{
	private Boolean cipherdetails;

	/**
	* <pre>
	* Details of the individual ciphers bound to the SSL vserver. Select this flag value to display the details of the individual ciphers bound to the SSL vserver.
	* </pre>
	*/
	public void set_cipherdetails(boolean cipherdetails) throws Exception {
		this.cipherdetails = new Boolean(cipherdetails);
	}

	/**
	* <pre>
	* Details of the individual ciphers bound to the SSL vserver. Select this flag value to display the details of the individual ciphers bound to the SSL vserver.
	* </pre>
	*/
	public void set_cipherdetails(Boolean cipherdetails) throws Exception{
		this.cipherdetails = cipherdetails;
	}

	/**
	* <pre>
	* Details of the individual ciphers bound to the SSL vserver. Select this flag value to display the details of the individual ciphers bound to the SSL vserver.
	* </pre>
	*/
	public Boolean get_cipherdetails() throws Exception {
		return this.cipherdetails;
	}

}
