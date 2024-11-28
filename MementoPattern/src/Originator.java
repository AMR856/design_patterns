public class Originator {
    private String state;
    public Originator(String state){
        this.state = state;
    }
    public void setState(String state){
        this.state = state;
    }
    public Memento createMemento(){
        return new Memento(this.state);
    }
    public String restoreFromMemento(Memento memento){
        return memento.getState();
    }
}
