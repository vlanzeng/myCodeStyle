package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.impl;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.TrusteeshipProjectInfoQuery;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayProjectInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyTrusteeshipOrderNoException;
import com.weilingtou.soa.internal.common.util.trusteeship.service.direct.TrusteeshipProjectQuerier;
import com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.TrusteeshipDirectInteractiveExecutor;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 16-5-4.
 */
@Service("yeepayProjectQuerier")
public class YeepayProjectQuerier implements TrusteeshipProjectQuerier{
    @Resource(name="projectInfoQueryExecutor")
    private TrusteeshipDirectInteractiveExecutor<TrusteeshipProjectInfoQuery, YeepayProjectInfo> projectInfoQueryExecutor;

    @Override
    public YeepayProjectInfo query(TrusteeshipProjectInfoQuery trusteeshipProjectInfoQuery) {
        if(trusteeshipProjectInfoQuery==null||trusteeshipProjectInfoQuery.getProjectId()==0){
            throw new EmptyTrusteeshipOrderNoException();
        }
        return projectInfoQueryExecutor.sendRequest(trusteeshipProjectInfoQuery);
    }
}
