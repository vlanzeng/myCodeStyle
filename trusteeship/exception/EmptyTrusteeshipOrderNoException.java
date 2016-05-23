package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class EmptyTrusteeshipOrderNoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4372222911115873803L;
	
	public EmptyTrusteeshipOrderNoException(){
		super();
	}
	
	public EmptyTrusteeshipOrderNoException(String msg){
		super(msg);
	}
}
