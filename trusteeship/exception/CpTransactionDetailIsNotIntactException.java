package com.weilingtou.soa.internal.common.util.trusteeship.exception;

import java.io.Serializable;

/**
 * Created by Administrator on 16-4-5.
 */
public class CpTransactionDetailIsNotIntactException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = -8370121481079729794L;

    public CpTransactionDetailIsNotIntactException() {
        super();
    }

    public CpTransactionDetailIsNotIntactException(String message) {
        super(message);
    }
}
