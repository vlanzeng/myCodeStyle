package com.weilingtou.soa.internal.common.util.trusteeship.service.direct;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayRechargeRecord;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.SingleBusinessQueryInfo;

public interface TrusteeshipRechargeRecordQuerier {
	YeepayRechargeRecord   query(SingleBusinessQueryInfo singleBusinessQueryInfo);	
}
