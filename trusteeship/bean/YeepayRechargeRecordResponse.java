package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "response")
public class YeepayRechargeRecordResponse {
	
	@XmlElement(name="records")
	private YeepayRechargeRecords yeepayRechargeRecords;

	public YeepayRechargeRecords getYeepayRechargeRecords() {
		return yeepayRechargeRecords;
	}

	public void setYeepayRechargeRecords(YeepayRechargeRecords yeepayRechargeRecords) {
		this.yeepayRechargeRecords = yeepayRechargeRecords;
	}
	
}
