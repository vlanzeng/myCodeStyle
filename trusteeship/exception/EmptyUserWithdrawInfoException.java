package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class EmptyUserWithdrawInfoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2915749859384900907L;
	
	public EmptyUserWithdrawInfoException(){
		super();
	}
	
	public EmptyUserWithdrawInfoException(String msg){
		super(msg);
	}
}
