//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton.printLol();
        if (singleton == singleton2) System.out.println("They are the same dude");
    }
}
