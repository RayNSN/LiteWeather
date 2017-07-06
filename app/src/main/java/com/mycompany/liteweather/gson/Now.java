package com.mycompany.liteweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wqm19 on 7/6/2017.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    private class More {
        @SerializedName("txt")
        public String info;
    }
}
