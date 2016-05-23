package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserTransactionInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.TrusteeshipUserMoneyTransfer;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.TrusteeshipGatewayResultCreator;

@Service("yeepayUserMoneyTransfer")
class YeepayUserMoneyTransfer implements TrusteeshipUserMoneyTransfer{
	
	@Resource(name="yeepayUserToUserTransferGatewayResultCreator")
	private TrusteeshipGatewayResultCreator<UserTransactionInfo>  yeepayUserToUserTransferGatewayResultCreator;
	
	@Resource(name="yeepayUserTransactionInfoValidator") 
	private ParameterValidator<UserTransactionInfo> yeepayUserTransactionInfoValidator;
	
	@Override
	public GatewayResult transfer(UserTransactionInfo userTransactionInfo) {
		yeepayUserTransactionInfoValidator.validate(userTransactionInfo);
		return yeepayUserToUserTransferGatewayResultCreator.create(userTransactionInfo);
	}
	
}
