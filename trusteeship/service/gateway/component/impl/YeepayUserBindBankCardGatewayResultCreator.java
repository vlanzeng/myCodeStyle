package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserBindBankCardInfo;


@Service("yeepayUserBindBankCardGatewayResultCreator")
class YeepayUserBindBankCardGatewayResultCreator extends AbstractYeepayGateWayResultCreator<UserBindBankCardInfo>{

	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return "/epay/BindBankCardAction.a";
	}

	@Override
	protected Map<String, String> createparamsMapMap(UserBindBankCardInfo userBindBankCardInfo) {
	     HashMap<String, String> paramsMap = new HashMap<String, String>();
	     paramsMap.put("requestNo", userBindBankCardInfo.getTrusteeshipOrderNo());
	     paramsMap.put("platformUserNo", userBindBankCardInfo.getTrusteeshipUserId());
	     paramsMap.put("notifyUrl",null);
	     paramsMap.put("callbackUrl",userBindBankCardInfo.getCallbackUrl());
	     return paramsMap;
	}

}
