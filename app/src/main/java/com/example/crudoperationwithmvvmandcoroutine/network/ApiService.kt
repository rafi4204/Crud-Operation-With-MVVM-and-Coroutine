package com.example.crudoperationwithmvvmandcoroutine.network

import retrofit2.http.POST

interface ApiService {
    @POST("/posts")
    fun requestForUserData()

}