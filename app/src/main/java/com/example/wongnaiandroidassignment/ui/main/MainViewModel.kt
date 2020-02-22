package com.example.wongnaiandroidassignment.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Job

class MainViewModel(
    private val repository: CoinsRepository
) : ViewModel() {
    private lateinit var job: Job
    private val _coins = MutableLiveData<CoinsResponse>()
    val coins: LiveData<CoinsResponse>
        get() = _coins

    fun getCoins() {
        job = Coroutines.ioMain(
            { repository.getCoins() },
            { _coins.value = it }
        )
    }

    override fun onCleared() {
        super.onCleared()
        if(::job.isInitialized){
            job.cancel()
        }
    }
}
