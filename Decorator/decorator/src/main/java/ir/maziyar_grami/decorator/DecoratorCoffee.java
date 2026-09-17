package ir.maziyar_grami.decorator;

public class DecoratorCoffee {

    private Coffee coffee;

    public DecoratorCoffee(Coffee coffee){
        this.coffee = coffee;
    }
    
    public void make(String extra){
        coffee.make();
        System.out.println(" " + extra);
    }
}
