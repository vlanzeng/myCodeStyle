package com.weilingtou.soa.internal.common.util.trusteeship.service.generator.impl;

import java.util.Date;
import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.Date.DateEnhanceUtils;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepayOrderExpiredEnum;
import com.weilingtou.soa.internal.common.util.trusteeship.service.generator.ExpireDateGenerator;

/**
 *月周期过期日期生成器 
 */
@Service("monthPeriodExpireDateGenerator")
class MonthPeriodExpireDateGenerator implements  ExpireDateGenerator{
	
	
	@Override
	public String generatorExpireDateString() {
		return  DateEnhanceUtils.dateToString(generatorExpireDate());
	}

	@Override
	public Date generatorExpireDate() {
		Date     nowDate   =  DateEnhanceUtils.getNowDate("yyyy-MM-dd HH:mm:ss");
		Date     expiredDate=DateEnhanceUtils.getDateAddMonth(nowDate, YeepayOrderExpiredEnum.ORDER_MONTH_EXPIRED_PERIOD.getValue());
		return expiredDate;
	}
	
}
