package comalexpolyanskyi.github.test_exposit.models;

/**
 * Created by Алексей on 18.06.2016.
 */
public class SixteenDaysWeather implements Weather {
    private String txt;
    private String description;
    private String icon;
    private double temp;
    private double pressure;
    private int humidity;
    private int speed;
    private int clouds;
    public SixteenDaysWeather(String txt, String description, String icon, double temp, double pressure, int humidity, int speed, int clouds) {
        this.txt = txt;
        this.description = description;
        this.icon = icon;
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        this.speed = speed;
        this.clouds = clouds;
    }
    @Override
    public String getPrecipitation() {
        return description;
    }
    @Override
    public String getIcon() {
        return icon;
    }
    @Override
    public double getTemp() {
        return temp;
    }
    @Override
    public double getPressure() {
        return pressure;
    }
    @Override
    public int getHumidity() {
        return humidity;
    }
    @Override
    public int getWindSpeed() {
        return speed;
    }
    @Override
    public String getInfo() {
        return txt;
    }
    @Override
    public int getCloudsProc() {
        return clouds;
    }
}
