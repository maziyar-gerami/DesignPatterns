package ir.maziyar_grami.decorator;

public class SimpleCoffee implements Coffee {

    @Override
    public void make() {
        System.out.print("Coffee");
    }
    
}
