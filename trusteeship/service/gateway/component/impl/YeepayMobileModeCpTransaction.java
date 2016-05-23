package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.RepayUserTransactionInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayBusinessType;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayUserType;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Administrator on 16-5-5.
 */
@Service("yeepayMobileModeCpTransaction")
public class YeepayMobileModeCpTransaction extends AbstractYeepayMobileModeCpTransactionCreater {

    @Override
    protected Map<String, String> createparamsMapMap(RepayUserTransactionInfo repayUserTransactionInfo) {
        Map<String, String> params = super.createparamsMapMap(repayUserTransactionInfo);
        params.put("remark","项目还款");
        params.put("tenderDescription", "项目还款");
        return params;
    }

    @Override
    protected String getYeepayUserType() {
        return YeepayUserType.MEMBER.getValue();
    }

    /**
     * 使用转账，不是用还款
     * @return
     */
    @Override
    protected String getYeepayBusinessType() {
        return YeepayBusinessType.TRANSFER.getValue();
    }

    @Override
    protected String getDealUserType() {
        return this.getYeepayUserType();
    }
}

