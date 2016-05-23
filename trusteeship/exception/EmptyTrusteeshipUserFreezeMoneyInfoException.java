package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class EmptyTrusteeshipUserFreezeMoneyInfoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3765754468633962849L;
	
	public EmptyTrusteeshipUserFreezeMoneyInfoException(){
		super();
	}
	public EmptyTrusteeshipUserFreezeMoneyInfoException(String msg){
		super(msg);
	}
}
