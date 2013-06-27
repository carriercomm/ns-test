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

package com.citrix.netscaler.nitro.resource.config.appqoe;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appqoeaction_response extends base_response
{
	public appqoeaction[] appqoeaction;
}
/**
* Configuration for AppQoS action resource.
*/

public class appqoeaction extends base_resource
{
	private String name;
	private String priority;
	private String responsewith;
	private String altcontentsvcname;
	private String altcontentpath;
	private Long polqdepth;
	private Long priqdepth;
	private Long maxconn;
	private Long delay;
	private Long clientdetectrate;
	private Long dosatckthrsh;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long __count;

	/**
	* <pre>
	* Name for the AppQoE action. Must begin with a letter, number, or the underscore symbol (_). Other characters allowed, after the first character, are the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), and colon (:) characters. This is a mandatory argument.
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for the AppQoE action. Must begin with a letter, number, or the underscore symbol (_). Other characters allowed, after the first character, are the hyphen (-), period (.) hash (#), space ( ), at (@), equals (=), and colon (:) characters. This is a mandatory argument.
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Priority for queuing the request. If server resources are not available for a request that matches the configured rule, this option specifies a priority for queuing the request until the server resources are available again. If priority is not configured then Lowest priority will be used to queue the request.<br> Possible values = HIGH, MEDIUM, LOW, LOWEST
	* </pre>
	*/
	public void set_priority(String priority) throws Exception{
		this.priority = priority;
	}

	/**
	* <pre>
	* Priority for queuing the request. If server resources are not available for a request that matches the configured rule, this option specifies a priority for queuing the request until the server resources are available again. If priority is not configured then Lowest priority will be used to queue the request.<br> Possible values = HIGH, MEDIUM, LOW, LOWEST
	* </pre>
	*/
	public String get_priority() throws Exception {
		return this.priority;
	}

	/**
	* <pre>
	* Responder action to be taken when the threshold is reached. Available settings function as follows:
            ACS - Serve content from an alternative content service
                  Threshold : maxConn or delay
            NS - Serve from the NetScaler appliance (built-in response)
                 Threshold : maxConn or delay
            DOS - Send challenge response to verify client, if DOS thresholds are not matched then drop connections to lowest priotiy if maxConn or delay is reached
                  Threshold : dosAtckThrsh and clientDetectRate
            CUSTOM - Serve content from custom response file.
                     Threshold : custom response file can be used as a any of the above action type, so thresholds depends on the response type.
                     Custom File : set appqoe parameter -fileName /netscaler/custom.html 
            NO ACTION - Serve no alternative content, drop connections to lowest priotiy if maxConn or delay is reached.<br> Possible values = ACS, NS, DOS, NOACTION, CUSTOM
	* </pre>
	*/
	public void set_responsewith(String responsewith) throws Exception{
		this.responsewith = responsewith;
	}

	/**
	* <pre>
	* Responder action to be taken when the threshold is reached. Available settings function as follows:
            ACS - Serve content from an alternative content service
                  Threshold : maxConn or delay
            NS - Serve from the NetScaler appliance (built-in response)
                 Threshold : maxConn or delay
            DOS - Send challenge response to verify client, if DOS thresholds are not matched then drop connections to lowest priotiy if maxConn or delay is reached
                  Threshold : dosAtckThrsh and clientDetectRate
            CUSTOM - Serve content from custom response file.
                     Threshold : custom response file can be used as a any of the above action type, so thresholds depends on the response type.
                     Custom File : set appqoe parameter -fileName /netscaler/custom.html 
            NO ACTION - Serve no alternative content, drop connections to lowest priotiy if maxConn or delay is reached.<br> Possible values = ACS, NS, DOS, NOACTION, CUSTOM
	* </pre>
	*/
	public String get_responsewith() throws Exception {
		return this.responsewith;
	}

	/**
	* <pre>
	* Name of the alternative content service to be used in the ACS.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_altcontentsvcname(String altcontentsvcname) throws Exception{
		this.altcontentsvcname = altcontentsvcname;
	}

	/**
	* <pre>
	* Name of the alternative content service to be used in the ACS.<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_altcontentsvcname() throws Exception {
		return this.altcontentsvcname;
	}

	/**
	* <pre>
	* Path to the alternative content service to be used in the ACS.<br> Minimum length =  4<br> Maximum length =  127
	* </pre>
	*/
	public void set_altcontentpath(String altcontentpath) throws Exception{
		this.altcontentpath = altcontentpath;
	}

