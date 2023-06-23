package com.tasanah.designpatterncreational.abstracts.creditcard;

import com.tasanah.designpatterncreational.abstracts.GetBalancePaymentRequest;
import com.tasanah.designpatterncreational.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class CreditCardGetBalanceRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
