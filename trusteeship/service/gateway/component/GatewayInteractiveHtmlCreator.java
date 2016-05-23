package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayInteractiveInfo;

/**
 * function:第三方网关接口生成接口
 *
 */
public interface GatewayInteractiveHtmlCreator {
	
		String create(GatewayInteractiveInfo gatewayInteractiveInfo);
		
}
