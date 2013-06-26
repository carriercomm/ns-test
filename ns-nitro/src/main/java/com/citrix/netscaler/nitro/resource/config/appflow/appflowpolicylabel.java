/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.appflow;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appflowpolicylabel_response extends base_response
{
	public appflowpolicylabel[] appflowpolicylabel;
}
/**
* Configuration for AppFlow policy label resource.
*/

public class appflowpolicylabel extends base_resource
{
	private String labelname;
	private String policylabeltype;
	private String newname;

	//------- Read only Parameter ---------;

	private Long numpol;
	private Long hits;
	private String policyname;
	private Long priority;
	private String gotopriorityexpression;
	private String labeltype;
	private String invoke_labelname;
	private Long flowtype;
	private String description;
	private Long __count;

	/**
	* <pre>
	* The name of the AppFlow policy label to be created.<br> Minimum length =  1
	* </pre>
	*/
	public void set_labelname(String labelname) throws Exception{
		this.labelname = labelname;
	}

	/**
	* <pre>
	* The name of the AppFlow policy label to be created.<br> Minimum length =  1
	* </pre>
	*/
	public String get_labelname() throws Exception {
		return this.labelname;
	}

	/**
	* <pre>
	* The type of the policy label.<br> Default value: NS_PLTMAP_APPFLOW_REQ<br> Possible values = HTTP, OTHERTCP
	* </pre>
	*/
	public void set_policylabeltype(String policylabeltype) throws Exception{
		this.policylabeltype = policylabeltype;
	}

	/**
	* <pre>
	* The type of the policy label.<br> Default value: NS_PLTMAP_APPFLOW_REQ<br> Possible values = HTTP, OTHERTCP
	* </pre>
	*/
	public String get_policylabeltype() throws Exception {
		return this.policylabeltype;
	}

	/**
	* <pre>
	* The new name of the AppFlow policylabel.<br> Minimum length =  1
	* </pre>
	*/
	public void set_newname(String newname) throws Exception{
		this.newname = newname;
	}

	/**
	* <pre>
	* The new name of the AppFlow policylabel.<br> Minimum length =  1
	* </pre>
	*/
	public String get_newname() throws Exception {
		return this.newname;
	}

	/**
	* <pre>
	* Number of polices bound to the policy label.
	* </pre>
	*/
	public Long get_numpol() throws Exception {
		return this.numpol;
	}

