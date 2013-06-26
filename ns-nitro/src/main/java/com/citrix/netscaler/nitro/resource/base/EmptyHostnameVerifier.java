package com.citrix.netscaler.nitro.resource.base;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/**
 * Authentication purpose.
 */
public class EmptyHostnameVerifier implements HostnameVerifier
{
	public boolean verify(String hostname, SSLSession session)
	{
		return true;
	}
}