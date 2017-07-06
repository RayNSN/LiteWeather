package com.mycompany.liteweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wqm19 on 7/6/2017.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;

    }
}
