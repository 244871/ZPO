public class Main {
    private float temp;
    private float pressure;
    private float humidity;
    private float temp_min;
    private float temp_max;


    // Getter Methods

    public float getTemp() {
        return temp - 273F;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemp_min() {
        return temp_min - 273F;
    }

    public float getTemp_max() {
        return temp_max - 273F;
    }

    // Setter Methods

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setTemp_min(float temp_min) {
        this.temp_min = temp_min;
    }

    public void setTemp_max(float temp_max) {
        this.temp_max = temp_max;
    }
}
