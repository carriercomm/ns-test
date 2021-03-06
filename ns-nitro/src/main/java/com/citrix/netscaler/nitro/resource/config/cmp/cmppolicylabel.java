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

package com.citrix.netscaler.nitro.resource.config.cmp;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class cmppolicylabel_response extends base_response
{
	public cmppolicylabel[] cmppolicylabel;
}
/**
* Configuration for compression policy label resource.
*/

public class cmppolicylabel extends base_resource
{
	private String labelname;
	private String type;
	private String newname;

	//------- Read only Parameter ---------;

	private Long numpol;
	private Long hits;
	private Long priority;
	private String gotopriorityexpression;
	private String labeltype;
	private String invoke_labelname;
	private Long flowtype;
	private String description;
	private Long __count;

	/**
	* <pre>
	* Name of the HTTP compression policy label. Must begin with a letter, number, or the underscore character (_). Additional characters allowed, after the first character, are the hyphen (-), period (.) pound sign (#), space ( ), at sign (@), equals (=), and colon (:). The name must be unique within the list of policy labels for compression policies. Can be renamed after the policy label is created. 
            
            The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my cmp policylabel" or 'my cmp policylabel').<br> Minimum length =  1
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* Name of the HTTP compression policy label. Must begin with a letter, number, or the underscore character (_). Additional characters allowed, after the first character, are the hyphen (-), period (.) pound sign (#), space ( ), at sign (@), equals (=), and colon (:). The name must be unique within the list of policy labels for compression policies. Can be renamed after the policy label is created. 
            
            The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my cmp policylabel" or 'my cmp policylabel').<br> Minimum length =  1
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* Type of packets (request packets or response) against which to match the policies bound to this policy label.<br> Possible values = REQ, RES
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Type of packets (request packets or response) against which to match the policies bound to this policy label.<br> Possible values = REQ, RES
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* New name for the compression policy label. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.
                        
                        The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my cmp policylabel" or 'my cmp policylabel').<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* New name for the compression policy label. Must begin with an ASCII alphabetic or underscore (_) character, and must contain only ASCII alphanumeric, underscore, hash (#), period (.), space, colon (:), at (@), equals (=), and hyphen (-) characters.
                        
                        The following requirement applies only to the NetScaler CLI:
If the name includes one or more spaces, enclose the name in double or single quotation marks (for example, "my cmp policylabel" or 'my cmp policylabel').<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* Number of polices bound to label.
	* </pre>
	*/
	public Long get_numpol() throws Exception {
		return this.numpol;
	}

	/**
	* <pre>
	* Number of times policy label was invoked.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* Specifies the priority of the policy.
	* </pre>
	*/
	public Long get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Expression specifying the priority of the next policy which will get evaluated if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_gotopriorityexpression() throws Exception {
		return this.gotopriorityexpression;
	}

	/**
	* <pre>
	* Type of policy label invocation.<br> Possible values = reqvserver, resvserver, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* Name of the label to invoke if the current policy evaluates to TRUE.
	* </pre>
	*/
	public String get_invoke_labelname() throws Exception {
		return this.invoke_labelname;
	}

	/**
	* <pre>
	* Flowtype of the bound compression policy.
	* </pre>
	*/
	public Long get_flowtype() throws Exception {
		return this.flowtype;
	}

	/**
	* <pre>
	* Description of the policylabel.
	* </pre>
	*/
	public String get_description() throws Exception {
		return this.description;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		cmppolicylabel_response result = (cmppolicylabel_response) service.get_payload_formatter().string_to_resource(cmppolicylabel_response.class, response);
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
		return result.cmppolicylabel;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return this.labelname;
	}

