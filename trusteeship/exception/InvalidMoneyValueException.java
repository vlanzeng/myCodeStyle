package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class InvalidMoneyValueException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1578313628421401929L;
	public InvalidMoneyValueException(){
		super();
	}	
	public InvalidMoneyValueException(String msg){
		super(msg);
	}
}
