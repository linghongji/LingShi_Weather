package com.example.administrator.lingshi_weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/2/22.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;

    public Update update;

    private class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
