package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class EmptyUserBindBankCardInfoException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5060934230519503319L;
	
	public EmptyUserBindBankCardInfoException(){
		super();
	}
	
	public EmptyUserBindBankCardInfoException(String msg){
		super(msg);
	}
	
}
