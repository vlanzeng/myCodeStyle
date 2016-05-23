package com.weilingtou.soa.internal.common.util.trusteeship.bean;

public class UserUpdatePasswordInfo{
	
	private String callbackUrl;
	private String  trusteeshipUserId;
	private String trusteeshipOrderNo;
	
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
	public String getTrusteeshipOrderNo() {
		return trusteeshipOrderNo;
	}
	public void setTrusteeshipOrderNo(String trusteeshipOrderNo) {
		this.trusteeshipOrderNo = trusteeshipOrderNo;
	}
	
}
