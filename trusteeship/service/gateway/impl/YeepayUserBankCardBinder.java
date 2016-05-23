package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserBindBankCardInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.TrusteeshipUserBankCardBinder;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.TrusteeshipGatewayResultCreator;


@Service("yeepayUserBankCardBinder")
class YeepayUserBankCardBinder implements TrusteeshipUserBankCardBinder{
	@Resource(name="yeepayUserBindBankCardGatewayResultCreator")
	private TrusteeshipGatewayResultCreator<UserBindBankCardInfo> yeepayUserBindBankCardGatewayResultCreator;
	
	@Resource(name="yeepayUserUnbindBankCardGatewayResultCreator")
	private TrusteeshipGatewayResultCreator<UserBindBankCardInfo> yeepayUserUnbindBankCardGatewayResultCreator;
	
	@Resource(name="userBindBankCardInfoValidator")
	private ParameterValidator<UserBindBankCardInfo>  userBindBankCardInfoValidator;
	
	@Override
	public GatewayResult bindBankCard(UserBindBankCardInfo userBindBankCardInfo) {
		userBindBankCardInfoValidator.validate(userBindBankCardInfo);
		return yeepayUserBindBankCardGatewayResultCreator.create(userBindBankCardInfo);
	}

	@Override
	public GatewayResult unBindBankCard(UserBindBankCardInfo userBindBankCardInfo) {
		userBindBankCardInfoValidator.validate(userBindBankCardInfo);
		return yeepayUserUnbindBankCardGatewayResultCreator.create(userBindBankCardInfo);
	}

}
