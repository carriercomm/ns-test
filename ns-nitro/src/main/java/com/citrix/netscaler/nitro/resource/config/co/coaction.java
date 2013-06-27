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

package com.citrix.netscaler.nitro.resource.config.co;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class coaction_response extends base_response
{
	public coaction[] coaction;
}
/**
* Configuration for content optimization action resource.
*/

public class coaction extends base_resource
{
	private String name;
	private Boolean pageextendcache;
	private Boolean imgshrinktoattrib;
	private Boolean imggiftopng;
	private Boolean imgadddimensions;
	private Boolean csstrimwhitespace;
	private Boolean cssrmcomments;
	private Boolean jstrimwhitespace;
	private Boolean jsrmcomments;
	private Boolean htmltrimwhitespace;
	private Boolean htmlrmcomments;
	private Boolean htmlrmdefaultattribs;
	private Boolean htmlrmattribquotes;
	private Boolean htmltrimurls;
	private Boolean imgweaken;
	private Boolean imginline;
	private Boolean imgshrinkformobile;
	private Boolean imglazyload;
	private Boolean jpgrmmetadata;
	private Boolean jpgprogressive;
	private Boolean cssinline;
	private Boolean jsinline;
	private Boolean csscombine;
	private Boolean jscombine;
	private Boolean cssflattenimports;
	private Boolean cssmovetohead;
	private Boolean convertimporttolink;
	private Boolean jsmovetoend;
	private String domainsharding;
	private String[] dnsshards;

	//------- Read only Parameter ---------;

	private Long hits;
	private Long undefhits;
	private String[] builtin;
	private Long __count;

	/**
	* <pre>
	* The name of the content optimization action.<br> Minimum length =  1
	* </pre>
	*/
	public void set_name(String name) throws Exception{
		this.name = name;
	}

	/**
	* <pre>
	* The name of the content optimization action.<br> Minimum length =  1
	* </pre>
	*/
	public String get_name() throws Exception {
		return this.name;
	}

	/**
	* <pre>
	* Action for cache extension.
	* </pre>
	*/
	public void set_pageextendcache(boolean pageextendcache) throws Exception {
		this.pageextendcache = new Boolean(pageextendcache);
	}

	/**
	* <pre>
	* Action for cache extension.
	* </pre>
	*/
	public void set_pageextendcache(Boolean pageextendcache) throws Exception{
		this.pageextendcache = pageextendcache;
	}

	/**
	* <pre>
	* Action for cache extension.
	* </pre>
	*/
	public Boolean get_pageextendcache() throws Exception {
		return this.pageextendcache;
	}

	/**
	* <pre>
	* shrink image dimensions as per height width attributes.
	* </pre>
	*/
	public void set_imgshrinktoattrib(boolean imgshrinktoattrib) throws Exception {
		this.imgshrinktoattrib = new Boolean(imgshrinktoattrib);
	}

	/**
	* <pre>
	* shrink image dimensions as per height width attributes.
	* </pre>
	*/
	public void set_imgshrinktoattrib(Boolean imgshrinktoattrib) throws Exception{
		this.imgshrinktoattrib = imgshrinktoattrib;
	}

	/**
	* <pre>
	* shrink image dimensions as per height width attributes.
	* </pre>
	*/
	public Boolean get_imgshrinktoattrib() throws Exception {
		return this.imgshrinktoattrib;
	}

	/**
	* <pre>
	* convert gif to png.
	* </pre>
	*/
	public void set_imggiftopng(boolean imggiftopng) throws Exception {
		this.imggiftopng = new Boolean(imggiftopng);
	}

	/**
	* <pre>
	* convert gif to png.
	* </pre>
	*/
	public void set_imggiftopng(Boolean imggiftopng) throws Exception{
		this.imggiftopng = imggiftopng;
	}

	/**
	* <pre>
	* convert gif to png.
	* </pre>
	*/
	public Boolean get_imggiftopng() throws Exception {
		return this.imggiftopng;
	}

	/**
	* <pre>
	* dimensions.
	* </pre>
	*/
	public void set_imgadddimensions(boolean imgadddimensions) throws Exception {
		this.imgadddimensions = new Boolean(imgadddimensions);
	}

