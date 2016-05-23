package com.weilingtou.soa.internal.common.util.trusteeship.service.direct;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.SingleBusinessQueryInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayFreezeUnfreezeRecord;

public interface TrusteeshipFreezeUnfreezeRecordQuerier {
	YeepayFreezeUnfreezeRecord query(SingleBusinessQueryInfo singleBusinessQueryInfo);
}
