package ir.maziyar_grami.decorator;

public class CoffeeWithSugar implements Coffee {

    private Coffee coffee;

    public CoffeeWithSugar(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public void make() {
        coffee.make();
        System.out.print(" with sugar");
    }
    
}
