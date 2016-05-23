package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.impl;

import java.util.Map;
import java.util.HashMap;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserUnFreezeMoneyInfo;

@Service("yeepayUserUnfreezeMoneyExecutor")
class YeepayUserUnfreezeMoneyExecutor extends AbstractYeepayDirectInteractiveExecutor<UserUnFreezeMoneyInfo, Void>{

	@Override
	protected Map<String, String> createParamsMap(UserUnFreezeMoneyInfo userUnFreezeMoneyInfo) {
		Map<String, String> paramsMap = new HashMap<String, String>();
	    paramsMap.put("freezeRequestNo", userUnFreezeMoneyInfo.getFreezeTrusteeshipUserOrderNo());
	    return paramsMap;
	}

	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return "/epay/UnFreezeWsAction.a";
	}

	@Override
	protected Void parseRequestResult(String xmlResult) {
		return VoidCreator.createVoid();
	}

}
