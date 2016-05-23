package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;

public interface TrusteeshipGatewayResultCreator<T> {
		GatewayResult   create(T paramer);
}
