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

import com.citrix.netscaler.nitro.resource.config.lb.lbmetrictable_metric_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class lbmetrictable_binding_response extends base_response
{
	public lbmetrictable_binding[] lbmetrictable_binding;
}
/**
	* Binding class showing the resources that can be bound to lbmetrictable_binding. 
	*/

public class lbmetrictable_binding extends base_resource
{
	private String metrictable;
	private lbmetrictable_metric_binding	lbmetrictable_metric_binding[] = null;

	/**
	* <pre>
	* The name of the metric table.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_metrictable(String metrictable) throws Exception{
		this.metrictable = metrictable;
	}

	/**
	* <pre>
	* The name of the metric table.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_metrictable() throws Exception {
		return this.metrictable;
	}

	/**
	* <pre>
	* metric that can be bound to lbmetrictable.
	* </pre>
	*/
	public lbmetrictable_metric_binding[] get_lbmetrictable_metric_bindings() throws Exception {
		return this.lbmetrictable_metric_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		lbmetrictable_binding_response result = (lbmetrictable_binding_response) service.get_payload_formatter().string_to_resource(lbmetrictable_binding_response.class, response);
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
		return result.lbmetrictable_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.metrictable;
	}

	/**
	* Use this API to fetch lbmetrictable_binding resource of given name .
	*/
	public static lbmetrictable_binding get(nitro_service service, String metrictable) throws Exception{
		lbmetrictable_binding obj = new lbmetrictable_binding();
		obj.set_metrictable(metrictable);
		lbmetrictable_binding response = (lbmetrictable_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch lbmetrictable_binding resources of given names .
	*/
	public static lbmetrictable_binding[] get(nitro_service service, String metrictable[]) throws Exception{
		if (metrictable !=null && metrictable.length>0) {
			lbmetrictable_binding response[] = new lbmetrictable_binding[metrictable.length];
			lbmetrictable_binding obj[] = new lbmetrictable_binding[metrictable.length];
			for (int i=0;i<metrictable.length;i++) {
				obj[i] = new lbmetrictable_binding();
				obj[i].set_metrictable(metrictable[i]);
				response[i] = (lbmetrictable_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}