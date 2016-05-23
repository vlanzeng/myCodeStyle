package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import javax.annotation.Resource;
import com.weilingtou.soa.internal.common.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.config.SysConfigStorageConservator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayInteractiveInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyHtmlResultException;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.GatewayInteractiveHtmlCreator;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.TrusteeshipGatewayResultCreator;

abstract class AbstractYeepayMobileModeGateWayResultCreator<T> implements TrusteeshipGatewayResultCreator<T>{
	
	@Resource(name="yeepayMobileModeGatewayInteractiveHtmlCreator")
	private  GatewayInteractiveHtmlCreator yeepayMobileModeGatewayInteractiveHtmlCreator;
	
	@Override
	public GatewayResult create(T paramer) {
		return createThirdPartyGatewayResult(paramer);
	}
	
	private GatewayResult    createThirdPartyGatewayResult(T paramer){
		GatewayInteractiveInfo gatewayInteractiveInfo=createGatewayInteractiveInfo(paramer);
		GatewayResult  thirdPartyGatewayResult = new GatewayResult();
		String htmlResult=yeepayMobileModeGatewayInteractiveHtmlCreator.create(gatewayInteractiveInfo);
		if(ValidateParameterUtil.isEmpty(htmlResult)){
           throw new 	EmptyHtmlResultException();		
		}
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
