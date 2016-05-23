package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import java.util.HashMap;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserWithdrawInfo;
import com.weilingtou.soa.internal.common.util.config.SysConfigStorageConservator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.TrusteeshipUserInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayFeeModeType;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayUserWithdrawInfo;

@Service("yeepayUserWithdrawMobileModeResultCreator")
class YeepayUserWithdrawMobileModeResultCreator extends AbstractYeepayMobileModeGateWayResultCreator<UserWithdrawInfo>{

	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return "mobile/WithdrawAction.a";
	}

	@Override
	protected Map<String, String> createparamsMapMap(UserWithdrawInfo userWithdrawInfo) {
		createUserWithdrawInfo(userWithdrawInfo);
		YeepayUserWithdrawInfo yeepayUserWithdrawInfo=createUserWithdrawInfo(userWithdrawInfo);
		String  xmlUserWithdrawInfo=JSON.toJSONString(yeepayUserWithdrawInfo);
		Map<String, String>  map =  new HashMap<String, String>();
		map.put("jsonObj", xmlUserWithdrawInfo);
		return map;
	}
	
	private YeepayUserWithdrawInfo createUserWithdrawInfo(UserWithdrawInfo userWithdrawInfo){
		YeepayUserWithdrawInfo yeepayUserWithdrawInfo  = new YeepayUserWithdrawInfo();
		TrusteeshipUserInfo trusteeshipUserInfo=userWithdrawInfo.getTrusteeshipUserInfo();
		yeepayUserWithdrawInfo.setAmount(userWithdrawInfo.getMoney().doubleValue());
		yeepayUserWithdrawInfo.setCallbackUrl(userWithdrawInfo.getCallbackUrl());
		yeepayUserWithdrawInfo.setFeeMode(YeepayFeeModeType.USER.getValue());
		yeepayUserWithdrawInfo.setNotifyUrl("null");
		yeepayUserWithdrawInfo.setPlatformNo(SysConfigStorageConservator.get("YEEPAY_SYSTEM_PLATFORM_NO"));
		yeepayUserWithdrawInfo.setPlatformUserNo(trusteeshipUserInfo.getTrusteeshipUserId());
		yeepayUserWithdrawInfo.setRequestNo(userWithdrawInfo.getTrusteeshipOrderNo());
		return yeepayUserWithdrawInfo;
	}
	
	
}
