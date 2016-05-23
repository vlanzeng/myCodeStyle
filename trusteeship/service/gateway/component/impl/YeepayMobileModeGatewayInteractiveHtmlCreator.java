package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.http.HttpClientUtils;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayInteractiveInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.GatewayInteractiveHtmlCreator;

@Service("yeepayMobileModeGatewayInteractiveHtmlCreator")
class YeepayMobileModeGatewayInteractiveHtmlCreator implements GatewayInteractiveHtmlCreator{
	
	@Resource(name="gatewayInteractiveInfoValidator")
	private    ParameterValidator<GatewayInteractiveInfo>  gatewayInteractiveInfoValidator;
	
	@Override
	public String create(GatewayInteractiveInfo gatewayInteractiveInfo) {
		
		return HttpClientUtils.httpPost(gatewayInteractiveInfo.getRequestHandlerUrl(), gatewayInteractiveInfo.getParamsMap());
		
	}
	
}
