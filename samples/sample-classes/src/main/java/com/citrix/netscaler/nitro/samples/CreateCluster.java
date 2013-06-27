package com.citrix.netscaler.nitro.samples;
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

import java.net.InetAddress;
import com.citrix.netscaler.nitro.exception.nitro_exception;
import com.citrix.netscaler.nitro.resource.config.cluster.cluster;
import com.citrix.netscaler.nitro.resource.config.cluster.clusterinstance;
import com.citrix.netscaler.nitro.resource.config.cluster.clusternode;
import com.citrix.netscaler.nitro.resource.config.ns.nsip;
import com.citrix.netscaler.nitro.service.nitro_service;

// Sample code to create a two-node NetScaler cluster.

public class CreateCluster 
{
   
	public static void main(String[] args) {
		
		try {
			
			//UPDATE THESE VARIABLES AS NEEDED
			String nsipAddress0 = "10.102.201.13";
			String nsipAddress1 = "10.102.201.14";
			String clipAddress = "10.102.201.18";
			String protocol = "http";
			String uName = "nsroot";
			String password = "nsroot";
			int timeout = 60000; /* The time to wait before connecting to the cluster IP address */
			
			//Connect to the first appliance that you want to add to the cluster
			nitro_service nonClipSession0 = new nitro_service(nsipAddress0,protocol);
			nonClipSession0.login(uName,password);
			
			//Create a cluster instance			
			clusterinstance newClusterInstance = new clusterinstance();
			newClusterInstance.set_clid(1);
			clusterinstance.add(nonClipSession0,newClusterInstance);
			
			//Add the appliance to the cluster
			clusternode ClusterNode0 = new clusternode();
			ClusterNode0.set_nodeid(0);
			ClusterNode0.set_ipaddress(nsipAddress0);
			ClusterNode0.set_state("ACTIVE");
			ClusterNode0.set_backplane("0/1/1");
			clusternode.add(nonClipSession0,ClusterNode0);
			
			//Add the cluster IP address
			nsip newNSIPAddress = new nsip();
			newNSIPAddress.set_ipaddress(clipAddress);
			newNSIPAddress.set_netmask("255.255.255.255");
			newNSIPAddress.set_type("CLIP");
			nsip.add(nonClipSession0,newNSIPAddress);
			
			//Enable the cluster instance
			clusterinstance.enable(nonClipSession0, newClusterInstance);
			
			//Save the configurations
			nonClipSession0.save_config();
			
			//Warm reboot the appliance
			nonClipSession0.reboot(true);
			
			//Wait for while for the cluster IP address to be available
			InetAddress.getByName(clipAddress).isReachable(timeout);
			
			//The cluster is created and the first node is added to the cluster. 
			//This node becomes the initial configuration coordinator of the cluster.
			
			//Log on to the cluster IP address and add the other nodes to the cluster
			
			//Connect to the cluster IP address
			nitro_service clipSession = new nitro_service(clipAddress,protocol);
			clipSession.login(uName,password);
			
			//Add the node to the cluster
			clusternode ClusterNode1 = new clusternode();
			ClusterNode1.set_nodeid(1);
			ClusterNode1.set_ipaddress(nsipAddress1);
			ClusterNode1.set_state("ACTIVE");
			ClusterNode1.set_backplane("1/1/1");
			clusternode.add(clipSession,ClusterNode1);
			
			//Save the configurations
			clipSession.save_config();
			
			//The second node is added to the cluster. 
			//You must now log on to the node that you have just added and join it to the cluster
			
			//Connect to the node that you have just added to the cluster
			nitro_service nonClipSession1 = new nitro_service(nsipAddress1,protocol);
			nonClipSession1.login(uName,password);
			
			//Join the node to the cluster
			cluster newCluster = new cluster();
			newCluster.set_clip(clipAddress);
			newCluster.set_password(password);
			cluster.join(nonClipSession1,newCluster);
			
			//Save the configurations
			nonClipSession1.save_config();
			
			//Warm reboot the appliance
			nonClipSession1.reboot(true);
			
			//Wait for while for the node to reboot
			InetAddress.getByName(clipAddress).isReachable(timeout);

			//Retrieving the cluster node details
			Long id = new Long(1); // node id 
			clusternode node= clusternode.get(clipSession, id);
			System.out.println("Node ID: "+ node.get_nodeid() + " | Admin state: " + node.get_state() + " | Backplane interface: "+ node.get_backplane());
						
			//Retrieving the cluster instance details
			Long id1 = new Long(1);// instance id 
			clusterinstance instance = clusterinstance.get(clipSession, id1);
			System.out.println("Cluster instance ID: "+ instance.get_clid() + " | Operational state: " +instance.get_operationalstate());
			
		}
		catch(nitro_exception error){
			
			System.out.println("NITRO Error -> Code " +error.getErrorCode() +" : " +error.getMessage());
		}
		catch(Exception e){
			System.out.println("Java Error -> " +e.getMessage());
			e.printStackTrace();
		}
	}	
}
