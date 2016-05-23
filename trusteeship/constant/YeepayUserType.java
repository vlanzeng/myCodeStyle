package com.weilingtou.soa.internal.common.util.trusteeship.constant;

public enum YeepayUserType {
	MEMBER("平台的会员托管账户","MEMBER"),
	MERCHANT("平台在易宝开通的商户账户","MERCHANT");
	
	private String name;
	private String value;
	
	private YeepayUserType(String name ,String value){
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
