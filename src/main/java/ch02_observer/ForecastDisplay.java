package ch02_observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ForecastDisplay implements Observer, DisplayElement {
    private float lastPressure;
    private float currentPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        this.currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        if (currentPressure > lastPressure) {
            log.info("Forecast: Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            log.info("Forecast: More of the same");
        } else if (currentPressure < lastPressure) {
            log.info("Forecast: Watch out for cooler, rainy weather");
        }
    }
}
