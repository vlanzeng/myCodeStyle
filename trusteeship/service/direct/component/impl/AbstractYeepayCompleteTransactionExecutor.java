package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.impl;

import java.util.Map;
import java.util.HashMap;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.CompleteTransactionInfo;

abstract class AbstractYeepayCompleteTransactionExecutor extends AbstractYeepayDirectInteractiveExecutor<CompleteTransactionInfo, Void>{

	@Override
	protected Map<String, String> createParamsMap(CompleteTransactionInfo completeTransactionInfo) {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("requestNo", completeTransactionInfo.getTrusteeshipTransactionInfoOrderNo());
        params.put("mode", getOperationMode());
        params.put("notifyUrl", completeTransactionInfo.getNotifyUrl());
		return params;
	}
	
	protected abstract  String getOperationMode();
	
	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return	"/epay/CompleteTransactionWSAction.a";
	}

}
