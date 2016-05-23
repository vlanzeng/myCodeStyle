package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "record")
public class YeepayRechargeRecord {

	@XmlElement(name = "amount")
	private BigDecimal rechargeMoney;
	
	@XmlElement(name = "userNo")
	private String trusteeshipUserId;
	
	@XmlElement(name = "createTime")
	private String rechargeDate;
	
	@XmlElement(name = "status")
	private String rechargeStatus;
	
	@XmlElement(name = "payProduct")
	private String paymentMode;
	
	@XmlElement(name = "fee")
	private BigDecimal  rechargeFee;
	
	@XmlElement(name = "feeMode")
	private String  feeMode;
	
	public BigDecimal getRechargeMoney() {
		return rechargeMoney;
	}

	public void setRechargeMoney(BigDecimal rechargeMoney) {
		this.rechargeMoney = rechargeMoney;
	}

	public String getTrusteeshipUserId() {
		return trusteeshipUserId;
	}

	public void setTrusteeshipUserId(String trusteeshipUserId) {
		this.trusteeshipUserId = trusteeshipUserId;
	}

	public String getRechargeDate() {
		return rechargeDate;
	}

	public void setRechargeDate(String rechargeDate) {
		this.rechargeDate = rechargeDate;
	}

	public String getRechargeStatus() {
		return rechargeStatus;
	}

	public void setRechargeStatus(String rechargeStatus) {
		this.rechargeStatus = rechargeStatus;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public BigDecimal getRechargeFee() {
		return rechargeFee;
	}

	public void setRechargeFee(BigDecimal rechargeFee) {
		this.rechargeFee = rechargeFee;
	}

	public String getFeeMode() {
		return feeMode;
	}

	public void setFeeMode(String feeMode) {
		this.feeMode = feeMode;
	}
	
	
	
}
