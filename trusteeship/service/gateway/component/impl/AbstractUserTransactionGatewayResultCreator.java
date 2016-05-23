package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import java.util.HashMap;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserTransactionInfo;

abstract class AbstractUserTransactionGatewayResultCreator extends AbstractYeepayGateWayResultCreator<UserTransactionInfo>{

	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return "/epay/CpTransactionAction.a";
	}

	@Override
	protected Map<String, String> createparamsMapMap(UserTransactionInfo yeepayUserTransactionInfo) {
		Map<String, String> params = new HashMap<String, String>();
        params.put("requestNo", yeepayUserTransactionInfo.getTrusteeshipOrderNo());
        params.put("platformUserNo", yeepayUserTransactionInfo.getTrusteeshipUserId());
        params.put("userType", getYeepayUserType());
        params.put("notifyUrl", null);
		params.put("bizType", getYeepayBusinessType());
		params.put("details", createYeepayUserTransactionInfo(yeepayUserTransactionInfo));
        params.put("callbackUrl", yeepayUserTransactionInfo.getCallbackUrl());
        return params;
	}
	
	private String   createYeepayUserTransactionInfo(UserTransactionInfo yeepayUserTransactionInfo ){
		StringBuilder  stringBuilder=new StringBuilder();
		stringBuilder.append("<detail>");
		stringBuilder.append("<targetUserType>");
		stringBuilder.append(getDealUserType());
		stringBuilder.append("</targetUserType>");
		stringBuilder.append("<targetPlatformUserNo>");
		stringBuilder.append(yeepayUserTransactionInfo.getDealTrusteeshipUserId());
		stringBuilder.append("</targetPlatformUserNo>");
		stringBuilder.append("<amount>");
		stringBuilder.append(yeepayUserTransactionInfo.getDealMoney().toString());
		stringBuilder.append("</amount>");
		stringBuilder.append("<bizType>");
		stringBuilder.append(getYeepayBusinessType());
		stringBuilder.append("</bizType>");
		stringBuilder.append("</detail>");
		return stringBuilder.toString();
	}
	
	abstract protected  String getYeepayUserType();
	
	abstract protected  String getYeepayBusinessType();
	
	abstract  protected String getDealUserType();
	
}