	/**
	* <pre>
	* Path to the alternative content service to be used in the ACS.<br> Minimum length =  4<br> Maximum length =  127
	* </pre>
	*/
	public String get_altcontentpath() throws Exception {
		return this.altcontentpath;
	}

	/**
	* <pre>
	* Policy queue depth threshold value. When the policy queue size (number of requests queued for the policy binding this action is attached to) increases to the specified polqDepth value, subsequent requests are dropped to the lowest priority level.<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_polqdepth(long polqdepth) throws Exception {
		this.polqdepth = new Long(polqdepth);
	}

	/**
	* <pre>
	* Policy queue depth threshold value. When the policy queue size (number of requests queued for the policy binding this action is attached to) increases to the specified polqDepth value, subsequent requests are dropped to the lowest priority level.<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_polqdepth(Long polqdepth) throws Exception{
		this.polqdepth = polqdepth;
	}

	/**
	* <pre>
	* Policy queue depth threshold value. When the policy queue size (number of requests queued for the policy binding this action is attached to) increases to the specified polqDepth value, subsequent requests are dropped to the lowest priority level.<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_polqdepth() throws Exception {
		return this.polqdepth;
	}

	/**
	* <pre>
	* Queue depth threshold value per priorirty level. If the queue size (number of requests in the queue of that particular priorirty) on the virtual server to which this policy is bound, increases to the specified qDepth value, subsequent requests are dropped to the lowest priority level.<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_priqdepth(long priqdepth) throws Exception {
		this.priqdepth = new Long(priqdepth);
	}

	/**
	* <pre>
	* Queue depth threshold value per priorirty level. If the queue size (number of requests in the queue of that particular priorirty) on the virtual server to which this policy is bound, increases to the specified qDepth value, subsequent requests are dropped to the lowest priority level.<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_priqdepth(Long priqdepth) throws Exception{
		this.priqdepth = priqdepth;
	}

	/**
	* <pre>
	* Queue depth threshold value per priorirty level. If the queue size (number of requests in the queue of that particular priorirty) on the virtual server to which this policy is bound, increases to the specified qDepth value, subsequent requests are dropped to the lowest priority level.<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_priqdepth() throws Exception {
		return this.priqdepth;
	}

	/**
	* <pre>
	* Maximum number of concurrent connections that can be open for requests that matches with rule.<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_maxconn(long maxconn) throws Exception {
		this.maxconn = new Long(maxconn);
	}

	/**
	* <pre>
	* Maximum number of concurrent connections that can be open for requests that matches with rule.<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_maxconn(Long maxconn) throws Exception{
		this.maxconn = maxconn;
	}

	/**
	* <pre>
	* Maximum number of concurrent connections that can be open for requests that matches with rule.<br> Minimum value =  1<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_maxconn() throws Exception {
		return this.maxconn;
	}

	/**
	* <pre>
	* Delay threshold, in microseconds, for requests that match the policy's rule. If the delay statistics gathered for the matching request exceed the specified delay, configured action triggered for that request, if there is no action then requests are dropped to the lowest priority level.<br> Minimum value =  1<br> Maximum value =  599999999
	* </pre>
	*/
	public void set_delay(long delay) throws Exception {
		this.delay = new Long(delay);
	}

	/**
	* <pre>
	* Delay threshold, in microseconds, for requests that match the policy's rule. If the delay statistics gathered for the matching request exceed the specified delay, configured action triggered for that request, if there is no action then requests are dropped to the lowest priority level.<br> Minimum value =  1<br> Maximum value =  599999999
	* </pre>
	*/
	public void set_delay(Long delay) throws Exception{
		this.delay = delay;
	}

	/**
	* <pre>
	* Delay threshold, in microseconds, for requests that match the policy's rule. If the delay statistics gathered for the matching request exceed the specified delay, configured action triggered for that request, if there is no action then requests are dropped to the lowest priority level.<br> Minimum value =  1<br> Maximum value =  599999999
	* </pre>
	*/
	public Long get_delay() throws Exception {
		return this.delay;
	}

