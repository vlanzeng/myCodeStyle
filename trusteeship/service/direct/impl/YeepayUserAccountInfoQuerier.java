package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.TrusteeshipUserInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayUserAccountInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipUserException;
import com.weilingtou.soa.internal.common.util.trusteeship.service.direct.TrusteeshipUserAccountInfoQuerier;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyDealthirdPartyCustodianUserIdException;
import com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.TrusteeshipDirectInteractiveExecutor;

@Service("yeepayUserAccountInfoQuerier")
class YeepayUserAccountInfoQuerier implements TrusteeshipUserAccountInfoQuerier{
	@Resource(name="yeepayQueryUserAccountInfoExecutor")
	private TrusteeshipDirectInteractiveExecutor<TrusteeshipUserInfo,YeepayUserAccountInfo> yeepayQueryUserAccountInfoExecutor;
	
	@Override
	public YeepayUserAccountInfo queryUserTrusteeshipAccount(TrusteeshipUserInfo thirdPartyCustodianUser) {
		validateThirdPartyCustodianUser(thirdPartyCustodianUser);
		return yeepayQueryUserAccountInfoExecutor.sendRequest(thirdPartyCustodianUser);
	}
	
	private void validateThirdPartyCustodianUser(TrusteeshipUserInfo thirdPartyCustodianUser){
		validateThirdPartyCustodianUserWhetherIsEmpty(thirdPartyCustodianUser);
		validateThirdPartyCustodianUserIdWhetherIsEmpty(thirdPartyCustodianUser);
	}
	private void validateThirdPartyCustodianUserWhetherIsEmpty(TrusteeshipUserInfo thirdPartyCustodianUser){
		if(ValidateParameterUtil.isEmpty(thirdPartyCustodianUser)){
			throw new EmptyTrusteeshipUserException();
		}
	}
	
	private void validateThirdPartyCustodianUserIdWhetherIsEmpty(TrusteeshipUserInfo thirdPartyCustodianUser){
		if(ValidateParameterUtil.isEmpty(thirdPartyCustodianUser.getTrusteeshipUserId())){
			throw new EmptyDealthirdPartyCustodianUserIdException();
		}
	}
	
}
