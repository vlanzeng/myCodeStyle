package com.weilingtou.soa.internal.common.util.trusteeship.bean;

public class UserMobileResetInfo{
	
	private String callbackUrl;
	private String  trusteeshipUserId;
	private String trusteeshipUserOrderNo;
	
	public String getCallbackUrl() {
		return callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	
	public String getTrusteeshipUserId() {
		return trusteeshipUserId;
	}
	public void setTrusteeshipUserId(String trusteeshipUserId) {
		this.trusteeshipUserId = trusteeshipUserId;
	}
	public String getTrusteeshipUserOrderNo() {
		return trusteeshipUserOrderNo;
	}
	public void setTrusteeshipUserOrderNo(String trusteeshipUserOrderNo) {
		this.trusteeshipUserOrderNo = trusteeshipUserOrderNo;
	}
	
}
