package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class BusinessLimitException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4732254334053676562L;
	
	public BusinessLimitException(){
		super();
	}
	public BusinessLimitException(String msg){
		super(msg);
	}
}
