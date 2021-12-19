package com.chiranjev.patterns.decorator;

public class PlainPizza implements Pizza{
    @Override
    public void bake() {
        System.out.println("Baking plain Pizza");
    }
}
