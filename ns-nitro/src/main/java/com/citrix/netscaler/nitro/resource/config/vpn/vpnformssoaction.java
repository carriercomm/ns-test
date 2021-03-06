/*
* Copyright (c) 2008-2015 Citrix Systems, Inc.
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*       http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/

package com.citrix.netscaler.nitro.resource.config.vpn;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class vpnformssoaction_response extends base_response
{
	public vpnformssoaction[] vpnformssoaction;
}
/**
* Configuration for Form sso action resource.
*/

public class vpnformssoaction extends base_resource
{
	private String name;
	private String actionurl;
	private String userfield;
	private String passwdfield;
	private String ssosuccessrule;
	private String namevaluepair;
	private Long responsesize;
	private String nvtype;
	private String submitmethod;
	private Long __count;

	/**
	* <pre>
	* Name for the form based single sign-on profile.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the form based single sign-on profile.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Root-relative URL to which the completed form is submitted.<br> Minimum length =  1
	* </pre>
	*/
	public void set_actionurl(String actionurl) throws Exception{
		this.actionurl = actionurl;
	}

	/**
	* <pre>
	* Root-relative URL to which the completed form is submitted.<br> Minimum length =  1
	* </pre>
	*/
	public String get_actionurl() throws Exception {
		return this.actionurl;
	}

	/**
	* <pre>
	* Name of the form field in which the user types in the user ID.<br> Minimum length =  1
	* </pre>
	*/
	public void set_userfield(String userfield) throws Exception{
		this.userfield = userfield;
	}

	/**
	* <pre>
	* Name of the form field in which the user types in the user ID.<br> Minimum length =  1
	* </pre>
	*/
	public String get_userfield() throws Exception {
		return this.userfield;
	}

	/**
	* <pre>
	* Name of the form field in which the user types in the password.<br> Minimum length =  1
	* </pre>
	*/
	public void set_passwdfield(String passwdfield) throws Exception{
		this.passwdfield = passwdfield;
	}

	/**
	* <pre>
	* Name of the form field in which the user types in the password.<br> Minimum length =  1
	* </pre>
	*/
	public String get_passwdfield() throws Exception {
		return this.passwdfield;
	}

	/**
	* <pre>
	* Use a frequently used expression or create a custom expression describing the action that the form-based single sign-on profile takes when invoked by a policy. Used for verifying successful single sign-on.
	* </pre>
	*/
	public void set_ssosuccessrule(String ssosuccessrule) throws Exception{
		this.ssosuccessrule = ssosuccessrule;
	}

	/**
	* <pre>
	* Use a frequently used expression or create a custom expression describing the action that the form-based single sign-on profile takes when invoked by a policy. Used for verifying successful single sign-on.
	* </pre>
	*/
	public String get_ssosuccessrule() throws Exception {
		return this.ssosuccessrule;
	}

	/**
	* <pre>
	* Other name-value pair attributes to send to the server, in addition to sending the user name and password. Value names are separated by an ampersand (&), such as in name1=value1&name2=value2.
	* </pre>
	*/
	public void set_namevaluepair(String namevaluepair) throws Exception{
		this.namevaluepair = namevaluepair;
	}

	/**
	* <pre>
	* Other name-value pair attributes to send to the server, in addition to sending the user name and password. Value names are separated by an ampersand (&), such as in name1=value1&name2=value2.
	* </pre>
	*/
	public String get_namevaluepair() throws Exception {
		return this.namevaluepair;
	}

	/**
	* <pre>
	* Maximum number of bytes to allow in the response size. Specifies the number of bytes in the response to be parsed for extracting the forms.<br> Default value: 8096
	* </pre>
	*/
	public void set_responsesize(long responsesize) throws Exception {
		this.responsesize = new Long(responsesize);
	}

	/**
	* <pre>
	* Maximum number of bytes to allow in the response size. Specifies the number of bytes in the response to be parsed for extracting the forms.<br> Default value: 8096
	* </pre>
	*/
	public void set_responsesize(Long responsesize) throws Exception{
		this.responsesize = responsesize;
	}

