package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import java.util.HashMap;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserInvestProjectInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserTransactionInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayBusinessType;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayUserType;

@Service("yeepayUserToUserMobileModeTenderCreator")
class YeepayUserToUserMobileModeTenderCreator extends  AbstractYeepayMobileModeTransactionResultCreator{

	@Override
	protected String getDealUserType() {
		return YeepayUserType.MEMBER.getValue();
	}

	@Override
	protected String getYeepayUserType() {
		return this.getDealUserType();
	}

	@Override
	protected String getYeepayBusinessType() {
		return YeepayBusinessType.TENDER.getValue();
	}

	@Override
	protected Map<String, Object> getBusinessExtendInfo(UserTransactionInfo userTransactionInfo) {
		UserInvestProjectInfo userInvestProjectInfo=(UserInvestProjectInfo) userTransactionInfo;
		Map<String,Object> businessExtendInfoMap  = new HashMap<String, Object>();
		businessExtendInfoMap.put("tenderOrderNo", userInvestProjectInfo.getProjectId());
		businessExtendInfoMap.put("tenderName", userInvestProjectInfo.getProjectName());
		businessExtendInfoMap.put("tenderAmount", userInvestProjectInfo.getDealMoney().toString());
		businessExtendInfoMap.put("tenderDescription", userInvestProjectInfo.getProjectDescripe());
		businessExtendInfoMap.put("borrowerPlatformUserNo", userTransactionInfo.getDealTrusteeshipUserId());
		return businessExtendInfoMap;
	}

}
