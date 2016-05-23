package com.weilingtou.soa.internal.common.util.trusteeship.bean;


import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="records")
public class YeepayWithdrawRecords {
	
	@XmlElement(name="record")
	private List<YeepayWithdrawRecord> yeepayWithdrawRecords ;

	public List<YeepayWithdrawRecord> getYeepayWithdrawRecords() {
		return yeepayWithdrawRecords;
	}

	public void setYeepayWithdrawRecords(List<YeepayWithdrawRecord> yeepayWithdrawRecords) {
		this.yeepayWithdrawRecords = yeepayWithdrawRecords;
	}
	
}
