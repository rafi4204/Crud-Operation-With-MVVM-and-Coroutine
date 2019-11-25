package com.example.crudoperationwithmvvmandcoroutine.di.module

import com.example.crudoperationwithmvvmandcoroutine.Repository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryPresenter {
    @Provides
    @Singleton
    fun provideRepo(): Repository = Repository()
}