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

package com.citrix.netscaler.nitro.resource.config.ns;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class nshttpprofile_response extends base_response
{
	public nshttpprofile[] nshttpprofile;
}
/**
* Configuration for HTTP profile resource.
*/

public class nshttpprofile extends base_resource
{
	private String name;
	private String dropinvalreqs;
	private String markhttp09inval;
	private String markconnreqinval;
	private String cmponpush;
	private String conmultiplex;
	private Long maxreusepool;
	private String dropextracrlf;
	private Long incomphdrdelay;
	private String websocket;
	private Long reqtimeout;
	private String adpttimeout;
	private String reqtimeoutaction;
	private String dropextradata;
	private String weblog;
	private String clientiphdrexpr;
	private Long maxreq;
	private String persistentetag;
	private String spdy;

	//------- Read only Parameter ---------;

	private Long refcnt;
	private Long __count;

	/**
	* <pre>
	* Name for an HTTP profile. Must begin with a letter, number, or the underscore \(_\) character. Other characters allowed, after the first character, are the hyphen \(-\), period \(.\), hash \(\#\), space \( \), at \(@\), and equal \(=\) characters. The name of a HTTP profile cannot be changed after it is created.

CLI Users: If the name includes one or more spaces, enclose the name in double or single quotation marks \(for example, "my http profile" or 'my http profile'\).<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* Name for an HTTP profile. Must begin with a letter, number, or the underscore \(_\) character. Other characters allowed, after the first character, are the hyphen \(-\), period \(.\), hash \(\#\), space \( \), at \(@\), and equal \(=\) characters. The name of a HTTP profile cannot be changed after it is created.

CLI Users: If the name includes one or more spaces, enclose the name in double or single quotation marks \(for example, "my http profile" or 'my http profile'\).<br> Minimum length =  1<br> Maximum length =  127
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Drop invalid HTTP requests or responses.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dropinvalreqs(String dropinvalreqs) throws Exception{
		this.dropinvalreqs = dropinvalreqs;
	}

	/**
	* <pre>
	* Drop invalid HTTP requests or responses.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dropinvalreqs() throws Exception {
		return this.dropinvalreqs;
	}

	/**
	* <pre>
	* Mark HTTP/0.9 requests as invalid.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_markhttp09inval(String markhttp09inval) throws Exception{
		this.markhttp09inval = markhttp09inval;
	}

	/**
	* <pre>
	* Mark HTTP/0.9 requests as invalid.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_markhttp09inval() throws Exception {
		return this.markhttp09inval;
	}

	/**
	* <pre>
	* Mark CONNECT requests as invalid.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_markconnreqinval(String markconnreqinval) throws Exception{
		this.markconnreqinval = markconnreqinval;
	}

	/**
	* <pre>
	* Mark CONNECT requests as invalid.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_markconnreqinval() throws Exception {
		return this.markconnreqinval;
	}

	/**
	* <pre>
	* Start data compression on receiving a TCP packet with PUSH flag set.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_cmponpush(String cmponpush) throws Exception{
		this.cmponpush = cmponpush;
	}

	/**
	* <pre>
	* Start data compression on receiving a TCP packet with PUSH flag set.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_cmponpush() throws Exception {
		return this.cmponpush;
	}

	/**
	* <pre>
	* Reuse server connections for requests from more than one client connections.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_conmultiplex(String conmultiplex) throws Exception{
		this.conmultiplex = conmultiplex;
	}

	/**
	* <pre>
	* Reuse server connections for requests from more than one client connections.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_conmultiplex() throws Exception {
		return this.conmultiplex;
	}

	/**
	* <pre>
	* Maximum limit on the number of connections, from the NetScaler to a particular server that are kept in the reuse pool. This setting is helpful for optimal memory utilization and for reducing the idle connections to the server just after the peak time.<br> Minimum value =  0<br> Maximum value =  360000
	* </pre>
	*/
	public void set_maxreusepool(long maxreusepool) throws Exception {
		this.maxreusepool = new Long(maxreusepool);
	}

