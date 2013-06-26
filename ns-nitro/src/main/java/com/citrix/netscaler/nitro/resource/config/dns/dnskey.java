/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.dns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class dnskey_response extends base_response
{
	public dnskey[] dnskey;
}

public class dnskey extends base_resource
{
	private String keyname;
	private String publickey;
	private String privatekey;
	private Long expires;
	private String units1;
	private Long notificationperiod;
	private String units2;
	private Long ttl;
	private String zonename;
	private String keytype;
	private String algorithm;
	private Long keysize;
	private String filenameprefix;
	private Long __count;

	/**
	* <pre>
	* The name given to a public/private key pair.<br> Minimum length =  1
	* </pre>
	*/
	public void set_keyname(String keyname) throws Exception{
		this.keyname = keyname;
	}

	/**
	* <pre>
	* The name given to a public/private key pair.<br> Minimum length =  1
	* </pre>
	*/
	public String get_keyname() throws Exception {
		return this.keyname;
	}

	/**
	* <pre>
	* File name of the public key to be used for signing zone.
	* </pre>
	*/
	public void set_publickey(String publickey) throws Exception{
		this.publickey = publickey;
	}

	/**
	* <pre>
	* File name of the public key to be used for signing zone.
	* </pre>
	*/
	public String get_publickey() throws Exception {
		return this.publickey;
	}

	/**
	* <pre>
	* File name of the private key to be used for signing zone.
	* </pre>
	*/
	public void set_privatekey(String privatekey) throws Exception{
		this.privatekey = privatekey;
	}

	/**
	* <pre>
	* File name of the private key to be used for signing zone.
	* </pre>
	*/
	public String get_privatekey() throws Exception {
		return this.privatekey;
	}

	/**
	* <pre>
	* Number of days since signing with a key, when the key expires.<br> Default value: 120<br> Minimum value =  1<br> Maximum value =  32767
	* </pre>
	*/
	public void set_expires(long expires) throws Exception {
		this.expires = new Long(expires);
	}

	/**
	* <pre>
	* Number of days since signing with a key, when the key expires.<br> Default value: 120<br> Minimum value =  1<br> Maximum value =  32767
	* </pre>
	*/
	public void set_expires(Long expires) throws Exception{
		this.expires = expires;
	}

	/**
	* <pre>
	* Number of days since signing with a key, when the key expires.<br> Default value: 120<br> Minimum value =  1<br> Maximum value =  32767
	* </pre>
	*/
	public Long get_expires() throws Exception {
		return this.expires;
	}

	/**
	* <pre>
	* expiry time units.<br> Default value: NSDNS_KEY_EXPIRY_DAYS<br> Possible values = MINUTES, HOURS, DAYS
	* </pre>
	*/
	public void set_units1(String units1) throws Exception{
		this.units1 = units1;
	}

	/**
	* <pre>
	* expiry time units.<br> Default value: NSDNS_KEY_EXPIRY_DAYS<br> Possible values = MINUTES, HOURS, DAYS
	* </pre>
	*/
	public String get_units1() throws Exception {
		return this.units1;
	}

	/**
	* <pre>
	* Number of days before the expiry of a key, when an notification should be generated.<br> Default value: 7<br> Minimum value =  1<br> Maximum value =  32767
	* </pre>
	*/
	public void set_notificationperiod(long notificationperiod) throws Exception {
		this.notificationperiod = new Long(notificationperiod);
	}

	/**
	* <pre>
	* Number of days before the expiry of a key, when an notification should be generated.<br> Default value: 7<br> Minimum value =  1<br> Maximum value =  32767
	* </pre>
	*/
	public void set_notificationperiod(Long notificationperiod) throws Exception{
		this.notificationperiod = notificationperiod;
	}

	/**
	* <pre>
	* Number of days before the expiry of a key, when an notification should be generated.<br> Default value: 7<br> Minimum value =  1<br> Maximum value =  32767
	* </pre>
	*/
	public Long get_notificationperiod() throws Exception {
		return this.notificationperiod;
	}

