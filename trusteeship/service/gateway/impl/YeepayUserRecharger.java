package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserRechargeInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.TrusteeshipUserRecharger;

import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.TrusteeshipGatewayResultCreator;

@Service("yeepayUserRecharger")
class YeepayUserRecharger implements TrusteeshipUserRecharger{

	@Resource(name="yeepayUserRechargerGatewayResultCreator")
	private TrusteeshipGatewayResultCreator<UserRechargeInfo> yeepayUserRechargerGatewayResultCreator;
	
	@Resource(name="userRechargeInfoValidator")
	private ParameterValidator<UserRechargeInfo> userRechargeInfoValidator;    
	
	@Override
	public GatewayResult recharge(UserRechargeInfo userRechargeInfo) {
		userRechargeInfoValidator.validate(userRechargeInfo);
		return yeepayUserRechargerGatewayResultCreator.create(userRechargeInfo);
	}
	
}
