package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.weilingtou.soa.internal.common.util.config.SysConfigStorageConservator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserMobileResetInfo;

@Service("yeepayUserMobileNumberResetGateWayResultCreator")
class YeepayUserMobileNumberResetGateWayResultCreator extends  AbstractYeepayGateWayResultCreator<UserMobileResetInfo>{

	@Override
	protected String seekMediationYeepayServiceSubUrl() {
	    return "/epay/ResetYeePayMobileAction.a";
	}

	@Override
	protected Map<String, String> createparamsMapMap(UserMobileResetInfo yeepayUserMobileResetInfo) {
	      Map<String, String> params = new HashMap<String, String>();
	      params.put("requestNo", yeepayUserMobileResetInfo.getTrusteeshipUserOrderNo());
	      params.put("platformNo",  SysConfigStorageConservator.get("YEEPAY_SYSTEM_PLATFORM_NO"));
	      params.put("platformUserNo", yeepayUserMobileResetInfo.getTrusteeshipUserId());
	      params.put("callbackUrl",yeepayUserMobileResetInfo.getCallbackUrl());
	      params.put("notifyUrl",null);
	      return  params;
	}

}
