package ir.maziyar_grami;

import ir.maziyar_grami.decorator.Coffee;
import ir.maziyar_grami.decorator.DecoratorCoffee;

public class Main {
    public static void main(String[] args) {
        String milk = "milk";
        Coffee coffee = new Coffee();
        DecoratorCoffee coffeeWithMilk = new DecoratorCoffee(coffee);
        coffeeWithMilk.make(milk);
    }
}