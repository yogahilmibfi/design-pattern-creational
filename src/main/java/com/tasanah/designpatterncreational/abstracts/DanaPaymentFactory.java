package com.tasanah.designpatterncreational.abstracts;

import com.tasanah.designpatterncreational.abstracts.dana.DanaCancelPaymentRequest;
import com.tasanah.designpatterncreational.abstracts.dana.DanaChargePaymentRequest;
import com.tasanah.designpatterncreational.abstracts.dana.DanaGetBalanceRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DanaPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new DanaChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new DanaCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new DanaGetBalanceRequest();
    }

}
