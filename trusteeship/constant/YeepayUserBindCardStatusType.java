package com.weilingtou.soa.internal.common.util.trusteeship.constant;

public enum YeepayUserBindCardStatusType {
	
	VERIFYING("认证中","VERIFYING"),
	VERIFIED("已认证","VERIFIED");
	private String name;
	private String value;
	private YeepayUserBindCardStatusType(String name,String value){
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
