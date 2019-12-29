package com.example.crudoperationwithmvvmandcoroutine

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.crudoperationwithmvvmandcoroutine.di.DaggerAppComponent
import com.example.crudoperationwithmvvmandcoroutine.model.ResponseModel
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import retrofit2.Response
import javax.inject.Inject

class FirstViewModel : ViewModel() {
    @Inject
    lateinit var repository: Repository

    init {
        val repComponent=DaggerAppComponent.create()
        repComponent.inject(this)

    }


    val liveUserData: LiveData<Response<ArrayList<ResponseModel>>> = liveData(Dispatchers.IO) {
        val data = repository.getData()
        emit(data)
    }

    fun testVM() {
        repository.test2()
    }


}
