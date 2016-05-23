package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserBindBankCardInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.TrusteeshipUserBankCardBinder;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.TrusteeshipGatewayResultCreator;

@Service("yeepayMobileModeUserBankCardBinder")
class YeepayMobileModeUserBankCardBinder implements TrusteeshipUserBankCardBinder{
	
	@Resource(name="userBindBankCardInfoValidator")
	private ParameterValidator<UserBindBankCardInfo>  userBindBankCardInfoValidator;
	
	@Resource(name="yeepayMobileModeUserbindBanCardCreator")
	private TrusteeshipGatewayResultCreator<UserBindBankCardInfo> yeepayMobileModeUserbindBanCardCreator;
	
	@Override
	public GatewayResult bindBankCard(UserBindBankCardInfo userBindBankCardInfo) {
		userBindBankCardInfoValidator.validate(userBindBankCardInfo);
		return yeepayMobileModeUserbindBanCardCreator.create(userBindBankCardInfo);
	}

	@Override
	public GatewayResult unBindBankCard(UserBindBankCardInfo userBindBankCardInfo) {
		throw new UnsupportedOperationException();
	}

}
