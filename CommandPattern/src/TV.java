public class TV implements Device{
    @Override
    public void turnOn() {
        System.out.println("TV is turned on");
    }
    @Override
    public void turnOff() {
        System.out.println("TV is turned off");
    }
    public void changeChannelForward(){
        System.out.println("Change the channel in a forward manner");
    }
    public void changeChannelBackward(){
        System.out.println("Change the channel in a backward manner");
    }
}
