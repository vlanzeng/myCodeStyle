package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "record")
public class YeepayTransferRecord {

	@XmlElement(name = "requestNo")
	private String trusteeshipUserOrderNo;

	@XmlElement(name = "bizType")
	private String businessType;

	@XmlElement(name = "amount")
	private BigDecimal transferAmount;

	@XmlElement(name = "status")
	private String transferStatus;

	@XmlElement(name = "subStatus")
	private String processStatus;

	@XmlElement(name = "createdTime")
	private String transferTime;
	@XmlElement(name = "sourceUserType")
	private String dealUserType;
	@XmlElement(name = "sourceUserNo")
	private String dealTrusteeshipUserId;

	public String getTrusteeshipUserOrderNo() {
		return trusteeshipUserOrderNo;
	}

	public void setTrusteeshipUserOrderNo(String trusteeshipUserOrderNo) {
		this.trusteeshipUserOrderNo = trusteeshipUserOrderNo;
	}

	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public BigDecimal getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(BigDecimal transferAmount) {
		this.transferAmount = transferAmount;
	}

	public String getTransferStatus() {
		return transferStatus;
	}

	public void setTransferStatus(String transferStatus) {
		this.transferStatus = transferStatus;
	}

	public String getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public String getTransferTime() {
		return transferTime;
	}

	public void setTransferTime(String transferTime) {
		this.transferTime = transferTime;
	}

	public String getDealUserType() {
		return dealUserType;
	}

	public void setDealUserType(String dealUserType) {
		this.dealUserType = dealUserType;
	}

	public String getDealTrusteeshipUserId() {
		return dealTrusteeshipUserId;
	}

	public void setDealTrusteeshipUserId(String dealTrusteeshipUserId) {
		this.dealTrusteeshipUserId = dealTrusteeshipUserId;
	}
	
}
