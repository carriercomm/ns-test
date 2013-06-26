/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

/**
 * Provides the classes necessary to create nitro_exception.
 */
package com.citrix.netscaler.nitro.exception;

import com.citrix.netscaler.nitro.resource.base.base_response;

@SuppressWarnings("serial")
/**
 * nitro_exception class is used to handle Nitro exceptions.
 */
public class nitro_exception extends Exception 
{
	private int errorcode;
	public base_response[] response;
	
	/**
	 * nitro_exception Class constructor.
	 */
	public nitro_exception() 
	{
		this.errorcode = -1;
    }
	
	/**
	 * nitro_exception Class constructor specifying the error message.
	 */
	public nitro_exception(String msg)
	{
		this(msg,-1);
    }

	/**
	 * nitro_exception Class constructor specifying the error message and error code.
	 */
	public nitro_exception(String msg,int errcode) 
	{
		super(msg);
		this.errorcode = errcode;
    }
	
	/**
	 * nitro_exception Class constructor specifying the error message and error code.
	 */
	public nitro_exception(String msg,int errcode,base_response[] response) 
	{
		super(msg);
		this.errorcode = errcode;
		this.response = response;
    }

	/**
	 * Gets the error code.
	 * @return gets the error code.
 	 */
	public int getErrorCode() 
	{
		return this.errorcode;
	}
}
