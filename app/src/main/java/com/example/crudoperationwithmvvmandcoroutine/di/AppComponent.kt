package com.example.crudoperationwithmvvmandcoroutine.di

import com.example.crudoperationwithmvvmandcoroutine.FirstFragment
import com.example.crudoperationwithmvvmandcoroutine.FirstViewModel
import com.example.crudoperationwithmvvmandcoroutine.di.module.RepositoryPresenter
import dagger.Component


@Component(modules = [RepositoryPresenter::class])
interface AppComponent {
   // fun inject(target: Repository)
   // fun inject(target: FirstFragment)
   fun inject(target: FirstViewModel)
}