package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import java.util.HashMap;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.config.SysConfigStorageConservator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserMobileResetInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayResetMobileInfo;

@Service("yeepayMobileModeUserUpdatePasswordCreator")
class YeepayMobileModeUserUpdatePasswordCreator extends AbstractYeepayMobileModeGateWayResultCreator<UserMobileResetInfo>{

	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return "/mobile/ResetMobileAction.a";
	}

	@Override
	protected Map<String, String> createparamsMapMap(UserMobileResetInfo userMobileResetInfo) {
		Map<String, String>  map =new HashMap<String,String>();
		YeepayResetMobileInfo yeepayResetMobileInfo=createYeepayResetMobileInfo(userMobileResetInfo);
		String jsonYeepayResetMobileInfo=JSON.toJSONString(yeepayResetMobileInfo);
		map.put("jsonObj", jsonYeepayResetMobileInfo);
		return	map;
	} 
	
	private YeepayResetMobileInfo  createYeepayResetMobileInfo(UserMobileResetInfo userMobileResetInfo){
		YeepayResetMobileInfo  yeepayResetMobileInfo  = new YeepayResetMobileInfo();
		yeepayResetMobileInfo.setCallbackUrl(userMobileResetInfo.getCallbackUrl());
		yeepayResetMobileInfo.setNotifyUrl(null);
		yeepayResetMobileInfo.setPlatformNo(SysConfigStorageConservator.get("YEEPAY_SYSTEM_PLATFORM_NO"));
		yeepayResetMobileInfo.setPlatformUserNo(userMobileResetInfo.getTrusteeshipUserId());
		yeepayResetMobileInfo.setRequestNo(userMobileResetInfo.getTrusteeshipUserOrderNo());
		return yeepayResetMobileInfo;
	}

}
