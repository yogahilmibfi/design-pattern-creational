package com.tasanah.designpatterncreational.abstracts.dana;

import com.tasanah.designpatterncreational.abstracts.CancelPaymentRequest;
import com.tasanah.designpatterncreational.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class DanaCancelPaymentRequest implements CancelPaymentRequest {

    @Getter
    @Setter
    private String id;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.DANA;
    }
}
