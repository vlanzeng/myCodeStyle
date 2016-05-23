package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.validator.impl;

import org.springframework.stereotype.Service;
import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserMobileResetInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipUserIdException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipOrderNoException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyYeepayUserUpdatePasswordInfoException;

@Service("userMobileResetInfoValidator")
class UserMobileResetInfoValidator implements ParameterValidator<UserMobileResetInfo>{

	@Override
	public void validate(UserMobileResetInfo yeepayUserMobileResetInfo) {
		validateWhetherYeepayUserMobileResetInfoIsEmpty(yeepayUserMobileResetInfo);
		validateWhetherTrusteeshipUserIdIsEmpty(yeepayUserMobileResetInfo);
		validateWhetherTrusteeshipOrderNoIsEmpty(yeepayUserMobileResetInfo);
	}
	
	private void  validateWhetherYeepayUserMobileResetInfoIsEmpty(UserMobileResetInfo yeepayUserMobileResetInfo){
		if(ValidateParameterUtil.isEmpty(yeepayUserMobileResetInfo)){
			throw new EmptyYeepayUserUpdatePasswordInfoException();
		}
		
	}
	
	private void validateWhetherTrusteeshipUserIdIsEmpty(UserMobileResetInfo yeepayUserMobileResetInfo){
		if(ValidateParameterUtil.isEmpty(yeepayUserMobileResetInfo.getTrusteeshipUserId())){
			throw new EmptyTrusteeshipUserIdException();
		}
	}
	
	private void validateWhetherTrusteeshipOrderNoIsEmpty(UserMobileResetInfo yeepayUserMobileResetInfo){
		if(ValidateParameterUtil.isEmpty(yeepayUserMobileResetInfo.getTrusteeshipUserOrderNo())){
			throw new EmptyTrusteeshipOrderNoException();
		}
	}
}
