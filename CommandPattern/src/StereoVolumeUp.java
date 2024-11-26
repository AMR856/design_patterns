public class StereoVolumeUp implements Command{
    private final Stereo stereo;
    public StereoVolumeUp(Stereo stereo){
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        this.stereo.volumeUp();
    }
    @Override
    public void unexecute() {
        this.stereo.volumeDown();
    }
}
