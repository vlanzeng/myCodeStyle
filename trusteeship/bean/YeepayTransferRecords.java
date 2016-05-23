package com.weilingtou.soa.internal.common.util.trusteeship.bean;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="records")
public class YeepayTransferRecords {
	
	@XmlElement(name="record")
	private List<YeepayTransferRecord>   yeepayTransferRecords;

	public List<YeepayTransferRecord> getYeepayTransferRecords() {
		return yeepayTransferRecords;
	}

	public void setYeepayTransferRecords(List<YeepayTransferRecord> yeepayTransferRecords) {
		this.yeepayTransferRecords = yeepayTransferRecords;
	}
	
	
}
