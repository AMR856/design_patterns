import java.util.ArrayList;

public class WeatherStation implements Subject {
    private ArrayList<Observer> observers;
    private int weather = 0;
    public WeatherStation() {
        this.observers = new ArrayList<Observer>();
    }
    @Override
    public void addObserver(Observer o) {
        if (o != null && !this.observers.contains(o)) this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (o != null) this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        try{
            for (Observer o : this.observers) o.updateState();
        } catch (Exception err){
            System.out.println("Failed notifying all the observers");
            System.exit(0);
        }
    }
    public void updateTemp(int value){
        this.weather = value;
        this.notifyObservers();
    }
    public int getTemp(){
        return this.weather;
    }
}
