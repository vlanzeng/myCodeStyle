package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class YeepayObjectNotExistException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4145603665904651459L;
	public YeepayObjectNotExistException(){
		super();
	}
	public YeepayObjectNotExistException(String msg){
		super(msg);
	}
}
