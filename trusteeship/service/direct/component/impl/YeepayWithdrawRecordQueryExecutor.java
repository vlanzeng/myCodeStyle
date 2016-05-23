package com.weilingtou.soa.internal.common.util.trusteeship.service.direct.component.impl;

import org.springframework.stereotype.Service;
import com.weilingtou.soa.internal.common.util.xml.JAXBUtil;
import com.weilingtou.util.comcom.util.ValidateParameterUtil;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayWithdrawRecord;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.YeepayWithdrawRecordsResponse;
import com.weilingtou.soa.internal.common.util.trusteeship.constant.YeepaySingleBusinessQueryMode;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.YeepayObjectNotExistException;

@Service("yeepayWithdrawRecordQueryExecutor")
class YeepayWithdrawRecordQueryExecutor extends AbstractYeepaySingleBusinessQueryExecutor<YeepayWithdrawRecord>{

	@Override
	protected String getSingleBusinessQueryMode() {
		return YeepaySingleBusinessQueryMode.WITHDRAW_RECORD.getValue();
	}

	@Override
	protected YeepayWithdrawRecord parseRequestResult(String xmlResult) {
		YeepayWithdrawRecordsResponse  yeepayWithdrawRecordsResponse =JAXBUtil.unmarshal(YeepayWithdrawRecordsResponse.class, xmlResult);
		if(ValidateParameterUtil.isEmpty(yeepayWithdrawRecordsResponse.getYeepayWithdrawRecords().getYeepayWithdrawRecords())){
			throw new YeepayObjectNotExistException();
		}
		return yeepayWithdrawRecordsResponse.getYeepayWithdrawRecords().getYeepayWithdrawRecords().get(0);
	}

}
