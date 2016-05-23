package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.validate.impl;

import org.springframework.stereotype.Service;
import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.CompleteTransactionInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipOrderNoException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyCompleteTransactionInfoException;

@Service("completeTransactionInfoValidator")
class CompleteTransactionInfoValidator implements ParameterValidator<CompleteTransactionInfo>{

	@Override
	public void validate(CompleteTransactionInfo completeTransactionInfo) {
		validateCompleteTransactionInfoWhetherEmpty(completeTransactionInfo);
		voidTrusteeshipTransactionInfoOrderNoWhetherEmpty(completeTransactionInfo);
	}
	
	private void validateCompleteTransactionInfoWhetherEmpty( CompleteTransactionInfo completeTransactionInfo){
		if(ValidateParameterUtil.isEmpty(completeTransactionInfo)){
			throw new  EmptyCompleteTransactionInfoException();
		}
	}
	
	private void  voidTrusteeshipTransactionInfoOrderNoWhetherEmpty( CompleteTransactionInfo completeTransactionInfo){
		if(ValidateParameterUtil.isEmpty(completeTransactionInfo.getTrusteeshipTransactionInfoOrderNo())){
			throw new EmptyTrusteeshipOrderNoException();
		}
	}
	
}
