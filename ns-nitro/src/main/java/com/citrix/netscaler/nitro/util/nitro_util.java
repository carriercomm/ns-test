/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/

/**
 * Util package.
 */
package com.citrix.netscaler.nitro.util;

import java.lang.reflect.Field;
/**
 * 
 * nitro_util class provides a way to create a string out of the object fields that are set. 
 */
public class nitro_util {

	/**
	 * encodes the given string using URLEncoder.
	 * @param str String that is to be encoded.
	 * @return  encoded string.
	 */
	public static String encode(String str)
	{
		try
		{
			return java.net.URLEncoder.encode(str, "UTF-8");
		}
		catch(java.io.UnsupportedEncodingException ue)
		{
			return str;
		}
	}
	/**
	 * create a string out of the object fields that are set
	 * @param obj Object
	 * @return String in Json format.
	 * @throws Exception Nitro exception is thrown.
	 */
	public static String object_to_string(java.lang.Object obj) throws Exception {
		String str = null;

		Class<?> c = obj.getClass();
		Field[] flds = c.getDeclaredFields();
		if (flds != null) {
			for (int i = 0; i < flds.length; i++)
			{
				flds[i].setAccessible(true);
				if (flds[i].get(obj) != null)
				{
					String strtmp = "";
					Object tmp = flds[i].get(obj);
					if (flds[i].getType().isArray()) {
						if (tmp instanceof String[]) {
							String[] tmp1 = (String[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j] + " "; 
							}
						} else if (tmp instanceof Integer[]) {
							Integer[] tmp1 = (Integer[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j].toString() + " "; 
							}
						} else if (tmp instanceof Long[]) {
							Long[] tmp1 = (Long[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j].toString() + " "; 
							}
						} else if (tmp instanceof Double[]) {
							Double[] tmp1 = (Double[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j].toString() + " "; 
							}
						} else if(tmp instanceof Boolean[]) {
							Boolean[] tmp1 = (Boolean[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j].toString() + " "; 
							}
						}						
						strtmp = strtmp.trim();
					} else {
						strtmp = flds[i].get(obj).toString();
					}
					if (str != null)
						str = str + ",";
					if (str == null)
					{
						str = "\""+flds[i].getName()+"\"" + ":" + "\""+strtmp+"\"";
					}
					else
					{
						str = str + "\""+flds[i].getName()+"\"" + ":" +"\""+ strtmp+"\"";
					}
				}
			}
		}
		return str;
	}
	
	/**
	 * create a string (without quotes)out of the object fields that are set
	 * @param obj Object
	 * @return String in Json format.
	 * @throws Exception Nitro exception is thrown.
	 */
	public static String object_to_string_withoutquotes(java.lang.Object obj) throws Exception {
		String str = null;

		Class<?> c = obj.getClass();
		Field[] flds = c.getDeclaredFields();
		if (flds != null) {
			for (int i = 0; i < flds.length; i++)
			{
				flds[i].setAccessible(true);
				if (flds[i].get(obj) != null)
				{
					String strtmp = "";
					if (flds[i].getType().isArray()) {
						Object tmp = flds[i].get(obj);
						if (tmp instanceof String[]) {
							String[] tmp1 = (String[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j] + " "; 
							}
						} else if (tmp instanceof Integer[]) {
							Integer[] tmp1 = (Integer[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j].toString() + " "; 
							}
						} else if (tmp instanceof Long[]) {
							Long[] tmp1 = (Long[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j].toString() + " "; 
							}
						} else if (tmp instanceof Double[]) {
							Double[] tmp1 = (Double[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j].toString() + " "; 
							}
						} else if(tmp instanceof Boolean[]) {
							Boolean[] tmp1 = (Boolean[])tmp;
							for (int j = 0 ;j<tmp1.length;j++) {
								strtmp += tmp1[j].toString() + " "; 
							}
						}						
						strtmp = strtmp.trim();
					} else {
						strtmp = flds[i].get(obj).toString();
					}
					if (str != null)
						str = str + ",";
					if (str == null)
					{
						str = flds[i].getName() + ":" + encode(strtmp);
					}
					else
					{
						str = str +flds[i].getName() + ":" + encode(strtmp);
					}
				}
			}
		}
		return str;
	}
}