	/**
	* <pre>
	* dimensions.
	* </pre>
	*/
	public void set_imgadddimensions(Boolean imgadddimensions) throws Exception{
		this.imgadddimensions = imgadddimensions;
	}

	/**
	* <pre>
	* dimensions.
	* </pre>
	*/
	public Boolean get_imgadddimensions() throws Exception {
		return this.imgadddimensions;
	}

	/**
	* <pre>
	* remove whitespaces from css.
	* </pre>
	*/
	public void set_csstrimwhitespace(boolean csstrimwhitespace) throws Exception {
		this.csstrimwhitespace = new Boolean(csstrimwhitespace);
	}

	/**
	* <pre>
	* remove whitespaces from css.
	* </pre>
	*/
	public void set_csstrimwhitespace(Boolean csstrimwhitespace) throws Exception{
		this.csstrimwhitespace = csstrimwhitespace;
	}

	/**
	* <pre>
	* remove whitespaces from css.
	* </pre>
	*/
	public Boolean get_csstrimwhitespace() throws Exception {
		return this.csstrimwhitespace;
	}

	/**
	* <pre>
	* remove comments from css.
	* </pre>
	*/
	public void set_cssrmcomments(boolean cssrmcomments) throws Exception {
		this.cssrmcomments = new Boolean(cssrmcomments);
	}

	/**
	* <pre>
	* remove comments from css.
	* </pre>
	*/
	public void set_cssrmcomments(Boolean cssrmcomments) throws Exception{
		this.cssrmcomments = cssrmcomments;
	}

	/**
	* <pre>
	* remove comments from css.
	* </pre>
	*/
	public Boolean get_cssrmcomments() throws Exception {
		return this.cssrmcomments;
	}

	/**
	* <pre>
	* remove whitespaces from js.
	* </pre>
	*/
	public void set_jstrimwhitespace(boolean jstrimwhitespace) throws Exception {
		this.jstrimwhitespace = new Boolean(jstrimwhitespace);
	}

	/**
	* <pre>
	* remove whitespaces from js.
	* </pre>
	*/
	public void set_jstrimwhitespace(Boolean jstrimwhitespace) throws Exception{
		this.jstrimwhitespace = jstrimwhitespace;
	}

	/**
	* <pre>
	* remove whitespaces from js.
	* </pre>
	*/
	public Boolean get_jstrimwhitespace() throws Exception {
		return this.jstrimwhitespace;
	}

	/**
	* <pre>
	* remove comments from js.
	* </pre>
	*/
	public void set_jsrmcomments(boolean jsrmcomments) throws Exception {
		this.jsrmcomments = new Boolean(jsrmcomments);
	}

	/**
	* <pre>
	* remove comments from js.
	* </pre>
	*/
	public void set_jsrmcomments(Boolean jsrmcomments) throws Exception{
		this.jsrmcomments = jsrmcomments;
	}

	/**
	* <pre>
	* remove comments from js.
	* </pre>
	*/
	public Boolean get_jsrmcomments() throws Exception {
		return this.jsrmcomments;
	}

	/**
	* <pre>
	* remove whitespaces from html.
	* </pre>
	*/
	public void set_htmltrimwhitespace(boolean htmltrimwhitespace) throws Exception {
		this.htmltrimwhitespace = new Boolean(htmltrimwhitespace);
	}

	/**
	* <pre>
	* remove whitespaces from html.
	* </pre>
	*/
	public void set_htmltrimwhitespace(Boolean htmltrimwhitespace) throws Exception{
		this.htmltrimwhitespace = htmltrimwhitespace;
	}

	/**
	* <pre>
	* remove whitespaces from html.
	* </pre>
	*/
	public Boolean get_htmltrimwhitespace() throws Exception {
		return this.htmltrimwhitespace;
	}

	/**
	* <pre>
	* remove comments from html.
	* </pre>
	*/
	public void set_htmlrmcomments(boolean htmlrmcomments) throws Exception {
		this.htmlrmcomments = new Boolean(htmlrmcomments);
	}

	/**
	* <pre>
	* remove comments from html.
	* </pre>
	*/
	public void set_htmlrmcomments(Boolean htmlrmcomments) throws Exception{
		this.htmlrmcomments = htmlrmcomments;
	}

