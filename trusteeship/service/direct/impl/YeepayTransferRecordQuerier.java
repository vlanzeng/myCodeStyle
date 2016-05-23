package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayTransferRecord;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.SingleBusinessQueryInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.direct.TrusteeshipTransferRecordQuerier;
import com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.TrusteeshipDirectInteractiveExecutor;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;

@Service("yeepayTransferRecordQuerier")
class YeepayTransferRecordQuerier implements TrusteeshipTransferRecordQuerier{
	
	@Resource(name="singleBusinessQueryInfoValidator")
	private ParameterValidator<SingleBusinessQueryInfo> singleBusinessQueryInfoValidator;
	
	@Resource(name="yeepayTransferRecordQueryExecutor")
	private TrusteeshipDirectInteractiveExecutor<SingleBusinessQueryInfo,YeepayTransferRecord> yeepayTransferRecordQueryExecutor;
	
	@Override
	public YeepayTransferRecord query(SingleBusinessQueryInfo singleBusinessQueryInfo) {
		singleBusinessQueryInfoValidator.validate(singleBusinessQueryInfo);
		return yeepayTransferRecordQueryExecutor.sendRequest(singleBusinessQueryInfo);
	}
	
}
