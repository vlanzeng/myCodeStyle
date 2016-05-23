package com.weilingtou.soa.internal.common.util.trusteeship.constant;

public enum YeepayRechargeStatus {
	WAIT_PAYMENT("未付","INIT"),
	PAYMENT_SUCCESS ("付款成功","SUCCESS");
	private String name;
	private String value;
	private YeepayRechargeStatus(String name ,String value){
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
