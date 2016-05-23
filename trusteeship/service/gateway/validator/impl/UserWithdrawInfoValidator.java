package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.validator.impl;

import java.math.BigDecimal;
import org.springframework.stereotype.Service;
import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserWithdrawInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.TrusteeshipUserInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.InvalidMoneyValueException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipUserException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyUserWithdrawInfoException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipUserIdException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipOrderNoException;

@Service("userWithdrawInfoValidator")
class UserWithdrawInfoValidator implements ParameterValidator<UserWithdrawInfo>{

	@Override
	public void validate(UserWithdrawInfo userWithdrawInfo) {
		validateWhetherUserWithdrawInfoIsEmpty(userWithdrawInfo);
		validateTrusteeshipIsEmpty(userWithdrawInfo);
		validateWhetherThirdPartyCustodianOrderNoIsEmpty(userWithdrawInfo);
		validateWhetherMoneyIsValid(userWithdrawInfo);
		validateWhetherTrusteeshipIdIsEmpty(userWithdrawInfo);
	}
	
	private void validateWhetherUserWithdrawInfoIsEmpty(UserWithdrawInfo userWithdrawInfo){
		if(ValidateParameterUtil.isEmpty(userWithdrawInfo)){
			throw new EmptyUserWithdrawInfoException();
		}
	}
	
	private void validateTrusteeshipIsEmpty(UserWithdrawInfo userWithdrawInfo){
		TrusteeshipUserInfo trusteeshipUserInfo =userWithdrawInfo.getTrusteeshipUserInfo();
		if(ValidateParameterUtil.isEmpty(trusteeshipUserInfo)){
			throw new EmptyTrusteeshipUserException();
		}
	}
	
	private void  validateWhetherThirdPartyCustodianOrderNoIsEmpty(UserWithdrawInfo userWithdrawInfo){
		if(ValidateParameterUtil.isEmpty(userWithdrawInfo.getTrusteeshipOrderNo())){
			throw new EmptyTrusteeshipOrderNoException();
		}
	}
	
	private void  validateWhetherMoneyIsValid(UserWithdrawInfo userWithdrawInfo){
		boolean  isEmptyMoney=	userWithdrawInfo.getMoney()==null;
		boolean  isNotPositiveValue=	userWithdrawInfo.getMoney().compareTo(BigDecimal.ZERO)!=1;
		if(isEmptyMoney||isNotPositiveValue){
			   throw new InvalidMoneyValueException();
		}	
	}
	
	private void  validateWhetherTrusteeshipIdIsEmpty(UserWithdrawInfo userWithdrawInfo){
		TrusteeshipUserInfo trusteeshipUserInfo=userWithdrawInfo.getTrusteeshipUserInfo();
		boolean  isEmptyTrusteeshipUserId= ValidateParameterUtil.isEmpty(trusteeshipUserInfo.getTrusteeshipUserId());
		if(isEmptyTrusteeshipUserId){
			throw new EmptyTrusteeshipUserIdException();
		}
	}
	
	
}
