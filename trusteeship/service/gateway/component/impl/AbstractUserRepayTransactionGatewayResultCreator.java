package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.ToCpTransactionDetail;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.RepayUserTransactionInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 16-4-5.
 */
abstract class AbstractUserRepayTransactionGatewayResultCreator extends AbstractYeepayGateWayResultCreator<RepayUserTransactionInfo> {
    @Override
    protected String seekMediationYeepayServiceSubUrl() {
        return "/epay/CpTransactionAction.a";
    }

    @Override
    protected Map<String, String> createparamsMapMap(RepayUserTransactionInfo yeepayUserTransactionInfo) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("requestNo", yeepayUserTransactionInfo.getTrusteeshipOrderNo());
        params.put("platformUserNo", yeepayUserTransactionInfo.getTrusteeshipUserId());
        params.put("userType", getYeepayUserType());
        params.put("notifyUrl",null);
        params.put("bizType", getYeepayBusinessType());
        params.put("details", createYeepayUserTransactionInfo(yeepayUserTransactionInfo.getToCpTransactionDetail()));
        params.put("callbackUrl", yeepayUserTransactionInfo.getCallbackUrl());
        return params;
    }

    private  String   createYeepayUserTransactionInfo(List<ToCpTransactionDetail>  toCpTransactionDetailList){
        StringBuffer stringBuilder= new StringBuffer();
        for(ToCpTransactionDetail cpTransactionDetail:toCpTransactionDetailList){
            stringBuilder.append("<detail>");
            stringBuilder.append("<targetUserType>");
            stringBuilder.append(cpTransactionDetail.getTargetUserType());
            stringBuilder.append("</targetUserType>");
            stringBuilder.append("<targetPlatformUserNo>");
            stringBuilder.append(cpTransactionDetail.getTargetPlatformUserNo());
            stringBuilder.append("</targetPlatformUserNo>");
            stringBuilder.append("<amount>");
            stringBuilder.append(cpTransactionDetail.getAmount().toString());
            stringBuilder.append("</amount>");
            stringBuilder.append("<bizType>");
            stringBuilder.append(cpTransactionDetail.getBizType());
            stringBuilder.append("</bizType>");
            stringBuilder.append("</detail>");
        }
        return stringBuilder.toString();
    }

    abstract protected  String getYeepayUserType();

    abstract protected  String getYeepayBusinessType();

    abstract  protected String getDealUserType();

}
