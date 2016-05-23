package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class EmptyTrusteeshipUserIdException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 447369630302778297L;
	
	public EmptyTrusteeshipUserIdException(){
		super();
	}
	
	public EmptyTrusteeshipUserIdException(String msg){
		super(msg);
	}
	
}
