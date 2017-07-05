package com.mycompany.liteweather.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by wqm19 on 7/4/2017.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        Log.d("HttpUtil","发出请求："+address);
        client.newCall(request).enqueue(callback);
    }
}
