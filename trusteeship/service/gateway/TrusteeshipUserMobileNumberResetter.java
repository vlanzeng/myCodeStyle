package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserMobileResetInfo;

public interface TrusteeshipUserMobileNumberResetter {
	    
	GatewayResult  resetMobileNumber(UserMobileResetInfo yeepayUserMobileResetInfo);
	
}
