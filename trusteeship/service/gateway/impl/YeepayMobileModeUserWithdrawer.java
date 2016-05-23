package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserWithdrawInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.TrusteeshipUserWithdrawer;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.TrusteeshipGatewayResultCreator;

@Service("yeepayMobileModeUserWithdrawer")
class YeepayMobileModeUserWithdrawer implements TrusteeshipUserWithdrawer {
	
	@Resource(name="userWithdrawInfoValidator")
	private ParameterValidator<UserWithdrawInfo> userWithdrawInfoValidator;
	
	@Resource(name="yeepayUserWithdrawMobileModeResultCreator")
	private TrusteeshipGatewayResultCreator<UserWithdrawInfo>  yeepayUserWithdrawMobileModeResultCreator;
	
	@Override
	public GatewayResult withdraw(UserWithdrawInfo userWithdrawInfo) {
		userWithdrawInfoValidator.validate(userWithdrawInfo);
		return yeepayUserWithdrawMobileModeResultCreator.create(userWithdrawInfo);
	}
	
}
