package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="record")
public class YeepayFreezeUnfreezeRecord {
	
	@XmlElement(name="requestNo")
	private String trusteeshipUserOrderNo;
	
	@XmlElement(name="platformUserNo")
	private String trusteeshipUserId;
	
	@XmlElement(name="amount")
	private BigDecimal operateMoney;
	@XmlElement(name="expired")
	private String overdueTime;
	
	@XmlElement(name="createTime")
	private String operateTime;
	
	@XmlElement(name="status")
	private String status;

	public String getTrusteeshipUserOrderNo() {
		return trusteeshipUserOrderNo;
	}

	public void setTrusteeshipUserOrderNo(String trusteeshipUserOrderNo) {
		this.trusteeshipUserOrderNo = trusteeshipUserOrderNo;
	}

	public String getTrusteeshipUserId() {
		return trusteeshipUserId;
	}

	public void setTrusteeshipUserId(String trusteeshipUserId) {
		this.trusteeshipUserId = trusteeshipUserId;
	}

	public BigDecimal getOperateMoney() {
		return operateMoney;
	}

	public void setOperateMoney(BigDecimal operateMoney) {
		this.operateMoney = operateMoney;
	}

	public String getOverdueTime() {
		return overdueTime;
	}

	public void setOverdueTime(String overdueTime) {
		this.overdueTime = overdueTime;
	}

	public String getOperateTime() {
		return operateTime;
	}

	public void setOperateTime(String operateTime) {
		this.operateTime = operateTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
