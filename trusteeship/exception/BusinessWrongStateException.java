package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class BusinessWrongStateException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2595244701213349728L;
	public BusinessWrongStateException(){
		super();
	}
	public BusinessWrongStateException(String msg){
		super(msg);
	}
}
