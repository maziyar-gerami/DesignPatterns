package ir.maziyar_grami;

import ir.maziyar_grami.decorator.Coffee;
import ir.maziyar_grami.decorator.CoffeeWithMilk;
import ir.maziyar_grami.decorator.CoffeeWithSugar;
import ir.maziyar_grami.decorator.SimpleCoffee;

public class Main {

    public static void main(String[] args) {

        Coffee coffee =
                new CoffeeWithMilk(
                        new SimpleCoffee()
                );
        coffee.make();

        System.out.println();

        Coffee coffee2 = new CoffeeWithSugar(
            new CoffeeWithMilk(
                new SimpleCoffee()
            )
        );
        coffee2.make();
    }
}