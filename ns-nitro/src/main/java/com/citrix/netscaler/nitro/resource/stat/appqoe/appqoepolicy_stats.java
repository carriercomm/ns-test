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

package com.citrix.netscaler.nitro.resource.stat.appqoe;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class appqoepolicy_response extends base_response
{
	public appqoepolicy_stats[] appqoepolicy;
}
/**
* Statistics for AppQoS policy resource.
*/

public class appqoepolicy_stats extends base_resource
{
	private String name;
	private String clearstats;
	private Long totsvrlinkedto;
	private Long svrlinkedtorate;
	private Long totcltlinkedto;
	private Long cltlinkedtorate;
	private Long totrequest;
	private Long requestrate;
	private Long totrequestbytes;
	private Long requestbytesrate;
	private Long totresponse;
	private Long responserate;
	private Long totresponsebytes;
	private Long responsebytesrate;
	private Long totjssent;
	private Long jssentrate;
	private Long totjsbytessent;
	private Long jsbytessentrate;
	private Long totjsrefused;
	private Long jsrefusedrate;
	private Long pipolicyhits;
	private Long pipolicyhitsrate;

	/**
	* <pre>
	* policyName
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* policyName.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Clear the statsistics / counters
	* </pre>
	*/
	public void set_clearstats(String clearstats) throws Exception{
		this.clearstats = clearstats;
	}

	/**
	* <pre>
	* Clear the statsistics / counters.<br> Possible values = basic, full
	* </pre>
	*/
	public String get_clearstats() throws Exception {
		return this.clearstats;
	}

	/**
	* <pre>
	* Rate (/s) counter for totrequest
	* </pre>
	*/
	public Long get_requestrate() throws Exception {
		return this.requestrate;
	}

	/**
	* <pre>
	* Total # of JavaScripts Sent
	* </pre>
	*/
	public Long get_totjssent() throws Exception {
		return this.totjssent;
	}

	/**
	* <pre>
	* Rate (/s) counter for totresponsebytes
	* </pre>
	*/
	public Long get_responsebytesrate() throws Exception {
		return this.responsebytesrate;
	}

	/**
	* <pre>
	* Total # of JavaScripts refused
	* </pre>
	*/
	public Long get_totjsrefused() throws Exception {
		return this.totjsrefused;
	}

	/**
	* <pre>
	* Rate (/s) counter for totrequestbytes
	* </pre>
	*/
	public Long get_requestbytesrate() throws Exception {
		return this.requestbytesrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totcltlinkedto
	* </pre>
	*/
	public Long get_cltlinkedtorate() throws Exception {
		return this.cltlinkedtorate;
	}

	/**
	* <pre>
	* Total # of JavaScripts Bytes Sent
	* </pre>
	*/
	public Long get_totjsbytessent() throws Exception {
		return this.totjsbytessent;
	}

	/**
	* <pre>
	* Rate (/s) counter for totsvrlinkedto
	* </pre>
	*/
	public Long get_svrlinkedtorate() throws Exception {
		return this.svrlinkedtorate;
	}

	/**
	* <pre>
	* Total number of servers this policy is linked to
	* </pre>
	*/
	public Long get_totsvrlinkedto() throws Exception {
		return this.totsvrlinkedto;
	}

	/**
	* <pre>
	* Total number of responses generated
	* </pre>
	*/
	public Long get_totresponse() throws Exception {
		return this.totresponse;
	}

	/**
	* <pre>
	* Total number of response bytes sent
	* </pre>
	*/
	public Long get_totresponsebytes() throws Exception {
		return this.totresponsebytes;
	}

	/**
	* <pre>
	* Rate (/s) counter for pipolicyhits
	* </pre>
	*/
	public Long get_pipolicyhitsrate() throws Exception {
		return this.pipolicyhitsrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totjssent
	* </pre>
	*/
	public Long get_jssentrate() throws Exception {
		return this.jssentrate;
	}

	/**
	* <pre>
	* Total number of clients this policy is hit
	* </pre>
	*/
	public Long get_totcltlinkedto() throws Exception {
		return this.totcltlinkedto;
	}

	/**
	* <pre>
	* Number of hits on the policy
	* </pre>
	*/
	public Long get_pipolicyhits() throws Exception {
		return this.pipolicyhits;
	}

	/**
	* <pre>
	* Rate (/s) counter for totjsbytessent
	* </pre>
	*/
	public Long get_jsbytessentrate() throws Exception {
		return this.jsbytessentrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totjsrefused
	* </pre>
	*/
	public Long get_jsrefusedrate() throws Exception {
		return this.jsrefusedrate;
	}

	/**
	* <pre>
	* Rate (/s) counter for totresponse
	* </pre>
	*/
	public Long get_responserate() throws Exception {
		return this.responserate;
	}

	/**
	* <pre>
	* Total # of requests
	* </pre>
	*/
	public Long get_totrequest() throws Exception {
		return this.totrequest;
	}

	/**
	* <pre>
	* Total # of requests bytes
	* </pre>
	*/
	public Long get_totrequestbytes() throws Exception {
		return this.totrequestbytes;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		appqoepolicy_response result = (appqoepolicy_response) service.get_payload_formatter().string_to_resource(appqoepolicy_response.class, response);
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
		return result.appqoepolicy;
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
	* Use this API to fetch the statistics of all appqoepolicy_stats resources that are configured on netscaler.
	*/
	public static appqoepolicy_stats[] get(nitro_service service) throws Exception{
		appqoepolicy_stats obj = new appqoepolicy_stats();
		appqoepolicy_stats[] response = (appqoepolicy_stats[])obj.stat_resources(service);
		return response;
	}

	/**
	* Use this API to fetch the statistics of all appqoepolicy_stats resources that are configured on netscaler.
	*/
	public static appqoepolicy_stats[] get(nitro_service service, options option) throws Exception{
		appqoepolicy_stats obj = new appqoepolicy_stats();
		appqoepolicy_stats[] response = (appqoepolicy_stats[])obj.stat_resources(service,option);
		return response;
	}

	/**
	* Use this API to fetch statistics of appqoepolicy_stats resource of given name .
	*/
	public static appqoepolicy_stats get(nitro_service service, String name) throws Exception{
		appqoepolicy_stats obj = new appqoepolicy_stats();
		obj.set_name(name);
		appqoepolicy_stats response = (appqoepolicy_stats) obj.stat_resource(service);
		return response;
	}

	public static class clearstatsEnum {
		public static final String basic = "basic";
		public static final String full = "full";
	}
}
