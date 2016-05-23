package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import java.util.HashMap;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserRegisterInfo;
import com.weilingtou.soa.internal.common.util.config.SysConfigStorageConservator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.TrusteeshipUserInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayUserRegisterInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayIdentityCardType;

@Service("yeepayUserRegisterMobileModeResultCreator")
class YeepayUserRegisterMobileModeResultCreator extends AbstractYeepayMobileModeGateWayResultCreator<UserRegisterInfo>{

	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return  "/mobile/RegisterAction.a";
	}

	@Override
	protected Map<String, String> createparamsMapMap(UserRegisterInfo userRegisterInfo) {
		YeepayUserRegisterInfo  yeepayUserRegisterInfo=createYeepayUserRegisterInfo(userRegisterInfo);
		String jsonYeepayUserRegisterInfo=JSON.toJSONString(yeepayUserRegisterInfo);
		Map<String,String>  map=new HashMap<String, String>();
		map.put("jsonObj", jsonYeepayUserRegisterInfo);
		return map;
	}
	
	private YeepayUserRegisterInfo  createYeepayUserRegisterInfo(UserRegisterInfo userRegisterInfo){
		TrusteeshipUserInfo  trusteeshipUserInfo=userRegisterInfo.getTrusteeshipUserInfo();
		YeepayUserRegisterInfo  yeepayUserRegisterInfo = new YeepayUserRegisterInfo();
		yeepayUserRegisterInfo.setCallbackUrl(userRegisterInfo.getCallbackUrl());
		yeepayUserRegisterInfo.setEmail(trusteeshipUserInfo.getEmail());
		yeepayUserRegisterInfo.setIdCardNo(trusteeshipUserInfo.getIdCardNo());
		yeepayUserRegisterInfo.setIdCardType(YeepayIdentityCardType.G2_IDCARD.getValue());
		yeepayUserRegisterInfo.setMobile(trusteeshipUserInfo.getPhoneNumber());
		yeepayUserRegisterInfo.setNickName(trusteeshipUserInfo.getNickName());
		yeepayUserRegisterInfo.setRealName(trusteeshipUserInfo.getRealName());
		yeepayUserRegisterInfo.setRequestNo(userRegisterInfo.getTrusteeshipOrderNo());
		yeepayUserRegisterInfo.setPlatformNo(SysConfigStorageConservator.get("YEEPAY_SYSTEM_PLATFORM_NO"));
		yeepayUserRegisterInfo.setPlatformUserNo(trusteeshipUserInfo.getTrusteeshipUserId());
		yeepayUserRegisterInfo.setNotifyUrl("null");
		return yeepayUserRegisterInfo;
	}
	
	
}
