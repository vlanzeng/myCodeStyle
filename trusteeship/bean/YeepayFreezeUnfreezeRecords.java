package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="records")
public class YeepayFreezeUnfreezeRecords {
	
	@XmlElement(name="record")
	private List<YeepayFreezeUnfreezeRecord> yeepayFreezeUnfreezeRecords;

	public List<YeepayFreezeUnfreezeRecord> getYeepayFreezeUnfreezeRecords() {
		return yeepayFreezeUnfreezeRecords;
	}

	public void setYeepayFreezeUnfreezeRecords(List<YeepayFreezeUnfreezeRecord> yeepayFreezeUnfreezeRecords) {
		this.yeepayFreezeUnfreezeRecords = yeepayFreezeUnfreezeRecords;
	}
	
}
