public class Adapter implements Target{
    private final Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void print() {
        this.adaptee.printOld();
    }
}