	/**
	* <pre>
	* Client detect rate, Integer representing the percentage of traffic to which the HTTP DoS policy is to be applied after the DOS attack threshold condition is satisfied.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_clientdetectrate(long clientdetectrate) throws Exception {
		this.clientdetectrate = new Long(clientdetectrate);
	}

	/**
	* <pre>
	* Client detect rate, Integer representing the percentage of traffic to which the HTTP DoS policy is to be applied after the DOS attack threshold condition is satisfied.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public void set_clientdetectrate(Long clientdetectrate) throws Exception{
		this.clientdetectrate = clientdetectrate;
	}

	/**
	* <pre>
	* Client detect rate, Integer representing the percentage of traffic to which the HTTP DoS policy is to be applied after the DOS attack threshold condition is satisfied.<br> Minimum value =  1<br> Maximum value =  100
	* </pre>
	*/
	public Long get_clientdetectrate() throws Exception {
		return this.clientdetectrate;
	}

	/**
	* <pre>
	* DOS attck threshold, The queue size (the number of outstanding client requests on the vserver) before DoS protection is activated on the vserver to which the DoS protection policy is bound. This is a mandatory argument for DOS action.<br> Minimum value =  21<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_dosatckthrsh(long dosatckthrsh) throws Exception {
		this.dosatckthrsh = new Long(dosatckthrsh);
	}

	/**
	* <pre>
	* DOS attck threshold, The queue size (the number of outstanding client requests on the vserver) before DoS protection is activated on the vserver to which the DoS protection policy is bound. This is a mandatory argument for DOS action.<br> Minimum value =  21<br> Maximum value =  4294967294
	* </pre>
	*/
	public void set_dosatckthrsh(Long dosatckthrsh) throws Exception{
		this.dosatckthrsh = dosatckthrsh;
	}

	/**
	* <pre>
	* DOS attck threshold, The queue size (the number of outstanding client requests on the vserver) before DoS protection is activated on the vserver to which the DoS protection policy is bound. This is a mandatory argument for DOS action.<br> Minimum value =  21<br> Maximum value =  4294967294
	* </pre>
	*/
	public Long get_dosatckthrsh() throws Exception {
		return this.dosatckthrsh;
	}

