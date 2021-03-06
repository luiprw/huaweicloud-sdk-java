 /*******************************************************************************
 * 	Copyright 2018 Huawei Technologies Co.,Ltd.                                         
 * 	                                                                                 
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not      
 * 	use this file except in compliance with the License. You may obtain a copy of    
 * 	the License at                                                                   
 * 	                                                                                 
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                   
 * 	                                                                                 
 * 	Unless required by applicable law or agreed to in writing, software              
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT        
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the         
 * 	License for the specific language governing permissions and limitations under    
 * 	the License.                                                                     
 *******************************************************************************/
package com.huawei.openstack4j.openstack.nat.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.huawei.openstack4j.model.ModelEntity;
import com.huawei.openstack4j.openstack.common.ListResult;

@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonRootName("snat_rule")
public class SnatRule implements ModelEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8838202488847895445L;

	private String id;
	
	private String tenant_id;
	
	@JsonProperty("nat_gateway_id")
	private String natGatewayId;
	
	@JsonProperty("network_id")
	private String networkId;
	
	@JsonProperty("floating_ip_id")
	private String 	floatingIpId;
	
	@JsonProperty("floating_ip_address")
	private String floatingIpAddress;
	
	private Status status;
	
	private String created_at;
	
	@JsonProperty("admin_state_up")
	private boolean adminStateUp;
	
	
	public  static class SnatRules extends ListResult<SnatRule>{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = -7607242585768409486L;
		
		@JsonProperty("snat_rules")
		private List<SnatRule> snatRule;
		
		@Override
		protected List<SnatRule> value() {
			return snatRule;
		}
		
		
	}
}
