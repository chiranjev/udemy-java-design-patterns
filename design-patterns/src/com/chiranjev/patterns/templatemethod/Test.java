package com.chiranjev.patterns.templatemethod;

public class Test {
    public static void main(String[] args) {
        DataRenderer renderer = new XMLDataRenderer();
        renderer.render();
    }
}
