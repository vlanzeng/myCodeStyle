package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import java.util.Map;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayUserType;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserTransactionInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayBusinessType;

@Service("yeepayUserToUserMobileModeTransferCreator")
class YeepayUserToUserMobileModeTransferCreator extends AbstractYeepayMobileModeTransactionResultCreator{



	@Override
	protected String getDealUserType() {
	  return YeepayUserType.MEMBER.getValue();
	}

	@Override
	protected String getYeepayUserType() {
		return this.getDealUserType();
	}

	@Override
	protected String getYeepayBusinessType() {
	    return YeepayBusinessType.TRANSFER.getValue();
	}

	@Override
	protected Map<String, Object> getBusinessExtendInfo(UserTransactionInfo userTransactionInfo) {
		return null;
	}

}
