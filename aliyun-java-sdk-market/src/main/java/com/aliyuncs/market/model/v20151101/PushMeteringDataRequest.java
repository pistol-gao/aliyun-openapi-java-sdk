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

package com.aliyuncs.market.model.v20151101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PushMeteringDataRequest extends RpcAcsRequest<PushMeteringDataResponse> {
	
	public PushMeteringDataRequest() {
		super("Market", "2015-11-01", "PushMeteringData");
		setMethod(MethodType.POST);
	}

	private String metering;

	public String getMetering() {
		return this.metering;
	}

	public void setMetering(String metering) {
		this.metering = metering;
		if(metering != null){
			putQueryParameter("Metering", metering);
		}
	}

	@Override
	public Class<PushMeteringDataResponse> getResponseClass() {
		return PushMeteringDataResponse.class;
	}

}
