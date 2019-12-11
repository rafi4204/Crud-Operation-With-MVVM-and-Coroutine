package com.example.crudoperationwithmvvmandcoroutine

import com.example.crudoperationwithmvvmandcoroutine.network.ApiService
import com.example.crudoperationwithmvvmandcoroutine.network.RetrofitInstance
import retrofit2.Retrofit
import javax.inject.Inject

class Repository @Inject constructor() {

    @Inject
    lateinit var retrofit: RetrofitInstance

    suspend fun getData()=retrofit.retrofitInstance().create(ApiService::class.java).requestForUserData().await()


}