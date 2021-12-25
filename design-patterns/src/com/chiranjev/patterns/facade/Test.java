package com.chiranjev.patterns.facade;

public class Test {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.processOrder("MacBook",3);
    }
}
