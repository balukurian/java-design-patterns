package hfdp.observer.weather.display;

import hfdp.observer.weather.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements DisplayElement, Observer {

    private float currentPressure = 29.92f;
    private float lastPressure;
    Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Pressure: " + this.currentPressure + " change in pressure " + (currentPressure - lastPressure));
    }

    @Override
    public void update(Observable obs, Object args) {
        if(obs instanceof WeatherData) {
            this.lastPressure = this.currentPressure;
            this.currentPressure = ((WeatherData) obs).getPressure();
            display();
        }
    }
}