	/**
	* <pre>
	* remove comments from html.
	* </pre>
	*/
	public Boolean get_htmlrmcomments() throws Exception {
		return this.htmlrmcomments;
	}

	/**
	* <pre>
	* remove default redundant attributes from html.
	* </pre>
	*/
	public void set_htmlrmdefaultattribs(boolean htmlrmdefaultattribs) throws Exception {
		this.htmlrmdefaultattribs = new Boolean(htmlrmdefaultattribs);
	}

	/**
	* <pre>
	* remove default redundant attributes from html.
	* </pre>
	*/
	public void set_htmlrmdefaultattribs(Boolean htmlrmdefaultattribs) throws Exception{
		this.htmlrmdefaultattribs = htmlrmdefaultattribs;
	}

	/**
	* <pre>
	* remove default redundant attributes from html.
	* </pre>
	*/
	public Boolean get_htmlrmdefaultattribs() throws Exception {
		return this.htmlrmdefaultattribs;
	}

	/**
	* <pre>
	* remove unnecessary quotes in html attributes.
	* </pre>
	*/
	public void set_htmlrmattribquotes(boolean htmlrmattribquotes) throws Exception {
		this.htmlrmattribquotes = new Boolean(htmlrmattribquotes);
	}

	/**
	* <pre>
	* remove unnecessary quotes in html attributes.
	* </pre>
	*/
	public void set_htmlrmattribquotes(Boolean htmlrmattribquotes) throws Exception{
		this.htmlrmattribquotes = htmlrmattribquotes;
	}

	/**
	* <pre>
	* remove unnecessary quotes in html attributes.
	* </pre>
	*/
	public Boolean get_htmlrmattribquotes() throws Exception {
		return this.htmlrmattribquotes;
	}

	/**
	* <pre>
	* trim urls.
	* </pre>
	*/
	public void set_htmltrimurls(boolean htmltrimurls) throws Exception {
		this.htmltrimurls = new Boolean(htmltrimurls);
	}

	/**
	* <pre>
	* trim urls.
	* </pre>
	*/
	public void set_htmltrimurls(Boolean htmltrimurls) throws Exception{
		this.htmltrimurls = htmltrimurls;
	}

	/**
	* <pre>
	* trim urls.
	* </pre>
	*/
	public Boolean get_htmltrimurls() throws Exception {
		return this.htmltrimurls;
	}

	/**
	* <pre>
	* weaken image.
	* </pre>
	*/
	public void set_imgweaken(boolean imgweaken) throws Exception {
		this.imgweaken = new Boolean(imgweaken);
	}

	/**
	* <pre>
	* weaken image.
	* </pre>
	*/
	public void set_imgweaken(Boolean imgweaken) throws Exception{
		this.imgweaken = imgweaken;
	}

	/**
	* <pre>
	* weaken image.
	* </pre>
	*/
	public Boolean get_imgweaken() throws Exception {
		return this.imgweaken;
	}

	/**
	* <pre>
	* inlining small images.
	* </pre>
	*/
	public void set_imginline(boolean imginline) throws Exception {
		this.imginline = new Boolean(imginline);
	}

	/**
	* <pre>
	* inlining small images.
	* </pre>
	*/
	public void set_imginline(Boolean imginline) throws Exception{
		this.imginline = imginline;
	}

	/**
	* <pre>
	* inlining small images.
	* </pre>
	*/
	public Boolean get_imginline() throws Exception {
		return this.imginline;
	}

	/**
	* <pre>
	* shrink image dimensions for mobile clients.
	* </pre>
	*/
	public void set_imgshrinkformobile(boolean imgshrinkformobile) throws Exception {
		this.imgshrinkformobile = new Boolean(imgshrinkformobile);
	}

	/**
	* <pre>
	* shrink image dimensions for mobile clients.
	* </pre>
	*/
	public void set_imgshrinkformobile(Boolean imgshrinkformobile) throws Exception{
		this.imgshrinkformobile = imgshrinkformobile;
	}

	/**
	* <pre>
	* shrink image dimensions for mobile clients.
	* </pre>
	*/
	public Boolean get_imgshrinkformobile() throws Exception {
		return this.imgshrinkformobile;
	}

