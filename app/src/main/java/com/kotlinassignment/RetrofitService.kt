package com.kotlinassignment

import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers


interface RetrofitService {

    @GET("s/2iodh4vg0eortkl/facts.json")
    @Headers("Cache-Control: public, max-age=640000, s-maxage=640000 , max-stale=2419200")
    suspend fun getAllData() : Response<Responsedata>

    companion object {
        var retrofitService: RetrofitService? = null
        fun getInstance() : RetrofitService {
            if (retrofitService == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://dl.dropboxusercontent.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                retrofitService = retrofit.create(RetrofitService::class.java)
            }
            return retrofitService!!
        }

    }


}