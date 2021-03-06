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

package com.citrix.netscaler.nitro.resource.config.responder;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class responderaction_response extends base_response
{
	public responderaction[] responderaction;
}
/**
* Configuration for responder action resource.
*/

public class responderaction extends base_resource
{
	private String name;
	private String type;
	private String target;
	private String htmlpage;
	private String bypasssafetycheck;
	private String comment;
	private String newname;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long referencecount;
	private Long undefhits;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* Name for the responder action. Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Can be changed after the responder policy is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my responder action" or 'my responder action').
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the responder action. Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), colon (:), and underscore characters. Can be changed after the responder policy is added.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my responder action" or 'my responder action').
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Type of responder action. Available settings function as follows:
* respondwith <target> - Respond to the request with the expression specified as the target.
* respondwithhtmlpage - Respond to the request with the uploaded HTML page object specified as the target.
* redirect - Redirect the request to the URL specified as the target.
* sqlresponse_ok - Send an SQL OK response.
* sqlresponse_error - Send an SQL ERROR response.<br> Possible values = noop, respondwith, redirect, respondwithhtmlpage, sqlresponse_ok, sqlresponse_error
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Type of responder action. Available settings function as follows:
* respondwith <target> - Respond to the request with the expression specified as the target.
* respondwithhtmlpage - Respond to the request with the uploaded HTML page object specified as the target.
* redirect - Redirect the request to the URL specified as the target.
* sqlresponse_ok - Send an SQL OK response.
* sqlresponse_error - Send an SQL ERROR response.<br> Possible values = noop, respondwith, redirect, respondwithhtmlpage, sqlresponse_ok, sqlresponse_error
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Expression specifying what to respond with. Typically a URL for redirect policies or a default-syntax expression.  In addition to NetScaler default-syntax expressions that refer to information in the request, a stringbuilder expression can contain text and HTML, and simple escape codes that define new lines and paragraphs. Enclose each stringbuilder expression element (either a NetScaler default-syntax expression or a string) in double quotation marks. Use the plus (+) character to join the elements. 

Examples:
1) Respondwith expression that sends an HTTP 1.1 200 OK response:
"HTTP/1.1 200 OK\r\n\r\n"

2) Redirect expression that redirects user to the specified web host and appends the request URL to the redirect.
"http://backupsite2.com" + HTTP.REQ.URL

3) Respondwith expression that sends an HTTP 1.1 404 Not Found response with the request URL included in the response:
"HTTP/1.1 404 Not Found\r\n\r\n"+ "HTTP.REQ.URL.HTTP_URL_SAFE" + "does not exist on the web server."

