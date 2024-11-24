public class Main {
    public static void main(String[] args) {
        VehicleFactory bmwFactory = new BMWFactory();
        VehicleFactory chevroletFactory= new ChevroletFactory();
        Vehicle bmw = bmwFactory.createVehicle();
        Vehicle chevrolet = chevroletFactory.createVehicle();
        bmw.printVehicle();
        chevrolet.printVehicle();
    }
}