	/**
	* Use this API to add cmppolicylabel.
	*/
	public static base_response add(nitro_service client, cmppolicylabel resource) throws Exception {
		cmppolicylabel addresource = new cmppolicylabel();
		addresource.labelname = resource.labelname;
		addresource.type = resource.type;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add cmppolicylabel resources.
	*/
	public static base_responses add(nitro_service client, cmppolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cmppolicylabel addresources[] = new cmppolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new cmppolicylabel();
				addresources[i].labelname = resources[i].labelname;
				addresources[i].type = resources[i].type;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete cmppolicylabel of given name.
	*/
	public static base_response delete(nitro_service client, String labelname) throws Exception {
		cmppolicylabel deleteresource = new cmppolicylabel();
		deleteresource.labelname = labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cmppolicylabel.
	*/
	public static base_response delete(nitro_service client, cmppolicylabel resource) throws Exception {
		cmppolicylabel deleteresource = new cmppolicylabel();
		deleteresource.labelname = resource.labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete cmppolicylabel resources of given names.
	*/
	public static base_responses delete(nitro_service client, String labelname[]) throws Exception {
		base_responses result = null;
		if (labelname != null && labelname.length > 0) {
			cmppolicylabel deleteresources[] = new cmppolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++){
				deleteresources[i] = new cmppolicylabel();
				deleteresources[i].labelname = labelname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete cmppolicylabel resources.
	*/
	public static base_responses delete(nitro_service client, cmppolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			cmppolicylabel deleteresources[] = new cmppolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new cmppolicylabel();
				deleteresources[i].labelname = resources[i].labelname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to rename a cmppolicylabel resource.
	*/
	public static base_response rename(nitro_service client, cmppolicylabel resource, String new_labelname) throws Exception {
		cmppolicylabel renameresource = new cmppolicylabel();
		renameresource.labelname = resource.labelname;
		return renameresource.rename_resource(client,new_labelname);
	}

	/**
	* Use this API to rename a cmppolicylabel resource.
	*/
	public static base_response rename(nitro_service client, String labelname, String new_labelname) throws Exception {
		cmppolicylabel renameresource = new cmppolicylabel();
		renameresource.labelname = labelname;
		return renameresource.rename_resource(client,new_labelname);
	}

	/**
	* Use this API to fetch all the cmppolicylabel resources that are configured on netscaler.
	*/
	public static cmppolicylabel[] get(nitro_service service) throws Exception{
		cmppolicylabel obj = new cmppolicylabel();
		cmppolicylabel[] response = (cmppolicylabel[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the cmppolicylabel resources that are configured on netscaler.
	*/
	public static cmppolicylabel[] get(nitro_service service, options option) throws Exception{
		cmppolicylabel obj = new cmppolicylabel();
		cmppolicylabel[] response = (cmppolicylabel[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch cmppolicylabel resource of given name .
	*/
	public static cmppolicylabel get(nitro_service service, String labelname) throws Exception{
		cmppolicylabel obj = new cmppolicylabel();
		obj.set_labelname(labelname);
		cmppolicylabel response = (cmppolicylabel) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch cmppolicylabel resources of given names .
	*/
	public static cmppolicylabel[] get(nitro_service service, String labelname[]) throws Exception{
		if (labelname !=null && labelname.length>0) {
			cmppolicylabel response[] = new cmppolicylabel[labelname.length];
			cmppolicylabel obj[] = new cmppolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++) {
				obj[i] = new cmppolicylabel();
				obj[i].set_labelname(labelname[i]);
				response[i] = (cmppolicylabel) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of cmppolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static cmppolicylabel[] get_filtered(nitro_service service, String filter) throws Exception{
		cmppolicylabel obj = new cmppolicylabel();
		options option = new options();
		option.set_filter(filter);
		cmppolicylabel[] response = (cmppolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of cmppolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static cmppolicylabel[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cmppolicylabel obj = new cmppolicylabel();
		options option = new options();
		option.set_filter(filter);
		cmppolicylabel[] response = (cmppolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the cmppolicylabel resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		cmppolicylabel obj = new cmppolicylabel();
		options option = new options();
		option.set_count(true);
		cmppolicylabel[] response = (cmppolicylabel[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of cmppolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		cmppolicylabel obj = new cmppolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cmppolicylabel[] response = (cmppolicylabel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of cmppolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		cmppolicylabel obj = new cmppolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		cmppolicylabel[] response = (cmppolicylabel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class typeEnum {
		public static final String REQ = "REQ";
		public static final String RES = "RES";
	}
	public static class labeltypeEnum {
		public static final String reqvserver = "reqvserver";
		public static final String resvserver = "resvserver";
		public static final String policylabel = "policylabel";
	}
}
