public abstract class CoffeeDecorator implements Coffee {
    Coffee coffee;
    @Override
    public String getDocs() {
        return "Standard Coffee Decorator";
    }
    public abstract double getCost();
}