	/**
	* <pre>
	* Number of times the policy label was invoked.
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* Name of the AppFlow policy.
	* </pre>
	*/
	public String get_policyname() throws Exception {
		return this.policyname;
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
	* Type of policy label invocation.<br> Possible values = vserver, policylabel
	* </pre>
	*/
	public String get_labeltype() throws Exception {
		return this.labeltype;
	}

	/**
	* <pre>
	* Name of the label to invoke if the current policy rule evaluates to TRUE.
	* </pre>
	*/
	public String get_invoke_labelname() throws Exception {
		return this.invoke_labelname;
	}

	/**
	* <pre>
	* Flowtype of the bound AppFlow policy.
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
		appflowpolicylabel_response result = (appflowpolicylabel_response) service.get_payload_formatter().string_to_resource(appflowpolicylabel_response.class, response);
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
		return result.appflowpolicylabel;
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
	* Use this API to add appflowpolicylabel.
	*/
	public static base_response add(nitro_service client, appflowpolicylabel resource) throws Exception {
		appflowpolicylabel addresource = new appflowpolicylabel();
		addresource.labelname = resource.labelname;
		addresource.policylabeltype = resource.policylabeltype;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add appflowpolicylabel resources.
	*/
	public static base_responses add(nitro_service client, appflowpolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appflowpolicylabel addresources[] = new appflowpolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new appflowpolicylabel();
				addresources[i].labelname = resources[i].labelname;
				addresources[i].policylabeltype = resources[i].policylabeltype;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete appflowpolicylabel of given name.
	*/
	public static base_response delete(nitro_service client, String labelname) throws Exception {
		appflowpolicylabel deleteresource = new appflowpolicylabel();
		deleteresource.labelname = labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appflowpolicylabel.
	*/
	public static base_response delete(nitro_service client, appflowpolicylabel resource) throws Exception {
		appflowpolicylabel deleteresource = new appflowpolicylabel();
		deleteresource.labelname = resource.labelname;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appflowpolicylabel resources of given names.
	*/
	public static base_responses delete(nitro_service client, String labelname[]) throws Exception {
		base_responses result = null;
		if (labelname != null && labelname.length > 0) {
			appflowpolicylabel deleteresources[] = new appflowpolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++){
				deleteresources[i] = new appflowpolicylabel();
				deleteresources[i].labelname = labelname[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete appflowpolicylabel resources.
	*/
	public static base_responses delete(nitro_service client, appflowpolicylabel resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appflowpolicylabel deleteresources[] = new appflowpolicylabel[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appflowpolicylabel();
				deleteresources[i].labelname = resources[i].labelname;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to rename a appflowpolicylabel resource.
	*/
	public static base_response rename(nitro_service client, appflowpolicylabel resource, String new_labelname) throws Exception {
		appflowpolicylabel renameresource = new appflowpolicylabel();
		renameresource.labelname = resource.labelname;
		return renameresource.rename_resource(client,new_labelname);
	}

	/**
	* Use this API to rename a appflowpolicylabel resource.
	*/
	public static base_response rename(nitro_service client, String labelname, String new_labelname) throws Exception {
		appflowpolicylabel renameresource = new appflowpolicylabel();
		renameresource.labelname = labelname;
		return renameresource.rename_resource(client,new_labelname);
	}

	/**
	* Use this API to fetch all the appflowpolicylabel resources that are configured on netscaler.
	*/
	public static appflowpolicylabel[] get(nitro_service service) throws Exception{
		appflowpolicylabel obj = new appflowpolicylabel();
		appflowpolicylabel[] response = (appflowpolicylabel[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the appflowpolicylabel resources that are configured on netscaler.
	*/
	public static appflowpolicylabel[] get(nitro_service service, options option) throws Exception{
		appflowpolicylabel obj = new appflowpolicylabel();
		appflowpolicylabel[] response = (appflowpolicylabel[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch appflowpolicylabel resource of given name .
	*/
	public static appflowpolicylabel get(nitro_service service, String labelname) throws Exception{
		appflowpolicylabel obj = new appflowpolicylabel();
		obj.set_labelname(labelname);
		appflowpolicylabel response = (appflowpolicylabel) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch appflowpolicylabel resources of given names .
	*/
	public static appflowpolicylabel[] get(nitro_service service, String labelname[]) throws Exception{
		if (labelname !=null && labelname.length>0) {
			appflowpolicylabel response[] = new appflowpolicylabel[labelname.length];
			appflowpolicylabel obj[] = new appflowpolicylabel[labelname.length];
			for (int i=0;i<labelname.length;i++) {
				obj[i] = new appflowpolicylabel();
				obj[i].set_labelname(labelname[i]);
				response[i] = (appflowpolicylabel) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of appflowpolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appflowpolicylabel[] get_filtered(nitro_service service, String filter) throws Exception{
		appflowpolicylabel obj = new appflowpolicylabel();
		options option = new options();
		option.set_filter(filter);
		appflowpolicylabel[] response = (appflowpolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appflowpolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appflowpolicylabel[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appflowpolicylabel obj = new appflowpolicylabel();
		options option = new options();
		option.set_filter(filter);
		appflowpolicylabel[] response = (appflowpolicylabel[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the appflowpolicylabel resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		appflowpolicylabel obj = new appflowpolicylabel();
		options option = new options();
		option.set_count(true);
		appflowpolicylabel[] response = (appflowpolicylabel[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of appflowpolicylabel resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		appflowpolicylabel obj = new appflowpolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appflowpolicylabel[] response = (appflowpolicylabel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appflowpolicylabel resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appflowpolicylabel obj = new appflowpolicylabel();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appflowpolicylabel[] response = (appflowpolicylabel[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class policylabeltypeEnum {
		public static final String HTTP = "HTTP";
		public static final String OTHERTCP = "OTHERTCP";
	}
	public static class labeltypeEnum {
		public static final String vserver = "vserver";
		public static final String policylabel = "policylabel";
	}
}
