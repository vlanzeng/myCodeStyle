package com.weilingtou.soa.internal.common.util.trusteeship.service.generator.impl;

import java.util.Date;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.Date.DateEnhanceUtils;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayOrderExpiredEnum;
import com.weilingtou.soa.internal.common.util.trusteeship.service.generator.ExpireDateGenerator;

/**
 *分钟周期过期日期生成器
 *
 */
@Service("minutePeriodExpireDateGenerator")
class MinutePeriodExpireDateGenerator implements  ExpireDateGenerator{
	
	@Override
	public String generatorExpireDateString() {
		return  DateEnhanceUtils.dateToString(generatorExpireDate());
	}

	@Override
	public Date generatorExpireDate() {
		Date     nowDate   =  DateEnhanceUtils.getNowDate("yyyy-MM-dd HH:mm:ss");
		Date     expiredDate=DateEnhanceUtils.getDateAddMinute(nowDate, YeepayOrderExpiredEnum.ORDER_MINUTE_EXPIRED_PERIOD.getValue());
		return expiredDate;
	}
	
}
