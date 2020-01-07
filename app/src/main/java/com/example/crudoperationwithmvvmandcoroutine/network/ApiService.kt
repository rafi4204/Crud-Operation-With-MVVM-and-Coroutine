package com.example.crudoperationwithmvvmandcoroutine.network

import com.example.crudoperationwithmvvmandcoroutine.model.BaseResponseModel
import retrofit2.http.POST

import com.example.crudoperationwithmvvmandcoroutine.model.ResponseModel
import kotlinx.coroutines.Deferred
import retrofit2.Response

interface ApiService {
    @POST("/posts")
    suspend fun requestForUserData(): Response<ArrayList<ResponseModel>>

}