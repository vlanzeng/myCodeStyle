package com.weilingtou.soa.internal.common.util.trusteeship.service.direct;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayWithdrawRecord;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.SingleBusinessQueryInfo;

public interface TrusteeshipWithdrawRecordQuerier {
	YeepayWithdrawRecord   query(SingleBusinessQueryInfo singleBusinessQueryInfo);	
}
