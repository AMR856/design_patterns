
public class Main {
    public static void main(String[] args) {
        CarFactory asianCarFactory = new AsianCarFactory();
        CarFactory europeanCarFactory = new EuropeanCarFactory();
        Car asianCar = asianCarFactory.createCar();
        Car europeanCar = europeanCarFactory.createCar();
        CarSpecifications asianCarSpecs = asianCarFactory.createSpecifications();
        CarSpecifications euroCarSpecs = europeanCarFactory.createSpecifications();
        asianCar.drive();
        asianCar.stop();
        asianCarSpecs.getSpecfications();
        europeanCar.drive();
        europeanCar.stop();
        euroCarSpecs.getSpecfications();
    }
}