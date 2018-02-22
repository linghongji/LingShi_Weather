package com.example.administrator.lingshi_weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/2/22.
 */

public class Forecast {
    public String date;

    @SerializedName("cond")
    public More more;
    @SerializedName("tmp")
    public Temperature temperature;

    private class More {
        @SerializedName("txt_d")
        public String info;
    }

    private class Temperature {
        public String max;
        public String min;
    }
}
