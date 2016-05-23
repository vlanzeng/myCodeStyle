package com.weilingtou.soa.internal.common.util.trusteeship.constant;

public enum YeepayServiceType {
	REGISTER("注册","REGISTER"),
	RECHARGE("充值","RECHARGE"),
	WITHDRAW("提现","WITHDRAW"),
	ACCOUNT_INFO("查询用户信息","ACCOUNT_INFO"),
	AUTHORIZE_AUTO_TRANSFER("自动转账授权","AUTHORIZE_AUTO_TRANSFER"),
	AUTHORIZE_AUTO_REPAYMENT("自动还款授权","AUTHORIZE_AUTO_REPAYMENT");
	private String name;
	private String value;
	private YeepayServiceType(String name ,String value){
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
