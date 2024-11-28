
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator("Working");
        CareTaker careTaker = new CareTaker();
        careTaker.addMemento(originator.createMemento());
        originator.setState("Not Working");
        careTaker.addMemento(originator.createMemento());
        System.out.println(originator.restoreFromMemento(careTaker.getMemento(0)));
        System.out.println(originator.restoreFromMemento(careTaker.getMemento(1)));
    }
}