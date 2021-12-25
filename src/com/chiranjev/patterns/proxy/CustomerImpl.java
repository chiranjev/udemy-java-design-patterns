package com.chiranjev.patterns.proxy;

import java.util.List;

public class CustomerImpl implements Customer{
    private int id;
    private List<Order> orders;

    CustomerImpl(){
        this.id = 123;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public List<Order> getOrders() {
        return orders;
    }
}
