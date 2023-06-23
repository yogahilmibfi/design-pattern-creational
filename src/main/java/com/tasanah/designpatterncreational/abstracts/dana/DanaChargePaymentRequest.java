package com.tasanah.designpatterncreational.abstracts.dana;

import com.tasanah.designpatterncreational.abstracts.ChargePaymentRequest;
import com.tasanah.designpatterncreational.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class DanaChargePaymentRequest implements ChargePaymentRequest {

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
        return PaymentMethod.DANA;
    }

    @Override
    public String toString() {
        return "DanaChargePaymentRequest {" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                '}';
    }
}
