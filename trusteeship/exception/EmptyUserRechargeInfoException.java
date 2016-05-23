package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class EmptyUserRechargeInfoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8300565349707966277L;
	
	public EmptyUserRechargeInfoException(){
		super();
	}
	public EmptyUserRechargeInfoException(String msg){
		super(msg);
	}
}
