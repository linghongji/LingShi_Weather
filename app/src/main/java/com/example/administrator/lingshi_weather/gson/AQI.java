package com.example.administrator.lingshi_weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/2/22.
 */

public class AQI {
    public AQICity city;

    private class AQICity {
        public String aqi;
        public String pm25;
    }
}
