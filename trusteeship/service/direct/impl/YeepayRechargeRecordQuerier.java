package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayRechargeRecord;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.SingleBusinessQueryInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.direct.TrusteeshipRechargeRecordQuerier;
import com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.TrusteeshipDirectInteractiveExecutor;

@Service("yeepayRechargeRecordQuerier")
class YeepayRechargeRecordQuerier implements TrusteeshipRechargeRecordQuerier{
	
	@Resource(name="singleBusinessQueryInfoValidator")
	private ParameterValidator<SingleBusinessQueryInfo> singleBusinessQueryInfoValidator;
	
	@Resource(name="yeepayRechargeRecordQueryExecutor")
	private TrusteeshipDirectInteractiveExecutor<SingleBusinessQueryInfo,YeepayRechargeRecord> yeepayRechargeRecordQueryExecutor;
	
	@Override
	public YeepayRechargeRecord query(SingleBusinessQueryInfo singleBusinessQueryInfo) {
		singleBusinessQueryInfoValidator.validate(singleBusinessQueryInfo);
		return yeepayRechargeRecordQueryExecutor.sendRequest(singleBusinessQueryInfo);
	}
	
}
