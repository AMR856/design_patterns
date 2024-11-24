public class PhoneDisplay implements Observer, IDisplay{
    private WeatherStation station;
    private int weather = 0;
    public PhoneDisplay(WeatherStation station){
        this.station = station;
    }
    @Override
    public void updateState() {
        this.weather = this.station.getTemp();
    }
    @Override
    public void display() {
        System.out.println("The weather on your phone is: " + this.weather);
    }
}
