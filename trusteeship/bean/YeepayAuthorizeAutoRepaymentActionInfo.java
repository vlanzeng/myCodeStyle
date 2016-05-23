package com.weilingtou.soa.internal.common.util.trusteeship.bean;

/**
 * Created by Administrator on 16-3-28.
 */
public class YeepayAuthorizeAutoRepaymentActionInfo {
   private String platformNo;// 商户编号
   private String requestNo;// 请求流水号
   private String orderNo;//标的号;
   private String notifyUrl;//服务器通知URL
   private String callbackUrl; // 页面回跳URL
   private String platformUserNo;// 用户编号

    public String getPlatformNo() {
        return platformNo;
    }

    public void setPlatformNo(String platformNo) {
        this.platformNo = platformNo;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getPlatformUserNo() {
        return platformUserNo;
    }

    public void setPlatformUserNo(String platformUserNo) {
        this.platformUserNo = platformUserNo;
    }
}
