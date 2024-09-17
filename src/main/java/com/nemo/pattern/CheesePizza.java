package com.nemo.pattern;

public class CheesePizza implements Pizza{

    @Override
    public void bake() {
        System.out.println("CheesePizza-bake");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza-box");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza-cut");
    }
}
