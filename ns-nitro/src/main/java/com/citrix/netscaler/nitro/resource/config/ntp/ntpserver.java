/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.ntp;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class ntpserver_response extends base_response
{
	public ntpserver[] ntpserver;
}
/**
* Configuration for NTP server resource.
*/

public class ntpserver extends base_resource
{
	private String serverip;
	private String servername;
	private Long minpoll;
	private Long maxpoll;
	private Boolean autokey;
	private Long key;
	private String preferredntpserver;
	private Long __count;

	/**
	* <pre>
	* IP address of the NTP server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_serverip(String serverip) throws Exception{
		this.serverip = serverip;
	}

	/**
	* <pre>
	* IP address of the NTP server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_serverip() throws Exception {
		return this.serverip;
	}

	/**
	* <pre>
	* Fully qualified domain name of the NTP server.
	* </pre>
	*/
	public void set_servername(String servername) throws Exception{
		this.servername = servername;
	}

	/**
	* <pre>
	* Fully qualified domain name of the NTP server.
	* </pre>
	*/
	public String get_servername() throws Exception {
		return this.servername;
	}

	/**
	* <pre>
	* Specifies the minimum poll intervals for NTP messages, in seconds to the
					 	  power of two. Value defaults to 6 (64 s), but can be decreased to a lower
						  limit of 4 (16 s).<br> Minimum value =  4<br> Maximum value =  17
	* </pre>
	*/
	public void set_minpoll(long minpoll) throws Exception {
		this.minpoll = new Long(minpoll);
	}

	/**
	* <pre>
	* Specifies the minimum poll intervals for NTP messages, in seconds to the
					 	  power of two. Value defaults to 6 (64 s), but can be decreased to a lower
						  limit of 4 (16 s).<br> Minimum value =  4<br> Maximum value =  17
	* </pre>
	*/
	public void set_minpoll(Long minpoll) throws Exception{
		this.minpoll = minpoll;
	}

	/**
	* <pre>
	* Specifies the minimum poll intervals for NTP messages, in seconds to the
					 	  power of two. Value defaults to 6 (64 s), but can be decreased to a lower
						  limit of 4 (16 s).<br> Minimum value =  4<br> Maximum value =  17
	* </pre>
	*/
	public Long get_minpoll() throws Exception {
		return this.minpoll;
	}

	/**
	* <pre>
	* Specifies the maximum poll intervals for NTP messages, in seconds to the
					 	  power of two. Value defaults to 10 (1,024 s), but can be increased to an
						  upper limit of 17 (36.4 h).<br> Minimum value =  4<br> Maximum value =  17
	* </pre>
	*/
	public void set_maxpoll(long maxpoll) throws Exception {
		this.maxpoll = new Long(maxpoll);
	}

	/**
	* <pre>
	* Specifies the maximum poll intervals for NTP messages, in seconds to the
					 	  power of two. Value defaults to 10 (1,024 s), but can be increased to an
						  upper limit of 17 (36.4 h).<br> Minimum value =  4<br> Maximum value =  17
	* </pre>
	*/
	public void set_maxpoll(Long maxpoll) throws Exception{
		this.maxpoll = maxpoll;
	}

	/**
	* <pre>
	* Specifies the maximum poll intervals for NTP messages, in seconds to the
					 	  power of two. Value defaults to 10 (1,024 s), but can be increased to an
						  upper limit of 17 (36.4 h).<br> Minimum value =  4<br> Maximum value =  17
	* </pre>
	*/
	public Long get_maxpoll() throws Exception {
		return this.maxpoll;
	}

	/**
	* <pre>
	* Specifies if autokey is to be used for the specified server.
	* </pre>
	*/
	public void set_autokey(boolean autokey) throws Exception {
		this.autokey = new Boolean(autokey);
	}

	/**
	* <pre>
	* Specifies if autokey is to be used for the specified server.
	* </pre>
	*/
	public void set_autokey(Boolean autokey) throws Exception{
		this.autokey = autokey;
	}

