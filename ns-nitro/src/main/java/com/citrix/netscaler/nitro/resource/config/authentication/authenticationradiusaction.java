/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.authentication;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class authenticationradiusaction_response extends base_response
{
	public authenticationradiusaction[] authenticationradiusaction;
}
/**
* Configuration for RADIUS action resource.
*/

public class authenticationradiusaction extends base_resource
{
	private String name;
	private String serverip;
	private Integer serverport;
	private Long authtimeout;
	private String radkey;
	private String radnasip;
	private String radnasid;
	private Long radvendorid;
	private Long radattributetype;
	private String radgroupsprefix;
	private String radgroupseparator;
	private String passencoding;
	private Long ipvendorid;
	private Long ipattributetype;
	private String accounting;
	private Long pwdvendorid;
	private Long pwdattributetype;

	//------- Read only Parameter ---------;

	private String ipaddress;
	private Long success;
	private Long failure;
	private Long __count;

	/**
	* <pre>
	* The name of the RADIUS action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the RADIUS action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* The IP address of the RADIUS server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_serverip(String serverip) throws Exception{
		this.serverip = serverip;
	}

	/**
	* <pre>
	* The IP address of the RADIUS server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_serverip() throws Exception {
		return this.serverip;
	}

	/**
	* <pre>
	* The port on which the RADIUS Server is running.<br> Default value: 1812<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(int serverport) throws Exception {
		this.serverport = new Integer(serverport);
	}

	/**
	* <pre>
	* The port on which the RADIUS Server is running.<br> Default value: 1812<br> Minimum value =  1
	* </pre>
	*/
	public void set_serverport(Integer serverport) throws Exception{
		this.serverport = serverport;
	}

	/**
	* <pre>
	* The port on which the RADIUS Server is running.<br> Default value: 1812<br> Minimum value =  1
	* </pre>
	*/
	public Integer get_serverport() throws Exception {
		return this.serverport;
	}

	/**
	* <pre>
	* The maximum number of seconds the system will wait for a response from the RADIUS server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public void set_authtimeout(long authtimeout) throws Exception {
		this.authtimeout = new Long(authtimeout);
	}

	/**
	* <pre>
	* The maximum number of seconds the system will wait for a response from the RADIUS server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public void set_authtimeout(Long authtimeout) throws Exception{
		this.authtimeout = authtimeout;
	}

	/**
	* <pre>
	* The maximum number of seconds the system will wait for a response from the RADIUS server.<br> Default value: 3<br> Minimum value =  1
	* </pre>
	*/
	public Long get_authtimeout() throws Exception {
		return this.authtimeout;
	}

	/**
	* <pre>
	* The key shared between the client and the server. This information is required for the system to communicate with the RADIUS server.<br> Minimum length =  1
	* </pre>
	*/
	public void set_radkey(String radkey) throws Exception{
		this.radkey = radkey;
	}

	/**
	* <pre>
	* The key shared between the client and the server. This information is required for the system to communicate with the RADIUS server.<br> Minimum length =  1
	* </pre>
	*/
	public String get_radkey() throws Exception {
		return this.radkey;
	}

	/**
	* <pre>
	* If enabled, the system's IP address (NSIP) is sent to the server as the "nasip" (Network Access Server IP) in accordance with the RADIUS protocol.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_radnasip(String radnasip) throws Exception{
		this.radnasip = radnasip;
	}

	/**
	* <pre>
	* If enabled, the system's IP address (NSIP) is sent to the server as the "nasip" (Network Access Server IP) in accordance with the RADIUS protocol.<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_radnasip() throws Exception {
		return this.radnasip;
	}

	/**
	* <pre>
	* If configured, this string is sent to the RADIUS server as the "nasid" (Network Access Server ID) in accordance with the RADIUS protocol.
	* </pre>
	*/
	public void set_radnasid(String radnasid) throws Exception{
		this.radnasid = radnasid;
	}

	/**
	* <pre>
	* If configured, this string is sent to the RADIUS server as the "nasid" (Network Access Server ID) in accordance with the RADIUS protocol.
	* </pre>
	*/
	public String get_radnasid() throws Exception {
		return this.radnasid;
	}