The following requirement applies only to the NetScaler CLI:
Enclose the entire expression in single quotation marks. (NetScaler default expression elements should be included inside the single quotation marks for the entire expression, but do not need to be enclosed in double quotation marks.).
	* </pre>
	*/
	public void set_target(String target) throws Exception{
		this.target = target;
	}

	/**
	* <pre>
	* Expression specifying what to respond with. Typically a URL for redirect policies or a default-syntax expression.  In addition to NetScaler default-syntax expressions that refer to information in the request, a stringbuilder expression can contain text and HTML, and simple escape codes that define new lines and paragraphs. Enclose each stringbuilder expression element (either a NetScaler default-syntax expression or a string) in double quotation marks. Use the plus (+) character to join the elements. 

Examples:
1) Respondwith expression that sends an HTTP 1.1 200 OK response:
"HTTP/1.1 200 OK\r\n\r\n"

2) Redirect expression that redirects user to the specified web host and appends the request URL to the redirect.
"http://backupsite2.com" + HTTP.REQ.URL

3) Respondwith expression that sends an HTTP 1.1 404 Not Found response with the request URL included in the response:
"HTTP/1.1 404 Not Found\r\n\r\n"+ "HTTP.REQ.URL.HTTP_URL_SAFE" + "does not exist on the web server."

The following requirement applies only to the NetScaler CLI:
Enclose the entire expression in single quotation marks. (NetScaler default expression elements should be included inside the single quotation marks for the entire expression, but do not need to be enclosed in double quotation marks.).
	* </pre>
	*/
	public String get_target() throws Exception {
		return this.target;
	}

	/**
	* <pre>
	* For respondwithhtmlpage policies, name of the HTML page object to use as the response. You must first import the page object.<br> Minimum length =  1
	* </pre>
	*/
	public void set_htmlpage(String htmlpage) throws Exception{
		this.htmlpage = htmlpage;
	}

	/**
	* <pre>
	* For respondwithhtmlpage policies, name of the HTML page object to use as the response. You must first import the page object.<br> Minimum length =  1
	* </pre>
	*/
	public String get_htmlpage() throws Exception {
		return this.htmlpage;
	}

	/**
	* <pre>
	* Bypass the safety check, allowing potentially unsafe expressions. An unsafe expression in a response is one that contains references to request elements that might not be present in all requests. If a response refers to a missing request element, an empty string is used instead.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public void set_bypasssafetycheck(String bypasssafetycheck) throws Exception{
		this.bypasssafetycheck = bypasssafetycheck;
	}

	/**
	* <pre>
	* Bypass the safety check, allowing potentially unsafe expressions. An unsafe expression in a response is one that contains references to request elements that might not be present in all requests. If a response refers to a missing request element, an empty string is used instead.<br> Default value: NO<br> Possible values = YES, NO
	* </pre>
	*/
	public String get_bypasssafetycheck() throws Exception {
		return this.bypasssafetycheck;
	}

	/**
	* <pre>
	* Comment. Any type of information about this responder action.
	* </pre>
	*/
	public void set_comment(String comment) throws Exception{
		this.comment = comment;
	}

	/**
	* <pre>
	* Comment. Any type of information about this responder action.
	* </pre>
	*/
	public String get_comment() throws Exception {
		return this.comment;
	}

	/**
	* <pre>
	* New name for the responder action.
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), colon (:), and underscore characters.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my responder action" or my responder action').<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the responder action.
Must begin with a letter, number, or the underscore character (_), and must contain only letters, numbers, and the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), colon (:), and underscore characters.

The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my responder action" or my responder action').<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* The number of times the action has been taken.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* The number of references to the action.
	* </pre>
	*/
	public Long get_referencecount() throws Exception {
		return this.referencecount;
	}

	/**
	* <pre>
	* The number of times the action resulted in UNDEF.
	* </pre>
	*/
	public Long get_undefhits() throws Exception {
		return this.undefhits;
	}

	/**
	* <pre>
	* Flag to determine whether responder action is built-in or not.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
	* </pre>
	*/
	public String[] get_builtin() throws Exception {
		return this.builtin;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		responderaction_response result = (responderaction_response) service.get_payload_formatter().string_to_resource(responderaction_response.class, response);
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
		return result.responderaction;
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
	* Use this API to add responderaction.
	*/
	public static base_response add(nitro_service client, responderaction resource) throws Exception {
		responderaction addresource = new responderaction();
		addresource.name = resource.name;
		addresource.type = resource.type;
		addresource.target = resource.target;
		addresource.htmlpage = resource.htmlpage;
		addresource.bypasssafetycheck = resource.bypasssafetycheck;
		addresource.comment = resource.comment;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add responderaction resources.
	*/
	public static base_responses add(nitro_service client, responderaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			responderaction addresources[] = new responderaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new responderaction();
				addresources[i].name = resources[i].name;
				addresources[i].type = resources[i].type;
				addresources[i].target = resources[i].target;
				addresources[i].htmlpage = resources[i].htmlpage;
				addresources[i].bypasssafetycheck = resources[i].bypasssafetycheck;
				addresources[i].comment = resources[i].comment;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete responderaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		responderaction deleteresource = new responderaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete responderaction.
	*/
	public static base_response delete(nitro_service client, responderaction resource) throws Exception {
		responderaction deleteresource = new responderaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete responderaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			responderaction deleteresources[] = new responderaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new responderaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete responderaction resources.
	*/
	public static base_responses delete(nitro_service client, responderaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			responderaction deleteresources[] = new responderaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new responderaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update responderaction.
	*/
	public static base_response update(nitro_service client, responderaction resource) throws Exception {
		responderaction updateresource = new responderaction();
		updateresource.name = resource.name;
		updateresource.target = resource.target;
		updateresource.bypasssafetycheck = resource.bypasssafetycheck;
		updateresource.htmlpage = resource.htmlpage;
		updateresource.comment = resource.comment;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update responderaction resources.
	*/
	public static base_responses update(nitro_service client, responderaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			responderaction updateresources[] = new responderaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new responderaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].target = resources[i].target;
				updateresources[i].bypasssafetycheck = resources[i].bypasssafetycheck;
				updateresources[i].htmlpage = resources[i].htmlpage;
				updateresources[i].comment = resources[i].comment;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of responderaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, responderaction resource, String[] args) throws Exception{
		responderaction unsetresource = new responderaction();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of responderaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			responderaction unsetresources[] = new responderaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new responderaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of responderaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, responderaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			responderaction unsetresources[] = new responderaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new responderaction();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to rename a responderaction resource.
	*/
	public static base_response rename(nitro_service client, responderaction resource, String new_name) throws Exception {
		responderaction renameresource = new responderaction();
		renameresource.name = resource.name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to rename a responderaction resource.
	*/
	public static base_response rename(nitro_service client, String name, String new_name) throws Exception {
		responderaction renameresource = new responderaction();
		renameresource.name = name;
		return renameresource.rename_resource(client,new_name);
	}

	/**
	* Use this API to fetch all the responderaction resources that are configured on netscaler.
	*/
	public static responderaction[] get(nitro_service service) throws Exception{
		responderaction obj = new responderaction();
		responderaction[] response = (responderaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the responderaction resources that are configured on netscaler.
	*/
	public static responderaction[] get(nitro_service service, options option) throws Exception{
		responderaction obj = new responderaction();
		responderaction[] response = (responderaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch responderaction resource of given name .
	*/
	public static responderaction get(nitro_service service, String name) throws Exception{
		responderaction obj = new responderaction();
		obj.set_name(name);
		responderaction response = (responderaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch responderaction resources of given names .
	*/
	public static responderaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			responderaction response[] = new responderaction[name.length];
			responderaction obj[] = new responderaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new responderaction();
				obj[i].set_name(name[i]);
				response[i] = (responderaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of responderaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static responderaction[] get_filtered(nitro_service service, String filter) throws Exception{
		responderaction obj = new responderaction();
		options option = new options();
		option.set_filter(filter);
		responderaction[] response = (responderaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of responderaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static responderaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		responderaction obj = new responderaction();
		options option = new options();
		option.set_filter(filter);
		responderaction[] response = (responderaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the responderaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		responderaction obj = new responderaction();
		options option = new options();
		option.set_count(true);
		responderaction[] response = (responderaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of responderaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		responderaction obj = new responderaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		responderaction[] response = (responderaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of responderaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		responderaction obj = new responderaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		responderaction[] response = (responderaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class bypasssafetycheckEnum {
		public static final String YES = "YES";
		public static final String NO = "NO";
	}
	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
	public static class typeEnum {
		public static final String noop = "noop";
		public static final String respondwith = "respondwith";
		public static final String redirect = "redirect";
		public static final String respondwithhtmlpage = "respondwithhtmlpage";
		public static final String sqlresponse_ok = "sqlresponse_ok";
		public static final String sqlresponse_error = "sqlresponse_error";
	}
}
