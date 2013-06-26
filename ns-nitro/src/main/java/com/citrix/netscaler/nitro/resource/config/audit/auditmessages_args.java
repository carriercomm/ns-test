/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.audit;

/**
	* Provides additional arguments required for fetching the auditmessages resource.
	*/

public class auditmessages_args 
{
	private String[] loglevel;
	private Long numofmesgs;

	/**
	* <pre>
	* The log level filter.<br> Possible values = ALL, EMERGENCY, ALERT, CRITICAL, ERROR, WARNING, NOTICE, INFORMATIONAL, DEBUG, NONE
	* </pre>
	*/
	public void set_loglevel(String[] loglevel) throws Exception{
		this.loglevel = loglevel;
	}

	/**
	* <pre>
	* The log level filter.<br> Possible values = ALL, EMERGENCY, ALERT, CRITICAL, ERROR, WARNING, NOTICE, INFORMATIONAL, DEBUG, NONE
	* </pre>
	*/
	public String[] get_loglevel() throws Exception {
		return this.loglevel;
	}

	/**
	* <pre>
	* The number of log messages to be printed.<br> Default value: 20<br> Minimum value =  1<br> Maximum value =  256
	* </pre>
	*/
	public void set_numofmesgs(long numofmesgs) throws Exception {
		this.numofmesgs = new Long(numofmesgs);
	}

	/**
	* <pre>
	* The number of log messages to be printed.<br> Default value: 20<br> Minimum value =  1<br> Maximum value =  256
	* </pre>
	*/
	public void set_numofmesgs(Long numofmesgs) throws Exception{
		this.numofmesgs = numofmesgs;
	}

	/**
	* <pre>
	* The number of log messages to be printed.<br> Default value: 20<br> Minimum value =  1<br> Maximum value =  256
	* </pre>
	*/
	public Long get_numofmesgs() throws Exception {
		return this.numofmesgs;
	}

	public static class loglevelEnum {
		public static final String ALL = "ALL";
		public static final String EMERGENCY = "EMERGENCY";
		public static final String ALERT = "ALERT";
		public static final String CRITICAL = "CRITICAL";
		public static final String ERROR = "ERROR";
		public static final String WARNING = "WARNING";
		public static final String NOTICE = "NOTICE";
		public static final String INFORMATIONAL = "INFORMATIONAL";
		public static final String DEBUG = "DEBUG";
		public static final String NONE = "NONE";
	}
}
