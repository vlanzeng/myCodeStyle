package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import java.math.BigDecimal;

public class UserFreezeMoneyInfo {
	
	private BigDecimal freezeMoney;
	private String trusteeshipUserId;
	private String  trusteeshipUserOrderNo;
	
	public String getTrusteeshipUserId() {
		return trusteeshipUserId;
	}
	public void setTrusteeshipUserId(String trusteeshipUserId) {
		this.trusteeshipUserId = trusteeshipUserId;
	}
	public BigDecimal getFreezeMoney() {
		return freezeMoney;
	}
	public void setFreezeMoney(BigDecimal freezeMoney) {
		this.freezeMoney = freezeMoney;
	}
	public String getTrusteeshipUserOrderNo() {
		return trusteeshipUserOrderNo;
	}
	public void setTrusteeshipUserOrderNo(String trusteeshipUserOrderNo) {
		this.trusteeshipUserOrderNo = trusteeshipUserOrderNo;
	}
	
}
