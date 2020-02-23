package com.example.wongnaiandroidassignment.ui.main

class CoinsRepository(
    private val api: CoinsApi
) : SafeApiRequest() {
    /* Get data from api and pass to the caller */
    suspend fun getCoins() = apiRequest { api.getCoins() }
}