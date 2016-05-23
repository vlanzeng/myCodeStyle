package com.weilingtou.soa.internal.common.util.trusteeship.constant;

public enum YeepayResultCodeType {
	SUCCESS("成功",1),
	FAILURE("失败",0),
	XML_FORMAT_ERROR("XML参数格式错误",2),
	SIGNATURE_VERIFICATION("签名验证失败",3), 
	OBJECT_NOT_EXIST_ERROR("引用了不存在的对象",101),
	BUSINESS_WRONG_STATE("业务状态不正确",102),
	BUSINESS_LIMIT_ERROR("由于业务限制导致业务不能执行",103),
	REAL_NAME_FAILURE("实名认证失败",104);
	private String name;
	
	private int    value;
	
	private YeepayResultCodeType(String name,int value){
		this.name=name;
		this.value=value;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int   getValue(){
		return this.value;
	}
	
}
