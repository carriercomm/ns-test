package com.citrix.netscaler.nitro.resource.base;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;

/**
 * Authentication purpose.
 */
public class EmptyTrustManager implements X509TrustManager
{
	public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException
	{
		return;
	}

	public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException
	{
		return;
	}

	public X509Certificate[] getAcceptedIssuers()
	{
		return new X509Certificate[]{};
	}
}
