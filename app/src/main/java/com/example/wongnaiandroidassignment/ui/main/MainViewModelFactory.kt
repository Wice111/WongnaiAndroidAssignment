package com.example.wongnaiandroidassignment.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModelFactory(
    private val  repository: CoinsRepository
): ViewModelProvider.NewInstanceFactory() {
    /*
        create viewmodel with repository as parameter
    */
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }


}