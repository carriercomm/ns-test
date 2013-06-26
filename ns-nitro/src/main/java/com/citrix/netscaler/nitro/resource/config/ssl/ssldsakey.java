/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.ssl;

import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class ssldsakey_response extends base_response
{
	public ssldsakey ssldsakey;
}
/**
* Configuration for dsa key resource.
*/

public class ssldsakey extends base_resource
{
	private String keyfile;
	private Long bits;
	private String keyform;
	private Boolean des;
	private Boolean des3;
	private String password;

	/**
	* <pre>
	* The name of the output file where the generated DSA key is stored. The default output path for the DH file is /nsconfig/ssl/.<br> Maximum length =  63
	* </pre>
	*/
	public void set_keyfile(String keyfile) throws Exception{
		this.keyfile = keyfile;
	}

	/**
	* <pre>
	* The name of the output file where the generated DSA key is stored. The default output path for the DH file is /nsconfig/ssl/.<br> Maximum length =  63
	* </pre>
	*/
	public String get_keyfile() throws Exception {
		return this.keyfile;
	}

	/**
	* <pre>
	* The bit value (key length) for the DSA key.<br> Minimum value =  512<br> Maximum value =  2048
	* </pre>
	*/
	public void set_bits(long bits) throws Exception {
		this.bits = new Long(bits);
	}

	/**
	* <pre>
	* The bit value (key length) for the DSA key.<br> Minimum value =  512<br> Maximum value =  2048
	* </pre>
	*/
	public void set_bits(Long bits) throws Exception{
		this.bits = bits;
	}

	/**
	* <pre>
	* The bit value (key length) for the DSA key.<br> Minimum value =  512<br> Maximum value =  2048
	* </pre>
	*/
	public Long get_bits() throws Exception {
		return this.bits;
	}

	/**
	* <pre>
	* The format of the key file:
	PEM: Privacy Enhanced Mail
	DER: Distinguished Encoding Rule.<br> Default value: FORMAT_PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public void set_keyform(String keyform) throws Exception{
		this.keyform = keyform;
	}

	/**
	* <pre>
	* The format of the key file:
	PEM: Privacy Enhanced Mail
	DER: Distinguished Encoding Rule.<br> Default value: FORMAT_PEM<br> Possible values = DER, PEM
	* </pre>
	*/
	public String get_keyform() throws Exception {
		return this.keyform;
	}

	/**
	* <pre>
	* Encrypt the generated DSA key using the DES algorithm. It prompts you to enter the pass-phrase (password) that is used to encrypt the key.
	* </pre>
	*/
	public void set_des(boolean des) throws Exception {
		this.des = new Boolean(des);
	}

	/**
	* <pre>
	* Encrypt the generated DSA key using the DES algorithm. It prompts you to enter the pass-phrase (password) that is used to encrypt the key.
	* </pre>
	*/
	public void set_des(Boolean des) throws Exception{
		this.des = des;
	}

	/**
	* <pre>
	* Encrypt the generated DSA key using the DES algorithm. It prompts you to enter the pass-phrase (password) that is used to encrypt the key.
	* </pre>
	*/
	public Boolean get_des() throws Exception {
		return this.des;
	}

	/**
	* <pre>
	* Encrypt the generated DSA key using Triple-DES algorithm. You will be prompted to enter the pass-phrase (password) that is used to encrypt the key.
	* </pre>
	*/
	public void set_des3(boolean des3) throws Exception {
		this.des3 = new Boolean(des3);
	}

	/**
	* <pre>
	* Encrypt the generated DSA key using Triple-DES algorithm. You will be prompted to enter the pass-phrase (password) that is used to encrypt the key.
	* </pre>
	*/
	public void set_des3(Boolean des3) throws Exception{
		this.des3 = des3;
	}

	/**
	* <pre>
	* Encrypt the generated DSA key using Triple-DES algorithm. You will be prompted to enter the pass-phrase (password) that is used to encrypt the key.
	* </pre>
	*/
	public Boolean get_des3() throws Exception {
		return this.des3;
	}

	/**
	* <pre>
	* The pass-phrase to use for encryption if '-des' or '-des3' option is selected.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public void set_password(String password) throws Exception{
		this.password = password;
	}

	/**
	* <pre>
	* The pass-phrase to use for encryption if '-des' or '-des3' option is selected.<br> Minimum length =  1<br> Maximum length =  31
	* </pre>
	*/
	public String get_password() throws Exception {
		return this.password;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception {
		ssldsakey[] resources = new ssldsakey[1];
		ssldsakey_response result = (ssldsakey_response) service.get_payload_formatter().string_to_resource(ssldsakey_response.class, response);
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
		resources[0] = result.ssldsakey;
		return resources;
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
	* Use this API to create ssldsakey.
	*/
	public static base_response create(nitro_service client, ssldsakey resource) throws Exception {
		ssldsakey createresource = new ssldsakey();
		createresource.keyfile = resource.keyfile;
		createresource.bits = resource.bits;
		createresource.keyform = resource.keyform;
		createresource.des = resource.des;
		createresource.des3 = resource.des3;
		createresource.password = resource.password;
		return createresource.perform_operation(client,"create");
	}

	public static class keyformEnum {
		public static final String DER = "DER";
		public static final String PEM = "PEM";
	}
}
