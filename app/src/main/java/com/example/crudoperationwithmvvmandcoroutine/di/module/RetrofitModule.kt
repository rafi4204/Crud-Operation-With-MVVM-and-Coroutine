package com.example.crudoperationwithmvvmandcoroutine.di.module

import com.example.crudoperationwithmvvmandcoroutine.network.RetrofitInstance
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class RetrofitModule {
    @Singleton
    @Provides
    fun getRetrofitIns():Retrofit=object: RetrofitInstance() {}.retrofitInstance()

}