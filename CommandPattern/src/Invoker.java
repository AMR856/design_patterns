public class Invoker {
    private Command turnOn1;
    private Command turnOff1;
    private Command turnOn2;
    private Command turnOff2;
    private Command changeChannelFoward;
    private Command changeChannelBackward;
    private Command stereoVolumeUp;
    private Command stereoVolumeDown;

    public Invoker(Command turnOn1,
                   Command turnOff1,
                   Command turnOn2,
                   Command turnOff2,
                   Command changeChannelFoward,
                   Command changeChannelBackward,
                   Command stereoVolumeUp,
                   Command stereoVolumeDown){
        this.turnOn1 = turnOn1;
        this.turnOff1 = turnOff1;
        this.turnOn2 = turnOn2;
        this.turnOff2 = turnOff2;
        this.changeChannelFoward = changeChannelFoward;
        this.changeChannelBackward = changeChannelBackward;
        this.stereoVolumeUp = stereoVolumeUp;
        this.stereoVolumeDown = stereoVolumeDown;
    }
    public void pressOn1(){
        this.turnOn1.execute();
    }
    public void pressOff1(){
        this.turnOff1.execute();
    }
    public void pressOn2(){
        this.turnOn2.execute();
    }
    public void pressOff2(){
        this.turnOff2.execute();
    }
    public void pressChannelForward(){
        this.changeChannelFoward.execute();
    }
    public void pressChannelBackward(){
        this.changeChannelBackward.execute();
    }
    public void pressStereoVolumeUp(){
        this.stereoVolumeUp.execute();
    }
    public void pressStereoVolumeDown(){
        this.stereoVolumeDown.execute();
    }
}
