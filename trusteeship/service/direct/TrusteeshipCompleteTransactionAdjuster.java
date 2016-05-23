package com.weilingtou.soa.internal.common.util.trusteeship.service.direct;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.CompleteTransactionInfo;

public interface TrusteeshipCompleteTransactionAdjuster {
		void  confirmTransaction(CompleteTransactionInfo completeTransactionInfo);
		void  cancelTransaction(CompleteTransactionInfo completeTransactionInfo);
}
