package desginpattern.observable;

/**
 * Created by Chandra.Sarathe on 4/15/2018.
 */
public class CurrentConditionsDisplay implements Observer , DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current Conditions:"+temperature + "degrees and humidity %"+humidity);
    }
}
