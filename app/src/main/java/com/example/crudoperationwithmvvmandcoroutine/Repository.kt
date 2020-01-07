package com.example.crudoperationwithmvvmandcoroutine

import android.util.Log
import com.example.crudoperationwithmvvmandcoroutine.network.ApiService
import com.example.crudoperationwithmvvmandcoroutine.network.RetrofitInstance
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import javax.inject.Inject

class Repository(val retrofit: RetrofitInstance) {

    /* @Inject
     lateinit var retrofit: RetrofitInstance*/

    suspend fun getData() =retrofit.retrofitInstance().create(ApiService::class.java).requestForUserData()


    fun test() {
        Log.d("2", "running................................................")
    }

    fun test2() {
        Log.d("2", "running22222222222................................................")
    }


}