package com.example.photoapitest.model.remote

import com.example.photoapitest.BuildConfig
import com.example.photoapitest.BuildConfig.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class Network {

    // to create single instance of api object
    val api: PhotoApi by lazy {
        initRetrofit()
    }


    private fun initRetrofit(): PhotoApi {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PhotoApi::class.java)
    }

}