	/**
	* <pre>
	* The vendor ID for using RADIUS group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public void set_radvendorid(long radvendorid) throws Exception {
		this.radvendorid = new Long(radvendorid);
	}

	/**
	* <pre>
	* The vendor ID for using RADIUS group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public void set_radvendorid(Long radvendorid) throws Exception{
		this.radvendorid = radvendorid;
	}

	/**
	* <pre>
	* The vendor ID for using RADIUS group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_radvendorid() throws Exception {
		return this.radvendorid;
	}

	/**
	* <pre>
	* The Attribute type for using RADIUS group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public void set_radattributetype(long radattributetype) throws Exception {
		this.radattributetype = new Long(radattributetype);
	}

	/**
	* <pre>
	* The Attribute type for using RADIUS group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public void set_radattributetype(Long radattributetype) throws Exception{
		this.radattributetype = radattributetype;
	}

	/**
	* <pre>
	* The Attribute type for using RADIUS group extraction.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_radattributetype() throws Exception {
		return this.radattributetype;
	}

	/**
	* <pre>
	* The groups prefix string that precedes the group names within a RADIUS attribute for RADIUS group extraction.
	* </pre>
	*/
	public void set_radgroupsprefix(String radgroupsprefix) throws Exception{
		this.radgroupsprefix = radgroupsprefix;
	}

	/**
	* <pre>
	* The groups prefix string that precedes the group names within a RADIUS attribute for RADIUS group extraction.
	* </pre>
	*/
	public String get_radgroupsprefix() throws Exception {
		return this.radgroupsprefix;
	}

	/**
	* <pre>
	* The group separator string that delimits group names within a RADIUS attribute for RADIUS group extraction.
	* </pre>
	*/
	public void set_radgroupseparator(String radgroupseparator) throws Exception{
		this.radgroupseparator = radgroupseparator;
	}

	/**
	* <pre>
	* The group separator string that delimits group names within a RADIUS attribute for RADIUS group extraction.
	* </pre>
	*/
	public String get_radgroupseparator() throws Exception {
		return this.radgroupseparator;
	}

	/**
	* <pre>
	* This option specifies how passwords should be encoded in the radius packets traveling from the system to the RADIUS server.<br> Default value: pap<br> Possible values = pap, chap, mschapv1, mschapv2
	* </pre>
	*/
	public void set_passencoding(String passencoding) throws Exception{
		this.passencoding = passencoding;
	}

	/**
	* <pre>
	* This option specifies how passwords should be encoded in the radius packets traveling from the system to the RADIUS server.<br> Default value: pap<br> Possible values = pap, chap, mschapv1, mschapv2
	* </pre>
	*/
	public String get_passencoding() throws Exception {
		return this.passencoding;
	}

	/**
	* <pre>
	* The vendor ID of the attribute in the RADIUS response which denotes the intranet IP.  The value of 0 denotes that the attribute is not vendor encoded.
	* </pre>
	*/
	public void set_ipvendorid(long ipvendorid) throws Exception {
		this.ipvendorid = new Long(ipvendorid);
	}

	/**
	* <pre>
	* The vendor ID of the attribute in the RADIUS response which denotes the intranet IP.  The value of 0 denotes that the attribute is not vendor encoded.
	* </pre>
	*/
	public void set_ipvendorid(Long ipvendorid) throws Exception{
		this.ipvendorid = ipvendorid;
	}

	/**
	* <pre>
	* The vendor ID of the attribute in the RADIUS response which denotes the intranet IP.  The value of 0 denotes that the attribute is not vendor encoded.
	* </pre>
	*/
	public Long get_ipvendorid() throws Exception {
		return this.ipvendorid;
	}

	/**
	* <pre>
	* The attribute type of the remote IP address attribute in a RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public void set_ipattributetype(long ipattributetype) throws Exception {
		this.ipattributetype = new Long(ipattributetype);
	}

	/**
	* <pre>
	* The attribute type of the remote IP address attribute in a RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public void set_ipattributetype(Long ipattributetype) throws Exception{
		this.ipattributetype = ipattributetype;
	}

	/**
	* <pre>
	* The attribute type of the remote IP address attribute in a RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_ipattributetype() throws Exception {
		return this.ipattributetype;
	}

	/**
	* <pre>
	* The state of the RADIUS server that will receive accounting messages.<br> Possible values = ON, OFF
	* </pre>
	*/
	public void set_accounting(String accounting) throws Exception{
		this.accounting = accounting;
	}

