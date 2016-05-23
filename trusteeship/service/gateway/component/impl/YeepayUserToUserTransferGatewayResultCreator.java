package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import org.springframework.stereotype.Service;

import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayBusinessType;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayUserType;

@Service("yeepayUserToUserTransferGatewayResultCreator")
class YeepayUserToUserTransferGatewayResultCreator extends AbstractUserTransactionGatewayResultCreator{

	@Override
	protected String getYeepayUserType() {
		return YeepayUserType.MEMBER.getValue();
	}

	@Override
	protected String getYeepayBusinessType() {
		return YeepayBusinessType.TRANSFER.getValue();
	}

	@Override
	protected String getDealUserType() {
		return this.getYeepayUserType();
	}
	
}
