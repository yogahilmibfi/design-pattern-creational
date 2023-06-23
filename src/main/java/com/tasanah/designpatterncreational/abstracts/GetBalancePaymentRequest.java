package com.tasanah.designpatterncreational.abstracts;

public interface GetBalancePaymentRequest {

    String getUserId();

    void setUserId(String userId);

    PaymentMethod getMethod();

}
