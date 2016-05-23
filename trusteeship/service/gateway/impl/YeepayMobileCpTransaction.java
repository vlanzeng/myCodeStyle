package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.impl;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.RepayUserTransactionInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.TrusteeshipUserRepayment;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.TrusteeshipGatewayResultCreator;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 16-5-5.
 */
@Service("yeepayMobileCpTransaction")
public class YeepayMobileCpTransaction implements TrusteeshipUserRepayment {
    @Resource(name="userRepaymentInfoValidator")
    private ParameterValidator<RepayUserTransactionInfo> userInvestProjectInfoValidator;

    @Resource(name="yeepayMobileModeCpTransaction")
    private TrusteeshipGatewayResultCreator<RepayUserTransactionInfo> yeepayMobileModeCpTransaction;
    @Override
    public GatewayResult toRepayment(RepayUserTransactionInfo repayUserTransactionInfo) {
        userInvestProjectInfoValidator.validate(repayUserTransactionInfo);
        return yeepayMobileModeCpTransaction.create(repayUserTransactionInfo);
    }
}