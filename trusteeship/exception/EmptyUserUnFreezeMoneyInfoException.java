package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class EmptyUserUnFreezeMoneyInfoException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 701511359582967235L;
	public EmptyUserUnFreezeMoneyInfoException(){
		super();
	}
	public EmptyUserUnFreezeMoneyInfoException(String msg){
		super(msg);
	}
}
