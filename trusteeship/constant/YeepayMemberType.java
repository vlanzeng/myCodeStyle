package com.weilingtou.soa.internal.common.util.trusteeship.constant;


public enum YeepayMemberType {
	
	PERSONAL("个人会员","PERSONAL"),
	ENTERPRISE("企业会员","ENTERPRISE");
	private String name;
	private String value;
	
	private YeepayMemberType(String name,String value){
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
