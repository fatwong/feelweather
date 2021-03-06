package com.feelweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Isaac on 2017/8/31.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
