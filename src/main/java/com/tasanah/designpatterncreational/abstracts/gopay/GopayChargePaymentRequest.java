package com.tasanah.designpatterncreational.abstracts.gopay;

import com.tasanah.designpatterncreational.abstracts.ChargePaymentRequest;
import com.tasanah.designpatterncreational.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class GopayChargePaymentRequest implements ChargePaymentRequest {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Override
    public Long getFee() {
        return 1000L;
    }

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    }

    @Override
    public String toString() {
        return "GopayChargePaymentRequest {" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                '}';
    }
}
