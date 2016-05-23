package com.weilingtou.soa.internal.common.util.trusteeship.constant;

public enum YeepayUserQuickPaymentType {
	NORMAL("未开通快捷支付","NORMAL"),
	UPGRADE("已开通快捷支付","UPGRADE");
	private String name;
	private String value;
	
	private YeepayUserQuickPaymentType(String name,String value){
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
