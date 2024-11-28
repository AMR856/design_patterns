import java.util.ArrayList;

public class CareTaker {
    private  ArrayList<Memento> mementos = new ArrayList<>(){};
    public void addMemento(Memento memento){
        this.mementos.add(memento);
    }
    public Memento getMemento(int index){
        return this.mementos.get(index);
    }
}
