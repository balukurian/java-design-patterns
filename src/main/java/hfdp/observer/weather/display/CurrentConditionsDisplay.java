package hfdp.observer.weather.display;
import hfdp.observer.weather.WeatherData;
import hfdp.observer.weather.display.DisplayElement;

import java.util.Observable;
import java.util.Observer;
public class CurrentConditionsDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable obs, Object args) {
        if(obs instanceof WeatherData) {
            this.temperature = ((WeatherData) obs).getTemperature();
            this.humidity = ((WeatherData) obs).getHumidity();
            display();
        }
    }
}
