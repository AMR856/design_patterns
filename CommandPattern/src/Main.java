public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Stereo stereo = new Stereo();
        Command turnOnTv = new TurnOnCommand(tv);
        Command turnOnStereo = new TurnOnCommand(stereo);
        Command turnOffTv = new TurnOffCommand(tv);
        Command turnOffStereo = new TurnOffCommand(stereo);
        Command changeChannelForward = new ChangeChannelCommandForward(tv);
        Command changeChannelBackward = new ChangeChannelCommandBackward(tv);
        Command volumeUp = new StereoVolumeUp(stereo);
        Command volumeDown = new StereoVolumeDown(stereo);
        Invoker remoteControl = new Invoker(
            turnOnTv,
            turnOffTv,
            turnOnStereo,
            turnOffStereo,
            changeChannelForward,
            changeChannelBackward,
            volumeUp,
            volumeDown
        );
        remoteControl.pressOn1();
        remoteControl.pressOn2();
        remoteControl.pressChannelForward();
        remoteControl.pressChannelBackward();
        remoteControl.pressStereoVolumeUp();
        remoteControl.pressStereoVolumeDown();
        remoteControl.pressOff1();
        remoteControl.pressOff2();
    }
}