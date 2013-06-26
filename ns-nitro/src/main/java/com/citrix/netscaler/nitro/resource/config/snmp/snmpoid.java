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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class snmpoid_response extends base_response
{
	public snmpoid[] snmpoid;
}
/**
* Configuration for SNMP Object Identifier resource.
*/

public class snmpoid extends base_resource
{
	private String entitytype;
	private String name;

	//------- Read only Parameter ---------;

	private String Snmpoid;
	private Long __count;

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

	/**
	* <pre>
	* The name of the entity whose SNMP OID you want the NetScaler appliance to display.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the entity whose SNMP OID you want the NetScaler appliance to display.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The snmp oid.
	* </pre>
	*/
	public String get_Snmpoid() throws Exception {
		return this.Snmpoid;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		snmpoid_response result = (snmpoid_response) service.get_payload_formatter().string_to_resource(snmpoid_response.class, response);
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
		return result.snmpoid;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.name;
	}

	/**
	* Use this API to fetch a snmpoid resource.
	*/
	public static snmpoid get(nitro_service service, snmpoid obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		snmpoid response = (snmpoid) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a snmpoid resources.
	*/
	public static snmpoid[] get(nitro_service service, snmpoid obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			snmpoid response[] = new snmpoid[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (snmpoid) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch all the snmpoid resources that are configured on netscaler.
	* This uses snmpoid_args which is a way to provide additional arguments while fetching the resources.
	*/
	public static snmpoid[] get(nitro_service service, snmpoid_args args) throws Exception{
		snmpoid obj = new snmpoid();
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(args));
		snmpoid[] response = (snmpoid[])obj.get_resources(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of snmpoid resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static snmpoid[] get_filtered(nitro_service service, snmpoid obj, String filter) throws Exception{
		options option = new options();
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		snmpoid[] response = (snmpoid[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of snmpoid resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static snmpoid[] get_filtered(nitro_service service, snmpoid obj, filtervalue[] filter) throws Exception{
		options option = new options();
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		snmpoid[] response = (snmpoid[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the snmpoid resources configured on NetScaler.
	*/
	public static long count(nitro_service service, snmpoid obj) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		snmpoid[] response = (snmpoid[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of snmpoid resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, snmpoid obj, String filter) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		snmpoid[] response = (snmpoid[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of snmpoid resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, snmpoid obj, filtervalue[] filter) throws Exception{
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		snmpoid[] response = (snmpoid[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class entitytypeEnum {
		public static final String VSERVER = "VSERVER";
		public static final String SERVICE = "SERVICE";
		public static final String SERVICEGROUP = "SERVICEGROUP";
	}
}
