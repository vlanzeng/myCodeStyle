package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import java.math.BigDecimal;

public class UserWithdrawInfo {
	private TrusteeshipUserInfo  trusteeshipUserInfo;
    private String   trusteeshipOrderNo;
	private String   callbackUrl;
	private BigDecimal money;
	
	public TrusteeshipUserInfo getTrusteeshipUserInfo() {
		return trusteeshipUserInfo;
	}
	public void setTrusteeshipUserInfo(TrusteeshipUserInfo thirdPartyCustodianUser) {
		this.trusteeshipUserInfo = thirdPartyCustodianUser;
	}
	public String getTrusteeshipOrderNo() {
		return trusteeshipOrderNo;
	}
	public void setTrusteeshipOrderNo(String thirdPartyCustodianOrderNo) {
		this.trusteeshipOrderNo = thirdPartyCustodianOrderNo;
	}
	public String getCallbackUrl() {
		return callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	
}
