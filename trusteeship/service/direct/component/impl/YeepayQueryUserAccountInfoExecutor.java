package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.impl;

import java.util.Map;
import java.util.HashMap;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.TrusteeshipUserInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayUserAccountInfo;
import com.weilingtou.soa.internal.common.util.xml.JAXBUtil;

@Service("yeepayQueryUserAccountInfoExecutor")
class YeepayQueryUserAccountInfoExecutor extends AbstractYeepayDirectInteractiveExecutor<TrusteeshipUserInfo,YeepayUserAccountInfo>{
	
	@Override
	protected Map<String, String> createParamsMap(TrusteeshipUserInfo thirdPartyCustodianUser) {
		Map<String, String> paramsMap = new HashMap<String, String>();
		paramsMap.put("platformUserNo", thirdPartyCustodianUser.getTrusteeshipUserId());
		return paramsMap;
	}

	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return  "/epay/AccountInfoWSAction.a";
	}

	@Override
	protected YeepayUserAccountInfo parseRequestResult(String xmlResult) {
			return JAXBUtil.unmarshal(YeepayUserAccountInfo.class, xmlResult);
	}
	
}
