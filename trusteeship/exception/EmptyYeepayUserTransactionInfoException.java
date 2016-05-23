package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class EmptyYeepayUserTransactionInfoException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1948900398384236968L;
	public EmptyYeepayUserTransactionInfoException(){
		super();
	}
	public EmptyYeepayUserTransactionInfoException(String msg){
		super(msg);
	}
}
