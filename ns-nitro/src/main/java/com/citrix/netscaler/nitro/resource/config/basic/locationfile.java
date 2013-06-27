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

package com.citrix.netscaler.nitro.resource.config.basic;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class locationfile_response extends base_response
{
	public locationfile[] locationfile;
}
/**
* Configuration for location file resource.
*/

public class locationfile extends base_resource
{
	private String Locationfile;
	private String format;
	private Long __count;

	/**
	* <pre>
	* Name of the location file, with or without absolute path. If the path is not included, the default path (/var/netscaler/locdb) is assumed. In a high availability setup, the static database must be stored in the same location on both NetScaler appliances.<br> Minimum length =  1
	* </pre>
	*/
	public void set_Locationfile(String Locationfile) throws Exception{
		this.Locationfile = Locationfile;
	}

	/**
	* <pre>
	* Name of the location file, with or without absolute path. If the path is not included, the default path (/var/netscaler/locdb) is assumed. In a high availability setup, the static database must be stored in the same location on both NetScaler appliances.<br> Minimum length =  1
	* </pre>
	*/
	public String get_Locationfile() throws Exception {
		return this.Locationfile;
	}

	/**
	* <pre>
	* Format of the location file. Required for the NetScaler appliance to identify how to read the location file.<br> Default value: netscaler<br> Possible values = netscaler, ip-country, ip-country-isp, ip-country-region-city, ip-country-region-city-isp, geoip-country, geoip-region, geoip-city, geoip-country-org, geoip-country-isp, geoip-city-isp-org
	* </pre>
	*/
	public void set_format(String format) throws Exception{
		this.format = format;
	}

	/**
	* <pre>
	* Format of the location file. Required for the NetScaler appliance to identify how to read the location file.<br> Default value: netscaler<br> Possible values = netscaler, ip-country, ip-country-isp, ip-country-region-city, ip-country-region-city-isp, geoip-country, geoip-region, geoip-city, geoip-country-org, geoip-country-isp, geoip-city-isp-org
	* </pre>
	*/
	public String get_format() throws Exception {
		return this.format;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		locationfile_response result = (locationfile_response) service.get_payload_formatter().string_to_resource(locationfile_response.class, response);
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
		return result.locationfile;
	}

	/**
	* <pre>
	* Returns the value of object identifier argument
	* </pre>
	*/

	protected String get_object_name() {
		return null;
	}

	/**
	* Use this API to add locationfile.
	*/
	public static base_response add(nitro_service client, locationfile resource) throws Exception {
		locationfile addresource = new locationfile();
		addresource.Locationfile = resource.Locationfile;
		addresource.format = resource.format;
		return addresource.add_resource(client);
	}

	/**
	* Use this API to add locationfile resources.
	*/
	public static base_responses add(nitro_service client, locationfile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			locationfile addresources[] = new locationfile[resources.length];
			for (int i=0;i<resources.length;i++){
				addresources[i] = new locationfile();
				addresources[i].Locationfile = resources[i].Locationfile;
				addresources[i].format = resources[i].format;
			}
			result = add_bulk_request(client, addresources);
		}
		return result;
	}

	/**
	* Use this API to delete locationfile.
	*/
	public static base_response delete(nitro_service client) throws Exception {
		locationfile deleteresource = new locationfile();
		return deleteresource.delete_resource(client);
	}

	/**
	* Use this API to delete locationfile resources.
	*/
	public static base_responses delete(nitro_service client, locationfile resources[]) throws Exception {
		base_responses result = null;
		if (resources != null && resources.length > 0) {
			locationfile deleteresources[] = new locationfile[resources.length];
			for (int i=0;i<resources.length;i++){
				deleteresources[i] = new locationfile();
			}
			result = delete_bulk_request(client, deleteresources);
		}
		return result;
	}

	/**
	* Use this API to fetch all the locationfile resources that are configured on netscaler.
	*/
	public static locationfile[] get(nitro_service service) throws Exception{
		locationfile obj = new locationfile();
		locationfile[] response = (locationfile[])obj.get_resources(service);
		return response;
	}
	/**
	* Use this API to fetch all the locationfile resources that are configured on netscaler.
	*/
	public static locationfile[] get(nitro_service service, options option) throws Exception{
		locationfile obj = new locationfile();
		locationfile[] response = (locationfile[])obj.get_resources(service,option);
		return response;
	}
	/**
	* Use this API to fetch filtered set of locationfile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static locationfile[] get_filtered(nitro_service service, String filter) throws Exception{
		locationfile obj = new locationfile();
		options option = new options();
		option.set_filter(filter);
		locationfile[] response = (locationfile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to fetch filtered set of locationfile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static locationfile[] get_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		locationfile obj = new locationfile();
		options option = new options();
		option.set_filter(filter);
		locationfile[] response = (locationfile[]) obj.getfiltered(service, option);
		return response;
	}

	/**
	* Use this API to count the locationfile resources configured on NetScaler.
	*/
	public static long count(nitro_service service) throws Exception{
		locationfile obj = new locationfile();
		options option = new options();
		option.set_count(true);
		locationfile[] response = (locationfile[])obj.get_resources(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count filtered the set of locationfile resources.
	* filter string should be in JSON format.eg: "port:80,servicetype:HTTP".
	*/
	public static long count_filtered(nitro_service service, String filter) throws Exception{
		locationfile obj = new locationfile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		locationfile[] response = (locationfile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	/**
	* Use this API to count the filtered set of locationfile resources.
	* set the filter parameter values in filtervalue object.
	*/
	public static long count_filtered(nitro_service service, filtervalue[] filter) throws Exception{
		locationfile obj = new locationfile();
		options option = new options();
		option.set_count(true);
		option.set_filter(filter);
		locationfile[] response = (locationfile[]) obj.getfiltered(service, option);
		if (response != null) {
			return response[0].__count;
		}
		return 0;
	}

	public static class formatEnum {
		public static final String netscaler = "netscaler";
		public static final String ip_country = "ip-country";
		public static final String ip_country_isp = "ip-country-isp";
		public static final String ip_country_region_city = "ip-country-region-city";
		public static final String ip_country_region_city_isp = "ip-country-region-city-isp";
		public static final String geoip_country = "geoip-country";
		public static final String geoip_region = "geoip-region";
		public static final String geoip_city = "geoip-city";
		public static final String geoip_country_org = "geoip-country-org";
		public static final String geoip_country_isp = "geoip-country-isp";
		public static final String geoip_city_isp_org = "geoip-city-isp-org";
	}
}
