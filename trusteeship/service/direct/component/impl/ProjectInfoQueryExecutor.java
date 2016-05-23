package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.impl;

import java.util.Map;
import java.util.HashMap;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayProjectInfo;
import com.weilingtou.soa.internal.common.util.config.SysConfigStorageConservator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.TrusteeshipProjectInfoQuery;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayWithdrawRecordsResponse;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.YeepayObjectNotExistException;
import com.weilingtou.soa.internal.common.util.xml.JAXBUtil;
import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import org.springframework.stereotype.Service;

/**
 * @author
 */
@Service("projectInfoQueryExecutor")
class ProjectInfoQueryExecutor extends AbstractYeepayDirectInteractiveExecutor<TrusteeshipProjectInfoQuery, YeepayProjectInfo>{

	@Override
	protected Map<String, String> createParamsMap(TrusteeshipProjectInfoQuery trusteeshipProjectInfoQuery) {
		Map<String, String>  paramsMap=new HashMap<String, String>();
		paramsMap.put("platformNo", SysConfigStorageConservator.get("YEEPAY_SYSTEM_PLATFORM_NO"));
		paramsMap.put("orderNo", trusteeshipProjectInfoQuery.getProjectId().toString());
		return paramsMap;
	}

	@Override
	protected String seekMediationYeepayServiceSubUrl() {
		return "epay/ProjectQueryAction.a";
	}

	@Override
	protected YeepayProjectInfo parseRequestResult(String xmlResult) {
        YeepayProjectInfo yeepayProjectInfo = JAXBUtil.unmarshal(YeepayProjectInfo.class, xmlResult);
        return yeepayProjectInfo;
	}

}
