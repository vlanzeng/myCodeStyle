package com.weilingtou.soa.internal.common.util.trusteeship.service.generator;

import java.util.Date;

/**
 * 
 * 过期日期生成器
 *
 */
public interface ExpireDateGenerator {
    
	/**
	 * function:生成字符串类型的过期日期
	 * @return String
	 */
	String   generatorExpireDateString();
	
	/**
	 * function:生成日期类型的过期日期
	 * @return  Date
	 */
	Date   generatorExpireDate();

}	
