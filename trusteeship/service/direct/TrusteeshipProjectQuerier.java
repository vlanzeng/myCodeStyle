package com.weilingtou.soa.internal.common.util.trusteeship.service.direct;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.TrusteeshipProjectInfoQuery;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayProjectInfo;

/**
 * Created by Administrator on 16-5-4.
 */
public interface TrusteeshipProjectQuerier {
    YeepayProjectInfo query(TrusteeshipProjectInfoQuery trusteeshipProjectInfoQuery);
}
