package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserWithdrawInfo;

/**
 * 
 * 网关第三方托管系统提现接口
 * 
 */
public interface TrusteeshipUserWithdrawer {
	
	/**	
	 * @param   userWithdrawInfo 用户提现参数
	 * @return  GatewayResult  网关接口公用返回结果
	 */
	GatewayResult  withdraw(UserWithdrawInfo userWithdrawInfo);
		
}
