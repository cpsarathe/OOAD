package desginpattern.observable;

/**
 * Created by Chandra.Sarathe on 4/15/2018.
 */
public class StatisticsDisplay implements Observer , DisplayElement {
    private Subject weatherData;

    private float temperature;
    private float pressure;
    private float humidity;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
    public void update(float temp, float humidity, float pressure) {
        this.humidity= humidity;
        this.temperature=temp;
        this.pressure=pressure;
    }

    public void display() {
        System.out.println("Statistics temperature:"+temperature+" humidity:"+humidity+" pressure:"+pressure);
    }
}
