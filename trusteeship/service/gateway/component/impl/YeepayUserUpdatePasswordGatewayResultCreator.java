package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.weilingtou.soa.internal.common.util.config.SysConfigStorageConservator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserUpdatePasswordInfo;

@Service("yeepayUserUpdatePasswordGatewayResultCreator")
class YeepayUserUpdatePasswordGatewayResultCreator extends AbstractYeepayGateWayResultCreator<UserUpdatePasswordInfo>{

	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return "/epay/ResetPasswordAction.a";
	}

	@Override
	protected Map<String, String> createparamsMapMap(UserUpdatePasswordInfo yeepayUserUpdatePasswordInfo) {
		HashMap<String, String> params = new HashMap<String, String>();
        params.put("requestNo", yeepayUserUpdatePasswordInfo.getTrusteeshipOrderNo());
        params.put("platformNo",  SysConfigStorageConservator.get("YEEPAY_SYSTEM_PLATFORM_NO"));
        params.put("platformUserNo", yeepayUserUpdatePasswordInfo.getTrusteeshipUserId());
        params.put("callbackUrl",yeepayUserUpdatePasswordInfo.getCallbackUrl());
        return params;
	}

}