	/**
	* <pre>
	* Maximum limit on the number of connections, from the NetScaler to a particular server that are kept in the reuse pool. This setting is helpful for optimal memory utilization and for reducing the idle connections to the server just after the peak time.<br> Minimum value =  0<br> Maximum value =  360000
	* </pre>
	*/
	public void set_maxreusepool(Long maxreusepool) throws Exception{
		this.maxreusepool = maxreusepool;
	}

	/**
	* <pre>
	* Maximum limit on the number of connections, from the NetScaler to a particular server that are kept in the reuse pool. This setting is helpful for optimal memory utilization and for reducing the idle connections to the server just after the peak time.<br> Minimum value =  0<br> Maximum value =  360000
	* </pre>
	*/
	public Long get_maxreusepool() throws Exception {
		return this.maxreusepool;
	}

	/**
	* <pre>
	* Drop any extra 'CR' and 'LF' characters present after the header.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dropextracrlf(String dropextracrlf) throws Exception{
		this.dropextracrlf = dropextracrlf;
	}

	/**
	* <pre>
	* Drop any extra 'CR' and 'LF' characters present after the header.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dropextracrlf() throws Exception {
		return this.dropextracrlf;
	}

	/**
	* <pre>
	* Maximum time to wait, in milliseconds, between incomplete header packets. If the header packets take longer to arrive at NetScaler, the connection is silently dropped.<br> Default value: 7000<br> Minimum value =  0<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public void set_incomphdrdelay(long incomphdrdelay) throws Exception {
		this.incomphdrdelay = new Long(incomphdrdelay);
	}

	/**
	* <pre>
	* Maximum time to wait, in milliseconds, between incomplete header packets. If the header packets take longer to arrive at NetScaler, the connection is silently dropped.<br> Default value: 7000<br> Minimum value =  0<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public void set_incomphdrdelay(Long incomphdrdelay) throws Exception{
		this.incomphdrdelay = incomphdrdelay;
	}

	/**
	* <pre>
	* Maximum time to wait, in milliseconds, between incomplete header packets. If the header packets take longer to arrive at NetScaler, the connection is silently dropped.<br> Default value: 7000<br> Minimum value =  0<br> Maximum value =  4294967294LU
	* </pre>
	*/
	public Long get_incomphdrdelay() throws Exception {
		return this.incomphdrdelay;
	}

	/**
	* <pre>
	* HTTP connection to be upgraded to a web socket connection. Once upgraded, NetScaler does not process Layer 7 traffic on this connection.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_websocket(String websocket) throws Exception{
		this.websocket = websocket;
	}

	/**
	* <pre>
	* HTTP connection to be upgraded to a web socket connection. Once upgraded, NetScaler does not process Layer 7 traffic on this connection.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_websocket() throws Exception {
		return this.websocket;
	}

	/**
	* <pre>
	* Time, in seconds, within which the HTTP request must complete. If the request does not complete within this time, the specified request timeout action is executed.<br> Minimum value =  0<br> Maximum value =  86400
	* </pre>
	*/
	public void set_reqtimeout(long reqtimeout) throws Exception {
		this.reqtimeout = new Long(reqtimeout);
	}

	/**
	* <pre>
	* Time, in seconds, within which the HTTP request must complete. If the request does not complete within this time, the specified request timeout action is executed.<br> Minimum value =  0<br> Maximum value =  86400
	* </pre>
	*/
	public void set_reqtimeout(Long reqtimeout) throws Exception{
		this.reqtimeout = reqtimeout;
	}

	/**
	* <pre>
	* Time, in seconds, within which the HTTP request must complete. If the request does not complete within this time, the specified request timeout action is executed.<br> Minimum value =  0<br> Maximum value =  86400
	* </pre>
	*/
	public Long get_reqtimeout() throws Exception {
		return this.reqtimeout;
	}

	/**
	* <pre>
	* Adapts the configured request timeout based on flow conditions. The timeout is increased or decreased internally and applied on the flow.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_adpttimeout(String adpttimeout) throws Exception{
		this.adpttimeout = adpttimeout;
	}

	/**
	* <pre>
	* Adapts the configured request timeout based on flow conditions. The timeout is increased or decreased internally and applied on the flow.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_adpttimeout() throws Exception {
		return this.adpttimeout;
	}

	/**
	* <pre>
	* Action to take when the HTTP request does not complete within the specified request timeout duration. You can configure the following actions:
* RESET - Send RST (reset) to client when timeout occurs.
* DROP - Drop silently when timeout occurs.
* Custom responder action - Name of the responder action to trigger when timeout occurs, used to send custom message.
	* </pre>
	*/
	public void set_reqtimeoutaction(String reqtimeoutaction) throws Exception{
		this.reqtimeoutaction = reqtimeoutaction;
	}

