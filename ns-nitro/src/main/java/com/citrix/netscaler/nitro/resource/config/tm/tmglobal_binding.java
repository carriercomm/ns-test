/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

package com.citrix.netscaler.nitro.resource.config.tm;

import com.citrix.netscaler.nitro.resource.config.tm.tmglobal_auditnslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.tm.tmglobal_tmtrafficpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.tm.tmglobal_auditsyslogpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.tm.tmglobal_tmsessionpolicy_binding;
import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.*;
import com.citrix.netscaler.nitro.exception.nitro_exception;

class tmglobal_binding_response extends base_response
{
	public tmglobal_binding[] tmglobal_binding;
}
/**
	* Binding class showing the resources that can be bound to tmglobal_binding. 
	*/

public class tmglobal_binding extends base_resource
{
	private tmglobal_auditnslogpolicy_binding	tmglobal_auditnslogpolicy_binding[] = null;
	private tmglobal_tmtrafficpolicy_binding	tmglobal_tmtrafficpolicy_binding[] = null;
	private tmglobal_auditsyslogpolicy_binding	tmglobal_auditsyslogpolicy_binding[] = null;
	private tmglobal_tmsessionpolicy_binding	tmglobal_tmsessionpolicy_binding[] = null;

	/**
	* <pre>
	* tmtrafficpolicy that can be bound to tmglobal.
	* </pre>
	*/
	public tmglobal_tmtrafficpolicy_binding[] get_tmglobal_tmtrafficpolicy_bindings() throws Exception {
		return this.tmglobal_tmtrafficpolicy_binding;
	}

	/**
	* <pre>
	* auditnslogpolicy that can be bound to tmglobal.
	* </pre>
	*/
	public tmglobal_auditnslogpolicy_binding[] get_tmglobal_auditnslogpolicy_bindings() throws Exception {
		return this.tmglobal_auditnslogpolicy_binding;
	}

	/**
	* <pre>
	* auditsyslogpolicy that can be bound to tmglobal.
	* </pre>
	*/
	public tmglobal_auditsyslogpolicy_binding[] get_tmglobal_auditsyslogpolicy_bindings() throws Exception {
		return this.tmglobal_auditsyslogpolicy_binding;
	}

	/**
	* <pre>
	* tmsessionpolicy that can be bound to tmglobal.
	* </pre>
	*/
	public tmglobal_tmsessionpolicy_binding[] get_tmglobal_tmsessionpolicy_bindings() throws Exception {
		return this.tmglobal_tmsessionpolicy_binding;
	}

	/**
	* <pre>
	* converts nitro response into object and returns the object array in case of get request.
	* </pre>
	*/
	protected base_resource[] get_nitro_response(nitro_service service, String response) throws Exception{
		tmglobal_binding_response result = (tmglobal_binding_response) service.get_payload_formatter().string_to_resource(tmglobal_binding_response.class, response);
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
		return result.tmglobal_binding;
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
	* Use this API to fetch a tmglobal_binding resource .
	*/
	public static tmglobal_binding get(nitro_service service) throws Exception{
		tmglobal_binding obj = new tmglobal_binding();
		tmglobal_binding response = (tmglobal_binding) obj.get_resource(service);
		return response;
	}


}