public class MilkDecorator extends CoffeeDecorator {
    private final double cost = 1.5d;
    MilkDecorator(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public String getDocs() {
        return this.coffee.getDocs() + " With Milk";
    }
    @Override
    public double getCost() {
        return this.coffee.getCost() + this.cost;
    }
}
