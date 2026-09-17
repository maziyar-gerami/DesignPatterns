package ir.maziyar_grami;

import ir.maziyar_grami.decorator.CoffeeWithMilk;
import ir.maziyar_grami.decorator.SimpleCoffee;

public class Main {

    public static void main(String[] args) {
        SimpleCoffee coffee = new SimpleCoffee();
        CoffeeWithMilk coffeeWithMilk = new CoffeeWithMilk(coffee);
        coffeeWithMilk.make();
    }
}