	/**
	* <pre>
	* Maximum number of bytes to allow in the response size. Specifies the number of bytes in the response to be parsed for extracting the forms.<br> Default value: 8096
	* </pre>
	*/
	public Long get_responsesize() throws Exception {
		return this.responsesize;
	}

	/**
	* <pre>
	* How to process the name-value pair. Available settings function as follows:
* STATIC - The administrator-configured values are used.
* DYNAMIC - The response is parsed, the form is extracted, and then submitted.<br> Default value: DYNAMIC<br> Possible values = STATIC, DYNAMIC
	* </pre>
	*/
	public void set_nvtype(String nvtype) throws Exception{
		this.nvtype = nvtype;
	}

	/**
	* <pre>
	* How to process the name-value pair. Available settings function as follows:
* STATIC - The administrator-configured values are used.
* DYNAMIC - The response is parsed, the form is extracted, and then submitted.<br> Default value: DYNAMIC<br> Possible values = STATIC, DYNAMIC
	* </pre>
	*/
	public String get_nvtype() throws Exception {
		return this.nvtype;
	}

	/**
	* <pre>
	* HTTP method (GET or POST) used by the single sign-on form to send the logon credentials to the logon server.<br> Default value: GET<br> Possible values = GET, POST
	* </pre>
	*/
	public void set_submitmethod(String submitmethod) throws Exception{
		this.submitmethod = submitmethod;
	}

