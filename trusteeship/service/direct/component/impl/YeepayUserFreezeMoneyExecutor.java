package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.impl;

import java.util.Map;
import java.util.HashMap;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.config.SysConfigStorageConservator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserFreezeMoneyInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.generator.ExpireDateGenerator;

@Service("yeepayUserFreezeMoneyExecutor")
class YeepayUserFreezeMoneyExecutor extends AbstractYeepayDirectInteractiveExecutor<UserFreezeMoneyInfo, Void>{
	
    @Resource(name="monthPeriodExpireDateGenerator")
    private  ExpireDateGenerator monthPeriodExpireDateGenerator;
    
	@Override
	protected Map<String, String> createParamsMap(UserFreezeMoneyInfo yeepayUserFreezeMoneyInfo) {
		 Map<String,String >  paramsMap= new HashMap<String, String>();
		 paramsMap.put("platformUserNo", yeepayUserFreezeMoneyInfo.getTrusteeshipUserId());
		 paramsMap.put("requestNo", yeepayUserFreezeMoneyInfo.getTrusteeshipUserOrderNo());
		 paramsMap.put("amount",yeepayUserFreezeMoneyInfo.getFreezeMoney().toString());
		 paramsMap.put( "platformNo", SysConfigStorageConservator.get("YEEPAY_SYSTEM_PLATFORM_NO"));
		 String expiredDate=monthPeriodExpireDateGenerator.generatorExpireDateString();
		 paramsMap.put("expired",expiredDate);
		 return paramsMap;
	}
	
	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return "/epay/FreezeWsAction.a";
	}

	@Override
	protected Void parseRequestResult(String xmlResult)  {
		return VoidCreator.createVoid();
	}
	
}
