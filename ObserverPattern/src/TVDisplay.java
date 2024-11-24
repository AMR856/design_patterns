public class TVDisplay implements Observer, IDisplay{
    private WeatherStation station;
    private int weather = 0;
    public TVDisplay(WeatherStation station){
        this.station = station;
    }
    @Override
    public void display() {
        System.out.println("The weather on the weather channel is: " + this.weather);
    }
    @Override
    public void updateState() {
        this.weather = this.station.getTemp();
    }
}
