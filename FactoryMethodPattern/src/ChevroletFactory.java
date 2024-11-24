public class ChevroletFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Chevrolet();
    }
}
