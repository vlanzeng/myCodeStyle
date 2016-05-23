package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import java.util.Map;

public class GatewayInteractiveInfo {
	
	private  String  requestHandlerUrl;
	private  Map<String, String>  paramsMap;
	
	public String getRequestHandlerUrl() {
		return requestHandlerUrl;
	}
	
	public void setRequestHandlerUrl(String requestHandlerUrl) {
		this.requestHandlerUrl = requestHandlerUrl;
	}
	
	public Map<String, String> getParamsMap() {
		return paramsMap;
	}
	
	public void setParamsMap(Map<String, String> paramsMap) {
		this.paramsMap = paramsMap;
	}
	
}
