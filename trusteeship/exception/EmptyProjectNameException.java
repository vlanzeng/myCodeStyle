package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class EmptyProjectNameException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5188751048746596014L;
	public EmptyProjectNameException(){
		super();
	}
	public EmptyProjectNameException(String msg){
		super(msg);
	}
}
