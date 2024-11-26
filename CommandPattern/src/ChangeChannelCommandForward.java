public class ChangeChannelCommandForward implements Command{
    private final TV tv;
    public ChangeChannelCommandForward(TV tv){
        this.tv = tv;
    }
    @Override
    public void execute() {
        this.tv.changeChannelForward();
    }
    @Override
    public void unexecute() {
        this.tv.changeChannelBackward();
    }
}
