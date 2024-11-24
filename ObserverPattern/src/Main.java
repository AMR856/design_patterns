//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            WeatherStation station = new WeatherStation();
            PhoneDisplay phone = new PhoneDisplay(station);
            TVDisplay TV = new TVDisplay(station);
            station.addObserver(phone);
            station.addObserver(TV);
            phone.display();
            TV.display();
            station.updateTemp(20);
            phone.display();
            TV.display();
        }
    }