package com.example.crudoperationwithmvvmandcoroutine.network

import retrofit2.http.POST

import com.example.crudoperationwithmvvmandcoroutine.model.ResponseModel
import retrofit2.Response

interface ApiService {
    @POST("/posts")
    suspend fun requestForUserData(): Response<ResponseModel>

}