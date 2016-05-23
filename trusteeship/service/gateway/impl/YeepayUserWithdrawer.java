package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserWithdrawInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.TrusteeshipUserWithdrawer;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.TrusteeshipGatewayResultCreator;

@Service("yeepayUserWithdrawer")
class YeepayUserWithdrawer implements TrusteeshipUserWithdrawer{
	
	@Resource(name="userWithdrawInfoValidator")
	private ParameterValidator<UserWithdrawInfo> userWithdrawInfoValidator;
	
	@Resource(name="yeepayWithdrawerGatewayResultCreator")
	private TrusteeshipGatewayResultCreator<UserWithdrawInfo> yeepayWithdrawerGatewayResultCreator;
	
	@Override
	public GatewayResult withdraw(UserWithdrawInfo userWithdrawInfo) {
		userWithdrawInfoValidator.validate(userWithdrawInfo);
		return yeepayWithdrawerGatewayResultCreator.create(userWithdrawInfo);
	}
	
}
