package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="response")
public class YeepayProjectInfo {
	@XmlElement(name = "platformNo")
	private String trusteeshipPlatformId;
	@XmlElement(name = "description")
	private String projectDescription;
	@XmlElement(name = "targetPlatformUserNo")
	private String borrowerTrusteeshipUserId;
	@XmlElement(name = "targetUserType")
	private String borrowerTrusteeshipUserType;
	@XmlElement(name = "transferAmount")
	private BigDecimal projectMoney;
    @XmlElement(name = "autoRepayment")
	private boolean isAutoRepayment;
	@XmlElement(name = "createTime")
	private String createTime;


	public String getTrusteeshipPlatformId() {
		return trusteeshipPlatformId;
	}

	public void setTrusteeshipPlatformId(String trusteeshipPlatformId) {
		this.trusteeshipPlatformId = trusteeshipPlatformId;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getBorrowerTrusteeshipUserId() {
		return borrowerTrusteeshipUserId;
	}

	public void setBorrowerTrusteeshipUserId(String borrowerTrusteeshipUserId) {
		this.borrowerTrusteeshipUserId = borrowerTrusteeshipUserId;
	}

	public String getBorrowerTrusteeshipUserType() {
		return borrowerTrusteeshipUserType;
	}

	public void setBorrowerTrusteeshipUserType(String borrowerTrusteeshipUserType) {
		this.borrowerTrusteeshipUserType = borrowerTrusteeshipUserType;
	}

	public BigDecimal getProjectMoney() {
		return projectMoney;
	}

	public void setProjectMoney(BigDecimal projectMoney) {
		this.projectMoney = projectMoney;
	}

	public boolean isAutoRepayment() {
		return isAutoRepayment;
	}

	public void setAutoRepayment(boolean isAutoRepayment) {
		this.isAutoRepayment = isAutoRepayment;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

    @Override
    public String toString() {
        return "YeepayProjectInfo{" +
                "trusteeshipPlatformId='" + trusteeshipPlatformId + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", borrowerTrusteeshipUserId='" + borrowerTrusteeshipUserId + '\'' +
                ", borrowerTrusteeshipUserType='" + borrowerTrusteeshipUserType + '\'' +
                ", projectMoney=" + projectMoney +
                ", isAutoRepayment=" + isAutoRepayment +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
