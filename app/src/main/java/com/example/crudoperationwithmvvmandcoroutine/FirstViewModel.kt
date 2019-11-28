package com.example.crudoperationwithmvvmandcoroutine

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class FirstViewModel : ViewModel() {
    @Inject
    lateinit var repository: Repository
}
