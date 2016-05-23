package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway;

import com.weilingtou.soa.external.modules.authorizeAutoRepayment.dto.AuthorizeAutoRepaymentDto;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.UserWithdrawInfo;

/**
 * Created by Administrator on 16-5-3.
 */
public interface TrusteeshipAuthAutoRepayment {
    GatewayResult toAuthorizeAutoRepayment(AuthorizeAutoRepaymentDto authorizeAutoRepaymentDto);
}
