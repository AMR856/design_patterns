public class EuropeanCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new EuropeanCar();
    }
    @Override
    public CarSpecifications createSpecifications() {
        return new EuropeanCarSpecifications();
    }
}
