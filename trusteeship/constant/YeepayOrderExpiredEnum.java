package com.weilingtou.soa.internal.common.util.trusteeship.constant;

public enum YeepayOrderExpiredEnum {
	
	ORDER_MONTH_EXPIRED_PERIOD("易宝订单月过期周期值",2),
	ORDER_MINUTE_EXPIRED_PERIOD("易宝订单分钟过期周期值",4);
	
	private String name;
	private int  value;
	
	private YeepayOrderExpiredEnum (String name,int value){
		this.name=name;
		this.value=value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public String getName(){
		return this.name;
	}
	
}
