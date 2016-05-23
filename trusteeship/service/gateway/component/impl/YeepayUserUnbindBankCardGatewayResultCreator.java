package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserBindBankCardInfo;

@Service("yeepayUserUnbindBankCardGatewayResultCreator")
class YeepayUserUnbindBankCardGatewayResultCreator extends  AbstractYeepayGateWayResultCreator<UserBindBankCardInfo>{

	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return "/epay/UnBindBankCardAction.a";
	} 

	@Override
	protected Map<String, String> createparamsMapMap(UserBindBankCardInfo userBindBankCardInfo) {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("requestNo", userBindBankCardInfo.getTrusteeshipOrderNo());
        params.put("platformUserNo", userBindBankCardInfo.getTrusteeshipUserId());
        params.put("notifyUrl",null);
        params.put("callbackUrl",userBindBankCardInfo.getCallbackUrl());
        return params;
	}

}
