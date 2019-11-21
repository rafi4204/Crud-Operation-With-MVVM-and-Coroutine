package com.example.crudoperationwithmvvmandcoroutine.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [])
interface AppComponent {
    fun inject()
}