	/**
	* <pre>
	* Action to take when the HTTP request does not complete within the specified request timeout duration. You can configure the following actions:
* RESET - Send RST (reset) to client when timeout occurs.
* DROP - Drop silently when timeout occurs.
* Custom responder action - Name of the responder action to trigger when timeout occurs, used to send custom message.
	* </pre>
	*/
	public String get_reqtimeoutaction() throws Exception {
		return this.reqtimeoutaction;
	}

	/**
	* <pre>
	* Drop any extra data when server sends more data than the specified content-length.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_dropextradata(String dropextradata) throws Exception{
		this.dropextradata = dropextradata;
	}

	/**
	* <pre>
	* Drop any extra data when server sends more data than the specified content-length.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_dropextradata() throws Exception {
		return this.dropextradata;
	}

	/**
	* <pre>
	* Enable or disable web logging.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_weblog(String weblog) throws Exception{
		this.weblog = weblog;
	}

	/**
	* <pre>
	* Enable or disable web logging.<br> Default value: ENABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_weblog() throws Exception {
		return this.weblog;
	}

	/**
	* <pre>
	* Name of the header that contains the real client IP address.
	* </pre>
	*/
	public void set_clientiphdrexpr(String clientiphdrexpr) throws Exception{
		this.clientiphdrexpr = clientiphdrexpr;
	}

	/**
	* <pre>
	* Name of the header that contains the real client IP address.
	* </pre>
	*/
	public String get_clientiphdrexpr() throws Exception {
		return this.clientiphdrexpr;
	}

	/**
	* <pre>
	* Maximum requests allowed on a single connection.<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public void set_maxreq(long maxreq) throws Exception {
		this.maxreq = new Long(maxreq);
	}

	/**
	* <pre>
	* Maximum requests allowed on a single connection.<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public void set_maxreq(Long maxreq) throws Exception{
		this.maxreq = maxreq;
	}

	/**
	* <pre>
	* Maximum requests allowed on a single connection.<br> Minimum value =  0<br> Maximum value =  65534
	* </pre>
	*/
	public Long get_maxreq() throws Exception {
		return this.maxreq;
	}

	/**
	* <pre>
	* Generate the persistent NetScaler specific ETag for the HTTP response with ETag header.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_persistentetag(String persistentetag) throws Exception{
		this.persistentetag = persistentetag;
	}

	/**
	* <pre>
	* Generate the persistent NetScaler specific ETag for the HTTP response with ETag header.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_persistentetag() throws Exception {
		return this.persistentetag;
	}

	/**
	* <pre>
	* Allow SPDY over SSL vserver. SSL will advertise SPDY support during NPN Handshake.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public void set_spdy(String spdy) throws Exception{
		this.spdy = spdy;
	}

	/**
	* <pre>
	* Allow SPDY over SSL vserver. SSL will advertise SPDY support during NPN Handshake.<br> Default value: DISABLED<br> Possible values = ENABLED, DISABLED
	* </pre>
	*/
	public String get_spdy() throws Exception {
		return this.spdy;
	}

