package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.validator.impl;

import org.springframework.stereotype.Service;
import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserRegisterInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.TrusteeshipUserInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyCallbackUrlException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipUserException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyUserRegisterInfoException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipUserIdException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipOrderNoException;

@Service("userRegisterInfoValidator")
class UserRegisterInfoValidator implements ParameterValidator<UserRegisterInfo>{

	@Override
	public void validate(UserRegisterInfo userRegisterInfo) {
		validateWhetherUserInfoEmpty(userRegisterInfo);
		validateWhetherUserInfoEmpty(userRegisterInfo);
		validateWhetherCallbackUrlIsEmpty(userRegisterInfo);
		validateWhetherUserRegisterInfoEmpty(userRegisterInfo);
		validateWhetherTrusteeshipOrderNoIsEmpty(userRegisterInfo);
		validateWhetherTrusteeshipUserIdExceptionIsEmpty(userRegisterInfo);
	}
	
	private void  validateWhetherUserRegisterInfoEmpty(UserRegisterInfo userRegisterInfo){
		if(ValidateParameterUtil.isEmpty(userRegisterInfo)){
			throw new EmptyUserRegisterInfoException();
		}
	}
	
	private void  validateWhetherUserInfoEmpty(UserRegisterInfo userRegisterInfo){
		TrusteeshipUserInfo  TrusteeshipUser =	userRegisterInfo.getTrusteeshipUserInfo();
		if(ValidateParameterUtil.isEmpty(TrusteeshipUser)){
			throw  new  EmptyTrusteeshipUserException();  
		}
	}
	
	private void  validateWhetherTrusteeshipUserIdExceptionIsEmpty(UserRegisterInfo userRegisterInfo){
		TrusteeshipUserInfo  thirdPartyCustodianUser =	userRegisterInfo.getTrusteeshipUserInfo();
		if(ValidateParameterUtil.isEmpty(thirdPartyCustodianUser.getTrusteeshipUserId())){
			throw new EmptyTrusteeshipUserIdException();
		}
	}
	
	private void validateWhetherCallbackUrlIsEmpty(UserRegisterInfo userRegisterInfo){
		if(ValidateParameterUtil.isEmpty(userRegisterInfo.getCallbackUrl())){
			throw new EmptyCallbackUrlException();
		}
	}
	
	private void validateWhetherTrusteeshipOrderNoIsEmpty(UserRegisterInfo userRegisterInfo){
		if(ValidateParameterUtil.isEmpty(userRegisterInfo.getTrusteeshipOrderNo())){
			throw new EmptyTrusteeshipOrderNoException();
		}
	}
}
