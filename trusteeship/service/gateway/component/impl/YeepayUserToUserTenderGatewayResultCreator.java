package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import org.springframework.stereotype.Service;
import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayUserType;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserTransactionInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserInvestProjectInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayBusinessType;

@Service("yeepayUserToUserTenderGatewayResultCreator")
class YeepayUserToUserTenderGatewayResultCreator extends AbstractUserTransactionGatewayResultCreator{
	
	
	@Override
	protected Map<String, String> createparamsMapMap(UserTransactionInfo yeepayUserTransactionInfo) {
		Map<String, String> params = super.createparamsMapMap(yeepayUserTransactionInfo);
		UserInvestProjectInfo userInvestProjectInfo=(UserInvestProjectInfo) yeepayUserTransactionInfo;
        params.put("tenderOrderNo", userInvestProjectInfo.getProjectId().toString());
        params.put("tenderName", userInvestProjectInfo.getProjectName());
        params.put("tenderAmount",userInvestProjectInfo.getProjectMoney().toString());
        if(ValidateParameterUtil.isEmpty(userInvestProjectInfo.getProjectDescripe() )){
        	 params.put("tenderDescription", "投资项目");
        }else{
        	 params.put("tenderDescription", userInvestProjectInfo.getProjectDescripe());
        }
        params.put("borrowerPlatformUserNo", userInvestProjectInfo.getDealTrusteeshipUserId());
        params.put("remark","欢迎参加微领投的相关项目，微领投伴您一路成长！");
        return params;
	}
	
	@Override
	protected String getYeepayUserType() {
		return YeepayUserType.MEMBER.getValue();
	}

	@Override
	protected String getYeepayBusinessType() {
		return YeepayBusinessType.TENDER.getValue();
	}

	@Override
	protected String getDealUserType() {
		return this.getYeepayUserType();
	}

}
