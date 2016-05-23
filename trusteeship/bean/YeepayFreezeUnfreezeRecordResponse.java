package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="response")
public class YeepayFreezeUnfreezeRecordResponse {
	@XmlElement(name="records")
	private YeepayFreezeUnfreezeRecords yeepayFreezeUnfreezeRecords;

	public YeepayFreezeUnfreezeRecords getYeepayFreezeUnfreezeRecords() {
		return yeepayFreezeUnfreezeRecords;
	}

	public void setYeepayFreezeUnfreezeRecords(YeepayFreezeUnfreezeRecords yeepayFreezeUnfreezeRecords) {
		this.yeepayFreezeUnfreezeRecords = yeepayFreezeUnfreezeRecords;
	}
	
}