	/**
	* <pre>
	* load image on request.
	* </pre>
	*/
	public void set_imglazyload(boolean imglazyload) throws Exception {
		this.imglazyload = new Boolean(imglazyload);
	}

	/**
	* <pre>
	* load image on request.
	* </pre>
	*/
	public void set_imglazyload(Boolean imglazyload) throws Exception{
		this.imglazyload = imglazyload;
	}

	/**
	* <pre>
	* load image on request.
	* </pre>
	*/
	public Boolean get_imglazyload() throws Exception {
		return this.imglazyload;
	}

	/**
	* <pre>
	* remove extra markers from jpeg image such as comments.
	* </pre>
	*/
	public void set_jpgrmmetadata(boolean jpgrmmetadata) throws Exception {
		this.jpgrmmetadata = new Boolean(jpgrmmetadata);
	}

	/**
	* <pre>
	* remove extra markers from jpeg image such as comments.
	* </pre>
	*/
	public void set_jpgrmmetadata(Boolean jpgrmmetadata) throws Exception{
		this.jpgrmmetadata = jpgrmmetadata;
	}

	/**
	* <pre>
	* remove extra markers from jpeg image such as comments.
	* </pre>
	*/
	public Boolean get_jpgrmmetadata() throws Exception {
		return this.jpgrmmetadata;
	}

	/**
	* <pre>
	* convert jpeg images to progressive.
	* </pre>
	*/
	public void set_jpgprogressive(boolean jpgprogressive) throws Exception {
		this.jpgprogressive = new Boolean(jpgprogressive);
	}

	/**
	* <pre>
	* convert jpeg images to progressive.
	* </pre>
	*/
	public void set_jpgprogressive(Boolean jpgprogressive) throws Exception{
		this.jpgprogressive = jpgprogressive;
	}

	/**
	* <pre>
	* convert jpeg images to progressive.
	* </pre>
	*/
	public Boolean get_jpgprogressive() throws Exception {
		return this.jpgprogressive;
	}

	/**
	* <pre>
	* inline css.
	* </pre>
	*/
	public void set_cssinline(boolean cssinline) throws Exception {
		this.cssinline = new Boolean(cssinline);
	}

	/**
	* <pre>
	* inline css.
	* </pre>
	*/
	public void set_cssinline(Boolean cssinline) throws Exception{
		this.cssinline = cssinline;
	}

	/**
	* <pre>
	* inline css.
	* </pre>
	*/
	public Boolean get_cssinline() throws Exception {
		return this.cssinline;
	}

	/**
	* <pre>
	* inline js.
	* </pre>
	*/
	public void set_jsinline(boolean jsinline) throws Exception {
		this.jsinline = new Boolean(jsinline);
	}

	/**
	* <pre>
	* inline js.
	* </pre>
	*/
	public void set_jsinline(Boolean jsinline) throws Exception{
		this.jsinline = jsinline;
	}

	/**
	* <pre>
	* inline js.
	* </pre>
	*/
	public Boolean get_jsinline() throws Exception {
		return this.jsinline;
	}

	/**
	* <pre>
	* combine many css files into one.
	* </pre>
	*/
	public void set_csscombine(boolean csscombine) throws Exception {
		this.csscombine = new Boolean(csscombine);
	}

	/**
	* <pre>
	* combine many css files into one.
	* </pre>
	*/
	public void set_csscombine(Boolean csscombine) throws Exception{
		this.csscombine = csscombine;
	}

	/**
	* <pre>
	* combine many css files into one.
	* </pre>
	*/
	public Boolean get_csscombine() throws Exception {
		return this.csscombine;
	}

	/**
	* <pre>
	* combine many javascript files into one.
	* </pre>
	*/
	public void set_jscombine(boolean jscombine) throws Exception {
		this.jscombine = new Boolean(jscombine);
	}

	/**
	* <pre>
	* combine many javascript files into one.
	* </pre>
	*/
	public void set_jscombine(Boolean jscombine) throws Exception{
		this.jscombine = jscombine;
	}

