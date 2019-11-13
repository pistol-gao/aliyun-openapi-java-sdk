/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.csb.model.v20171118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.csb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PublishCasServiceRequest extends RpcAcsRequest<PublishCasServiceResponse> {
	   

	private String casCsbName;

	private String data;
	public PublishCasServiceRequest() {
		super("CSB", "2017-11-18", "PublishCasService", "csb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCasCsbName() {
		return this.casCsbName;
	}

	public void setCasCsbName(String casCsbName) {
		this.casCsbName = casCsbName;
		if(casCsbName != null){
			putQueryParameter("CasCsbName", casCsbName);
		}
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putBodyParameter("Data", data);
		}
	}

	@Override
	public Class<PublishCasServiceResponse> getResponseClass() {
		return PublishCasServiceResponse.class;
	}

}
