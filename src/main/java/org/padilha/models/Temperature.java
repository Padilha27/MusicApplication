package org.padilha.models;

public class Temperature {
    private float minTemperature;
    private float maxTemperature;
    //private Float MAX_VALUE = 100f;
    //private Float MIN_VALUE = -50f;

    public Temperature(float minTemperature, float maxTemperature) {
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }
    public boolean isTemperatureInRange(float temperature) {
        return temperature >= minTemperature && temperature <= maxTemperature;
    }
}


