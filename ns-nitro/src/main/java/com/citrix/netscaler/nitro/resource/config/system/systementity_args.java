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

package com.citrix.netscaler.nitro.resource.config.system;

/**
	* Provides additional arguments required for fetching the systementity resource.
	*/

public class systementity_args 
{
	private String type;
	private String datasource;
	private Integer core;

	/**
	* <pre>
	* Specify the entity type.
	* </pre>
	*/
	public void set_type(String type) throws Exception{
		this.type = type;
	}

	/**
	* <pre>
	* Specify the entity type.
	* </pre>
	*/
	public String get_type() throws Exception {
		return this.type;
	}

	/**
	* <pre>
	* Specifies the source which contains all the stored counter values.
	* </pre>
	*/
	public void set_datasource(String datasource) throws Exception{
		this.datasource = datasource;
	}

	/**
	* <pre>
	* Specifies the source which contains all the stored counter values.
	* </pre>
	*/
	public String get_datasource() throws Exception {
		return this.datasource;
	}

	/**
	* <pre>
	* Specify core ID of the PE in nCore.
	* </pre>
	*/
	public void set_core(int core) throws Exception {
		this.core = new Integer(core);
	}

	/**
	* <pre>
	* Specify core ID of the PE in nCore.
	* </pre>
	*/
	public void set_core(Integer core) throws Exception{
		this.core = core;
	}

	/**
	* <pre>
	* Specify core ID of the PE in nCore.
	* </pre>
	*/
	public Integer get_core() throws Exception {
		return this.core;
	}

}
