package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import java.math.BigDecimal;

public class UserTransactionInfo {
	
	private String callbackUrl;
	private BigDecimal  dealMoney; 
	private String trusteeshipUserId;
	private String dealTrusteeshipUserId;
	private String trusteeshipOrderNo;
	
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
	public BigDecimal getDealMoney() {
		return dealMoney;
	}
	public void setDealMoney(BigDecimal dealMoney) {
		this.dealMoney = dealMoney;
	}
	public String getCallbackUrl() {
		return callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	public String getTrusteeshipOrderNo() {
		return trusteeshipOrderNo;
	}
	public void setTrusteeshipOrderNo(String trusteeshipOrderNo) {
		this.trusteeshipOrderNo = trusteeshipOrderNo;
	}
	
}
