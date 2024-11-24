public class SugarDecorator extends CoffeeDecorator{
    private final double cost = 0.5d;
    SugarDecorator(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public String getDocs() {
        return this.coffee.getDocs() + " With Sugar";
    }

    @Override
    public double getCost() {
        return this.coffee.getCost() + this.cost;
    }
}
