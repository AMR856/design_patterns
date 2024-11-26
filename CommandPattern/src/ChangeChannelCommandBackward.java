public class ChangeChannelCommandBackward implements Command{
    private final TV tv;
    public ChangeChannelCommandBackward(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        this.tv.changeChannelBackward();
    }
    @Override
    public void unexecute() {
        this.tv.changeChannelForward();
    }
}
