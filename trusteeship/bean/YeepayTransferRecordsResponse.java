package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="response")
public class YeepayTransferRecordsResponse {
	
	@XmlElement(name="records")
    private YeepayTransferRecords 	yeepayTransferRecords;

	public YeepayTransferRecords getYeepayTransferRecords() {
		return yeepayTransferRecords;
	}

	public void setYeepayTransferRecords(YeepayTransferRecords yeepayTransferRecords) {
		this.yeepayTransferRecords = yeepayTransferRecords;
	}
	
}
