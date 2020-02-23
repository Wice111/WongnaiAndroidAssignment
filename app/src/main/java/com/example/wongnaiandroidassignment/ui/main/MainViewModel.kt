package com.example.wongnaiandroidassignment.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Job

class MainViewModel(
    private val repository: CoinsRepository
) : ViewModel() {
    private lateinit var job: Job

    /* Live data */
    private val _coins = MutableLiveData<CoinsResponse>()
    val coins: LiveData<CoinsResponse>
        get() = _coins
    /*
        Use coroutine to get data from repository and put into live data
    */
    fun getCoins() {
        job = Coroutines.ioMain(
            { repository.getCoins() },
            { _coins.value = it }
        )
    }
    /*
        Cancel the job when app is put into the background or is killed
    */
    override fun onCleared() {
        super.onCleared()
        if(::job.isInitialized){
            job.cancel()
        }
    }
}
