package com.tasanah.designpatterncreational.abstracts.creditcard;

import com.tasanah.designpatterncreational.abstracts.ChargePaymentRequest;
import com.tasanah.designpatterncreational.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class CreditCardChargePaymentRequest implements ChargePaymentRequest {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Override
    public Long getFee() {
        return getAmount() * 5 / 100;
    }

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDIT_CARD;
    }

    @Override
    public String toString() {
        return "CreditCardChargePaymentRequest {" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                '}';
    }
}
