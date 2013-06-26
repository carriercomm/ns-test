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
	* Provides additional arguments required for fetching the nsevents resource.
	*/

public class nsevents_args 
{
	private Long eventno;

	/**
	* <pre>
	* Last retrieved event no. This command will return all events after that.
	* </pre>
	*/
	public void set_eventno(long eventno) throws Exception {
		this.eventno = new Long(eventno);
	}

	/**
	* <pre>
	* Last retrieved event no. This command will return all events after that.
	* </pre>
	*/
	public void set_eventno(Long eventno) throws Exception{
		this.eventno = eventno;
	}

	/**
	* <pre>
	* Last retrieved event no. This command will return all events after that.
	* </pre>
	*/
	public Long get_eventno() throws Exception {
		return this.eventno;
	}

}
