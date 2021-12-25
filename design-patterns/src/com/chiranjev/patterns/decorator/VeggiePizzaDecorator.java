package com.chiranjev.patterns.decorator;

public class VeggiePizzaDecorator extends PizzaDecorator{
    public VeggiePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public void bake(){
        super.bake();
        System.out.printf("Adding veggie toppings");
    }
}
