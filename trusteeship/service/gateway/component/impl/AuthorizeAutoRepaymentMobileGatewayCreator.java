package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.component.impl;

import com.alibaba.fastjson.JSON;
import com.weilingtou.soa.external.modules.authorizeAutoRepayment.dto.AuthorizeAutoRepaymentDto;
import com.weilingtou.soa.internal.common.util.config.SysConfigStorageConservator;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 16-5-3.
 * 自动还款授权
 */
@Service("authorizeAutoRepaymentMobileGatewayCreator")
public class AuthorizeAutoRepaymentMobileGatewayCreator extends AbstractYeepayMobileModeGateWayResultCreator<AuthorizeAutoRepaymentDto> {
    @Override
    protected String seekMediationYeepayServiceSubUrl() {
        return "mobile/AuthorizeAutoRepaymentAction.a";
    }

    @Override
    protected Map<String, String> createparamsMapMap(AuthorizeAutoRepaymentDto authorizeAutoRepaymentDto) {
        AuthorizeAutoRepaymentDto authorizeAutoRepaymentDto1 = crateAuthorizeAutoRepaymentDto(authorizeAutoRepaymentDto);
        String  xmlUserWithdrawInfo= JSON.toJSONString(authorizeAutoRepaymentDto1);
        Map<String, String>  map =  new HashMap<String, String>();
        map.put("jsonObj", xmlUserWithdrawInfo);
        return map;
    }
    AuthorizeAutoRepaymentDto crateAuthorizeAutoRepaymentDto(AuthorizeAutoRepaymentDto authorizeAutoRepaymentDto){
        authorizeAutoRepaymentDto.setNotifyUrl("null");
        authorizeAutoRepaymentDto.setPlatformNo(SysConfigStorageConservator.get("YEEPAY_SYSTEM_PLATFORM_NO"));
        return authorizeAutoRepaymentDto;
    }
}
