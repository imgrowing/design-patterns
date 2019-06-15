package ch02_observer;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class StatisticsDisplay implements Observer, DisplayElement {
    private List<Float> temperatures;
    private List<Float> humidities;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        temperatures = new ArrayList<>();
        humidities = new ArrayList<>();

        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperatures.add(temp);
        this.humidities.add(humidity);
        display();
    }

    @Override
    public void display() {
        log.info("Avg/Max/Min: {} / {} / {}", averageTemperature(), maxTemperature(), minTemperature());
    }

    private float averageTemperature() {
        double sum = temperatures.stream().mapToDouble(Float::doubleValue).sum();
        return ((float) Math.round(sum / temperatures.size() * 10)) / 10;
    }

    private float maxTemperature() {
        return temperatures.stream().max(Float::compareTo).orElse(0f);
    }

    private float minTemperature() {
        return temperatures.stream().min(Float::compareTo).orElse(0f);
    }
}
