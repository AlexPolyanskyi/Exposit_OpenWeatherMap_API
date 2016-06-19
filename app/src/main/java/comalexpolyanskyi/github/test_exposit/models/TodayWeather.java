package comalexpolyanskyi.github.test_exposit.models;

/**
 * Created by Алексей on 08.06.2016.
 */
public class TodayWeather implements Weather {
    private String city;
    private String precipitation;
    private String icon;
    private double temp;
    private double pressure;
    private int humidity;
    private int windSpeed;
    private int cloudsProc;

    public TodayWeather(String city, String precipitation, String icon, double temp, double pressure, int humidity, int windSpeed, int cloudsProc) {
        this.city = city;
        this.precipitation = precipitation;
        this.icon = icon;
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.cloudsProc = cloudsProc;
    }

    public double getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public int getCloudsProc() {
        return cloudsProc;
    }

    public String getInfo() {
        return city;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public String getIcon() {
        return icon;
    }

    public double getTemp() {
        return temp;
    }

}
