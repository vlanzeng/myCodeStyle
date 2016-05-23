package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import java.math.BigDecimal;

public class UserRechargeInfo {
	private TrusteeshipUserInfo  trusteeshipUserInfo;
    private String  trusteeshipOrderNo;
	private String   callbackUrl;
	private BigDecimal rechargeMoney;
	
	public TrusteeshipUserInfo getTrusteeshipUserInfo() {
		return trusteeshipUserInfo;
	}
	public void setTrusteeshipUserInfo(TrusteeshipUserInfo thirdPartyCustodianUser) {
		this.trusteeshipUserInfo = thirdPartyCustodianUser;
	}
	public String getTrusteeshipOrderNo() {
		return trusteeshipOrderNo;
	}
	public void setTrusteeshipOrderNo(String trusteeshipOrderNo) {
		this.trusteeshipOrderNo = trusteeshipOrderNo;
	}
	public String getCallbackUrl() {
		return callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	public BigDecimal getRechargeMoney() {
		return rechargeMoney;
	}
	public void setRechargeMoney(BigDecimal money) {
		this.rechargeMoney = money;
	}
	
}
