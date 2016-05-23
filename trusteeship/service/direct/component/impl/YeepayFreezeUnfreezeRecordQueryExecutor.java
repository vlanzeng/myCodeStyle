package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.impl;

import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.xml.JAXBUtil;
import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayFreezeUnfreezeRecord;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepaySingleBusinessQueryMode;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.YeepayObjectNotExistException;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayFreezeUnfreezeRecordResponse;

@Service("yeepayFreezeUnfreezeRecordQueryExecutor")
class YeepayFreezeUnfreezeRecordQueryExecutor extends AbstractYeepaySingleBusinessQueryExecutor<YeepayFreezeUnfreezeRecord>{

	@Override
	protected String getSingleBusinessQueryMode() {
		return YeepaySingleBusinessQueryMode.FREEZERE_RECORD.getValue();
	}

	@Override
	protected YeepayFreezeUnfreezeRecord parseRequestResult(String xmlResult) {
		 YeepayFreezeUnfreezeRecordResponse yeepayFreezeUnfreezeRecordResponse = JAXBUtil.unmarshal(YeepayFreezeUnfreezeRecordResponse.class, xmlResult);
		 if(ValidateParameterUtil.isEmpty(yeepayFreezeUnfreezeRecordResponse.getYeepayFreezeUnfreezeRecords().getYeepayFreezeUnfreezeRecords())){
			throw new YeepayObjectNotExistException(); 
		 }
		return yeepayFreezeUnfreezeRecordResponse.getYeepayFreezeUnfreezeRecords().getYeepayFreezeUnfreezeRecords().get(0);
	}

}
