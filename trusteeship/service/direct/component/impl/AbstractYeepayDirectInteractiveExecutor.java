package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.impl;

import java.util.Map;
import com.weilingtou.soa.internal.common.util.xml.JAXBUtil;
import com.weilingtou.soa.internal.common.util.http.HttpClientUtils;
import com.weilingtou.soa.internal.common.util.config.SysConfigStorageConservator;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayResultCodeType;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.BusinessLimitException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.RealNameFailureException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.YeepayXmlFormatException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.BusinessWrongStateException;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayDirectInteractiveBaseResult;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.YeepayObjectNotExistException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.RequestYeepayServiceFailureException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.YeepaySignatureVerificationException;
import com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.TrusteeshipDirectInteractiveExecutor;

abstract class AbstractYeepayDirectInteractiveExecutor<P,R> implements TrusteeshipDirectInteractiveExecutor<P,R>{

	@Override
	public R sendRequest(P param) {
		Map<String,String> params=createParamsMap(param);
		String xmlResult = HttpClientUtils.sendPost(SysConfigStorageConservator.get("THIRD_PARTY_PROXY_SERVICE_BASE_URL")+seekMediationYeepayServiceSubUrl(), params);
		validateRequestResultState(xmlResult);
		return parseRequestResult(xmlResult);
	}
	
	protected abstract  Map<String,String>  createParamsMap(P param);
	

	protected abstract String seekMediationYeepayServiceSubUrl();
	
	protected abstract R parseRequestResult(String xmlResult);
	
	private void validateRequestResultState(String xmlResult){
		YeepayDirectInteractiveBaseResult yeepayDirectInteractiveBaseResult=parseRequestBaseResult(xmlResult);
		if(yeepayDirectInteractiveBaseResult.getCode()==YeepayResultCodeType.FAILURE.getValue()){
			throw new RequestYeepayServiceFailureException();
		}
		if(yeepayDirectInteractiveBaseResult.getCode()==YeepayResultCodeType.XML_FORMAT_ERROR.getValue()){
			throw new YeepayXmlFormatException();
		}
		if(yeepayDirectInteractiveBaseResult.getCode()==YeepayResultCodeType.SIGNATURE_VERIFICATION.getValue() ){
			throw new YeepaySignatureVerificationException();
		}
		if(yeepayDirectInteractiveBaseResult.getCode()==YeepayResultCodeType.OBJECT_NOT_EXIST_ERROR.getValue()){
			throw new YeepayObjectNotExistException();
		}
		if(yeepayDirectInteractiveBaseResult.getCode()==YeepayResultCodeType.BUSINESS_WRONG_STATE.getValue() ){
			throw new BusinessWrongStateException();
		}
		if(yeepayDirectInteractiveBaseResult.getCode()==YeepayResultCodeType.BUSINESS_LIMIT_ERROR.getValue()){
			throw new  BusinessLimitException();
		}
		if(yeepayDirectInteractiveBaseResult.getCode()==YeepayResultCodeType.REAL_NAME_FAILURE.getValue()){
			throw new RealNameFailureException();
		}
	}
	
	private YeepayDirectInteractiveBaseResult  parseRequestBaseResult(String xmlResult){
			return JAXBUtil.unmarshal(YeepayDirectInteractiveBaseResult.class, xmlResult);
	}
	
}
