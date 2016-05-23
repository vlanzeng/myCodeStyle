package com.weilingtou.soa.internal.common.util.trusteeship.constant;

public enum YeepaySingleBusinessQueryMode {
	
	CP_TRANSACTION("转账记录","CP_TRANSACTION"),
	RECHARGE_RECORD("充值记录","RECHARGE_RECORD"),
	WITHDRAW_RECORD("提现记录","WITHDRAW_RECORD"),
	FREEZERE_RECORD("冻结/解冻接口","FREEZERE_RECORD");
	
	private String name;
	
	private String value;
	
	private YeepaySingleBusinessQueryMode(String name,String value){
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
