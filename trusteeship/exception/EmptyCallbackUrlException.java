package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class EmptyCallbackUrlException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5171296895964960361L;
	
	public EmptyCallbackUrlException(){
		super();
	}
	
	public EmptyCallbackUrlException(String msg){
		super(msg);
	}
	
}
