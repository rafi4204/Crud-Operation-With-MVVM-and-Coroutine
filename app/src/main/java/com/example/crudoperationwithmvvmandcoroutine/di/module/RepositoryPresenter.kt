package com.example.crudoperationwithmvvmandcoroutine.di.module

import com.example.crudoperationwithmvvmandcoroutine.Repository
import com.example.crudoperationwithmvvmandcoroutine.network.RetrofitInstance
import dagger.Module
import dagger.Provides

@Module
class RepositoryPresenter {

    @Provides
    fun provideRetrofitIns(): RetrofitInstance = RetrofitInstance()

    @Provides
    fun provideRepo(retrofitInstance: RetrofitInstance): Repository = Repository(retrofitInstance)
}