	/**
	* <pre>
	* The state of the RADIUS server that will receive accounting messages.<br> Possible values = ON, OFF
	* </pre>
	*/
	public String get_accounting() throws Exception {
		return this.accounting;
	}

	/**
	* <pre>
	* Vendor ID of the attribute in the RADIUS response which will be used to extract the user Password.<br> Minimum value =  1
	* </pre>
	*/
	public void set_pwdvendorid(long pwdvendorid) throws Exception {
		this.pwdvendorid = new Long(pwdvendorid);
	}

	/**
	* <pre>
	* Vendor ID of the attribute in the RADIUS response which will be used to extract the user Password.<br> Minimum value =  1
	* </pre>
	*/
	public void set_pwdvendorid(Long pwdvendorid) throws Exception{
		this.pwdvendorid = pwdvendorid;
	}

	/**
	* <pre>
	* Vendor ID of the attribute in the RADIUS response which will be used to extract the user Password.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_pwdvendorid() throws Exception {
		return this.pwdvendorid;
	}

	/**
	* <pre>
	* Attribute type of the vendor specific Password-Attribute in a RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public void set_pwdattributetype(long pwdattributetype) throws Exception {
		this.pwdattributetype = new Long(pwdattributetype);
	}

	/**
	* <pre>
	* Attribute type of the vendor specific Password-Attribute in a RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public void set_pwdattributetype(Long pwdattributetype) throws Exception{
		this.pwdattributetype = pwdattributetype;
	}

	/**
	* <pre>
	* Attribute type of the vendor specific Password-Attribute in a RADIUS response.<br> Minimum value =  1
	* </pre>
	*/
	public Long get_pwdattributetype() throws Exception {
		return this.pwdattributetype;
	}

