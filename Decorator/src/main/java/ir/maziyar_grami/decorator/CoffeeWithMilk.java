package ir.maziyar_grami.decorator;

public class CoffeeWithMilk implements Coffee {

    private Coffee coffee;

    public CoffeeWithMilk(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public void make() {
        coffee.make();
        System.out.print(" with milk");
    }
}
