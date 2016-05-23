package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.impl;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.RepayUserTransactionInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.TrusteeshipUserRepayment;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.TrusteeshipGatewayResultCreator;


/**
 * Created by Administrator on 16-4-5.
 */
@Service("yeepayUserRepaymentTrusteeship")
public class YeepayUserRepayment implements TrusteeshipUserRepayment {
    @Resource(name="userRepaymentInfoValidator")
    private ParameterValidator<RepayUserTransactionInfo> userInvestProjectInfoValidator;

    @Resource(name="yeepayUserRepaymentGatewayResultCreator")
    private TrusteeshipGatewayResultCreator<RepayUserTransactionInfo> yeepayUserRepaymentGatewayResultCreator;
    @Override
    public GatewayResult toRepayment(RepayUserTransactionInfo repayUserTransactionInfo) {
        userInvestProjectInfoValidator.validate(repayUserTransactionInfo);
        return yeepayUserRepaymentGatewayResultCreator.create(repayUserTransactionInfo);
    }
}
