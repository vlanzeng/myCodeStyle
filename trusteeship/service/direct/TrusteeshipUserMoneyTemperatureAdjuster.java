package com.weilingtou.soa.internal.common.util.trusteeship.service.direct;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserFreezeMoneyInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserUnFreezeMoneyInfo;

public interface TrusteeshipUserMoneyTemperatureAdjuster {
	
	void   freezeMoney(UserFreezeMoneyInfo userFreezeMoneyInfo);
	
	void   unFreezeMoney(UserUnFreezeMoneyInfo  userUnFreezeMoneyInfo);
	
}
