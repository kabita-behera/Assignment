package com.kotlinassignment

class MainRepository constructor(private val retrofitService: RetrofitService) {

    suspend fun getAllData() = retrofitService.getAllData()

}