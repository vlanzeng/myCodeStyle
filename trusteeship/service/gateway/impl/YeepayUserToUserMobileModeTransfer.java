package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserTransactionInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.TrusteeshipUserMoneyTransfer;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.TrusteeshipGatewayResultCreator;

@Service("yeepayUserToUserMobileModeTransfer")
class YeepayUserToUserMobileModeTransfer implements TrusteeshipUserMoneyTransfer{
	
	@Resource(name="yeepayUserTransactionInfoValidator") 
	private ParameterValidator<UserTransactionInfo> yeepayUserTransactionInfoValidator;
	
	@Resource(name="yeepayUserToUserMobileModeTransferCreator")
	private  TrusteeshipGatewayResultCreator<UserTransactionInfo>  yeepayUserToUserMobileModeTransferCreator;
	@Override
	public GatewayResult transfer(UserTransactionInfo userTransactionInfo) {
		yeepayUserTransactionInfoValidator.validate(userTransactionInfo);
		return yeepayUserToUserMobileModeTransferCreator.create(userTransactionInfo);
	}

}
