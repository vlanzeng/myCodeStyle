package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.impl;

import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.xml.JAXBUtil;
import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayRechargeRecord;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayRechargeRecordResponse;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepaySingleBusinessQueryMode;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.YeepayObjectNotExistException;

@Service("yeepayRechargeRecordQueryExecutor")
class YeepayRechargeRecordQueryExecutor extends AbstractYeepaySingleBusinessQueryExecutor<YeepayRechargeRecord>{

	@Override
	protected String getSingleBusinessQueryMode() {
		return YeepaySingleBusinessQueryMode.RECHARGE_RECORD.getValue();
	}

	@Override
	protected YeepayRechargeRecord parseRequestResult(String xmlResult) {
		YeepayRechargeRecordResponse yeepayRechargeRecordResponse = JAXBUtil.unmarshal(YeepayRechargeRecordResponse.class, xmlResult);
		 if(ValidateParameterUtil.isEmpty(yeepayRechargeRecordResponse.getYeepayRechargeRecords().getYeepayRechargeRecords())){
			 throw new YeepayObjectNotExistException();
		 }
		 return yeepayRechargeRecordResponse.getYeepayRechargeRecords().getYeepayRechargeRecords().get(0);
	}

}
