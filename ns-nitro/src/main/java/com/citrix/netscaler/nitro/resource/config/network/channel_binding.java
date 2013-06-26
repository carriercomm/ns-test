/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.network;

import com.citrix.netscaler.nitro.resource.config.network.channel_interface_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class channel_binding_response extends base_response
{
	public channel_binding[] channel_binding;
}
/**
	* Binding class showing the resources that can be bound to channel_binding. 
	*/

public class channel_binding extends base_resource
{
	private String id;
	private channel_interface_binding	channel_interface_binding[] = null;

	/**
	* <pre>
	* LA channel name in form LA/x, where x is the channel ID, which ranges from 1 to 4.<br> Minimum length =  1
	* </pre>
	*/
	public void set_id(String id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* LA channel name in form LA/x, where x is the channel ID, which ranges from 1 to 4.<br> Minimum length =  1
	* </pre>
	*/
	public String get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* interface that can be bound to channel.
	* </pre>
	*/
	public channel_interface_binding[] get_channel_interface_bindings() throws Exception {
		return this.channel_interface_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		channel_binding_response result = (channel_binding_response) service.get_payload_formatter().string_to_resource(channel_binding_response.class, response);
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
		return result.channel_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.id;
	}

	/**
	* Use this API to fetch channel_binding resource of given name .
	*/
	public static channel_binding get(nitro_service service, String id) throws Exception{
		channel_binding obj = new channel_binding();
		obj.set_id(id);
		channel_binding response = (channel_binding) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch channel_binding resources of given names .
	*/
	public static channel_binding[] get(nitro_service service, String id[]) throws Exception{
		if (id !=null && id.length>0) {
			channel_binding response[] = new channel_binding[id.length];
			channel_binding obj[] = new channel_binding[id.length];
			for (int i=0;i<id.length;i++) {
				obj[i] = new channel_binding();
				obj[i].set_id(id[i]);
				response[i] = (channel_binding) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}

}