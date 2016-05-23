package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import java.util.HashMap;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.security.Md5Helper;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserRechargeInfo;
import com.weilingtou.soa.internal.common.util.security.exception.Md5HandleException;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.TrusteeshipUserInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayFeeModeType;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayServiceType;

@Service("yeepayUserRechargerGatewayResultCreator")
class YeepayUserRechargerGatewayResultCreator extends AbstractYeepayGateWayResultCreator<UserRechargeInfo>{

	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return "/epay/MerchantRegistrAction.a";
	}

	@Override
	protected Map<String, String> createparamsMapMap(UserRechargeInfo userRechargeInfo) {
		TrusteeshipUserInfo thirdPartyCustodianUser =userRechargeInfo.getTrusteeshipUserInfo();
        HashMap<String, String> paramsMap = new HashMap<String, String>();
        paramsMap.put("requestNo", userRechargeInfo.getTrusteeshipOrderNo());
        paramsMap.put("platformUserNo", thirdPartyCustodianUser.getTrusteeshipUserId());
        paramsMap.put("amount",userRechargeInfo.getRechargeMoney().toString());
        paramsMap.put("feeMode", YeepayFeeModeType.PLAT_FORM.getValue());
        paramsMap.put("notifyUrl",null);
        paramsMap.put("callbackUrl",userRechargeInfo.getCallbackUrl());
        paramsMap.put("service",YeepayServiceType.RECHARGE.getValue());
        paramsMap.put("md5",createMd5CryptographicData(userRechargeInfo));
        return paramsMap;
	}
	
	private String  createMd5CryptographicData(UserRechargeInfo userRechargeInfo){
		TrusteeshipUserInfo  thirdPartyCustodianUser=userRechargeInfo.getTrusteeshipUserInfo();
	    String md5Str = userRechargeInfo.getTrusteeshipOrderNo()+thirdPartyCustodianUser.getTrusteeshipUserId()+userRechargeInfo.getRechargeMoney().toString();
	    String md5CryptographicData = "";
	    try {
	    	md5CryptographicData= Md5Helper.md5Encode(md5Str);
	    } catch (Exception e) {
	            throw new Md5HandleException();
	    }
	 return  md5CryptographicData;
	}
	
}
