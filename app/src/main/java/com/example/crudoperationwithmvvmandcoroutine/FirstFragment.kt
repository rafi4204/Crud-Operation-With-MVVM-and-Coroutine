package com.example.crudoperationwithmvvmandcoroutine

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.crudoperationwithmvvmandcoroutine.di.DaggerAppComponent
import com.example.crudoperationwithmvvmandcoroutine.network.RetrofitInstance
import kotlinx.coroutines.ExperimentalCoroutinesApi
import retrofit2.Retrofit
import javax.inject.Inject


class FirstFragment : Fragment() {
    @Inject
lateinit var repository: Repository
    companion object {
        fun newInstance() = FirstFragment()
    }

    private lateinit var viewModel: FirstViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.first_fragment, container, false)
    }

    @ExperimentalCoroutinesApi
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

       /* val repComponent=DaggerAppComponent.create()
        repComponent.inject(this)
        repository.test()*/

        viewModel = ViewModelProviders.of(this).get(FirstViewModel::class.java)
        viewModel.liveUserData.observe(this, Observer {
            Log.d("2", it.body()?.size.toString())
        })
      //  viewModel.testVM()

    }

}