	/**
	* <pre>
	* HTTP method (GET or POST) used by the single sign-on form to send the logon credentials to the logon server.<br> Default value: GET<br> Possible values = GET, POST
	* </pre>
	*/
	public String get_submitmethod() throws Exception {
		return this.submitmethod;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		vpnformssoaction_response result = (vpnformssoaction_response) service.get_payload_formatter().string_to_resource(vpnformssoaction_response.class, response);
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
		return result.vpnformssoaction;
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
	* Use this API to add vpnformssoaction.
	*/
	public static base_response add(nitro_service client, vpnformssoaction resource) throws Exception {
		vpnformssoaction addresource = new vpnformssoaction();
		addresource.name = resource.name;
		addresource.actionurl = resource.actionurl;
		addresource.userfield = resource.userfield;
		addresource.passwdfield = resource.passwdfield;
		addresource.ssosuccessrule = resource.ssosuccessrule;
		addresource.namevaluepair = resource.namevaluepair;
		addresource.responsesize = resource.responsesize;
		addresource.nvtype = resource.nvtype;
		addresource.submitmethod = resource.submitmethod;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add vpnformssoaction resources.
	*/
	public static base_responses add(nitro_service client, vpnformssoaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnformssoaction addresources[] = new vpnformssoaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new vpnformssoaction();
				addresources[i].name = resources[i].name;
				addresources[i].actionurl = resources[i].actionurl;
				addresources[i].userfield = resources[i].userfield;
				addresources[i].passwdfield = resources[i].passwdfield;
				addresources[i].ssosuccessrule = resources[i].ssosuccessrule;
				addresources[i].namevaluepair = resources[i].namevaluepair;
				addresources[i].responsesize = resources[i].responsesize;
				addresources[i].nvtype = resources[i].nvtype;
				addresources[i].submitmethod = resources[i].submitmethod;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpnformssoaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		vpnformssoaction deleteresource = new vpnformssoaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpnformssoaction.
	*/
	public static base_response delete(nitro_service client, vpnformssoaction resource) throws Exception {
		vpnformssoaction deleteresource = new vpnformssoaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete vpnformssoaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpnformssoaction deleteresources[] = new vpnformssoaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new vpnformssoaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete vpnformssoaction resources.
	*/
	public static base_responses delete(nitro_service client, vpnformssoaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnformssoaction deleteresources[] = new vpnformssoaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new vpnformssoaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update vpnformssoaction.
	*/
	public static base_response update(nitro_service client, vpnformssoaction resource) throws Exception {
		vpnformssoaction updateresource = new vpnformssoaction();
		updateresource.name = resource.name;
		updateresource.actionurl = resource.actionurl;
		updateresource.userfield = resource.userfield;
		updateresource.passwdfield = resource.passwdfield;
		updateresource.ssosuccessrule = resource.ssosuccessrule;
		updateresource.responsesize = resource.responsesize;
		updateresource.namevaluepair = resource.namevaluepair;
		updateresource.nvtype = resource.nvtype;
		updateresource.submitmethod = resource.submitmethod;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update vpnformssoaction resources.
	*/
	public static base_responses update(nitro_service client, vpnformssoaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnformssoaction updateresources[] = new vpnformssoaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new vpnformssoaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].actionurl = resources[i].actionurl;
				updateresources[i].userfield = resources[i].userfield;
				updateresources[i].passwdfield = resources[i].passwdfield;
				updateresources[i].ssosuccessrule = resources[i].ssosuccessrule;
				updateresources[i].responsesize = resources[i].responsesize;
				updateresources[i].namevaluepair = resources[i].namevaluepair;
				updateresources[i].nvtype = resources[i].nvtype;
				updateresources[i].submitmethod = resources[i].submitmethod;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vpnformssoaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, vpnformssoaction resource, String[] args) throws Exception{
		vpnformssoaction unsetresource = new vpnformssoaction();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of vpnformssoaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			vpnformssoaction unsetresources[] = new vpnformssoaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new vpnformssoaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of vpnformssoaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, vpnformssoaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			vpnformssoaction unsetresources[] = new vpnformssoaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new vpnformssoaction();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the vpnformssoaction resources that are configured on netscaler.
	*/
	public static vpnformssoaction[] get(nitro_service service) throws Exception{
		vpnformssoaction obj = new vpnformssoaction();
		vpnformssoaction[] response = (vpnformssoaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the vpnformssoaction resources that are configured on netscaler.
	*/
	public static vpnformssoaction[] get(nitro_service service, options option) throws Exception{
		vpnformssoaction obj = new vpnformssoaction();
		vpnformssoaction[] response = (vpnformssoaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch vpnformssoaction resource of given name .
	*/
	public static vpnformssoaction get(nitro_service service, String name) throws Exception{
		vpnformssoaction obj = new vpnformssoaction();
		obj.set_name(name);
		vpnformssoaction response = (vpnformssoaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch vpnformssoaction resources of given names .
	*/
	public static vpnformssoaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			vpnformssoaction response[] = new vpnformssoaction[name.length];
			vpnformssoaction obj[] = new vpnformssoaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new vpnformssoaction();
				obj[i].set_name(name[i]);
				response[i] = (vpnformssoaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of vpnformssoaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static vpnformssoaction[] get_filtered(nitro_service service, String filter) throws Exception{
		vpnformssoaction obj = new vpnformssoaction();
		options option = new options();
		option.set_filter(filter);
		vpnformssoaction[] response = (vpnformssoaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of vpnformssoaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static vpnformssoaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnformssoaction obj = new vpnformssoaction();
		options option = new options();
		option.set_filter(filter);
		vpnformssoaction[] response = (vpnformssoaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the vpnformssoaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		vpnformssoaction obj = new vpnformssoaction();
		options option = new options();
		option.set_count(true);
		vpnformssoaction[] response = (vpnformssoaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of vpnformssoaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		vpnformssoaction obj = new vpnformssoaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnformssoaction[] response = (vpnformssoaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of vpnformssoaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		vpnformssoaction obj = new vpnformssoaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		vpnformssoaction[] response = (vpnformssoaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class nvtypeEnum {
		public static final String STATIC = "STATIC";
		public static final String DYNAMIC = "DYNAMIC";
	}
	public static class submitmethodEnum {
		public static final String GET = "GET";
		public static final String POST = "POST";
	}
}
