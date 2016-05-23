package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.weilingtou.soa.internal.common.util.security.DesUtil;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.TrusteeshipUserInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserRegisterInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayIdentityCardType;

@Service("yeepayUserRegisterGatewayResultCreator")
class YeepayUserRegisterGatewayResultCreator extends AbstractYeepayGateWayResultCreator<UserRegisterInfo>{

	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return  "/epay/CreateNewIpsAcctAction.a";
	}

	@Override
	protected Map<String, String> createparamsMapMap(UserRegisterInfo userRegisterInfo) {
		TrusteeshipUserInfo thirdPartyCustodianUser =userRegisterInfo.getTrusteeshipUserInfo();
		Map<String, String>    paramsMap = new HashMap<String, String>();
		paramsMap.put("requestNo", userRegisterInfo.getCallbackUrl());
		paramsMap.put("platformUserNo", thirdPartyCustodianUser.getTrusteeshipUserId());
		paramsMap.put("nickName", thirdPartyCustodianUser.getNickName());
		paramsMap.put("realName", thirdPartyCustodianUser.getRealName());
		paramsMap.put("idCardType",YeepayIdentityCardType.G2_IDCARD.getValue());
		paramsMap.put("idCardNo", DesUtil.DecryptDES(thirdPartyCustodianUser.getIdCardNo()));
		paramsMap.put("mobile", thirdPartyCustodianUser.getPhoneNumber());
        if(thirdPartyCustodianUser.getEmail()!=null &&!"".equals(thirdPartyCustodianUser.getEmail())){
        	paramsMap.put("email", thirdPartyCustodianUser.getEmail());
        }
        paramsMap.put("notifyUrl",null);
        paramsMap.put("callbackUrl", userRegisterInfo.getCallbackUrl());
        return paramsMap;
	}

}
