package ro.pub.cs.systems.eim.practicaltest02;

/**
 * Created by bordin on 5/20/16.
 */
public class WeatherForecastInformation {

    public String temperature;
    public String wind_speed;
    public String condition;
    public String pressure;
    public String humidity;

    public WeatherForecastInformation (String temperature, String wind_speed, String condition, String pressure, String humidity) {
        this.temperature = temperature;
        this.wind_speed = wind_speed;
        this.condition = condition;
        this.pressure = pressure;
        this.humidity = humidity;
    }

}