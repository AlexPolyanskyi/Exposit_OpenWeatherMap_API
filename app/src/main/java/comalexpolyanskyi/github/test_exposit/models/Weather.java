package comalexpolyanskyi.github.test_exposit.models;

/**
 * Created by Алексей on 08.06.2016.
 */
public interface Weather {
    double getPressure();
    int getHumidity();
    int getWindSpeed();
    int getCloudsProc();
    String getInfo();
    String getPrecipitation();
    String getIcon();
    double getTemp();
}
