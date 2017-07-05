package com.mycompany.liteweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by wqm19 on 7/4/2017.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
