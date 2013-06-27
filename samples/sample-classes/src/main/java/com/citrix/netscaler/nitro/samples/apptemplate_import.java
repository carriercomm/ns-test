package com.citrix.netscaler.nitro.samples;
/*
* The following copyright is for all changes made by Citrix Systems, Inc.:
* Copyright: Copyright 2002-2008 Citrix Systems, Inc. All rights reserved.
* This software and documentation contain valuable trade
* secrets and proprietary property belonging to Citrix Systems, Inc.
* None of this software and documentation may be copied,
* duplicated or disclosed without the express
* written permission of Citrix Systems, Inc.
*/




import com.citrix.netscaler.nitro.resource.base.*;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.exception.nitro_exception;
import com.citrix.netscaler.nitro.resource.config.app.*;


public class apptemplate_import
{
	String ip ;
	String username ;
	String password ;
	   
	public static void main(String[] args) {
		nitro_service session = null;
		if (args.length < 3) {
			System.out.println("Usage: run.bat <ip> <username> <password>");
			return;
		}
		try {
			apptemplate_import config = new apptemplate_import();
		   	session = new nitro_service(args[0],"http");
		  	session.set_credential(args[1],args[2]);
		  	config.import_apptemplates(session);
		  	if (session != null)
				session.logout();
		}catch (nitro_exception e)
		{
			System.out.println("Exception::rc="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.out.println("Exception::message="+e.getMessage());
		} 
	    return;
	}
	
	public void import_apptemplates(nitro_service client) 
	{
		import_app(client);
		import_app_withappname(client);
		import_app_withdeploymentfile(client);
	}
	
	public void import_app(nitro_service session)
	{
		try
		{
			application importresource = new application();
			importresource.set_apptemplatefilename("share.xml"); 
			
			base_response result = application.Import(session, importresource);
			
			System.out.println("import application result::errorcode="+result.errorcode+ ",message="+result.message);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::import application::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::import application::message="+e);
		}
	}
	
	public void import_app_withappname(nitro_service session)
	{
		try
		{
			application importresource = new application();
			importresource.set_apptemplatefilename("share.xml"); 
			importresource.set_appname("Myapp");
			
			base_response result = application.Import(session, importresource);
			
			System.out.println("import application result::errorcode="+result.errorcode+ ",message="+result.message);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::import application::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::import application::message="+e);
		}
	}
	
	public void import_app_withdeploymentfile(nitro_service session)
	{
		try
		{
			application importresource = new application();
			importresource.set_apptemplatefilename("share.xml"); 
			importresource.set_appname("Myapp1");
			importresource.set_deploymentfilename("share_deployment.xml");
			
			base_response result = application.Import(session, importresource);
			
			System.out.println("import application result::errorcode="+result.errorcode+ ",message="+result.message);
		}catch (nitro_exception e)
		{
			System.out.println("Exception::import application::errorcode="+e.getErrorCode()+",message="+ e.getMessage());
		}catch (Exception e)
		{
			System.err.println("Exception::import application::message="+e);
		}
	}
	
}
