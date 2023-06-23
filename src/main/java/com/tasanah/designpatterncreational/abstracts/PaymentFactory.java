package com.tasanah.designpatterncreational.abstracts;

public interface PaymentFactory {

    ChargePaymentRequest createChargeRequest();

    CancelPaymentRequest createCancelRequest();

    GetBalancePaymentRequest createGetBalanceRequest();

}
