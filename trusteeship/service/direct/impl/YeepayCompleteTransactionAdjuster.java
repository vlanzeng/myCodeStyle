package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.CompleteTransactionInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.direct.TrusteeshipCompleteTransactionAdjuster;
import com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.TrusteeshipDirectInteractiveExecutor;

@Service("yeepayCompleteTransactionAdjuster")
class YeepayCompleteTransactionAdjuster implements TrusteeshipCompleteTransactionAdjuster{
	
	@Resource(name="completeTransactionInfoValidator")
	private ParameterValidator<CompleteTransactionInfo>  completeTransactionInfoValidator;
	
	@Resource(name="yeepayConfirmTransactionExecutor")
	private TrusteeshipDirectInteractiveExecutor<CompleteTransactionInfo, Void>   yeepayConfirmTransactionExecutor;
	
	@Resource(name="yeepayCancelConfirmTransactionExecutor")
	private TrusteeshipDirectInteractiveExecutor<CompleteTransactionInfo, Void>   yeepayCancelConfirmTransactionExecutor;
	
	
	@Override
	public void confirmTransaction(CompleteTransactionInfo completeTransactionInfo) {
		completeTransactionInfoValidator.validate(completeTransactionInfo);
		yeepayConfirmTransactionExecutor.sendRequest(completeTransactionInfo);
	}

	@Override
	public void cancelTransaction(CompleteTransactionInfo completeTransactionInfo) {
		completeTransactionInfoValidator.validate(completeTransactionInfo);
		yeepayCancelConfirmTransactionExecutor.sendRequest(completeTransactionInfo);
	}
	
}
