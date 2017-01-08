package com.example.android.sunshine;

import android.content.Context;
import android.support.v4.content.ContextCompat;

public class Utility {
    public static int getIconResourceForWeatherCondition(Context context, int weatherId) {
        // Based on weather code data found at:
        // http://openweathermap.org/weather-conditions
        if (weatherId >= 200 && weatherId <= 232) {
            return ContextCompat.getColor(context,R.drawable.ic_storm);
        } else if (weatherId >= 300 && weatherId <= 321) {
            return ContextCompat.getColor(context,R.drawable.ic_light_rain);
        } else if (weatherId >= 500 && weatherId <= 504) {
            return ContextCompat.getColor(context,R.drawable.ic_rain);
        } else if (weatherId == 511) {
            return ContextCompat.getColor(context,R.drawable.ic_snow);
        } else if (weatherId >= 520 && weatherId <= 531) {
            return ContextCompat.getColor(context,R.drawable.ic_rain);
        } else if (weatherId >= 600 && weatherId <= 622) {
            return ContextCompat.getColor(context,R.drawable.ic_snow);
        } else if (weatherId >= 701 && weatherId <= 761) {
            return ContextCompat.getColor(context,R.drawable.ic_fog);
        } else if (weatherId == 761 || weatherId == 781) {
            return ContextCompat.getColor(context,R.drawable.ic_storm);
        } else if (weatherId == 800) {
            return ContextCompat.getColor(context,R.drawable.ic_clear);
        } else if (weatherId == 801) {
            return ContextCompat.getColor(context,R.drawable.ic_light_clouds);
        } else if (weatherId >= 802 && weatherId <= 804) {
            return ContextCompat.getColor(context,R.drawable.ic_cloudy);
        }
        return ContextCompat.getColor(context,R.mipmap.ic_launcher);
    }

}