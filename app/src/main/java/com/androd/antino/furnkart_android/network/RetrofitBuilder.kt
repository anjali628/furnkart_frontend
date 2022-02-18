package com.androd.antino.furnkart_android.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitBuilder {

    private val retrofit by lazy {
            Retrofit.Builder()
                .baseUrl(ApiInterface.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }


        val api: ApiInterface by lazy {
            retrofit.create(ApiInterface::class.java)

        }
}