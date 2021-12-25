package com.chiranjev.patterns.flyweight.solution;

/*
1. Separate the Extrinsic State
2. Pass them as parameters
3. Create a factory class
 */

public class Test {
    public static void main(String[] args) {
        PaintApp app = new PaintApp();
        app.render(10);
    }
}

