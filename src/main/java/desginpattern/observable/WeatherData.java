package desginpattern.observable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chandra.Sarathe on 4/15/2018.
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    public void removeObserver(Observer o) {
        if(!observers.isEmpty()) {
            int i = observers.indexOf(o);
            if(i>=0) observers.remove(i);
        }
    }

    public void notifyObservers() {
        for(Observer o: observers){
            o.update(temperature,humidity,pressure);
        }
    }

    /**
     * Weather data will receive data from sensor and assume sensor will set data here.
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature,float humidity , float pressure){
        this.temperature=temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }


    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