	/**
	* <pre>
	* IP address.
	* </pre>
	*/
	public String get_ipaddress() throws Exception {
		return this.ipaddress;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_success() throws Exception {
		return this.success;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_failure() throws Exception {
		return this.failure;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		authenticationradiusaction_response result = (authenticationradiusaction_response) service.get_payload_formatter().string_to_resource(authenticationradiusaction_response.class, response);
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
		return result.authenticationradiusaction;
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
	* Use this API to add authenticationradiusaction.
	*/
	public static base_response add(nitro_service client, authenticationradiusaction resource) throws Exception {
		authenticationradiusaction addresource = new authenticationradiusaction();
		addresource.name = resource.name;
		addresource.serverip = resource.serverip;
		addresource.serverport = resource.serverport;
		addresource.authtimeout = resource.authtimeout;
		addresource.radkey = resource.radkey;
		addresource.radnasip = resource.radnasip;
		addresource.radnasid = resource.radnasid;
		addresource.radvendorid = resource.radvendorid;
		addresource.radattributetype = resource.radattributetype;
		addresource.radgroupsprefix = resource.radgroupsprefix;
		addresource.radgroupseparator = resource.radgroupseparator;
		addresource.passencoding = resource.passencoding;
		addresource.ipvendorid = resource.ipvendorid;
		addresource.ipattributetype = resource.ipattributetype;
		addresource.accounting = resource.accounting;
		addresource.pwdvendorid = resource.pwdvendorid;
		addresource.pwdattributetype = resource.pwdattributetype;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add authenticationradiusaction resources.
	*/
	public static base_responses add(nitro_service client, authenticationradiusaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationradiusaction addresources[] = new authenticationradiusaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new authenticationradiusaction();
				addresources[i].name = resources[i].name;
				addresources[i].serverip = resources[i].serverip;
				addresources[i].serverport = resources[i].serverport;
				addresources[i].authtimeout = resources[i].authtimeout;
				addresources[i].radkey = resources[i].radkey;
				addresources[i].radnasip = resources[i].radnasip;
				addresources[i].radnasid = resources[i].radnasid;
				addresources[i].radvendorid = resources[i].radvendorid;
				addresources[i].radattributetype = resources[i].radattributetype;
				addresources[i].radgroupsprefix = resources[i].radgroupsprefix;
				addresources[i].radgroupseparator = resources[i].radgroupseparator;
				addresources[i].passencoding = resources[i].passencoding;
				addresources[i].ipvendorid = resources[i].ipvendorid;
				addresources[i].ipattributetype = resources[i].ipattributetype;
				addresources[i].accounting = resources[i].accounting;
				addresources[i].pwdvendorid = resources[i].pwdvendorid;
				addresources[i].pwdattributetype = resources[i].pwdattributetype;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationradiusaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		authenticationradiusaction deleteresource = new authenticationradiusaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationradiusaction.
	*/
	public static base_response delete(nitro_service client, authenticationradiusaction resource) throws Exception {
		authenticationradiusaction deleteresource = new authenticationradiusaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete authenticationradiusaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationradiusaction deleteresources[] = new authenticationradiusaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new authenticationradiusaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete authenticationradiusaction resources.
	*/
	public static base_responses delete(nitro_service client, authenticationradiusaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationradiusaction deleteresources[] = new authenticationradiusaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new authenticationradiusaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update authenticationradiusaction.
	*/
	public static base_response update(nitro_service client, authenticationradiusaction resource) throws Exception {
		authenticationradiusaction updateresource = new authenticationradiusaction();
		updateresource.name = resource.name;
		updateresource.serverip = resource.serverip;
		updateresource.serverport = resource.serverport;
		updateresource.authtimeout = resource.authtimeout;
		updateresource.radkey = resource.radkey;
		updateresource.radnasip = resource.radnasip;
		updateresource.radnasid = resource.radnasid;
		updateresource.radvendorid = resource.radvendorid;
		updateresource.radattributetype = resource.radattributetype;
		updateresource.radgroupsprefix = resource.radgroupsprefix;
		updateresource.radgroupseparator = resource.radgroupseparator;
		updateresource.passencoding = resource.passencoding;
		updateresource.ipvendorid = resource.ipvendorid;
		updateresource.ipattributetype = resource.ipattributetype;
		updateresource.accounting = resource.accounting;
		updateresource.pwdvendorid = resource.pwdvendorid;
		updateresource.pwdattributetype = resource.pwdattributetype;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update authenticationradiusaction resources.
	*/
	public static base_responses update(nitro_service client, authenticationradiusaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationradiusaction updateresources[] = new authenticationradiusaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new authenticationradiusaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].serverip = resources[i].serverip;
				updateresources[i].serverport = resources[i].serverport;
				updateresources[i].authtimeout = resources[i].authtimeout;
				updateresources[i].radkey = resources[i].radkey;
				updateresources[i].radnasip = resources[i].radnasip;
				updateresources[i].radnasid = resources[i].radnasid;
				updateresources[i].radvendorid = resources[i].radvendorid;
				updateresources[i].radattributetype = resources[i].radattributetype;
				updateresources[i].radgroupsprefix = resources[i].radgroupsprefix;
				updateresources[i].radgroupseparator = resources[i].radgroupseparator;
				updateresources[i].passencoding = resources[i].passencoding;
				updateresources[i].ipvendorid = resources[i].ipvendorid;
				updateresources[i].ipattributetype = resources[i].ipattributetype;
				updateresources[i].accounting = resources[i].accounting;
				updateresources[i].pwdvendorid = resources[i].pwdvendorid;
				updateresources[i].pwdattributetype = resources[i].pwdattributetype;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationradiusaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, String name, String args[]) throws Exception {
		authenticationradiusaction unsetresource = new authenticationradiusaction();
		unsetresource.name = name;
		return unsetresource.unset_resource(client, args);
	}

	/**
	* Use this API to unset the properties of authenticationradiusaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, authenticationradiusaction resource, String[] args) throws Exception{
		authenticationradiusaction unsetresource = new authenticationradiusaction();
		unsetresource.name = resource.name;
		unsetresource.serverip = resource.serverip;
		unsetresource.serverport = resource.serverport;
		unsetresource.authtimeout = resource.authtimeout;
		unsetresource.radnasip = resource.radnasip;
		unsetresource.radnasid = resource.radnasid;
		unsetresource.radvendorid = resource.radvendorid;
		unsetresource.radattributetype = resource.radattributetype;
		unsetresource.radgroupsprefix = resource.radgroupsprefix;
		unsetresource.radgroupseparator = resource.radgroupseparator;
		unsetresource.passencoding = resource.passencoding;
		unsetresource.ipvendorid = resource.ipvendorid;
		unsetresource.ipattributetype = resource.ipattributetype;
		unsetresource.accounting = resource.accounting;
		unsetresource.pwdvendorid = resource.pwdvendorid;
		unsetresource.pwdattributetype = resource.pwdattributetype;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of authenticationradiusaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			authenticationradiusaction unsetresources[] = new authenticationradiusaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new authenticationradiusaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of authenticationradiusaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, authenticationradiusaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			authenticationradiusaction unsetresources[] = new authenticationradiusaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new authenticationradiusaction();
				unsetresources[i].name = resources[i].name;
				unsetresources[i].serverip = resources[i].serverip;
				unsetresources[i].serverport = resources[i].serverport;
				unsetresources[i].authtimeout = resources[i].authtimeout;
				unsetresources[i].radnasip = resources[i].radnasip;
				unsetresources[i].radnasid = resources[i].radnasid;
				unsetresources[i].radvendorid = resources[i].radvendorid;
				unsetresources[i].radattributetype = resources[i].radattributetype;
				unsetresources[i].radgroupsprefix = resources[i].radgroupsprefix;
				unsetresources[i].radgroupseparator = resources[i].radgroupseparator;
				unsetresources[i].passencoding = resources[i].passencoding;
				unsetresources[i].ipvendorid = resources[i].ipvendorid;
				unsetresources[i].ipattributetype = resources[i].ipattributetype;
				unsetresources[i].accounting = resources[i].accounting;
				unsetresources[i].pwdvendorid = resources[i].pwdvendorid;
				unsetresources[i].pwdattributetype = resources[i].pwdattributetype;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the authenticationradiusaction resources that are configured on netscaler.
	*/
	public static authenticationradiusaction[] get(nitro_service service) throws Exception{
		authenticationradiusaction obj = new authenticationradiusaction();
		authenticationradiusaction[] response = (authenticationradiusaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the authenticationradiusaction resources that are configured on netscaler.
	*/
	public static authenticationradiusaction[] get(nitro_service service, options option) throws Exception{
		authenticationradiusaction obj = new authenticationradiusaction();
		authenticationradiusaction[] response = (authenticationradiusaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch authenticationradiusaction resource of given name .
	*/
	public static authenticationradiusaction get(nitro_service service, String name) throws Exception{
		authenticationradiusaction obj = new authenticationradiusaction();
		obj.set_name(name);
		authenticationradiusaction response = (authenticationradiusaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch authenticationradiusaction resources of given names .
	*/
	public static authenticationradiusaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			authenticationradiusaction response[] = new authenticationradiusaction[name.length];
			authenticationradiusaction obj[] = new authenticationradiusaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new authenticationradiusaction();
				obj[i].set_name(name[i]);
				response[i] = (authenticationradiusaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of authenticationradiusaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static authenticationradiusaction[] get_filtered(nitro_service service, String filter) throws Exception{
		authenticationradiusaction obj = new authenticationradiusaction();
		options option = new options();
		option.set_filter(filter);
		authenticationradiusaction[] response = (authenticationradiusaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of authenticationradiusaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static authenticationradiusaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationradiusaction obj = new authenticationradiusaction();
		options option = new options();
		option.set_filter(filter);
		authenticationradiusaction[] response = (authenticationradiusaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the authenticationradiusaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		authenticationradiusaction obj = new authenticationradiusaction();
		options option = new options();
		option.set_count(true);
		authenticationradiusaction[] response = (authenticationradiusaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of authenticationradiusaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		authenticationradiusaction obj = new authenticationradiusaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationradiusaction[] response = (authenticationradiusaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of authenticationradiusaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		authenticationradiusaction obj = new authenticationradiusaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		authenticationradiusaction[] response = (authenticationradiusaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class passencodingEnum {
		public static final String pap = "pap";
		public static final String chap = "chap";
		public static final String mschapv1 = "mschapv1";
		public static final String mschapv2 = "mschapv2";
	}
	public static class accountingEnum {
		public static final String ON = "ON";
		public static final String OFF = "OFF";
	}
	public static class radnasipEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}