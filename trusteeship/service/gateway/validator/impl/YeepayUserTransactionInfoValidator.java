package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.validator.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;
import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserTransactionInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.InvalidMoneyValueException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipUserIdException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyYeepayUserTransactionInfoException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyDealthirdPartyCustodianUserIdException;

@Service("yeepayUserTransactionInfoValidator")
class YeepayUserTransactionInfoValidator implements ParameterValidator<UserTransactionInfo>{

	@Override
	public void validate(UserTransactionInfo yeepayUserTransactionInfo) {
		validateYeepayUserTransactionInfoWhetherEmpty(yeepayUserTransactionInfo);
		validateTrusteeshipUserIdWhetherEmpty(yeepayUserTransactionInfo);
		validateDealThirdPartyCustodianUserIdWhetherEmpty(yeepayUserTransactionInfo);
		validateDealMoneyEmpty(yeepayUserTransactionInfo);
	}
	
	private void  validateYeepayUserTransactionInfoWhetherEmpty(UserTransactionInfo yeepayUserTransactionInfo){
		if(ValidateParameterUtil.isEmpty(yeepayUserTransactionInfo)){
			throw new EmptyYeepayUserTransactionInfoException();
		}
	}
	
	private void validateTrusteeshipUserIdWhetherEmpty(UserTransactionInfo yeepayUserTransactionInfo){
		if(ValidateParameterUtil.isEmpty(yeepayUserTransactionInfo.getTrusteeshipUserId())){
			throw new EmptyTrusteeshipUserIdException();
		}
	}
	
	private void validateDealThirdPartyCustodianUserIdWhetherEmpty(UserTransactionInfo yeepayUserTransactionInfo){
		if(ValidateParameterUtil.isEmpty(yeepayUserTransactionInfo.getTrusteeshipUserId())){
			throw new EmptyDealthirdPartyCustodianUserIdException();
		}
	}
	
	private void validateDealMoneyEmpty(UserTransactionInfo yeepayUserTransactionInfo){
		BigDecimal  dealMoney=yeepayUserTransactionInfo.getDealMoney();
		boolean isNotPositiveValue=dealMoney.compareTo(BigDecimal.ZERO)!=1;
		if(ValidateParameterUtil.isEmpty(dealMoney)||isNotPositiveValue){
			throw new InvalidMoneyValueException();
		}
	}
	
}
