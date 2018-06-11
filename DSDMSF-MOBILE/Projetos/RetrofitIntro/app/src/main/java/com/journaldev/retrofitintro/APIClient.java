package com.journaldev.retrofitintro;

import com.journaldev.retrofitintro.pojo.MultipleResource;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by anupamchugh on 05/01/17.
 */

class APIClient {

    private static Retrofit retrofit = null;
    //DOMINIO+CONTEXTO
    public static final String ENDPOINT = "http://services.urbano.eti.br/northwind/";

    static Retrofit getClient() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();


        //PASSO 1
        retrofit = new Retrofit.Builder()
                .baseUrl(ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();



        return retrofit;
    }

}
