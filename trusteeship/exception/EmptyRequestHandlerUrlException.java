package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class EmptyRequestHandlerUrlException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4642565971825874108L;
	
	public EmptyRequestHandlerUrlException(){
		super();
	}
	
	public EmptyRequestHandlerUrlException(String msg){
		super(msg);
	}
	
}