	/**
	* <pre>
	* notify time units.<br> Default value: NSDNS_KEY_EXPIRY_DAYS<br> Possible values = MINUTES, HOURS, DAYS
	* </pre>
	*/
	public void set_units2(String units2) throws Exception{
		this.units2 = units2;
	}

	/**
	* <pre>
	* notify time units.<br> Default value: NSDNS_KEY_EXPIRY_DAYS<br> Possible values = MINUTES, HOURS, DAYS
	* </pre>
	*/
	public String get_units2() throws Exception {
		return this.units2;
	}

	/**
	* <pre>
	* Time to live, in seconds.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(long ttl) throws Exception {
		this.ttl = new Long(ttl);
	}

	/**
	* <pre>
	* Time to live, in seconds.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public void set_ttl(Long ttl) throws Exception{
		this.ttl = ttl;
	}

	/**
	* <pre>
	* Time to live, in seconds.<br> Default value: 3600<br> Minimum value =  0<br> Maximum value =  2147483647
	* </pre>
	*/
	public Long get_ttl() throws Exception {
		return this.ttl;
	}

	/**
	* <pre>
	* The name of the zone for which the key is being added.<br> Minimum length =  1
	* </pre>
	*/
	public void set_zonename(String zonename) throws Exception{
		this.zonename = zonename;
	}

	/**
	* <pre>
	* The name of the zone for which the key is being added.<br> Minimum length =  1
	* </pre>
	*/
	public String get_zonename() throws Exception {
		return this.zonename;
	}

	/**
	* <pre>
	* The type of key.<br> Default value: NS_DNSKEY_ZSK<br> Possible values = KSK, KeySigningKey, ZSK, ZoneSigningKey
	* </pre>
	*/
	public void set_keytype(String keytype) throws Exception{
		this.keytype = keytype;
	}

	/**
	* <pre>
	* The type of key.<br> Default value: NS_DNSKEY_ZSK<br> Possible values = KSK, KeySigningKey, ZSK, ZoneSigningKey
	* </pre>
	*/
	public String get_keytype() throws Exception {
		return this.keytype;
	}

	/**
	* <pre>
	* The type of algorithm to be generated.<br> Default value: NS_DNSKEYALGO_RSASHA1<br> Possible values = RSASHA1
	* </pre>
	*/
	public void set_algorithm(String algorithm) throws Exception{
		this.algorithm = algorithm;
	}

	/**
	* <pre>
	* The type of algorithm to be generated.<br> Default value: NS_DNSKEYALGO_RSASHA1<br> Possible values = RSASHA1
	* </pre>
	*/
	public String get_algorithm() throws Exception {
		return this.algorithm;
	}

	/**
	* <pre>
	* The size in bits of the key to be created.<br> Default value: 512
	* </pre>
	*/
	public void set_keysize(long keysize) throws Exception {
		this.keysize = new Long(keysize);
	}

	/**
	* <pre>
	* The size in bits of the key to be created.<br> Default value: 512
	* </pre>
	*/
	public void set_keysize(Long keysize) throws Exception{
		this.keysize = keysize;
	}

	/**
	* <pre>
	* The size in bits of the key to be created.<br> Default value: 512
	* </pre>
	*/
	public Long get_keysize() throws Exception {
		return this.keysize;
	}

	/**
	* <pre>
	* The string to be used as file name for the generated public, private and ds key files.
	* </pre>
	*/
	public void set_filenameprefix(String filenameprefix) throws Exception{
		this.filenameprefix = filenameprefix;
	}

	/**
	* <pre>
	* The string to be used as file name for the generated public, private and ds key files.
	* </pre>
	*/
	public String get_filenameprefix() throws Exception {
		return this.filenameprefix;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		dnskey_response result = (dnskey_response) service.get_payload_formatter().string_to_resource(dnskey_response.class, response);
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
		return result.dnskey;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.keyname;
	}

