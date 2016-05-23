package com.weilingtou.soa.internal.common.util.trusteeship.exception;

public class YeepaySignatureVerificationException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8125789083794703014L;
		public YeepaySignatureVerificationException(){
			super();
		}
		public YeepaySignatureVerificationException(String msg){
			super(msg);
		}
}
