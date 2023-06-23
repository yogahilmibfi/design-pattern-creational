package com.tasanah.designpatterncreational.abstracts.gopay;

import com.tasanah.designpatterncreational.abstracts.CancelPaymentRequest;
import com.tasanah.designpatterncreational.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class GopayCancelPaymentRequest implements CancelPaymentRequest {

    @Getter
    @Setter
    private String id;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    }
}
