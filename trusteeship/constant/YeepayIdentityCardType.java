package com.weilingtou.soa.internal.common.util.trusteeship.constant;

public enum YeepayIdentityCardType {
	G1_IDCARD("第一代","G1_IDCARD"),
	G2_IDCARD("第二代","G2_IDCARD");
	
	private String name;
	private String value;
	
	private YeepayIdentityCardType(String name,String value){
		this.name=name;
		this.value=value;
	}
	
	public String getValue(){
		return this.value;
	}
	
	public String  getName(){
		return this.name;
	}
	
}
