package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.SingleBusinessQueryInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayFreezeUnfreezeRecord;
import com.weilingtou.soa.internal.common.util.trusteeship.service.direct.TrusteeshipFreezeUnfreezeRecordQuerier;
import com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.TrusteeshipDirectInteractiveExecutor;

@Service("yeepayFreezeOrUnfreezeRecordQuerier")
class YeepayFreezeOrUnfreezeRecordQuerier implements TrusteeshipFreezeUnfreezeRecordQuerier{
	
	@Resource(name="singleBusinessQueryInfoValidator")
	private ParameterValidator<SingleBusinessQueryInfo>  singleBusinessQueryInfoValidator;
	
	@Resource(name="yeepayFreezeUnfreezeRecordQueryExecutor")
	private TrusteeshipDirectInteractiveExecutor<SingleBusinessQueryInfo, YeepayFreezeUnfreezeRecord>  yeepayFreezeUnfreezeRecordQueryExecutor;
	
	@Override
	public YeepayFreezeUnfreezeRecord query(SingleBusinessQueryInfo singleBusinessQueryInfo) {
		singleBusinessQueryInfoValidator.validate(singleBusinessQueryInfo);
		return yeepayFreezeUnfreezeRecordQueryExecutor.sendRequest(singleBusinessQueryInfo);
	}

}
