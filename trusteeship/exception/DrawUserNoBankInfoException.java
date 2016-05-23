package com.weilingtou.soa.internal.common.util.trusteeship.exception;

/**
 * Created by Administrator on 16-3-28.
 */
public class DrawUserNoBankInfoException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = -144194746040058467L;

	public DrawUserNoBankInfoException() {
    }

    public DrawUserNoBankInfoException(String message) {
        super(message);
    }
}
