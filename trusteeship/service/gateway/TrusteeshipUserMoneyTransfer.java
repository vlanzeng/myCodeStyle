package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserTransactionInfo;

public interface TrusteeshipUserMoneyTransfer {
	    GatewayResult  transfer(UserTransactionInfo userTransactionInfo );
}
