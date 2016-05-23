package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import javax.annotation.Resource;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.GatewayInteractiveHtmlCreator;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.TrusteeshipGatewayResultCreator;
import com.weilingtou.soa.internal.common.util.config.SysConfigStorageConservator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayInteractiveInfo;

abstract class AbstractYeepayGateWayResultCreator<T> implements TrusteeshipGatewayResultCreator<T>{
	
	@Resource(name="yeepayWebClientGatewayInteractiveHtmlCreator")
	private GatewayInteractiveHtmlCreator yeepayWebClientGatewayInteractiveHtmlCreator;
	
	@Override
	public GatewayResult create(T paramer) {
		return createThirdPartyGatewayResult(paramer);
	}
	
	private GatewayResult    createThirdPartyGatewayResult(T paramer){
		GatewayInteractiveInfo gatewayInteractiveInfo=createGatewayInteractiveInfo(paramer);
		GatewayResult  thirdPartyGatewayResult = new GatewayResult();
		String htmlResult=yeepayWebClientGatewayInteractiveHtmlCreator.create(gatewayInteractiveInfo);
		thirdPartyGatewayResult.setResult(htmlResult);
		return  thirdPartyGatewayResult;
	}
	
	private GatewayInteractiveInfo  createGatewayInteractiveInfo(T paramer){
		Map<String, String>    paramsMap=createparamsMapMap(paramer);
		GatewayInteractiveInfo   gatewayInteractiveInfo = new GatewayInteractiveInfo();
		gatewayInteractiveInfo.setParamsMap(paramsMap);
		gatewayInteractiveInfo.setRequestHandlerUrl(SysConfigStorageConservator.get("THIRD_PARTY_PROXY_SERVICE_BASE_URL")+seekMediationYeepayServiceSubUrl());
		return gatewayInteractiveInfo;
	}
	
	protected abstract String seekMediationYeepayServiceSubUrl();
	
	protected abstract Map<String, String>  createparamsMapMap(T paramer);
	
}
