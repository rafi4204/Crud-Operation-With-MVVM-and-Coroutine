package com.example.crudoperationwithmvvmandcoroutine.network

import com.example.crudoperationwithmvvmandcoroutine.model.BaseResponseModel
import retrofit2.http.POST

import com.example.crudoperationwithmvvmandcoroutine.model.ResponseModel
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("/posts")
    suspend fun requestForUserData(): Response<ArrayList<ResponseModel>>

}