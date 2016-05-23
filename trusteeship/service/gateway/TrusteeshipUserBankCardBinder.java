package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserBindBankCardInfo;

public interface TrusteeshipUserBankCardBinder {
	
		GatewayResult  bindBankCard(UserBindBankCardInfo userBindBankCardInfo);
		GatewayResult  unBindBankCard(UserBindBankCardInfo userBindBankCardInfo);
}
