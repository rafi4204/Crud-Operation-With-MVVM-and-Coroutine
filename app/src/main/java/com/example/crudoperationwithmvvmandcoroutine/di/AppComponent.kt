package com.example.crudoperationwithmvvmandcoroutine.di

import com.example.crudoperationwithmvvmandcoroutine.FirstViewModel
import com.example.crudoperationwithmvvmandcoroutine.Repository
import com.example.crudoperationwithmvvmandcoroutine.di.module.RepositoryPresenter
import com.example.crudoperationwithmvvmandcoroutine.di.module.RetrofitModule
import com.example.crudoperationwithmvvmandcoroutine.network.RetrofitInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RetrofitModule::class , RepositoryPresenter::class])
interface AppComponent {
    fun inject(target:Repository)
    fun inject(target:FirstViewModel)
}