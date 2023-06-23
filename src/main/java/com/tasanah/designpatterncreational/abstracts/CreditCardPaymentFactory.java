package com.tasanah.designpatterncreational.abstracts;

import com.tasanah.designpatterncreational.abstracts.creditcard.CreditCardCancelPaymentRequest;
import com.tasanah.designpatterncreational.abstracts.creditcard.CreditCardChargePaymentRequest;
import com.tasanah.designpatterncreational.abstracts.creditcard.CreditCardGetBalanceRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreditCardPaymentFactory implements PaymentFactory {
    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new CreditCardChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new CreditCardCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new CreditCardGetBalanceRequest();
    }
}
