/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.lb;

import com.citrix.netscaler.nitro.resource.config.lb.lbmonitor_metric_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class lbmonitor_binding_response extends base_response
{
	public lbmonitor_binding[] lbmonitor_binding;
}
/**
	* Binding class showing the resources that can be bound to lbmonitor_binding. 
	*/

public class lbmonitor_binding extends base_resource
{
	private String monitorname;
	private lbmonitor_metric_binding	lbmonitor_metric_binding[] = null;

	/**
	* <pre>
	* The name of the monitor.<br> Minimum length =  1
	* </pre>
	*/
	public void set_monitorname(String monitorname) throws Exception{
		this.monitorname = monitorname;
	}

	/**
	* <pre>
	* The name of the monitor.<br> Minimum length =  1
	* </pre>
	*/
	public String get_monitorname() throws Exception {
		return this.monitorname;
	}

	/**
	* <pre>
	* metric that can be bound to lbmonitor.
	* </pre>
	*/
	public lbmonitor_metric_binding[] get_lbmonitor_metric_bindings() throws Exception {
		return this.lbmonitor_metric_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbmonitor_binding_response result = (lbmonitor_binding_response) service.get_payload_formatter().string_to_resource(lbmonitor_binding_response.class, response);
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
		return result.lbmonitor_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.monitorname;
	}

	/**
	* Use this API to fetch lbmonitor_binding resource of given name .
	*/
	public static lbmonitor_binding get(nitro_service service, String monitorname) throws Exception{
		lbmonitor_binding obj = new lbmonitor_binding();
		obj.set_monitorname(monitorname);
		lbmonitor_binding response = (lbmonitor_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch lbmonitor_binding resources of given names .
	*/
	public static lbmonitor_binding[] get(nitro_service service, String monitorname[]) throws Exception{
		if (monitorname !=null && monitorname.length>0) {
			lbmonitor_binding response[] = new lbmonitor_binding[monitorname.length];
			lbmonitor_binding obj[] = new lbmonitor_binding[monitorname.length];
			for (int i=0;i<monitorname.length;i++) {
				obj[i] = new lbmonitor_binding();
				obj[i].set_monitorname(monitorname[i]);
				response[i] = (lbmonitor_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}