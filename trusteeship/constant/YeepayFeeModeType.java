package com.weilingtou.soa.internal.common.util.trusteeship.constant;

public enum YeepayFeeModeType {
	PLAT_FORM("收取平台手续费","PLATFORM"),
	USER("收取用户手续费","USER");
	private String name;
	private String value;
	private YeepayFeeModeType(String name ,String value){
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
