package com.example.crudoperationwithmvvmandcoroutine

import com.example.crudoperationwithmvvmandcoroutine.network.RetrofitInstance
import javax.inject.Inject

class Repository @Inject constructor() {

    @Inject
    lateinit var retrofitInstance: RetrofitInstance

}