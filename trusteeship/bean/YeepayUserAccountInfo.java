package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "response")
public class YeepayUserAccountInfo {

	@XmlElement(name = "memberType")
	private String memberType;

	@XmlElement(name = "activeStatus")
	private String activeStatus;

	@XmlElement(name = "balance")
	private BigDecimal totalMoney;

	@XmlElement(name = "availableAmount")
	private BigDecimal availableMoney;

	@XmlElement(name = "freezeAmount")
	private BigDecimal freezeMoney;

	@XmlElement(name = "cardNo")
	private String bindBankCardNo;

	@XmlElement(name = "cardStatus")
	private String bindBankCardStatus;

	@XmlElement(name = "bank")
	private String bindBank;

	@XmlElement(name = "autoTender")
	private boolean autoTender;

	@XmlElement(name = "paySwift")
	private String paySwift;

	@XmlElement(name = "bindMobileNo")
	private String bindMobileNo;

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public BigDecimal getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(BigDecimal totalMoney) {
		this.totalMoney = totalMoney;
	}

	public BigDecimal getAvailableMoney() {
		return availableMoney;
	}

	public void setAvailableMoney(BigDecimal availableMoney) {
		this.availableMoney = availableMoney;
	}

	public BigDecimal getFreezeMoney() {
		return freezeMoney;
	}

	public void setFreezeMoney(BigDecimal freezeMoney) {
		this.freezeMoney = freezeMoney;
	}

	public String getBindBankCardNo() {
		return bindBankCardNo;
	}

	public void setBindBankCardNo(String bindBankCardNo) {
		this.bindBankCardNo = bindBankCardNo;
	}

	public String getBindBankCardStatus() {
		return bindBankCardStatus;
	}

	public void setBindBankCardStatus(String bindBankCardStatus) {
		this.bindBankCardStatus = bindBankCardStatus;
	}

	public String getBindBank() {
		return bindBank;
	}

	public void setBindBank(String bindBank) {
		this.bindBank = bindBank;
	}

	public boolean isAutoTender() {
		return autoTender;
	}

	public void setAutoTender(boolean autoTender) {
		this.autoTender = autoTender;
	}

	public String getPaySwift() {
		return paySwift;
	}

	public void setPaySwift(String paySwift) {
		this.paySwift = paySwift;
	}

	public String getBindMobileNo() {
		return bindMobileNo;
	}

	public void setBindMobileNo(String bindMobileNo) {
		this.bindMobileNo = bindMobileNo;
	}

    @Override
    public String toString() {
        return "YeepayUserAccountInfo{" +
                "memberType='" + memberType + '\'' +
                ", activeStatus='" + activeStatus + '\'' +
                ", totalMoney=" + totalMoney +
                ", availableMoney=" + availableMoney +
                ", freezeMoney=" + freezeMoney +
                ", bindBankCardNo='" + bindBankCardNo + '\'' +
                ", bindBankCardStatus='" + bindBankCardStatus + '\'' +
                ", bindBank='" + bindBank + '\'' +
                ", autoTender=" + autoTender +
                ", paySwift='" + paySwift + '\'' +
                ", bindMobileNo='" + bindMobileNo + '\'' +
                '}';
    }
}
