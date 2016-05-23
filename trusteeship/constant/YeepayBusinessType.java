package com.weilingtou.soa.internal.common.util.trusteeship.constant;

public enum YeepayBusinessType {
	
	TRANSFER("转账","TRANSFER"),
	TENDER("投资项目","TENDER"),
	REPAYMENT("还款","REPAYMENT"),
    COMMISSION("分润","COMMISSION");;

	private String name;
	private String value;
	private YeepayBusinessType(String name ,String value){
		this.name=name;
		this.value=value;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getValue(){
		return this.value;
	}
	
}
