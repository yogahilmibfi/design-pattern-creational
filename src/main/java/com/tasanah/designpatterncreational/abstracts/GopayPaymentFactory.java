package com.tasanah.designpatterncreational.abstracts;

import com.tasanah.designpatterncreational.abstracts.gopay.GopayCancelPaymentRequest;
import com.tasanah.designpatterncreational.abstracts.gopay.GopayChargePaymentRequest;
import com.tasanah.designpatterncreational.abstracts.gopay.GopayGetBalanceRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GopayPaymentFactory implements PaymentFactory {
    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new GopayChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new GopayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new GopayGetBalanceRequest();
    }
}
