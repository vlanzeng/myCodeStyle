package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.validator.impl;

import java.util.Map;
import org.springframework.stereotype.Service;
import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayInteractiveInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyParamsMapException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyRequestHandlerUrlException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyGatewayInteractiveInfoException;

@Service("gatewayInteractiveInfoValidator")
class GatewayInteractiveInfoValidator implements ParameterValidator<GatewayInteractiveInfo>{

	@Override
	public void validate(GatewayInteractiveInfo gatewayInteractiveInfo) {
		validateWhetherEmptyGatewayInteractiveInfo(gatewayInteractiveInfo);
		validateWhetherEmptyRequestHandlerUrl(gatewayInteractiveInfo);
		validateWhetherEmptyParamsMap(gatewayInteractiveInfo);
	}

	
	private void   validateWhetherEmptyGatewayInteractiveInfo(GatewayInteractiveInfo gatewayInteractiveInfo){
		if(ValidateParameterUtil.isEmpty(gatewayInteractiveInfo)){
			throw new  EmptyGatewayInteractiveInfoException();
		}
	}
	
	private void  validateWhetherEmptyRequestHandlerUrl(GatewayInteractiveInfo gatewayInteractiveInfo){
		if(ValidateParameterUtil.isEmpty(gatewayInteractiveInfo.getRequestHandlerUrl())){
			throw new EmptyRequestHandlerUrlException();
		}
	}
	
	private void validateWhetherEmptyParamsMap(GatewayInteractiveInfo gatewayInteractiveInfo){
		Map<String, String>  paramsMap=gatewayInteractiveInfo.getParamsMap();
		if(ValidateParameterUtil.isEmpty(paramsMap)||paramsMap.isEmpty()){
		  throw new EmptyParamsMapException();
		}
      }
}
