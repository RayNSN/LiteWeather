package com.mycompany.liteweather.gson;

/**
 * Created by wqm19 on 7/6/2017.
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;
        public String pm25;
    }
}
