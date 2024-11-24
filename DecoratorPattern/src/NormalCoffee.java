public class NormalCoffee implements Coffee{
    @Override
    public String getDocs() {
        return "Normal Coffee";
    }
    @Override
    public double getCost() {
        return 1.5d;
    }
}
