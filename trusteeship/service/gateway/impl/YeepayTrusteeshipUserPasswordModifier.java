package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserUpdatePasswordInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.TrusteeshipUserPasswordModifier;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipUserIdException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipOrderNoException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyYeepayUserUpdatePasswordInfoException;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.TrusteeshipGatewayResultCreator;

@Service("yeepayTrusteeshipUserPasswordModifier")
class YeepayTrusteeshipUserPasswordModifier implements TrusteeshipUserPasswordModifier{
	
	@Resource(name="yeepayUserUpdatePasswordGatewayResultCreator")
	private   TrusteeshipGatewayResultCreator<UserUpdatePasswordInfo>  yeepayUserUpdatePasswordGatewayResultCreator;
	
	
	@Override
	public GatewayResult modifyPassword(UserUpdatePasswordInfo yeepayUserUpdatePasswordInfo) {
		validateYeepayUserUpdatePasswordInfo(yeepayUserUpdatePasswordInfo);
		return yeepayUserUpdatePasswordGatewayResultCreator.create(yeepayUserUpdatePasswordInfo);
	}
	
	private void  validateYeepayUserUpdatePasswordInfo(UserUpdatePasswordInfo yeepayUserUpdatePasswordInfo){
		validateWhetherYeepayUserUpdatePasswordInfoIsEmpty(yeepayUserUpdatePasswordInfo);
		validateWhetherTrusteeshipUserIdIsEmpty(yeepayUserUpdatePasswordInfo);
		validateWhetherTrusteeshipOrderNoIsEmpty(yeepayUserUpdatePasswordInfo);
	}
	
	private void  validateWhetherYeepayUserUpdatePasswordInfoIsEmpty(UserUpdatePasswordInfo yeepayUserUpdatePasswordInfo){
		if(ValidateParameterUtil.isEmpty(yeepayUserUpdatePasswordInfo)){
			throw new EmptyYeepayUserUpdatePasswordInfoException();
		}
		
	}
	
	private void validateWhetherTrusteeshipUserIdIsEmpty(UserUpdatePasswordInfo yeepayUserUpdatePasswordInfo){
		if(ValidateParameterUtil.isEmpty(yeepayUserUpdatePasswordInfo.getTrusteeshipUserId())){
			throw new EmptyTrusteeshipUserIdException();
		}
	}
	
	private void validateWhetherTrusteeshipOrderNoIsEmpty(UserUpdatePasswordInfo yeepayUserUpdatePasswordInfo){
		if(ValidateParameterUtil.isEmpty(yeepayUserUpdatePasswordInfo.getTrusteeshipOrderNo())){
			throw new EmptyTrusteeshipOrderNoException();
		}
	}
	
	
}
