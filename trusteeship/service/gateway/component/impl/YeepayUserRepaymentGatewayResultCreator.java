package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayUserType;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayBusinessType;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.RepayUserTransactionInfo;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Administrator on 16-4-5.
 */
@Service("yeepayUserRepaymentGatewayResultCreator")
class YeepayUserRepaymentGatewayResultCreator extends AbstractUserRepayTransactionGatewayResultCreator {

    @Override
    protected Map<String, String> createparamsMapMap(RepayUserTransactionInfo repayUserTransactionInfo) {
        Map<String, String> params = super.createparamsMapMap(repayUserTransactionInfo);
       /* params.put("tenderOrderNo", repaymentProjectInfo.getProjectId().toString());
        params.put("tenderName", repaymentProjectInfo.getProjectName());
        params.put("tenderAmount",repaymentProjectInfo.getProjectMoney().toString());
        if(ValidateParameterUtil.isEmpty(repaymentProjectInfo.getProjectDescripe() )){
            params.put("tenderDescription", "项目还款");
        }else{
            params.put("tenderDescription", repaymentProjectInfo.getProjectDescripe());
        }
        params.put("borrowerPlatformUserNo", repaymentProjectInfo.getDealTrusteeshipUserId());
        params.put("remark","欢迎参加微领投的相关项目，微领投伴您一路成长！");*/
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
