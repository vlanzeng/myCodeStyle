package com.weilingtou.soa.internal.common.util.trusteeship.bean;


public class UserRegisterInfo {
	
	private TrusteeshipUserInfo  trusteeshipUserInfo;
    private String   trusteeshipOrderNo;
	private String   callbackUrl;
	
	public TrusteeshipUserInfo getTrusteeshipUserInfo() {
		return trusteeshipUserInfo;
	}
	
	public void setTrusteeshipUserInfo(TrusteeshipUserInfo trusteeshipUserInfo) {
		this.trusteeshipUserInfo = trusteeshipUserInfo;
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
    
}
