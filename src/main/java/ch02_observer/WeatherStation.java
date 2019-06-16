package ch02_observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        Observer statisticsDisplay = new StatisticsDisplay(weatherData);
        Observer forecastDisplay = new ForecastDisplay(weatherData);
        Observer heatIndex = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(23, 56, 1024);
        weatherData.setMeasurements(27, 52, 1004);
        weatherData.setMeasurements(29, 55, 1011);
    }
}
