package com.example.crudoperationwithmvvmandcoroutine

import com.example.crudoperationwithmvvmandcoroutine.network.RetrofitInstance
import retrofit2.Retrofit
import javax.inject.Inject

class Repository @Inject constructor() {

    @Inject
    lateinit var retrofit: Retrofit

   // suspend fun getData()=retrofit.req





}