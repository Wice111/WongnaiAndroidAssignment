package com.example.wongnaiandroidassignment.ui.main

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface CoinsApi {

    @GET("coins")
    suspend fun getCoins(): Response<CoinsResponse>

    /* Use Retrofit to build api */
    companion object {
        operator fun invoke(): CoinsApi {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.coinranking.com/v1/public/")
                .build()
                .create(CoinsApi::class.java)
        }
    }

}