	/**
	* <pre>
	* combine many javascript files into one.
	* </pre>
	*/
	public Boolean get_jscombine() throws Exception {
		return this.jscombine;
	}

	/**
	* <pre>
	* css flatten imports.
	* </pre>
	*/
	public void set_cssflattenimports(boolean cssflattenimports) throws Exception {
		this.cssflattenimports = new Boolean(cssflattenimports);
	}

	/**
	* <pre>
	* css flatten imports.
	* </pre>
	*/
	public void set_cssflattenimports(Boolean cssflattenimports) throws Exception{
		this.cssflattenimports = cssflattenimports;
	}

	/**
	* <pre>
	* css flatten imports.
	* </pre>
	*/
	public Boolean get_cssflattenimports() throws Exception {
		return this.cssflattenimports;
	}

	/**
	* <pre>
	* move css to head.
	* </pre>
	*/
	public void set_cssmovetohead(boolean cssmovetohead) throws Exception {
		this.cssmovetohead = new Boolean(cssmovetohead);
	}

	/**
	* <pre>
	* move css to head.
	* </pre>
	*/
	public void set_cssmovetohead(Boolean cssmovetohead) throws Exception{
		this.cssmovetohead = cssmovetohead;
	}

	/**
	* <pre>
	* move css to head.
	* </pre>
	*/
	public Boolean get_cssmovetohead() throws Exception {
		return this.cssmovetohead;
	}

	/**
	* <pre>
	* convert @import to link.
	* </pre>
	*/
	public void set_convertimporttolink(boolean convertimporttolink) throws Exception {
		this.convertimporttolink = new Boolean(convertimporttolink);
	}

	/**
	* <pre>
	* convert @import to link.
	* </pre>
	*/
	public void set_convertimporttolink(Boolean convertimporttolink) throws Exception{
		this.convertimporttolink = convertimporttolink;
	}

	/**
	* <pre>
	* convert @import to link.
	* </pre>
	*/
	public Boolean get_convertimporttolink() throws Exception {
		return this.convertimporttolink;
	}

	/**
	* <pre>
	* move js to end of body.
	* </pre>
	*/
	public void set_jsmovetoend(boolean jsmovetoend) throws Exception {
		this.jsmovetoend = new Boolean(jsmovetoend);
	}

	/**
	* <pre>
	* move js to end of body.
	* </pre>
	*/
	public void set_jsmovetoend(Boolean jsmovetoend) throws Exception{
		this.jsmovetoend = jsmovetoend;
	}

	/**
	* <pre>
	* move js to end of body.
	* </pre>
	*/
	public Boolean get_jsmovetoend() throws Exception {
		return this.jsmovetoend;
	}

	/**
	* <pre>
	* Domain name in url links that needs to be rewritten with the shards/dns aliases given.
	* </pre>
	*/
	public void set_domainsharding(String domainsharding) throws Exception{
		this.domainsharding = domainsharding;
	}

	/**
	* <pre>
	* Domain name in url links that needs to be rewritten with the shards/dns aliases given.
	* </pre>
	*/
	public String get_domainsharding() throws Exception {
		return this.domainsharding;
	}

	/**
	* <pre>
	* Set of domain names that replaces the parent domain.
	* </pre>
	*/
	public void set_dnsshards(String[] dnsshards) throws Exception{
		this.dnsshards = dnsshards;
	}

