public class TurnOnCommand implements Command{
    private final Device device;
    public TurnOnCommand(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        this.device.turnOn();
    }
    @Override
    public void unexecute(){
        this.device.turnOff();
    }
}
