package desginpattern.observable;

/**
 * Created by Chandra.Sarathe on 4/15/2018.
 */
public class ForecastDisplay implements Observer , DisplayElement {
    private Subject weatherData;

    private float temperature;
    private float pressure;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
    public void update(float temp, float humidity, float pressure) {
        this.temperature=temp;
        this.pressure=pressure;
        display();
    }

    public void display() {
        System.out.println("Forecast temperature:"+temperature+" pressure: "+pressure);
    }

}
