package com.tasanah.designpatterncreational.abstracts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest(classes = AbstractFactoryApplication.class)
class AbstractFactoryApplicationTest {

    @Autowired
    private ApplicationContext context;

    @Test
    void testPaymentFactory() {
        PaymentFactory paymentFactoryDana = context.getBean(DanaPaymentFactory.class);
        PaymentFactory paymentFactoryGopay = context.getBean(GopayPaymentFactory.class);

        payment(paymentFactoryDana);
        payment(paymentFactoryGopay);
    }

    public void payment(PaymentFactory paymentFactory) {
        ChargePaymentRequest paymentRequest = paymentFactory.createChargeRequest();
        paymentRequest.setId("123");
        paymentRequest.setAmount(2_500_000L);

        // send ke payment gateway

        System.out.println(paymentRequest);
    }

    public void cancel(PaymentFactory paymentFactory) {
        CancelPaymentRequest cancelRequest = paymentFactory.createCancelRequest();
        cancelRequest.setId("123");

        // send ke payment gateway

        System.out.println(cancelRequest);
    }

    public Long getBalance(PaymentFactory paymentFactory) {
        GetBalancePaymentRequest request = paymentFactory.createGetBalanceRequest();
        request.setUserId("yogahilmi");

        return 5_000_000L;
    }
}