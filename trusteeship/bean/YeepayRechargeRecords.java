package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "records")
public class YeepayRechargeRecords {
	
	@XmlElement(name="record")
	private List<YeepayRechargeRecord>  yeepayRechargeRecords;

	public List<YeepayRechargeRecord> getYeepayRechargeRecords() {
		return yeepayRechargeRecords;
	}

	public void setYeepayRechargeRecords(List<YeepayRechargeRecord> yeepayRechargeRecord) {
		this.yeepayRechargeRecords = yeepayRechargeRecord;
	}
	
	
}
