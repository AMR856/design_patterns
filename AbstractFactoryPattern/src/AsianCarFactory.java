public class AsianCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new AsianCar();
    }

    @Override
    public CarSpecifications createSpecifications() {
        return new AsianCarSpecifications();
    }
}
