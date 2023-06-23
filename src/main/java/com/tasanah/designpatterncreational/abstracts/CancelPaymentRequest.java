package com.tasanah.designpatterncreational.abstracts;

public interface CancelPaymentRequest {

    String getId();

    void setId(String id);

    PaymentMethod getMethod();

}
