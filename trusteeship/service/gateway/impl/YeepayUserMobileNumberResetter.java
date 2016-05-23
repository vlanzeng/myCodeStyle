package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserMobileResetInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.TrusteeshipUserMobileNumberResetter;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.TrusteeshipGatewayResultCreator;

@Service("yeepayUserMobileNumberResetter")
class YeepayUserMobileNumberResetter implements TrusteeshipUserMobileNumberResetter{
	@Resource(name="yeepayUserMobileNumberResetGateWayResultCreator")
	private TrusteeshipGatewayResultCreator<UserMobileResetInfo>  yeepayUserMobileNumberResetGateWayResultCreator;
	
	@Resource(name="userMobileResetInfoValidator")
	private ParameterValidator<UserMobileResetInfo>  userMobileResetInfoValidator;
	
	@Override
	public GatewayResult resetMobileNumber(UserMobileResetInfo yeepayUserMobileResetInfo) {
		userMobileResetInfoValidator.validate(yeepayUserMobileResetInfo);
		return yeepayUserMobileNumberResetGateWayResultCreator.create(yeepayUserMobileResetInfo);
	}
	
}
