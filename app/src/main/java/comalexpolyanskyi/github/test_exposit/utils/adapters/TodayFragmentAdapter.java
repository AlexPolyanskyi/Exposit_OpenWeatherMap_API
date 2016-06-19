package comalexpolyanskyi.github.test_exposit.utils.adapters;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import comalexpolyanskyi.github.test_exposit.R;
import comalexpolyanskyi.github.test_exposit.models.TodayWeather;

/**
 * Created by Алексей on 15.06.2016.
 */
public class TodayFragmentAdapter {
    private AppCompatActivity activity = null;
    private View view = null;
    private boolean loading = false;
    public TodayFragmentAdapter(AppCompatActivity activity, View view){
        this.activity = activity;
        this.view = view;
    }
    public void initView(TodayWeather todayWeather) {
        ((TextView) view.findViewById(R.id.temperature)).setText(todayWeather.getTemp() + "°c");
        ((TextView) view.findViewById(R.id.weather)).setText(todayWeather.getPrecipitation());
        ((TextView) view.findViewById(R.id.cloudiness)).setText(activity.getString(R.string.cloudness) + " " + todayWeather.getCloudsProc() + "%");
        ((TextView) view.findViewById(R.id.humidity)).setText(activity.getString(R.string.humidity) + " " + todayWeather.getHumidity() + "%");
        ((TextView) view.findViewById(R.id.pressure)).setText(activity.getString(R.string.pressure) + " " + todayWeather.getPressure() + "hPa");
        ((TextView) view.findViewById(R.id.wind_speed)).setText(activity.getString(R.string.wind_speed) + " " + todayWeather.getWindSpeed() + "m/с");
        String image = todayWeather.getIcon();
        ((ImageView) view.findViewById(R.id.weather_image)).setImageResource(changeImage(image));
    }

    private int changeImage(String image){
        int imageType;
        switch (image){
            case "01d": imageType = R.drawable.w01d; break;
            case "02d": case "02n": imageType = R.drawable.w02d; break;
            case "01n": imageType =R.drawable.w01n; break;
            case "03d": case "03n": imageType = R.drawable.w03; break;
            case "04d": case "04n": imageType = R.drawable.w04; break;
            case "09d": case "09n": imageType = R.drawable.w05; break;
            case "10d": case "10n": imageType = R.drawable.w06; break;
            case "11d": case "11n": imageType =R.drawable.w07; break;
            case "13d": case "13n": imageType =R.drawable.w08; break;
            case "50d": case "50n": imageType =R.drawable.w50; break;
            default:
                imageType = R.drawable.w01d;
        }
        return  imageType;
    }

    public void stopLoading(){
        loading = false;
        view.findViewById(R.id.today_progress).setVisibility(View.GONE);
        view.findViewById(R.id.today_layout).setVisibility(View.VISIBLE);

    }
    public void startLoading(){
        loading = true;
        view.findViewById(R.id.today_progress).setVisibility(View.VISIBLE);
        view.findViewById(R.id.today_layout).setVisibility(View.GONE);

    }
    public boolean isLoading(){
        return loading;
    }
}
