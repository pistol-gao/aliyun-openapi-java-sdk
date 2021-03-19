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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oos.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetSecretParameterRequest extends RpcAcsRequest<GetSecretParameterResponse> {
	   

	private Boolean withDecryption;

	private Integer parameterVersion;

	private String name;
	public GetSecretParameterRequest() {
		super("oos", "2019-06-01", "GetSecretParameter");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getWithDecryption() {
		return this.withDecryption;
	}

	public void setWithDecryption(Boolean withDecryption) {
		this.withDecryption = withDecryption;
		if(withDecryption != null){
			putQueryParameter("WithDecryption", withDecryption.toString());
		}
	}

	public Integer getParameterVersion() {
		return this.parameterVersion;
	}

	public void setParameterVersion(Integer parameterVersion) {
		this.parameterVersion = parameterVersion;
		if(parameterVersion != null){
			putQueryParameter("ParameterVersion", parameterVersion.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<GetSecretParameterResponse> getResponseClass() {
		return GetSecretParameterResponse.class;
	}

}
