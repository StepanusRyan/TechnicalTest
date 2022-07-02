package com.stepanusryan.testprogram.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class APIConfig {
    companion object{
        fun getLogin():API{
            val retrofit = Retrofit.Builder()
                .baseUrl("http://94.74.86.174:8080/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(API::class.java)
        }
    }
}