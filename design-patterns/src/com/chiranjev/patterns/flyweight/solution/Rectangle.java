package com.chiranjev.patterns.flyweight.solution;

public class Rectangle extends Shape {

    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Rectangle(){
        label = "Rectangle";
    }

    @Override
    public void draw(int length, int breadth, String fillStyle) {
        System.out.println("Drawing a "
                +label +" with length "
                +length+" Breadth "
                +breadth+" Fill Style "
                +fillStyle);
    }
}
