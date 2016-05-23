package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class EmptyTrusteeshipUserException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8162540263355002114L;
	public EmptyTrusteeshipUserException(){
		super();
	}
	public EmptyTrusteeshipUserException(String msg){
		super(msg);
	}
}
