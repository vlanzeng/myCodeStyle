package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayWithdrawRecord;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.SingleBusinessQueryInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.direct.TrusteeshipWithdrawRecordQuerier;
import com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.TrusteeshipDirectInteractiveExecutor;

@Service("yeepayWithdrawRecordQuerier")
class YeepayWithdrawRecordQuerier implements TrusteeshipWithdrawRecordQuerier{
	
	@Resource(name="singleBusinessQueryInfoValidator")
	private ParameterValidator<SingleBusinessQueryInfo>  singleBusinessQueryInfoValidator;
	
	@Resource(name="yeepayWithdrawRecordQueryExecutor")
	private TrusteeshipDirectInteractiveExecutor<SingleBusinessQueryInfo, YeepayWithdrawRecord>  yeepayWithdrawRecordQueryExecutor;
	
	@Override
	public YeepayWithdrawRecord query(SingleBusinessQueryInfo singleBusinessQueryInfo) {
		singleBusinessQueryInfoValidator.validate(singleBusinessQueryInfo);
		return yeepayWithdrawRecordQueryExecutor.sendRequest(singleBusinessQueryInfo);
	}
	
}