	/**
	* <pre>
	* Specifies if autokey is to be used for the specified server.
	* </pre>
	*/
	public Boolean get_autokey() throws Exception {
		return this.autokey;
	}

	/**
	* <pre>
	* Specifies the key to be used for the specified server.<br> Minimum value =  1<br> Maximum value =  65534
	* </pre>
	*/
	public void set_key(long key) throws Exception {
		this.key = new Long(key);
	}

	/**
	* <pre>
	* Specifies the key to be used for the specified server.<br> Minimum value =  1<br> Maximum value =  65534
	* </pre>
	*/
	public void set_key(Long key) throws Exception{
		this.key = key;
	}

	/**
	* <pre>
	* Specifies the key to be used for the specified server.<br> Minimum value =  1<br> Maximum value =  65534
	* </pre>
	*/
	public Long get_key() throws Exception {
		return this.key;
	}

	/**
	* <pre>
	* Specifies if the server is preferred one.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_preferredntpserver(String preferredntpserver) throws Exception{
		this.preferredntpserver = preferredntpserver;
	}

	/**
	* <pre>
	* Specifies if the server is preferred one.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_preferredntpserver() throws Exception {
		return this.preferredntpserver;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		ntpserver_response result = (ntpserver_response) service.get_payload_formatter().string_to_resource(ntpserver_response.class, response);
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
		return result.ntpserver;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.serverip;
	}

	/**
	* Use this API to add ntpserver.
	*/
	public static base_response add(nitro_service client, ntpserver resource) throws Exception {
		ntpserver addresource = new ntpserver();
		addresource.serverip = resource.serverip;
		addresource.servername = resource.servername;
		addresource.minpoll = resource.minpoll;
		addresource.maxpoll = resource.maxpoll;
		addresource.autokey = resource.autokey;
		addresource.key = resource.key;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add ntpserver resources.
	*/
	public static base_responses add(nitro_service client, ntpserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			ntpserver addresources[] = new ntpserver[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new ntpserver();
				addresources[i].serverip = resources[i].serverip;
				addresources[i].servername = resources[i].servername;
				addresources[i].minpoll = resources[i].minpoll;
				addresources[i].maxpoll = resources[i].maxpoll;
				addresources[i].autokey = resources[i].autokey;
				addresources[i].key = resources[i].key;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete ntpserver of given name.
	*/
	public static base_response delete(nitro_service client, String serverip) throws Exception {
		ntpserver deleteresource = new ntpserver();
		deleteresource.serverip = serverip;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete ntpserver.
	*/
	public static base_response delete(nitro_service client, ntpserver resource) throws Exception {
		ntpserver deleteresource = new ntpserver();
		deleteresource.serverip = resource.serverip;
		deleteresource.servername = resource.servername;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete ntpserver resources of given names.
	*/
	public static base_responses delete(nitro_service client, String serverip[]) throws Exception {
		base_responses result = null;
		if (serverip != null && serverip.length > 0) {
			ntpserver deleteresources[] = new ntpserver[serverip.length];
			for (int i=0;i<serverip.length;i++){
				deleteresources[i] = new ntpserver();
				deleteresources[i].serverip = serverip[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete ntpserver resources.
	*/
	public static base_responses delete(nitro_service client, ntpserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			ntpserver deleteresources[] = new ntpserver[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new ntpserver();
				deleteresources[i].serverip = resources[i].serverip;
				deleteresources[i].servername = resources[i].servername;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update ntpserver.
	*/
	public static base_response update(nitro_service client, ntpserver resource) throws Exception {
		ntpserver updateresource = new ntpserver();
		updateresource.serverip = resource.serverip;
		updateresource.servername = resource.servername;
		updateresource.minpoll = resource.minpoll;
		updateresource.maxpoll = resource.maxpoll;
		updateresource.preferredntpserver = resource.preferredntpserver;
		updateresource.autokey = resource.autokey;
		updateresource.key = resource.key;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update ntpserver resources.
	*/
	public static base_responses update(nitro_service client, ntpserver resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			ntpserver updateresources[] = new ntpserver[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new ntpserver();
				updateresources[i].serverip = resources[i].serverip;
				updateresources[i].servername = resources[i].servername;
				updateresources[i].minpoll = resources[i].minpoll;
				updateresources[i].maxpoll = resources[i].maxpoll;
				updateresources[i].preferredntpserver = resources[i].preferredntpserver;
				updateresources[i].autokey = resources[i].autokey;
				updateresources[i].key = resources[i].key;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of ntpserver resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String serverip, String args[]) throws Exception {
		ntpserver unsetresource = new ntpserver();
		unsetresource.serverip = serverip;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of ntpserver resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, ntpserver resource, String[] args) throws Exception{
		ntpserver unsetresource = new ntpserver();
		unsetresource.serverip = resource.serverip;
		unsetresource.servername = resource.servername;
		unsetresource.minpoll = resource.minpoll;
		unsetresource.maxpoll = resource.maxpoll;
		unsetresource.preferredntpserver = resource.preferredntpserver;
		unsetresource.autokey = resource.autokey;
		unsetresource.key = resource.key;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of ntpserver resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String serverip[], String args[]) throws Exception {
		base_responses result = null;
		if (serverip != null && serverip.length > 0) {
			ntpserver unsetresources[] = new ntpserver[serverip.length];
			for (int i=0;i<serverip.length;i++){
				unsetresources[i] = new ntpserver();
				unsetresources[i].serverip = serverip[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of ntpserver resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, ntpserver resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			ntpserver unsetresources[] = new ntpserver[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new ntpserver();
				unsetresources[i].serverip = resources[i].serverip;
				unsetresources[i].servername = resources[i].servername;
				unsetresources[i].minpoll = resources[i].minpoll;
				unsetresources[i].maxpoll = resources[i].maxpoll;
				unsetresources[i].preferredntpserver = resources[i].preferredntpserver;
				unsetresources[i].autokey = resources[i].autokey;
				unsetresources[i].key = resources[i].key;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the ntpserver resources that are configured on netscaler.
	*/
	public static ntpserver[] get(nitro_service service) throws Exception{
		ntpserver obj = new ntpserver();
		ntpserver[] response = (ntpserver[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the ntpserver resources that are configured on netscaler.
	*/
	public static ntpserver[] get(nitro_service service, options option) throws Exception{
		ntpserver obj = new ntpserver();
		ntpserver[] response = (ntpserver[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch a ntpserver resource.
	*/
	public static ntpserver get(nitro_service service, ntpserver obj) throws Exception{
		options option = new options();
		option.set_args(nitro_util.object_to_string_withoutquotes(obj));
		ntpserver response = (ntpserver) obj.get_resource(service,option);
		return response;
	}

	/**
	* Use this API to fetch a ntpserver resources.
	*/
	public static ntpserver[] get(nitro_service service, ntpserver obj[]) throws Exception{
		if (obj != null && obj.length > 0) {
			ntpserver response[] = new ntpserver[obj.length];
			for (int i=0;i<obj.length;i++) {
				options option = new options();
				option.set_args(nitro_util.object_to_string_withoutquotes(obj[i]));
				response[i] = (ntpserver) obj[i].get_resource(service,option);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of ntpserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static ntpserver[] get_filtered(nitro_service service, String filter) throws Exception{
		ntpserver obj = new ntpserver();
		options option = new options();
		option.set_filter(filter);
		ntpserver[] response = (ntpserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of ntpserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static ntpserver[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		ntpserver obj = new ntpserver();
		options option = new options();
		option.set_filter(filter);
		ntpserver[] response = (ntpserver[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the ntpserver resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		ntpserver obj = new ntpserver();
		options option = new options();
		option.set_count(true);
		ntpserver[] response = (ntpserver[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of ntpserver resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		ntpserver obj = new ntpserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ntpserver[] response = (ntpserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of ntpserver resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		ntpserver obj = new ntpserver();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		ntpserver[] response = (ntpserver[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class preferredntpserverEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
}
