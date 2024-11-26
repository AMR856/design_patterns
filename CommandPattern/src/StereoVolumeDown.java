public class StereoVolumeDown implements Command {
    private final Stereo stereo;
    public StereoVolumeDown(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        this.stereo.volumeDown();
    }
    @Override
    public void unexecute() {
        this.stereo.volumeUp();
    }
}
