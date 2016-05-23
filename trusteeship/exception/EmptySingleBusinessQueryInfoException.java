package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class EmptySingleBusinessQueryInfoException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1857154126270846713L;
	
	public EmptySingleBusinessQueryInfoException(){
		super();
	}
	public EmptySingleBusinessQueryInfoException(String msg){
		super(msg);
	}
}
