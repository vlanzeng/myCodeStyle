package com.weilingtou.soa.internal.common.util.trusteeship.constant;

public enum YeepayCompleteTransactionMode {
	
	CONFIRM_TRANSACTION("确认资金交易划转","CONFIRM"), 
	CANCEL_TRANSACTION("取消资金交易","CANCEL");
	private String name;
	private String value;
	
	private YeepayCompleteTransactionMode(String name ,String value){
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
