package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component;

/**
 * 直连方式请求托管接口
 * @param <P> 参数
 * @param <R> 结果
 */

public interface TrusteeshipDirectInteractiveExecutor<P,R> {
	R  sendRequest(P param);

}
