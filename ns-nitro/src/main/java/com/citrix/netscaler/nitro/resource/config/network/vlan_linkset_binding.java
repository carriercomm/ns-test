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

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vlan_linkset_binding_response extends base_response
{
	public vlan_linkset_binding[] vlan_linkset_binding;
}
/**
	* Binding class showing the linkset that can be bound to vlan.
	*/

public class vlan_linkset_binding extends base_resource
{
	private String ifnum;
	private Boolean tagged;
	private Long id;
	private Long __count;

	/**
	* <pre>
	* Specifies the virtual LAN ID.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_id(long id) throws Exception {
		this.id = new Long(id);
	}

	/**
	* <pre>
	* Specifies the virtual LAN ID.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public void set_id(Long id) throws Exception{
		this.id = id;
	}

	/**
	* <pre>
	* Specifies the virtual LAN ID.<br> Minimum value =  1<br> Maximum value =  4094
	* </pre>
	*/
	public Long get_id() throws Exception {
		return this.id;
	}

	/**
	* <pre>
	* The interface to be bound to the VLAN, specified in slot/port notation (for example, 1/3).<br> Minimum length =  1
	* </pre>
	*/
	public void set_ifnum(String ifnum) throws Exception{
		this.ifnum = ifnum;
	}

	/**
	* <pre>
	* The interface to be bound to the VLAN, specified in slot/port notation (for example, 1/3).<br> Minimum length =  1
	* </pre>
	*/
	public String get_ifnum() throws Exception {
		return this.ifnum;
	}

	/**
	* <pre>
	* Make the interface an 802.1q tagged interface. Packets sent on this interface on this VLAN have an additional 4-byte 802.1q tag, which identifies the VLAN. To use 802.1q tagging, you must also configure the switch connected to the appliance's interfaces.
	* </pre>
	*/
	public void set_tagged(boolean tagged) throws Exception {
		this.tagged = new Boolean(tagged);
	}

	/**
	* <pre>
	* Make the interface an 802.1q tagged interface. Packets sent on this interface on this VLAN have an additional 4-byte 802.1q tag, which identifies the VLAN. To use 802.1q tagging, you must also configure the switch connected to the appliance's interfaces.
	* </pre>
	*/
	public void set_tagged(Boolean tagged) throws Exception{
		this.tagged = tagged;
	}

	/**
	* <pre>
	* Make the interface an 802.1q tagged interface. Packets sent on this interface on this VLAN have an additional 4-byte 802.1q tag, which identifies the VLAN. To use 802.1q tagging, you must also configure the switch connected to the appliance's interfaces.
	* </pre>
	*/
	public Boolean get_tagged() throws Exception {
		return this.tagged;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vlan_linkset_binding_response result = (vlan_linkset_binding_response) service.get_payload_formatter().string_to_resource(vlan_linkset_binding_response.class, response);
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
		return result.vlan_linkset_binding;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		if(this.id != null) {
			return this.id.toString();
		}
		return null;
	}

	public static base_response add(nitro_service client, vlan_linkset_binding resource) throws Exception {
		vlan_linkset_binding updateresource = new vlan_linkset_binding();
		updateresource.id = resource.id;
		updateresource.ifnum = resource.ifnum;
		updateresource.tagged = resource.tagged;
		return updateresource.update_resource(client);
	}

	public static base_responses add(nitro_service client, vlan_linkset_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vlan_linkset_binding updateresources[] = new vlan_linkset_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vlan_linkset_binding();
				updateresources[i].id = resources[i].id;
				updateresources[i].ifnum = resources[i].ifnum;
				updateresources[i].tagged = resources[i].tagged;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	public static base_response delete(nitro_service client, vlan_linkset_binding resource) throws Exception {
		vlan_linkset_binding deleteresource = new vlan_linkset_binding();
		deleteresource.id = resource.id;
		deleteresource.ifnum = resource.ifnum;
		deleteresource.tagged = resource.tagged;
		return deleteresource.delete_resource(client);
	}

	public static base_responses delete(nitro_service client, vlan_linkset_binding resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vlan_linkset_binding deleteresources[] = new vlan_linkset_binding[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vlan_linkset_binding();
				deleteresources[i].id = resources[i].id;
				deleteresources[i].ifnum = resources[i].ifnum;
				deleteresources[i].tagged = resources[i].tagged;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch vlan_linkset_binding resources of given name .
	*/
	public static vlan_linkset_binding[] get(nitro_service service, Long id) throws Exception{
		vlan_linkset_binding obj = new vlan_linkset_binding();
		obj.set_id(id);
		vlan_linkset_binding response[] = (vlan_linkset_binding[]) obj.get_resources(service);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vlan_linkset_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vlan_linkset_binding[] get_filtered(nitro_service service, Long id, String filter) throws Exception{
		vlan_linkset_binding obj = new vlan_linkset_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		vlan_linkset_binding[] response = (vlan_linkset_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vlan_linkset_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vlan_linkset_binding[] get_filtered(nitro_service service, Long id, filtervalue[] filter) throws Exception{
		vlan_linkset_binding obj = new vlan_linkset_binding();
		obj.set_id(id);
		options option = new options();
		option.set_filter(filter);
		vlan_linkset_binding[] response = (vlan_linkset_binding[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count vlan_linkset_binding resources configued on NetScaler.
	*/
	public static long count(nitro_service service, Long id) throws Exception{
		vlan_linkset_binding obj = new vlan_linkset_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		vlan_linkset_binding response[] = (vlan_linkset_binding[]) obj.get_resources(service,option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vlan_linkset_binding resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, Long id, String filter) throws Exception{
		vlan_linkset_binding obj = new vlan_linkset_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vlan_linkset_binding[] response = (vlan_linkset_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vlan_linkset_binding resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, Long id, filtervalue[] filter) throws Exception{
		vlan_linkset_binding obj = new vlan_linkset_binding();
		obj.set_id(id);
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vlan_linkset_binding[] response = (vlan_linkset_binding[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}


}