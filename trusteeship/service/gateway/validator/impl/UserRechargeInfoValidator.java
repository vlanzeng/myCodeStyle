package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.validator.impl;

import java.math.BigDecimal;
import org.springframework.stereotype.Service;
import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserRechargeInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.TrusteeshipUserInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.InvalidMoneyValueException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipUserException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyUserRechargeInfoException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipUserIdException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipOrderNoException;

@Service("userRechargeInfoValidator")
class UserRechargeInfoValidator implements ParameterValidator<UserRechargeInfo>{

	@Override
	public void validate(UserRechargeInfo userRechargeInfo) {
		validateWhetherUserRechargeInfoIsEmpty(userRechargeInfo);
		validateTrusteeshipUserIsEmpty(userRechargeInfo);
		validateWhetherRechargeMoneyIsValid(userRechargeInfo);
		validateWhetherTrusteeshipOrderNoIsEmpty(userRechargeInfo);
		validateWhetherTrusteeshipUserIdIsEmpty(userRechargeInfo);
	}
	
	private void  validateWhetherUserRechargeInfoIsEmpty(UserRechargeInfo userRechargeInfo){
		   if(ValidateParameterUtil.isEmpty(userRechargeInfo)){
			   throw new EmptyUserRechargeInfoException();
		   }	
	}
	
	private void  validateTrusteeshipUserIsEmpty(UserRechargeInfo userRechargeInfo){
		TrusteeshipUserInfo  thirdPartyCustodianUser =userRechargeInfo.getTrusteeshipUserInfo();
		if(ValidateParameterUtil.isEmpty(thirdPartyCustodianUser)){
			   throw new EmptyTrusteeshipUserException();
		}	
	}
	
	private void  validateWhetherRechargeMoneyIsValid(UserRechargeInfo userRechargeInfo){
		boolean  isEmptyMoney=	userRechargeInfo.getRechargeMoney()==null;
		boolean  isNotPositiveValue=	userRechargeInfo.getRechargeMoney().compareTo(BigDecimal.ZERO)!=1;
		if(isEmptyMoney||isNotPositiveValue){
			   throw new InvalidMoneyValueException();
		}	
	}
	
	private void validateWhetherTrusteeshipOrderNoIsEmpty(UserRechargeInfo userRechargeInfo){
		boolean  isEmptyThirdPartyCustodianOrderNo= ValidateParameterUtil.isEmpty(userRechargeInfo.getTrusteeshipOrderNo());
		if(isEmptyThirdPartyCustodianOrderNo){
			throw  new  EmptyTrusteeshipOrderNoException();
		}
	}
	
	private void  validateWhetherTrusteeshipUserIdIsEmpty(UserRechargeInfo userRechargeInfo){
		TrusteeshipUserInfo thirdPartyCustodianUser=userRechargeInfo.getTrusteeshipUserInfo();
		boolean  isEmptyThirdPartyCustodianUserId= ValidateParameterUtil.isEmpty(thirdPartyCustodianUser.getTrusteeshipUserId());
		if(isEmptyThirdPartyCustodianUserId){
			throw new EmptyTrusteeshipUserIdException();
		}
	}
}