	/**
	* <pre>
	* Set of domain names that replaces the parent domain.
	* </pre>
	*/
	public String[] get_dnsshards() throws Exception {
		return this.dnsshards;
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
	* The number of times the action resulted in UNDEF.
	* </pre>
	*/
	public Long get_undefhits() throws Exception {
		return this.undefhits;
	}

	/**
	* <pre>
	* Flag to determine if co action is builtin or not.<br> Possible values = MODIFIABLE, DELETABLE, IMMUTABLE
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
		coaction_response result = (coaction_response) service.get_payload_formatter().string_to_resource(coaction_response.class, response);
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
		return result.coaction;
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
	* Use this API to add coaction.
	*/
	public static base_response add(nitro_service client, coaction resource) throws Exception {
		coaction addresource = new coaction();
		addresource.name = resource.name;
		addresource.pageextendcache = resource.pageextendcache;
		addresource.imgshrinktoattrib = resource.imgshrinktoattrib;
		addresource.imggiftopng = resource.imggiftopng;
		addresource.imgadddimensions = resource.imgadddimensions;
		addresource.csstrimwhitespace = resource.csstrimwhitespace;
		addresource.cssrmcomments = resource.cssrmcomments;
		addresource.jstrimwhitespace = resource.jstrimwhitespace;
		addresource.jsrmcomments = resource.jsrmcomments;
		addresource.htmltrimwhitespace = resource.htmltrimwhitespace;
		addresource.htmlrmcomments = resource.htmlrmcomments;
		addresource.htmlrmdefaultattribs = resource.htmlrmdefaultattribs;
		addresource.htmlrmattribquotes = resource.htmlrmattribquotes;
		addresource.htmltrimurls = resource.htmltrimurls;
		addresource.imgweaken = resource.imgweaken;
		addresource.imginline = resource.imginline;
		addresource.imgshrinkformobile = resource.imgshrinkformobile;
		addresource.imglazyload = resource.imglazyload;
		addresource.jpgrmmetadata = resource.jpgrmmetadata;
		addresource.jpgprogressive = resource.jpgprogressive;
		addresource.cssinline = resource.cssinline;
		addresource.jsinline = resource.jsinline;
		addresource.csscombine = resource.csscombine;
		addresource.jscombine = resource.jscombine;
		addresource.cssflattenimports = resource.cssflattenimports;
		addresource.cssmovetohead = resource.cssmovetohead;
		addresource.convertimporttolink = resource.convertimporttolink;
		addresource.jsmovetoend = resource.jsmovetoend;
		addresource.domainsharding = resource.domainsharding;
		addresource.dnsshards = resource.dnsshards;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add coaction resources.
	*/
	public static base_responses add(nitro_service client, coaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			coaction addresources[] = new coaction[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new coaction();
				addresources[i].name = resources[i].name;
				addresources[i].pageextendcache = resources[i].pageextendcache;
				addresources[i].imgshrinktoattrib = resources[i].imgshrinktoattrib;
				addresources[i].imggiftopng = resources[i].imggiftopng;
				addresources[i].imgadddimensions = resources[i].imgadddimensions;
				addresources[i].csstrimwhitespace = resources[i].csstrimwhitespace;
				addresources[i].cssrmcomments = resources[i].cssrmcomments;
				addresources[i].jstrimwhitespace = resources[i].jstrimwhitespace;
				addresources[i].jsrmcomments = resources[i].jsrmcomments;
				addresources[i].htmltrimwhitespace = resources[i].htmltrimwhitespace;
				addresources[i].htmlrmcomments = resources[i].htmlrmcomments;
				addresources[i].htmlrmdefaultattribs = resources[i].htmlrmdefaultattribs;
				addresources[i].htmlrmattribquotes = resources[i].htmlrmattribquotes;
				addresources[i].htmltrimurls = resources[i].htmltrimurls;
				addresources[i].imgweaken = resources[i].imgweaken;
				addresources[i].imginline = resources[i].imginline;
				addresources[i].imgshrinkformobile = resources[i].imgshrinkformobile;
				addresources[i].imglazyload = resources[i].imglazyload;
				addresources[i].jpgrmmetadata = resources[i].jpgrmmetadata;
				addresources[i].jpgprogressive = resources[i].jpgprogressive;
				addresources[i].cssinline = resources[i].cssinline;
				addresources[i].jsinline = resources[i].jsinline;
				addresources[i].csscombine = resources[i].csscombine;
				addresources[i].jscombine = resources[i].jscombine;
				addresources[i].cssflattenimports = resources[i].cssflattenimports;
				addresources[i].cssmovetohead = resources[i].cssmovetohead;
				addresources[i].convertimporttolink = resources[i].convertimporttolink;
				addresources[i].jsmovetoend = resources[i].jsmovetoend;
				addresources[i].domainsharding = resources[i].domainsharding;
				addresources[i].dnsshards = resources[i].dnsshards;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to update coaction.
	*/
	public static base_response update(nitro_service client, coaction resource) throws Exception {
		coaction updateresource = new coaction();
		updateresource.name = resource.name;
		updateresource.pageextendcache = resource.pageextendcache;
		updateresource.imgshrinktoattrib = resource.imgshrinktoattrib;
		updateresource.imggiftopng = resource.imggiftopng;
		updateresource.imgadddimensions = resource.imgadddimensions;
		updateresource.csstrimwhitespace = resource.csstrimwhitespace;
		updateresource.cssrmcomments = resource.cssrmcomments;
		updateresource.jstrimwhitespace = resource.jstrimwhitespace;
		updateresource.jsrmcomments = resource.jsrmcomments;
		updateresource.htmltrimwhitespace = resource.htmltrimwhitespace;
		updateresource.htmlrmcomments = resource.htmlrmcomments;
		updateresource.htmlrmdefaultattribs = resource.htmlrmdefaultattribs;
		updateresource.htmlrmattribquotes = resource.htmlrmattribquotes;
		updateresource.htmltrimurls = resource.htmltrimurls;
		updateresource.imgweaken = resource.imgweaken;
		updateresource.imginline = resource.imginline;
		updateresource.imgshrinkformobile = resource.imgshrinkformobile;
		updateresource.imglazyload = resource.imglazyload;
		updateresource.jpgrmmetadata = resource.jpgrmmetadata;
		updateresource.jpgprogressive = resource.jpgprogressive;
		updateresource.cssinline = resource.cssinline;
		updateresource.jsinline = resource.jsinline;
		updateresource.csscombine = resource.csscombine;
		updateresource.jscombine = resource.jscombine;
		updateresource.cssflattenimports = resource.cssflattenimports;
		updateresource.cssmovetohead = resource.cssmovetohead;
		updateresource.convertimporttolink = resource.convertimporttolink;
		updateresource.jsmovetoend = resource.jsmovetoend;
		updateresource.domainsharding = resource.domainsharding;
		updateresource.dnsshards = resource.dnsshards;
		return updateresource.update_resource(client);
	}

	/**
	* Use this API to update coaction resources.
	*/
	public static base_responses update(nitro_service client, coaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			coaction updateresources[] = new coaction[resources.length];
			for (int i=0;i<resources.length;i++){
				updateresources[i] = new coaction();
				updateresources[i].name = resources[i].name;
				updateresources[i].pageextendcache = resources[i].pageextendcache;
				updateresources[i].imgshrinktoattrib = resources[i].imgshrinktoattrib;
				updateresources[i].imggiftopng = resources[i].imggiftopng;
				updateresources[i].imgadddimensions = resources[i].imgadddimensions;
				updateresources[i].csstrimwhitespace = resources[i].csstrimwhitespace;
				updateresources[i].cssrmcomments = resources[i].cssrmcomments;
				updateresources[i].jstrimwhitespace = resources[i].jstrimwhitespace;
				updateresources[i].jsrmcomments = resources[i].jsrmcomments;
				updateresources[i].htmltrimwhitespace = resources[i].htmltrimwhitespace;
				updateresources[i].htmlrmcomments = resources[i].htmlrmcomments;
				updateresources[i].htmlrmdefaultattribs = resources[i].htmlrmdefaultattribs;
				updateresources[i].htmlrmattribquotes = resources[i].htmlrmattribquotes;
				updateresources[i].htmltrimurls = resources[i].htmltrimurls;
				updateresources[i].imgweaken = resources[i].imgweaken;
				updateresources[i].imginline = resources[i].imginline;
				updateresources[i].imgshrinkformobile = resources[i].imgshrinkformobile;
				updateresources[i].imglazyload = resources[i].imglazyload;
				updateresources[i].jpgrmmetadata = resources[i].jpgrmmetadata;
				updateresources[i].jpgprogressive = resources[i].jpgprogressive;
				updateresources[i].cssinline = resources[i].cssinline;
				updateresources[i].jsinline = resources[i].jsinline;
				updateresources[i].csscombine = resources[i].csscombine;
				updateresources[i].jscombine = resources[i].jscombine;
				updateresources[i].cssflattenimports = resources[i].cssflattenimports;
				updateresources[i].cssmovetohead = resources[i].cssmovetohead;
				updateresources[i].convertimporttolink = resources[i].convertimporttolink;
				updateresources[i].jsmovetoend = resources[i].jsmovetoend;
				updateresources[i].domainsharding = resources[i].domainsharding;
				updateresources[i].dnsshards = resources[i].dnsshards;
			}
			result = update_bulk_request(client, updateresources);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of coaction resource.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_response unset(nitro_service client, coaction resource, String[] args) throws Exception{
		coaction unsetresource = new coaction();
		unsetresource.name = resource.name;
		return unsetresource.unset_resource(client,args);
	}

	/**
	* Use this API to unset the properties of coaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, String name[], String args[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			coaction unsetresources[] = new coaction[name.length];
			for (int i=0;i<name.length;i++){
				unsetresources[i] = new coaction();
				unsetresources[i].name = name[i];
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to unset the properties of coaction resources.
	* Properties that need to be unset are specified in args array.
	*/
	public static base_responses unset(nitro_service client, coaction resources[],  String[] args) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			coaction unsetresources[] = new coaction[resources.length];
			for (int i=0;i<resources.length;i++){
				unsetresources[i] = new coaction();
				unsetresources[i].name = resources[i].name;
			}
			result = unset_bulk_request(client, unsetresources,args);
		}
		return result;
	}

	/**
	* Use this API to delete coaction of given name.
	*/
	public static base_response delete(nitro_service client, String name) throws Exception {
		coaction deleteresource = new coaction();
		deleteresource.name = name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete coaction.
	*/
	public static base_response delete(nitro_service client, coaction resource) throws Exception {
		coaction deleteresource = new coaction();
		deleteresource.name = resource.name;
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete coaction resources of given names.
	*/
	public static base_responses delete(nitro_service client, String name[]) throws Exception {
		base_responses result = null;
		if (name != null && name.length > 0) {
			coaction deleteresources[] = new coaction[name.length];
			for (int i=0;i<name.length;i++){
				deleteresources[i] = new coaction();
				deleteresources[i].name = name[i];
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to delete coaction resources.
	*/
	public static base_responses delete(nitro_service client, coaction resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			coaction deleteresources[] = new coaction[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new coaction();
				deleteresources[i].name = resources[i].name;
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the coaction resources that are configured on netscaler.
	*/
	public static coaction[] get(nitro_service service) throws Exception{
		coaction obj = new coaction();
		coaction[] response = (coaction[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the coaction resources that are configured on netscaler.
	*/
	public static coaction[] get(nitro_service service, options option) throws Exception{
		coaction obj = new coaction();
		coaction[] response = (coaction[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch coaction resource of given name .
	*/
	public static coaction get(nitro_service service, String name) throws Exception{
		coaction obj = new coaction();
		obj.set_name(name);
		coaction response = (coaction) obj.get_resource(service);
		return response;
	}

	/**
	* Use this API to fetch coaction resources of given names .
	*/
	public static coaction[] get(nitro_service service, String name[]) throws Exception{
		if (name !=null && name.length>0) {
			coaction response[] = new coaction[name.length];
			coaction obj[] = new coaction[name.length];
			for (int i=0;i<name.length;i++) {
				obj[i] = new coaction();
				obj[i].set_name(name[i]);
				response[i] = (coaction) obj[i].get_resource(service);
			}
			return response;
		}
		return null;
	}
	/**
	* Use this API to fetch filtered set of coaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static coaction[] get_filtered(nitro_service service, String filter) throws Exception{
		coaction obj = new coaction();
		options option = new options();
		option.set_filter(filter);
		coaction[] response = (coaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of coaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static coaction[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		coaction obj = new coaction();
		options option = new options();
		option.set_filter(filter);
		coaction[] response = (coaction[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the coaction resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		coaction obj = new coaction();
		options option = new options();
		option.set_count(true);
		coaction[] response = (coaction[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of coaction resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		coaction obj = new coaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		coaction[] response = (coaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of coaction resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		coaction obj = new coaction();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		coaction[] response = (coaction[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class builtinEnum {
		public static final String MODIFIABLE = "MODIFIABLE";
		public static final String DELETABLE = "DELETABLE";
		public static final String IMMUTABLE = "IMMUTABLE";
	}
}
