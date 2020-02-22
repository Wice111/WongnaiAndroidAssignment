package com.example.wongnaiandroidassignment.ui.main

class CoinsRepository(
    private val api: CoinsApi
) : SafeApiRequest() {
    suspend fun getCoins() = apiRequest { api.getCoins() }
}