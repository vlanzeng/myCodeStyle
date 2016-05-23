package com.weilingtou.soa.internal.common.util.trusteeship.service.direct;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.TrusteeshipUserInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayUserAccountInfo;


public interface TrusteeshipUserAccountInfoQuerier {
	
	YeepayUserAccountInfo  queryUserTrusteeshipAccount(TrusteeshipUserInfo thirdPartyCustodianUser);
	
}
