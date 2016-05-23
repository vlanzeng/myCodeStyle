package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.validate.impl;

import org.springframework.stereotype.Service;
import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.SingleBusinessQueryInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipOrderNoException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptySingleBusinessQueryInfoException;

@Service("singleBusinessQueryInfoValidator")
class SingleBusinessQueryInfoValidator implements ParameterValidator<SingleBusinessQueryInfo>{

	@Override
	public void validate(SingleBusinessQueryInfo singleBusinessQueryInfo) {
		validateSingleBusinessQueryInfoWhetherEmpty(singleBusinessQueryInfo);
		validateTrusteeshipTrusteeshipUserOrderNoWhetherEmpty(singleBusinessQueryInfo);
	}
	
	private void  validateSingleBusinessQueryInfoWhetherEmpty(SingleBusinessQueryInfo singleBusinessQueryInfo){
		if(ValidateParameterUtil.isEmpty(singleBusinessQueryInfo)){
			throw new EmptySingleBusinessQueryInfoException();
		}
	}
	
	private void validateTrusteeshipTrusteeshipUserOrderNoWhetherEmpty(SingleBusinessQueryInfo singleBusinessQueryInfo){
		if(ValidateParameterUtil.isEmpty(singleBusinessQueryInfo.getTrusteeshipUserOrderNo())){
			throw new EmptyTrusteeshipOrderNoException();
		}
	}
	
}	
