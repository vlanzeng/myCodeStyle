package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.RepayUserTransactionInfo;

/**
 * Created by Administrator on 16-4-5.
 */
public interface TrusteeshipUserRepayment {
    GatewayResult toRepayment(RepayUserTransactionInfo repayUserTransactionInfo);
}
