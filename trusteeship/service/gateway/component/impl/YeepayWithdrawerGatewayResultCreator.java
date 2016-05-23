package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserWithdrawInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.TrusteeshipUserInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayFeeModeType;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayServiceType;
import com.weilingtou.soa.internal.common.util.trusteeship.service.generator.ExpireDateGenerator;

@Service("yeepayWithdrawerGatewayResultCreator")
class YeepayWithdrawerGatewayResultCreator extends AbstractYeepayGateWayResultCreator<UserWithdrawInfo>{
	
    @Resource(name="minutePeriodExpireDateGenerator")
	private  ExpireDateGenerator minutePeriodExpireDateGenerator;
	
	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return "/epay/WithdrawAction.a";
	}

	@Override
	protected Map<String, String> createparamsMapMap(UserWithdrawInfo userWithdrawInfo) {
		TrusteeshipUserInfo thirdPartyCustodianUser =userWithdrawInfo.getTrusteeshipUserInfo();
        HashMap<String, String> paramsMap = new HashMap<String, String>();
        paramsMap.put("notifyUrl",null);
        paramsMap.put("expired", minutePeriodExpireDateGenerator.generatorExpireDateString());
        paramsMap.put("feeMode", YeepayFeeModeType.USER.getValue());
        paramsMap.put("amount",userWithdrawInfo.getMoney().toString());
        paramsMap.put("callbackUrl",userWithdrawInfo.getCallbackUrl());
        paramsMap.put("service",YeepayServiceType.WITHDRAW.getValue());
        paramsMap.put("requestNo", userWithdrawInfo.getTrusteeshipOrderNo());
        paramsMap.put("platformUserNo", thirdPartyCustodianUser.getTrusteeshipUserId());
        return paramsMap;
	}
	
}
