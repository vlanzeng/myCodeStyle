package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class EmptyUserRegisterInfoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4361897582971579577L;
	
	public EmptyUserRegisterInfoException(){
		super();
	}
	
	public EmptyUserRegisterInfoException(String msg){
		super(msg);
	}
	
}
