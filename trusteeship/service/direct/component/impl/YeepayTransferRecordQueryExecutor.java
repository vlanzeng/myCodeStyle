package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.impl;

import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.xml.JAXBUtil;
import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayTransferRecord;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayTransferRecordsResponse;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepaySingleBusinessQueryMode;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.YeepayObjectNotExistException;

@Service("yeepayTransferRecordQueryExecutor")
class YeepayTransferRecordQueryExecutor extends AbstractYeepaySingleBusinessQueryExecutor<YeepayTransferRecord>{

	@Override
	protected String getSingleBusinessQueryMode() {
		return YeepaySingleBusinessQueryMode.CP_TRANSACTION.getValue();
	}

	@Override
	protected YeepayTransferRecord parseRequestResult(String xmlResult) {
		YeepayTransferRecordsResponse  yeepayTransferRecordsResponse =JAXBUtil.unmarshal(YeepayTransferRecordsResponse.class, xmlResult);
		if(ValidateParameterUtil.isEmpty(yeepayTransferRecordsResponse.getYeepayTransferRecords().getYeepayTransferRecords())){
			throw new YeepayObjectNotExistException();
		}
		return yeepayTransferRecordsResponse.getYeepayTransferRecords().getYeepayTransferRecords().get(0);
	}

}
