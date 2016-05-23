package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.validator.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.external.common.exception.EmptyProjectIdException;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserTransactionInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserInvestProjectInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyProjectNameException;

@Service("userInvestProjectInfoValidator")
class UserInvestProjectInfoValidator implements ParameterValidator<UserInvestProjectInfo>{
	
	@Resource(name="yeepayUserTransactionInfoValidator")
	private ParameterValidator<UserTransactionInfo> yeepayUserTransactionInfoValidator;
	
	@Override
	public void validate(UserInvestProjectInfo userInvestProjectInfo) {
		yeepayUserTransactionInfoValidator.validate(userInvestProjectInfo);
		validateProjectIdWhetherEmpty(userInvestProjectInfo);
		validateProjectNameWhetherEmpty(userInvestProjectInfo);
		validateProjectMoneyWhetherValid(userInvestProjectInfo);
	}
	
	private void  validateProjectIdWhetherEmpty(UserInvestProjectInfo userInvestProjectInfo){
		if(ValidateParameterUtil.isEmpty(userInvestProjectInfo.getProjectId())){
			throw new EmptyProjectIdException();
		}
	}

	private void  validateProjectNameWhetherEmpty(UserInvestProjectInfo userInvestProjectInfo){
		if(ValidateParameterUtil.isEmpty(userInvestProjectInfo.getProjectName())){
			throw new EmptyProjectNameException();
		}
	}
	
	private void  validateProjectMoneyWhetherValid(UserInvestProjectInfo userInvestProjectInfo){
		if(ValidateParameterUtil.isEmpty(userInvestProjectInfo.getProjectName())){
			throw new EmptyProjectNameException();
		}
	}
	
}
