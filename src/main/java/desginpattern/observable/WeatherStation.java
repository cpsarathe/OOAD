package desginpattern.observable;

/**
 * Created by Chandra.Sarathe on 4/15/2018.
 */
public class WeatherStation {

    public static void main(String ar[]){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(16.0f,34.5f,5.0f);
        weatherData.setMeasurements(26.0f,44.5f,5.0f);
        weatherData.setMeasurements(16.0f,4.5f,15.0f);

    }
}
