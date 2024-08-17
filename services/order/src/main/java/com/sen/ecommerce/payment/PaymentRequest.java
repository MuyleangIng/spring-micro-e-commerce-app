package com.sen.ecommerce.payment;

import com.sen.ecommerce.customer.CustomerResponse;
import com.sen.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}