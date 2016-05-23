package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserTransactionInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserInvestProjectInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.TrusteeshipUserProjectInvestor;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.TrusteeshipGatewayResultCreator;

@Service("yeepayUserProjectInvestor")
class YeepayUserProjectInvestor implements TrusteeshipUserProjectInvestor{
	
	@Resource(name="userInvestProjectInfoValidator")
	private ParameterValidator<UserTransactionInfo> userInvestProjectInfoValidator;
	
	@Resource(name="yeepayUserToUserTenderGatewayResultCreator")
	private TrusteeshipGatewayResultCreator<UserTransactionInfo>  yeepayUserToUserTenderGatewayResultCreator;
	
	@Override
	public GatewayResult investProject(UserInvestProjectInfo userInvestProjectInfo) {
		userInvestProjectInfoValidator.validate(userInvestProjectInfo);
		return yeepayUserToUserTenderGatewayResultCreator.create(userInvestProjectInfo);
	}
	
}
