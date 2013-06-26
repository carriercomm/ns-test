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

class iptunnelparam_response extends base_response
{
	public iptunnelparam iptunnelparam;
}
/**
* Configuration for ip tunnel parameter resource.
*/

public class iptunnelparam extends base_resource
{
	private String srcip;
	private String dropfrag;
	private Long dropfragcputhreshold;
	private String srciproundrobin;

	/**
	* <pre>
	* The common source IP address for all tunnels. For a specific tunnel, this global setting is overridden if you have specified another source IP address. Must be a MIP or SNIP address.<br> Minimum length =  1
	* </pre>
	*/
	public void set_srcip(String srcip) throws Exception{
		this.srcip = srcip;
	}

	/**
	* <pre>
	* The common source IP address for all tunnels. For a specific tunnel, this global setting is overridden if you have specified another source IP address. Must be a MIP or SNIP address.<br> Minimum length =  1
	* </pre>
	*/
	public String get_srcip() throws Exception {
		return this.srcip;
	}

	/**
	* <pre>
	* Drop any IP packet that requires fragmentation before it is sent through the tunnel.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_dropfrag(String dropfrag) throws Exception{
		this.dropfrag = dropfrag;
	}

	/**
	* <pre>
	* Drop any IP packet that requires fragmentation before it is sent through the tunnel.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_dropfrag() throws Exception {
		return this.dropfrag;
	}

	/**
	* <pre>
	* Threshold value, as a percentage of CPU usage, at which to drop packets that require fragmentation to use the IP tunnel. Applies only if dropFrag paramenter is set to NO. Minimum value: 1. Maximum value: 100. Default: 0 (not set).<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_dropfragcputhreshold(long dropfragcputhreshold) throws Exception {
		this.dropfragcputhreshold = new Long(dropfragcputhreshold);
	}

	/**
	* <pre>
	* Threshold value, as a percentage of CPU usage, at which to drop packets that require fragmentation to use the IP tunnel. Applies only if dropFrag paramenter is set to NO. Minimum value: 1. Maximum value: 100. Default: 0 (not set).<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_dropfragcputhreshold(Long dropfragcputhreshold) throws Exception{
		this.dropfragcputhreshold = dropfragcputhreshold;
	}

	/**
	* <pre>
	* Threshold value, as a percentage of CPU usage, at which to drop packets that require fragmentation to use the IP tunnel. Applies only if dropFrag paramenter is set to NO. Minimum value: 1. Maximum value: 100. Default: 0 (not set).<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_dropfragcputhreshold() throws Exception {
		return this.dropfragcputhreshold;
	}

	/**
	* <pre>
	* If the source IP is not configured, apply round-robin selection from the configured SNIPs.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_srciproundrobin(String srciproundrobin) throws Exception{
		this.srciproundrobin = srciproundrobin;
	}

	/**
	* <pre>
	* If the source IP is not configured, apply round-robin selection from the configured SNIPs.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_srciproundrobin() throws Exception {
		return this.srciproundrobin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		iptunnelparam[] resources = new iptunnelparam[1];
		iptunnelparam_response result = (iptunnelparam_response) service.get_payload_formatter().string_to_resource(iptunnelparam_response.class, response);
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
		resources[0] = result.iptunnelparam;
		return resources;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to update iptunnelparam.
	*/
	public static base_response update(nitro_service client, iptunnelparam resource) throws Exception {
		iptunnelparam updateresource = new iptunnelparam();
		updateresource.srcip = resource.srcip;
		updateresource.dropfrag = resource.dropfrag;
		updateresource.dropfragcputhreshold = resource.dropfragcputhreshold;
		updateresource.srciproundrobin = resource.srciproundrobin;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to unset the properties of iptunnelparam resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, iptunnelparam resource, String[] args) throws Exception{
		iptunnelparam unsetresource = new iptunnelparam();
		unsetresource.srcip = resource.srcip;
		unsetresource.dropfrag = resource.dropfrag;
		unsetresource.dropfragcputhreshold = resource.dropfragcputhreshold;
		unsetresource.srciproundrobin = resource.srciproundrobin;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to fetch all the iptunnelparam resources that are configured on netscaler.
	*/
	public static iptunnelparam get(nitro_service service) throws Exception{
		iptunnelparam obj = new iptunnelparam();
		iptunnelparam[] response = (iptunnelparam[])obj.get_resources(service);
		return response[0];
	}

	/**
	* Use this API to fetch all the iptunnelparam resources that are configured on netscaler.
	*/
	public static iptunnelparam get(nitro_service service,  options option) throws Exception{
		iptunnelparam obj = new iptunnelparam();
		iptunnelparam[] response = (iptunnelparam[])obj.get_resources(service,option);
		return response[0];
	}

	public static class dropfragEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class srciproundrobinEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
