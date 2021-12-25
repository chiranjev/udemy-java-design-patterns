package com.chiranjev.patterns.proxy;

import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Customer customer = new CustomerProxyImpl();
        System.out.println(customer.getId());
        System.out.println(customer.getOrders()
                .stream()
                .map(order->order.getProductName())
                .collect(Collectors.toList()));
    }
}
