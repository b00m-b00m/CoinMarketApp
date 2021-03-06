package com.example.pavel.myapplication.clientapi.CryptoCompareAPI;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Pavel on 7/28/2018.
 */

public class CryptoCompareAPI {

    private static Retrofit retrofit;
    private static final String BASE_URL = "https://min-api.cryptocompare.com";

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
