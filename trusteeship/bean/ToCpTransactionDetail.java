package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import java.math.BigDecimal;

/**
 * Created by Administrator on 16-4-5. 、
 * ToCpTransaction detail数据
 */
public class ToCpTransactionDetail {
    private String targetUserType;
    private String targetPlatformUserNo;
    private BigDecimal amount;
    private String bizType;

    public String getTargetUserType() {
        return targetUserType;
    }

    public void setTargetUserType(String targetUserType) {
        this.targetUserType = targetUserType;
    }

    public String getTargetPlatformUserNo() {
        return targetPlatformUserNo;
    }

    public void setTargetPlatformUserNo(String targetPlatformUserNo) {
        this.targetPlatformUserNo = targetPlatformUserNo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }
}
