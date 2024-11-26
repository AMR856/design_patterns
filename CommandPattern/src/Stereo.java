public class Stereo implements Device{
    @Override
    public void turnOn() {
        System.out.println("Stereo is turned on");
    }
    @Override
    public void turnOff() {
        System.out.println("Stereo is turned off");
    }
    public void volumeUp(){
        System.out.println("The volume was turned up");
    }
    public void volumeDown(){
        System.out.println("The volume was turned down");
    }
}
