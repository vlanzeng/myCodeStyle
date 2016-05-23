package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import java.util.HashMap;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.config.SysConfigStorageConservator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserBindBankCardInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayUserBindBankCardInfo;

@Service("yeepayMobileModeUserbindBanCardCreator")
class YeepayMobileModeUserbindBanCardCreator extends AbstractYeepayMobileModeGateWayResultCreator<UserBindBankCardInfo>{

	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return "/mobile/BindBankCardAction.a";
	}

	@Override
	protected Map<String, String> createparamsMapMap(UserBindBankCardInfo userBindBankCardInfo) {
		YeepayUserBindBankCardInfo yeepayUserBindBankCardInfo=createYeepayUserBindBankCardInfo(userBindBankCardInfo);
		String jsonYeepayUserBindBankCardInfo=JSON.toJSONString(yeepayUserBindBankCardInfo);
		Map<String,String>  map = new HashMap<String, String>();
		map.put("jsonObj", jsonYeepayUserBindBankCardInfo);
		return map;
	}
	
	private YeepayUserBindBankCardInfo  createYeepayUserBindBankCardInfo(UserBindBankCardInfo userBindBankCardInfo){
		YeepayUserBindBankCardInfo  yeepayUserBindBankCardInfo = new YeepayUserBindBankCardInfo();
		yeepayUserBindBankCardInfo.setCallbackUrl(userBindBankCardInfo.getCallbackUrl());
		yeepayUserBindBankCardInfo.setNotifyUrl(null);
		yeepayUserBindBankCardInfo.setPlatformNo(SysConfigStorageConservator.get("YEEPAY_SYSTEM_PLATFORM_NO"));
		yeepayUserBindBankCardInfo.setPlatformUserNo(userBindBankCardInfo.getTrusteeshipUserId());
		yeepayUserBindBankCardInfo.setRequestNo(userBindBankCardInfo.getTrusteeshipOrderNo());
		return yeepayUserBindBankCardInfo;
	}
	
}
