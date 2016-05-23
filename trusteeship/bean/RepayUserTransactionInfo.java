package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Administrator on 16-4-5.
 */
public class RepayUserTransactionInfo {
    private String callbackUrl;
    private BigDecimal dealMoney;
    private String trusteeshipUserId;
    private String dealTrusteeshipUserId;
    private String trusteeshipOrderNo;
    private List<ToCpTransactionDetail> toCpTransactionDetail;

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public BigDecimal getDealMoney() {
        return dealMoney;
    }

    public void setDealMoney(BigDecimal dealMoney) {
        this.dealMoney = dealMoney;
    }

    public String getTrusteeshipUserId() {
        return trusteeshipUserId;
    }

    public void setTrusteeshipUserId(String trusteeshipUserId) {
        this.trusteeshipUserId = trusteeshipUserId;
    }

    public String getDealTrusteeshipUserId() {
        return dealTrusteeshipUserId;
    }

    public void setDealTrusteeshipUserId(String dealTrusteeshipUserId) {
        this.dealTrusteeshipUserId = dealTrusteeshipUserId;
    }

    public String getTrusteeshipOrderNo() {
        return trusteeshipOrderNo;
    }

    public void setTrusteeshipOrderNo(String trusteeshipOrderNo) {
        this.trusteeshipOrderNo = trusteeshipOrderNo;
    }

    public List<ToCpTransactionDetail> getToCpTransactionDetail() {
        return toCpTransactionDetail;
    }

    public void setToCpTransactionDetail(List<ToCpTransactionDetail> toCpTransactionDetail) {
        this.toCpTransactionDetail = toCpTransactionDetail;
    }
}
