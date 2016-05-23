package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.impl;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserFreezeMoneyInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserUnFreezeMoneyInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyUserUnFreezeMoneyInfoException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.InvalidMoneyValueException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipUserIdException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipOrderNoException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipUserFreezeMoneyInfoException;
import com.weilingtou.soa.internal.common.util.trusteeship.service.direct.TrusteeshipUserMoneyTemperatureAdjuster;
import com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.TrusteeshipDirectInteractiveExecutor;

@Service("yeepayUserMoneyTemperatureAdjuster")
class YeepayUserMoneyTemperatureAdjuster implements  TrusteeshipUserMoneyTemperatureAdjuster{
	
	@Resource(name="yeepayUserFreezeMoneyExecutor")
	private TrusteeshipDirectInteractiveExecutor<UserFreezeMoneyInfo,Void> yeepayUserFreezeMoneyExecutor;
	
	@Resource(name="yeepayUserUnfreezeMoneyExecutor")
	private TrusteeshipDirectInteractiveExecutor<UserUnFreezeMoneyInfo, Void> yeepayUserUnfreezeMoneyExecutor;
	
	@Override
	public void freezeMoney(UserFreezeMoneyInfo userFreezeMoneyInfo) {
		validateThirdPartyUserFreezeMoneyInfo(userFreezeMoneyInfo);
		yeepayUserFreezeMoneyExecutor.sendRequest(userFreezeMoneyInfo);
	}
	
	private  void validateThirdPartyUserFreezeMoneyInfo(UserFreezeMoneyInfo thirdPartyUserFreezeMoneyInfo){
		validateThirdPartyUserFreezeMoneyInfoWhetherEmpty(thirdPartyUserFreezeMoneyInfo);
		validateFreezeMoneyWhetherIsValid(thirdPartyUserFreezeMoneyInfo);
		validateTrusteeshipUserIdWhetherIsEmpty(thirdPartyUserFreezeMoneyInfo);
		validateTrusteeshipOrderNoIsEmpty(thirdPartyUserFreezeMoneyInfo);
	}
	
	private void validateThirdPartyUserFreezeMoneyInfoWhetherEmpty(UserFreezeMoneyInfo thirdPartyUserFreezeMoneyInfo){
		if(ValidateParameterUtil.isEmpty(thirdPartyUserFreezeMoneyInfo)){
			throw new  EmptyTrusteeshipUserFreezeMoneyInfoException();
		}
	}
	
	private void  validateFreezeMoneyWhetherIsValid(UserFreezeMoneyInfo thirdPartyUserFreezeMoneyInfo){
		boolean isNotPositiveValue=thirdPartyUserFreezeMoneyInfo.getFreezeMoney().compareTo(BigDecimal.ZERO)!=1;
		if(ValidateParameterUtil.isEmpty(thirdPartyUserFreezeMoneyInfo)||isNotPositiveValue){
			throw new InvalidMoneyValueException();
		}
	}
	
	private void  validateTrusteeshipUserIdWhetherIsEmpty(UserFreezeMoneyInfo thirdPartyUserFreezeMoneyInfo){
		if(ValidateParameterUtil.isEmpty(thirdPartyUserFreezeMoneyInfo.getTrusteeshipUserId()) ){
			throw new EmptyTrusteeshipUserIdException();
		}
	}
	
	private void validateTrusteeshipOrderNoIsEmpty(UserFreezeMoneyInfo thirdPartyUserFreezeMoneyInfo){
		if(ValidateParameterUtil.isEmpty(thirdPartyUserFreezeMoneyInfo.getTrusteeshipUserOrderNo()) ){
			throw new EmptyTrusteeshipOrderNoException();
		}
	}

	@Override
	public void unFreezeMoney(UserUnFreezeMoneyInfo userUnFreezeMoneyInfo) {
		validateUserUnFreezeMoneyInfo(userUnFreezeMoneyInfo);
		yeepayUserUnfreezeMoneyExecutor.sendRequest(userUnFreezeMoneyInfo);
	}
	
	private void validateUserUnFreezeMoneyInfo(UserUnFreezeMoneyInfo userUnFreezeMoneyInfo){
		validateUserUnFreezeMoneyInfoWhtherEmpty(userUnFreezeMoneyInfo);
		validateTrusteeshipFreezeOrderNoWhetherEmpty(userUnFreezeMoneyInfo);
	}
	
	private void validateUserUnFreezeMoneyInfoWhtherEmpty(UserUnFreezeMoneyInfo userUnFreezeMoneyInfo){
		if(ValidateParameterUtil.isEmpty(userUnFreezeMoneyInfo)){
			throw new EmptyUserUnFreezeMoneyInfoException();
		}
	}
	
	private void  validateTrusteeshipFreezeOrderNoWhetherEmpty(UserUnFreezeMoneyInfo userUnFreezeMoneyInfo){
		if(ValidateParameterUtil.isEmpty(userUnFreezeMoneyInfo.getFreezeTrusteeshipUserOrderNo())){
			throw new EmptyTrusteeshipOrderNoException();
		}
	}
	
}
