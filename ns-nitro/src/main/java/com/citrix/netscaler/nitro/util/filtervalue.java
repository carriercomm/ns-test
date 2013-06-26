package com.citrix.netscaler.nitro.util;

/**
 * 
 * filtervalue class provides a way to specify the filter parameter name and value for performing filtered get operation. 
 */
public class filtervalue {
	private String name;
	private String value;
	
	public filtervalue(String name,String value){
		this.name = name;
		this.value = value;
	}
	
	/**
     * @return gets the name of the filter parameter.
     */
	public String get_name() {
		return this.name;
	}
	
	/**
     * @return gets the value of the filter parameter.
     */
	public String get_value() {
		return this.value;
	}
}
