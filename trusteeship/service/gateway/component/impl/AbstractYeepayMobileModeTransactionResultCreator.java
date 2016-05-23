package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import com.alibaba.fastjson.JSON;
import javax.annotation.Resource;
import com.weilingtou.soa.internal.common.util.config.SysConfigStorageConservator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserTransactionInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayCpTransactionInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayCpTransactionDetailInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.generator.ExpireDateGenerator;

abstract class AbstractYeepayMobileModeTransactionResultCreator extends AbstractYeepayMobileModeGateWayResultCreator<UserTransactionInfo>{
	
	@Resource(name="monthPeriodExpireDateGenerator")
	private  ExpireDateGenerator monthPeriodExpireDateGenerator;
	
	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return "/mobile/CpTransactionAction.a";
	}

	@Override
	protected Map<String, String> createparamsMapMap(UserTransactionInfo userTransactionInfo) {
		YeepayCpTransactionInfo  yeepayCpTransactionInfo = createYeepayCpTransactionInfo(userTransactionInfo);
		String jsonYeepayCpTransactionInfo = JSON.toJSONString(yeepayCpTransactionInfo);
		Map<String, String>  paramMap= new HashMap<String, String>();
		paramMap.put("jsonObj", jsonYeepayCpTransactionInfo);
		return paramMap;
	}
	
	private YeepayCpTransactionInfo createYeepayCpTransactionInfo(UserTransactionInfo userTransactionInfo){
		YeepayCpTransactionInfo  yeepayCpTransactionInfo = new YeepayCpTransactionInfo();
		yeepayCpTransactionInfo.setBizType(getYeepayBusinessType());
		yeepayCpTransactionInfo.setCallbackUrl(userTransactionInfo.getCallbackUrl());
		yeepayCpTransactionInfo.setDetails(createYeepayCpTransactionDetailInfoes(userTransactionInfo));
		yeepayCpTransactionInfo.setExpired(monthPeriodExpireDateGenerator.generatorExpireDateString());
		yeepayCpTransactionInfo.setExtend(getBusinessExtendInfo(userTransactionInfo));
		yeepayCpTransactionInfo.setNotifyUrl(null);
		yeepayCpTransactionInfo.setPlatformNo(SysConfigStorageConservator.get("YEEPAY_SYSTEM_PLATFORM_NO"));
		yeepayCpTransactionInfo.setPlatformUserNo(userTransactionInfo.getTrusteeshipUserId());
		yeepayCpTransactionInfo.setRequestNo(userTransactionInfo.getTrusteeshipOrderNo());
		yeepayCpTransactionInfo.setUserType(getYeepayUserType());
		yeepayCpTransactionInfo.setRemark("欢迎参加微领投的相关项目，微领投伴您一路成长！");
		return yeepayCpTransactionInfo;
	}
	
	private  List<YeepayCpTransactionDetailInfo>  createYeepayCpTransactionDetailInfoes(UserTransactionInfo userTransactionInfo){
		List<YeepayCpTransactionDetailInfo>  yeepayCpTransactionDetailInfoes = new ArrayList<YeepayCpTransactionDetailInfo>();
		YeepayCpTransactionDetailInfo yeepayCpTransactionDetailInfo = new YeepayCpTransactionDetailInfo();
		yeepayCpTransactionDetailInfo.setAmount(userTransactionInfo.getDealMoney().doubleValue());
		yeepayCpTransactionDetailInfo.setBizType(getYeepayBusinessType());
		yeepayCpTransactionDetailInfo.setTargetPlatformUserNo(userTransactionInfo.getDealTrusteeshipUserId());
		yeepayCpTransactionDetailInfo.setTargetUserType(getDealUserType());
		yeepayCpTransactionDetailInfoes.add(yeepayCpTransactionDetailInfo);
		return yeepayCpTransactionDetailInfoes;
	}
	
	abstract  protected String getDealUserType();
	
	abstract protected  String getYeepayUserType();
	
	abstract protected  String   getYeepayBusinessType();
	
	abstract protected  Map<String, Object>   getBusinessExtendInfo(UserTransactionInfo userTransactionInfo);

}
