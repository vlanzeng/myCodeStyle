package com.weilingtou.soa.internal.common.util.trusteeship.service.gateway.validator.impl;

import com.weilingtou.soa.internal.common.util.trusteeship.bean.RepayUserTransactionInfo;
import com.weilingtou.soa.internal.common.util.trusteeship.bean.ToCpTransactionDetail;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.CpTransactionDetailIsNotIntactException;
import com.weilingtou.soa.internal.common.util.trusteeship.exception.EmptyCpTransactionDetailException;
import com.weilingtou.soa.internal.common.validate.ParameterValidator;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Created by Administrator on 16-4-5.
 */
@Service("userRepaymentInfoValidator")
class UserRepaymentInfoValidator implements ParameterValidator<RepayUserTransactionInfo> {

    @Override
    public void validate(RepayUserTransactionInfo repayUserTransactionInfo) {
        validateDetailIsNull(repayUserTransactionInfo);
        validateAttributeIsEmpty(repayUserTransactionInfo.getToCpTransactionDetail());
    }

    private void validateDetailIsNull(RepayUserTransactionInfo repayUserTransactionInfo){
        if(repayUserTransactionInfo.getToCpTransactionDetail()==null || repayUserTransactionInfo.getToCpTransactionDetail().size()<=0){
            throw  new EmptyCpTransactionDetailException();
        }
    }

    private  void validateAttributeIsEmpty(List<ToCpTransactionDetail> toCpTransactionDetailList){
        try {
            for(Object obj:toCpTransactionDetailList){
                for (Field f : obj.getClass().getDeclaredFields()) {
                    f.setAccessible(true);
                    if (f.get(obj) == null) {
                        throw  new CpTransactionDetailIsNotIntactException();
                    }
                }
            }
        }catch (Exception e){
           e.printStackTrace();
        }
    }



}
