package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import java.util.HashMap;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserRechargeInfo;
import com.weilingtou.soa.internal.common.util.config.SysConfigStorageConservator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayRechargeInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayFeeModeType;

@Service("yeepayUserRechargeMobileModeResultCreator")
class YeepayUserRechargeMobileModeResultCreator extends AbstractYeepayMobileModeGateWayResultCreator<UserRechargeInfo>{

	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return "mobile//RechargeAction.a";
	}

	@Override
	protected Map<String, String> createparamsMapMap(UserRechargeInfo userRechargeInfo) {
		YeepayRechargeInfo    yeepayRechargeInfo = createYeepayRechargeInfo(userRechargeInfo);
		Map<String,String> map   = new HashMap<String,String>();
		map.put("jsonObj", JSON.toJSONString(yeepayRechargeInfo));
		return map;
	}
	
	private YeepayRechargeInfo   createYeepayRechargeInfo(UserRechargeInfo userRechargeInfo){
		YeepayRechargeInfo    yeepayRechargeInfo = new YeepayRechargeInfo();
		yeepayRechargeInfo.setAmount(userRechargeInfo.getRechargeMoney().doubleValue());
		yeepayRechargeInfo.setCallbackUrl(userRechargeInfo.getCallbackUrl());
		yeepayRechargeInfo.setFeeMode(YeepayFeeModeType.PLAT_FORM.getValue());
		yeepayRechargeInfo.setNotifyUrl("null");
		yeepayRechargeInfo.setPlatformNo(SysConfigStorageConservator.get("YEEPAY_SYSTEM_PLATFORM_NO"));
		yeepayRechargeInfo.setRequestNo(userRechargeInfo.getTrusteeshipOrderNo());
		yeepayRechargeInfo.setPlatformUserNo(userRechargeInfo.getTrusteeshipUserInfo().getTrusteeshipUserId());
		return yeepayRechargeInfo;
	}
	
	
}
