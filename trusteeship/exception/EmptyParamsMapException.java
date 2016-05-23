package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class EmptyParamsMapException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4234817878848500307L;
	
	public EmptyParamsMapException(){
		super();
	}
	
	public  EmptyParamsMapException(String msg){
		super(msg);
	}
	
}
