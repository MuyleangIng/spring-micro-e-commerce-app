package com.sen.ecommerce.kafka;

import com.sen.ecommerce.customer.CustomerResponse;
import com.sen.ecommerce.order.PaymentMethod;
import com.sen.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}