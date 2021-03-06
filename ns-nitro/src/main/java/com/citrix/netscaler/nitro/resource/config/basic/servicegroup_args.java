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

/**
	* Provides additional arguments required for fetching the servicegroup resource.
	*/

public class servicegroup_args 
{
	private Boolean includemembers;

	/**
	* <pre>
	* Display the members of the listed service groups in addition to their settings. Can be specified when no service group name is provided in the command. In that case, the details displayed for each service group are identical to the details displayed when a service group name is provided, except that bound monitors are not displayed.
	* </pre>
	*/
	public void set_includemembers(boolean includemembers) throws Exception {
		this.includemembers = new Boolean(includemembers);
	}

	/**
	* <pre>
	* Display the members of the listed service groups in addition to their settings. Can be specified when no service group name is provided in the command. In that case, the details displayed for each service group are identical to the details displayed when a service group name is provided, except that bound monitors are not displayed.
	* </pre>
	*/
	public void set_includemembers(Boolean includemembers) throws Exception{
		this.includemembers = includemembers;
	}

	/**
	* <pre>
	* Display the members of the listed service groups in addition to their settings. Can be specified when no service group name is provided in the command. In that case, the details displayed for each service group are identical to the details displayed when a service group name is provided, except that bound monitors are not displayed.
	* </pre>
	*/
	public Boolean get_includemembers() throws Exception {
		return this.includemembers;
	}

}
