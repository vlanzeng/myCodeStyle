package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.impl;

import java.util.Map;
import java.util.HashMap;

import com.weilingtou.soa.internal.common.util.config.SysConfigStorageConservator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.SingleBusinessQueryInfo;

abstract class AbstractYeepaySingleBusinessQueryExecutor<R> extends AbstractYeepayDirectInteractiveExecutor<SingleBusinessQueryInfo, R>{

	@Override
	protected Map<String, String> createParamsMap(SingleBusinessQueryInfo singleBusinessQueryInfo) {
		Map<String, String> paramsMap = new HashMap<String, String>();
		paramsMap.put("requestNo", singleBusinessQueryInfo.getTrusteeshipUserOrderNo()); 
		paramsMap.put("mode", getSingleBusinessQueryMode());
		paramsMap.put("platformNo", SysConfigStorageConservator.get("YEEPAY_SYSTEM_PLATFORM_NO"));
		return paramsMap;
	}
	
	protected abstract String  getSingleBusinessQueryMode();
	
	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return "/epay/QueryWSAction.a";
	}

}
