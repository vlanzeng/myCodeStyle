package com.weilingtou.soa.internal.common.util.trusteeship.service.direct;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayTransferRecord;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.SingleBusinessQueryInfo;

public interface TrusteeshipTransferRecordQuerier {
	
		YeepayTransferRecord query(SingleBusinessQueryInfo singleBusinessQueryInfo);

}
