package org.padilha.models;

public class Temperature {
    private float minTemperature;
    private float maxTemperature;
    private float value;
    private float MAX_VALUE = 100f;
    private float MIN_VALUE = -50f;

    public Temperature(float minTemperature, float maxTemperature) {
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public Temperature(){
    }
    public boolean isTemperatureInSongRange(float inputTemperature) {
        return inputTemperature >= minTemperature && inputTemperature <= maxTemperature;
    }
    public boolean TemperatureIsNotInRange(float inputTemperature){
        return inputTemperature < MIN_VALUE && inputTemperature > MAX_VALUE;
    }

    public void setValue(float value){
        if (value < MIN_VALUE ){
            throw new RuntimeException("Temperatura abaixo do mínimo");
        }
        if (value > MAX_VALUE ){
            throw new RuntimeException("Temperatura acima do máximo");
        }
        this.value = value;
    }
}