	/**
	* Use this API to add dnskey.
	*/
	public static base_response add(nitro_service client, dnskey resource) throws Exception {
		dnskey addresource = new dnskey();
		addresource.keyname = resource.keyname;
		addresource.publickey = resource.publickey;
		addresource.privatekey = resource.privatekey;
		addresource.expires = resource.expires;
		addresource.units1 = resource.units1;
		addresource.notificationperiod = resource.notificationperiod;
		addresource.units2 = resource.units2;
		addresource.ttl = resource.ttl;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add dnskey resources.
	*/
	public static base_responses add(nitro_service client, dnskey resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnskey addresources[] = new dnskey[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new dnskey();
				addresources[i].keyname = resources[i].keyname;
				addresources[i].publickey = resources[i].publickey;
				addresources[i].privatekey = resources[i].privatekey;
				addresources[i].expires = resources[i].expires;
				addresources[i].units1 = resources[i].units1;
				addresources[i].notificationperiod = resources[i].notificationperiod;
				addresources[i].units2 = resources[i].units2;
				addresources[i].ttl = resources[i].ttl;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to create dnskey.
	*/
	public static base_response create(nitro_service client, dnskey resource) throws Exception {
		dnskey createresource = new dnskey();
		createresource.zonename = resource.zonename;
		createresource.keytype = resource.keytype;
		createresource.algorithm = resource.algorithm;
		createresource.keysize = resource.keysize;
		createresource.filenameprefix = resource.filenameprefix;
		return createresource.perform_operation(client,"create");
	}

	/**
	* Use this API to create dnskey resources.
	*/
	public static base_responses create(nitro_service client, dnskey resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnskey createresources[] = new dnskey[resources.length];
			for (int i=0;i<resources.length;i++){
				createresources[i] = new dnskey();
				createresources[i].zonename = resources[i].zonename;
				createresources[i].keytype = resources[i].keytype;
				createresources[i].algorithm = resources[i].algorithm;
				createresources[i].keysize = resources[i].keysize;
				createresources[i].filenameprefix = resources[i].filenameprefix;
			}
			result = perform_operation_bulk_request(client, createresources,"create");
		}
		return result;
	}

	/**
	* Use this API to update dnskey.
	*/
	public static base_response update(nitro_service client, dnskey resource) throws Exception {
		dnskey updateresource = new dnskey();
		updateresource.keyname = resource.keyname;
		updateresource.expires = resource.expires;
		updateresource.units1 = resource.units1;
		updateresource.notificationperiod = resource.notificationperiod;
		updateresource.units2 = resource.units2;
		updateresource.ttl = resource.ttl;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update dnskey resources.
	*/
	public static base_responses update(nitro_service client, dnskey resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnskey updateresources[] = new dnskey[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new dnskey();
				updateresources[i].keyname = resources[i].keyname;
				updateresources[i].expires = resources[i].expires;
				updateresources[i].units1 = resources[i].units1;
				updateresources[i].notificationperiod = resources[i].notificationperiod;
				updateresources[i].units2 = resources[i].units2;
				updateresources[i].ttl = resources[i].ttl;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dnskey resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String keyname, String args[]) throws Exception {
		dnskey unsetresource = new dnskey();
		unsetresource.keyname = keyname;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of dnskey resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, dnskey resource, String[] args) throws Exception{
		dnskey unsetresource = new dnskey();
		unsetresource.keyname = resource.keyname;
		unsetresource.expires = resource.expires;
		unsetresource.units1 = resource.units1;
		unsetresource.notificationperiod = resource.notificationperiod;
		unsetresource.units2 = resource.units2;
		unsetresource.ttl = resource.ttl;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of dnskey resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String keyname[], String args[]) throws Exception {
		base_responses result = null;
		if (keyname != null && keyname.length > 0) {
			dnskey unsetresources[] = new dnskey[keyname.length];
			for (int i=0;i<keyname.length;i++){
				unsetresources[i] = new dnskey();
				unsetresources[i].keyname = keyname[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of dnskey resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, dnskey resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnskey unsetresources[] = new dnskey[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new dnskey();
				unsetresources[i].keyname = resources[i].keyname;
				unsetresources[i].expires = resources[i].expires;
				unsetresources[i].units1 = resources[i].units1;
				unsetresources[i].notificationperiod = resources[i].notificationperiod;
				unsetresources[i].units2 = resources[i].units2;
				unsetresources[i].ttl = resources[i].ttl;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to delete dnskey of given name.
	*/
	public static base_response delete(nitro_service client, String keyname) throws Exception {
		dnskey deleteresource = new dnskey();
		deleteresource.keyname = keyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnskey.
	*/
	public static base_response delete(nitro_service client, dnskey resource) throws Exception {
		dnskey deleteresource = new dnskey();
		deleteresource.keyname = resource.keyname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete dnskey resources of given names.
	*/
	public static base_responses delete(nitro_service client, String keyname[]) throws Exception {
		base_responses result = null;
		if (keyname != null && keyname.length > 0) {
			dnskey deleteresources[] = new dnskey[keyname.length];
			for (int i=0;i<keyname.length;i++){
				deleteresources[i] = new dnskey();
				deleteresources[i].keyname = keyname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete dnskey resources.
	*/
	public static base_responses delete(nitro_service client, dnskey resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			dnskey deleteresources[] = new dnskey[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new dnskey();
				deleteresources[i].keyname = resources[i].keyname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the dnskey resources that are configured on netscaler.
	*/
	public static dnskey[] get(nitro_service service) throws Exception{
		dnskey obj = new dnskey();
		dnskey[] response = (dnskey[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the dnskey resources that are configured on netscaler.
	*/
	public static dnskey[] get(nitro_service service, options option) throws Exception{
		dnskey obj = new dnskey();
		dnskey[] response = (dnskey[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch dnskey resource of given name .
	*/
	public static dnskey get(nitro_service service, String keyname) throws Exception{
		dnskey obj = new dnskey();
		obj.set_keyname(keyname);
		dnskey response = (dnskey) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch dnskey resources of given names .
	*/
	public static dnskey[] get(nitro_service service, String keyname[]) throws Exception{
		if (keyname !=null && keyname.length>0) {
			dnskey response[] = new dnskey[keyname.length];
			dnskey obj[] = new dnskey[keyname.length];
			for (int i=0;i<keyname.length;i++) {
				obj[i] = new dnskey();
				obj[i].set_keyname(keyname[i]);
				response[i] = (dnskey) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of dnskey resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static dnskey[] get_filtered(nitro_service service, String filter) throws Exception{
		dnskey obj = new dnskey();
		options option = new options();
		option.set_filter(filter);
		dnskey[] response = (dnskey[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of dnskey resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static dnskey[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnskey obj = new dnskey();
		options option = new options();
		option.set_filter(filter);
		dnskey[] response = (dnskey[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the dnskey resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		dnskey obj = new dnskey();
		options option = new options();
		option.set_count(true);
		dnskey[] response = (dnskey[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of dnskey resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		dnskey obj = new dnskey();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnskey[] response = (dnskey[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of dnskey resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		dnskey obj = new dnskey();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		dnskey[] response = (dnskey[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class algorithmEnum {
		public static final String RSASHA1 = "RSASHA1";
	}
	public static class units1Enum {
		public static final String MINUTES = "MINUTES";
		public static final String HOURS = "HOURS";
		public static final String DAYS = "DAYS";
	}
	public static class keytypeEnum {
		public static final String KSK = "KSK";
		public static final String KeySigningKey = "KeySigningKey";
		public static final String ZSK = "ZSK";
		public static final String ZoneSigningKey = "ZoneSigningKey";
	}
	public static class units2Enum {
		public static final String MINUTES = "MINUTES";
		public static final String HOURS = "HOURS";
		public static final String DAYS = "DAYS";
	}
}
