package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.validator.impl;

import org.springframework.stereotype.Service;
import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserBindBankCardInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipUserIdException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipOrderNoException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyUserBindBankCardInfoException;

@Service("userBindBankCardInfoValidator")
class UserBindBankCardInfoValidator implements ParameterValidator<UserBindBankCardInfo>{

	@Override
	public void validate(UserBindBankCardInfo userBindBankCardInfo) {
		validateWhetherUserBindBankCardInfoIsEmpty(userBindBankCardInfo);
		validateTrusteeshipOrderNoIsEmpty(userBindBankCardInfo);
		validateTrusteeshipIsEmpty(userBindBankCardInfo);
	}
	
	private void  validateWhetherUserBindBankCardInfoIsEmpty(UserBindBankCardInfo userBindBankCardInfo){
		if(ValidateParameterUtil.isEmpty(userBindBankCardInfo)){
			throw new EmptyUserBindBankCardInfoException();
		}
	}
	
	private void   validateTrusteeshipOrderNoIsEmpty(UserBindBankCardInfo userBindBankCardInfo){
		if(ValidateParameterUtil.isEmpty(userBindBankCardInfo.getTrusteeshipOrderNo())){
			throw new EmptyTrusteeshipOrderNoException();
		}
	}
	
	private void  validateTrusteeshipIsEmpty(UserBindBankCardInfo userBindBankCardInfo){
		if(ValidateParameterUtil.isEmpty( userBindBankCardInfo.getTrusteeshipUserId())){
			throw new EmptyTrusteeshipUserIdException();
		}
	}
	
}
