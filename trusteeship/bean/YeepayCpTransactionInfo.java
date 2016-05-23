package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import java.util.Map;
import java.util.List;

public class YeepayCpTransactionInfo {
    private String  remark;
    private String  userType;
    private String  bizType;
    private String  expired;
    private String  notifyUrl;
    private String  requestNo;
    private String  platformNo;
    private String  callbackUrl;
    private String  platformUserNo;
    private Map<String,Object> extend;
    private List<YeepayCpTransactionDetailInfo> details;
    
	public String getPlatformNo() {
		return platformNo;
	}
	public void setPlatformNo(String platformNo) {
		this.platformNo = platformNo;
	}
	public String getRequestNo() {
		return requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
	public String getPlatformUserNo() {
		return platformUserNo;
	}
	public void setPlatformUserNo(String platformUserNo) {
		this.platformUserNo = platformUserNo;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getBizType() {
		return bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getExpired() {
		return expired;
	}
	public void setExpired(String expired) {
		this.expired = expired;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Map<String, Object> getExtend() {
		return extend;
	}
	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
	public String getNotifyUrl() {
		return notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	public String getCallbackUrl() {
		return callbackUrl;
	}
	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}
	public List<YeepayCpTransactionDetailInfo> getDetails() {
		return details;
	}
	public void setDetails(List<YeepayCpTransactionDetailInfo> details) {
		this.details = details;
	}
    
}
