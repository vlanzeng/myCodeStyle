package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="response")
public class YeepayWithdrawRecordsResponse {
	
	@XmlElement(name="records")
	private YeepayWithdrawRecords yeepayWithdrawRecords;

	public YeepayWithdrawRecords getYeepayWithdrawRecords() {
		return yeepayWithdrawRecords;
	}

	public void setYeepayWithdrawRecords(YeepayWithdrawRecords yeepayWithdrawRecords) {
		this.yeepayWithdrawRecords = yeepayWithdrawRecords;
	}
	
}
