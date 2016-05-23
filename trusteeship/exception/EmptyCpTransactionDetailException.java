package com.weilingtou.soa.internal.common.util.trusteeship.exception;

import java.io.Serializable;

/**
 * Created by Administrator on 16-4-5.
 */
public class EmptyCpTransactionDetailException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 5353749917318572845L;

    public EmptyCpTransactionDetailException() {
        super();
    }

    public EmptyCpTransactionDetailException(String message) {
        super(message);
    }
}
