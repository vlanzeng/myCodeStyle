package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "record")
public class YeepayWithdrawRecord {

	@XmlElement(name = "amount")
	private BigDecimal withDrawMoney;

	@XmlElement(name = "userNo")
	private String trusteeshipUserId;

	@XmlElement(name = "createTime")
	private String withDrawTime;

	@XmlElement(name = "status")
	private String whithDrawStatus;

	@XmlElement(name = "remitStatus")
	private String remitStatus;
	@XmlElement(name = "fee")
	private BigDecimal fee;

	@XmlElement(name = "feeMode")
	private String feeMode;

	public BigDecimal getWithDrawMoney() {
		return withDrawMoney;
	}

	public void setWithDrawMoney(BigDecimal withDrawMoney) {
		this.withDrawMoney = withDrawMoney;
	}

	public String getTrusteeshipUserId() {
		return trusteeshipUserId;
	}

	public void setTrusteeshipUserId(String trusteeshipUserId) {
		this.trusteeshipUserId = trusteeshipUserId;
	}

	public String getWithDrawTime() {
		return withDrawTime;
	}

	public void setWithDrawTime(String withDrawTime) {
		this.withDrawTime = withDrawTime;
	}

	public String getWhithDrawStatus() {
		return whithDrawStatus;
	}

	public void setWhithDrawStatus(String whithDrawStatus) {
		this.whithDrawStatus = whithDrawStatus;
	}

	public String getRemitStatus() {
		return remitStatus;
	}

	public void setRemitStatus(String remitStatus) {
		this.remitStatus = remitStatus;
	}

	public BigDecimal getFee() {
		return fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public String getFeeMode() {
		return feeMode;
	}

	public void setFeeMode(String feeMode) {
		this.feeMode = feeMode;
	}

}
