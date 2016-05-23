package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserRegisterInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.TrusteeshipUserRegister;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.TrusteeshipGatewayResultCreator;

@Service("YeepayUserRegister")
class YeepayUserRegister implements TrusteeshipUserRegister{
	
	@Resource(name="userRegisterInfoValidator")
	private ParameterValidator<UserRegisterInfo>   userRegisterInfoValidator;
	
	@Resource(name="yeepayUserRegisterGatewayResultCreator")
	private TrusteeshipGatewayResultCreator<UserRegisterInfo> yeepayUserRegisterGatewayResultCreator;
	
	
	@Override
	public GatewayResult register(UserRegisterInfo userRegisterInfo) {
		userRegisterInfoValidator.validate(userRegisterInfo);
		return yeepayUserRegisterGatewayResultCreator.create(userRegisterInfo);
	}
	
	
	
}
