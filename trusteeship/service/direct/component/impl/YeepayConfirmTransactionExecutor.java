package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.impl;


import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayCompleteTransactionMode;

@Service("yeepayConfirmTransactionExecutor")
class YeepayConfirmTransactionExecutor extends AbstractYeepayCompleteTransactionExecutor{

	@Override
	protected String getOperationMode() {
		return	YeepayCompleteTransactionMode.CONFIRM_TRANSACTION.getValue();
	}

	@Override
	protected Void parseRequestResult(String xmlResult) {
		return VoidCreator.createVoid();
	}
	
}
