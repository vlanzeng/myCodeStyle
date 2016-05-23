package com.weilingtou.soa.internal.common.util.trusteeship.constant;

public enum YeepayTransferStatus {
	USER_HAS_BEEN_AUTHORIZATION("转账已得到用户确认","PREAUTH"),
	HAS_BEEN_CONFIRM_TRANSFER("已确认出款","CONFIRM"),
	Has_been_CANCEL_TRANSFER("已确认取消出款","CANCEL"),
	DIRECT_TRANSFER("直接划转","DIRECT");
	private String name;
	private String value;
	private YeepayTransferStatus(String name ,String value){
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