	/**
	* <pre>
	* Number of entities using this profile.
	* </pre>
	*/
	public Long get_refcnt() throws Exception {
		return this.refcnt;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		nshttpprofile_response result = (nshttpprofile_response) service.get_payload_formatter().string_to_resource(nshttpprofile_response.class, response);
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
		return result.nshttpprofile;
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
	* Use this API to add nshttpprofile.
	*/
	public static base_response add(nitro_service client, nshttpprofile resource) throws Exception {
		nshttpprofile addresource = new nshttpprofile();
		addresource.name = resource.name;
		addresource.dropinvalreqs = resource.dropinvalreqs;
		addresource.markhttp09inval = resource.markhttp09inval;
		addresource.markconnreqinval = resource.markconnreqinval;
		addresource.cmponpush = resource.cmponpush;
		addresource.conmultiplex = resource.conmultiplex;
		addresource.maxreusepool = resource.maxreusepool;
		addresource.dropextracrlf = resource.dropextracrlf;
		addresource.incomphdrdelay = resource.incomphdrdelay;
		addresource.websocket = resource.websocket;
		addresource.reqtimeout = resource.reqtimeout;
		addresource.adpttimeout = resource.adpttimeout;
		addresource.reqtimeoutaction = resource.reqtimeoutaction;
		addresource.dropextradata = resource.dropextradata;
		addresource.weblog = resource.weblog;
		addresource.clientiphdrexpr = resource.clientiphdrexpr;
		addresource.maxreq = resource.maxreq;
		addresource.persistentetag = resource.persistentetag;
		addresource.spdy = resource.spdy;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add nshttpprofile resources.
	*/
	public static base_responses add(nitro_service client, nshttpprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nshttpprofile addresources[] = new nshttpprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new nshttpprofile();
				addresources[i].name = resources[i].name;
				addresources[i].dropinvalreqs = resources[i].dropinvalreqs;
				addresources[i].markhttp09inval = resources[i].markhttp09inval;
				addresources[i].markconnreqinval = resources[i].markconnreqinval;
				addresources[i].cmponpush = resources[i].cmponpush;
				addresources[i].conmultiplex = resources[i].conmultiplex;
				addresources[i].maxreusepool = resources[i].maxreusepool;
				addresources[i].dropextracrlf = resources[i].dropextracrlf;
				addresources[i].incomphdrdelay = resources[i].incomphdrdelay;
				addresources[i].websocket = resources[i].websocket;
				addresources[i].reqtimeout = resources[i].reqtimeout;
				addresources[i].adpttimeout = resources[i].adpttimeout;
				addresources[i].reqtimeoutaction = resources[i].reqtimeoutaction;
				addresources[i].dropextradata = resources[i].dropextradata;
				addresources[i].weblog = resources[i].weblog;
				addresources[i].clientiphdrexpr = resources[i].clientiphdrexpr;
				addresources[i].maxreq = resources[i].maxreq;
				addresources[i].persistentetag = resources[i].persistentetag;
				addresources[i].spdy = resources[i].spdy;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete nshttpprofile of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		nshttpprofile deleteresource = new nshttpprofile();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nshttpprofile.
	*/
	public static base_response delete(nitro_service client, nshttpprofile resource) throws Exception {
		nshttpprofile deleteresource = new nshttpprofile();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete nshttpprofile resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nshttpprofile deleteresources[] = new nshttpprofile[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new nshttpprofile();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete nshttpprofile resources.
	*/
	public static base_responses delete(nitro_service client, nshttpprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nshttpprofile deleteresources[] = new nshttpprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new nshttpprofile();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to update nshttpprofile.
	*/
	public static base_response update(nitro_service client, nshttpprofile resource) throws Exception {
		nshttpprofile updateresource = new nshttpprofile();
		updateresource.name = resource.name;
		updateresource.dropinvalreqs = resource.dropinvalreqs;
		updateresource.markhttp09inval = resource.markhttp09inval;
		updateresource.markconnreqinval = resource.markconnreqinval;
		updateresource.cmponpush = resource.cmponpush;
		updateresource.conmultiplex = resource.conmultiplex;
		updateresource.maxreusepool = resource.maxreusepool;
		updateresource.dropextracrlf = resource.dropextracrlf;
		updateresource.incomphdrdelay = resource.incomphdrdelay;
		updateresource.websocket = resource.websocket;
		updateresource.reqtimeout = resource.reqtimeout;
		updateresource.adpttimeout = resource.adpttimeout;
		updateresource.reqtimeoutaction = resource.reqtimeoutaction;
		updateresource.dropextradata = resource.dropextradata;
		updateresource.weblog = resource.weblog;
		updateresource.clientiphdrexpr = resource.clientiphdrexpr;
		updateresource.maxreq = resource.maxreq;
		updateresource.persistentetag = resource.persistentetag;
		updateresource.spdy = resource.spdy;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update nshttpprofile resources.
	*/
	public static base_responses update(nitro_service client, nshttpprofile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nshttpprofile updateresources[] = new nshttpprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new nshttpprofile();
				updateresources[i].name = resources[i].name;
				updateresources[i].dropinvalreqs = resources[i].dropinvalreqs;
				updateresources[i].markhttp09inval = resources[i].markhttp09inval;
				updateresources[i].markconnreqinval = resources[i].markconnreqinval;
				updateresources[i].cmponpush = resources[i].cmponpush;
				updateresources[i].conmultiplex = resources[i].conmultiplex;
				updateresources[i].maxreusepool = resources[i].maxreusepool;
				updateresources[i].dropextracrlf = resources[i].dropextracrlf;
				updateresources[i].incomphdrdelay = resources[i].incomphdrdelay;
				updateresources[i].websocket = resources[i].websocket;
				updateresources[i].reqtimeout = resources[i].reqtimeout;
				updateresources[i].adpttimeout = resources[i].adpttimeout;
				updateresources[i].reqtimeoutaction = resources[i].reqtimeoutaction;
				updateresources[i].dropextradata = resources[i].dropextradata;
				updateresources[i].weblog = resources[i].weblog;
				updateresources[i].clientiphdrexpr = resources[i].clientiphdrexpr;
				updateresources[i].maxreq = resources[i].maxreq;
				updateresources[i].persistentetag = resources[i].persistentetag;
				updateresources[i].spdy = resources[i].spdy;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nshttpprofile resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, nshttpprofile resource, String[] args) throws Exception{
		nshttpprofile unsetresource = new nshttpprofile();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of nshttpprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			nshttpprofile unsetresources[] = new nshttpprofile[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new nshttpprofile();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of nshttpprofile resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, nshttpprofile resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			nshttpprofile unsetresources[] = new nshttpprofile[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new nshttpprofile();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to fetch all the nshttpprofile resources that are configured on netscaler.
	*/
	public static nshttpprofile[] get(nitro_service service) throws Exception{
		nshttpprofile obj = new nshttpprofile();
		nshttpprofile[] response = (nshttpprofile[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the nshttpprofile resources that are configured on netscaler.
	*/
	public static nshttpprofile[] get(nitro_service service, options option) throws Exception{
		nshttpprofile obj = new nshttpprofile();
		nshttpprofile[] response = (nshttpprofile[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch nshttpprofile resource of given name .
	*/
	public static nshttpprofile get(nitro_service service, String name) throws Exception{
		nshttpprofile obj = new nshttpprofile();
		obj.set_name(name);
		nshttpprofile response = (nshttpprofile) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch nshttpprofile resources of given names .
	*/
	public static nshttpprofile[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			nshttpprofile response[] = new nshttpprofile[name.length];
			nshttpprofile obj[] = new nshttpprofile[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new nshttpprofile();
				obj[i].set_name(name[i]);
				response[i] = (nshttpprofile) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of nshttpprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static nshttpprofile[] get_filtered(nitro_service service, String filter) throws Exception{
		nshttpprofile obj = new nshttpprofile();
		options option = new options();
		option.set_filter(filter);
		nshttpprofile[] response = (nshttpprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of nshttpprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static nshttpprofile[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nshttpprofile obj = new nshttpprofile();
		options option = new options();
		option.set_filter(filter);
		nshttpprofile[] response = (nshttpprofile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the nshttpprofile resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		nshttpprofile obj = new nshttpprofile();
		options option = new options();
		option.set_count(true);
		nshttpprofile[] response = (nshttpprofile[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of nshttpprofile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		nshttpprofile obj = new nshttpprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nshttpprofile[] response = (nshttpprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of nshttpprofile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		nshttpprofile obj = new nshttpprofile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		nshttpprofile[] response = (nshttpprofile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class conmultiplexEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class markhttp09invalEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class adpttimeoutEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class markconnreqinvalEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class spdyEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class persistentetagEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class dropinvalreqsEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class dropextracrlfEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class dropextradataEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class websocketEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class cmponpushEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
	public static class weblogEnum {
		public static final String ENABLED = "ENABLED";
		public static final String DISABLED = "DISABLED";
	}
}
