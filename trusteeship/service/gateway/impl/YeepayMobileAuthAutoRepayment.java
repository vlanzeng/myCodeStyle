package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.impl;

import com.weilingtou.soa.external.modules.authorizeAutoRepayment.dto.AuthorizeAutoRepaymentDto;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.GatewayResult;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.TrusteeshipAuthAutoRepayment;
import com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.TrusteeshipGatewayResultCreator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 16-5-3.
 */
@Service("yeepayMobileAuthAutoRepayment")
public class YeepayMobileAuthAutoRepayment implements TrusteeshipAuthAutoRepayment{

    @Resource(name="authorizeAutoRepaymentMobileGatewayCreator")
    private TrusteeshipGatewayResultCreator<AuthorizeAutoRepaymentDto> authorizeAutoRepaymentMobileGatewayCreator;
    @Override
    public GatewayResult toAuthorizeAutoRepayment(AuthorizeAutoRepaymentDto authorizeAutoRepaymentDto) {
        return authorizeAutoRepaymentMobileGatewayCreator.create(authorizeAutoRepaymentDto);
    }

}
