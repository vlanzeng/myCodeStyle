package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class EmptyCompleteTransactionInfoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3017825278835572831L;
	public EmptyCompleteTransactionInfoException(){
		super();
	}
	public EmptyCompleteTransactionInfoException(String msg){
		super(msg);
	}
}