	/**
	* <pre>
	* .
	* </pre>
	*/
	public Long get_hits() throws Exception {
		return this.hits;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appqoeaction_response result = (appqoeaction_response) service.get_payload_formatter().string_to_resource(appqoeaction_response.class, response);
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
		return result.appqoeaction;
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
	* Use this API to add appqoeaction.
	*/
	public static base_response add(nitro_service client, appqoeaction resource) throws Exception {
		appqoeaction addresource = new appqoeaction();
		addresource.name = resource.name;
		addresource.priority = resource.priority;
		addresource.responsewith = resource.responsewith;
		addresource.altcontentsvcname = resource.altcontentsvcname;
		addresource.altcontentpath = resource.altcontentpath;
		addresource.polqdepth = resource.polqdepth;
		addresource.priqdepth = resource.priqdepth;
		addresource.maxconn = resource.maxconn;
		addresource.delay = resource.delay;
		addresource.clientdetectrate = resource.clientdetectrate;
		addresource.dosatckthrsh = resource.dosatckthrsh;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add appqoeaction resources.
	*/
	public static base_responses add(nitro_service client, appqoeaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appqoeaction addresources[] = new appqoeaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new appqoeaction();
				addresources[i].name = resources[i].name;
				addresources[i].priority = resources[i].priority;
				addresources[i].responsewith = resources[i].responsewith;
				addresources[i].altcontentsvcname = resources[i].altcontentsvcname;
				addresources[i].altcontentpath = resources[i].altcontentpath;
				addresources[i].polqdepth = resources[i].polqdepth;
				addresources[i].priqdepth = resources[i].priqdepth;
				addresources[i].maxconn = resources[i].maxconn;
				addresources[i].delay = resources[i].delay;
				addresources[i].clientdetectrate = resources[i].clientdetectrate;
				addresources[i].dosatckthrsh = resources[i].dosatckthrsh;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete appqoeaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		appqoeaction deleteresource = new appqoeaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appqoeaction.
	*/
	public static base_response delete(nitro_service client, appqoeaction resource) throws Exception {
		appqoeaction deleteresource = new appqoeaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete appqoeaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			appqoeaction deleteresources[] = new appqoeaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new appqoeaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete appqoeaction resources.
	*/
	public static base_responses delete(nitro_service client, appqoeaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appqoeaction deleteresources[] = new appqoeaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new appqoeaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update appqoeaction.
	*/
	public static base_response update(nitro_service client, appqoeaction resource) throws Exception {
		appqoeaction updateresource = new appqoeaction();
		updateresource.name = resource.name;
		updateresource.priority = resource.priority;
		updateresource.altcontentsvcname = resource.altcontentsvcname;
		updateresource.altcontentpath = resource.altcontentpath;
		updateresource.polqdepth = resource.polqdepth;
		updateresource.priqdepth = resource.priqdepth;
		updateresource.maxconn = resource.maxconn;
		updateresource.delay = resource.delay;
		updateresource.clientdetectrate = resource.clientdetectrate;
		updateresource.dosatckthrsh = resource.dosatckthrsh;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update appqoeaction resources.
	*/
	public static base_responses update(nitro_service client, appqoeaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appqoeaction updateresources[] = new appqoeaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new appqoeaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].priority = resources[i].priority;
				updateresources[i].altcontentsvcname = resources[i].altcontentsvcname;
				updateresources[i].altcontentpath = resources[i].altcontentpath;
				updateresources[i].polqdepth = resources[i].polqdepth;
				updateresources[i].priqdepth = resources[i].priqdepth;
				updateresources[i].maxconn = resources[i].maxconn;
				updateresources[i].delay = resources[i].delay;
				updateresources[i].clientdetectrate = resources[i].clientdetectrate;
				updateresources[i].dosatckthrsh = resources[i].dosatckthrsh;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of appqoeaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, appqoeaction resource, String[] args) throws Exception{
		appqoeaction unsetresource = new appqoeaction();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of appqoeaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			appqoeaction unsetresources[] = new appqoeaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new appqoeaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of appqoeaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, appqoeaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			appqoeaction unsetresources[] = new appqoeaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new appqoeaction();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the appqoeaction resources that are configured on netscaler.
	*/
	public static appqoeaction[] get(nitro_service service) throws Exception{
		appqoeaction obj = new appqoeaction();
		appqoeaction[] response = (appqoeaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the appqoeaction resources that are configured on netscaler.
	*/
	public static appqoeaction[] get(nitro_service service, options option) throws Exception{
		appqoeaction obj = new appqoeaction();
		appqoeaction[] response = (appqoeaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch appqoeaction resource of given name .
	*/
	public static appqoeaction get(nitro_service service, String name) throws Exception{
		appqoeaction obj = new appqoeaction();
		obj.set_name(name);
		appqoeaction response = (appqoeaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch appqoeaction resources of given names .
	*/
	public static appqoeaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			appqoeaction response[] = new appqoeaction[name.length];
			appqoeaction obj[] = new appqoeaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new appqoeaction();
				obj[i].set_name(name[i]);
				response[i] = (appqoeaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of appqoeaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static appqoeaction[] get_filtered(nitro_service service, String filter) throws Exception{
		appqoeaction obj = new appqoeaction();
		options option = new options();
		option.set_filter(filter);
		appqoeaction[] response = (appqoeaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of appqoeaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static appqoeaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appqoeaction obj = new appqoeaction();
		options option = new options();
		option.set_filter(filter);
		appqoeaction[] response = (appqoeaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the appqoeaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		appqoeaction obj = new appqoeaction();
		options option = new options();
		option.set_count(true);
		appqoeaction[] response = (appqoeaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of appqoeaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		appqoeaction obj = new appqoeaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appqoeaction[] response = (appqoeaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of appqoeaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		appqoeaction obj = new appqoeaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		appqoeaction[] response = (appqoeaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class priorityEnum {
		public static final String HIGH = "HIGH";
		public static final String MEDIUM = "MEDIUM";
		public static final String LOW = "LOW";
		public static final String LOWEST = "LOWEST";
	}
	public static class responsewithEnum {
		public static final String ACS = "ACS";
		public static final String NS = "NS";
		public static final String DOS = "DOS";
		public static final String NOACTION = "NOACTION";
		public static final String CUSTOM = "CUSTOM";
	}
}
