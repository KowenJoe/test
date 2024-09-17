package com.nemo.pattern;

public class SimplePizzaFactory {
    public static Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;
        if (ordertype.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (ordertype.equals("greek")) {
            pizza = new GreekPizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new PepperPizza();
        }
        return pizza;
    }


    public static void main(String[] args) {
        Pizza cheese = CreatePizza("cheese");
        cheese.bake();
    }
}
