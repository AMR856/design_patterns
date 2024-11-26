
public class Main {
    public static void main(String[] args) {
        Target printer = new Adapter(new Adaptee());
        printer.print();
    }
}