package com.example.wongnaiandroidassignment.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.wongnaiandroidassignment.R
import com.example.wongnaiandroidassignment.databinding.RecyclerviewCoinBinding


class CoinsAdapter (
    private val coinsResponse : CoinsResponse
): RecyclerView.Adapter<CoinsAdapter.CoinsViewHolder>(){

    /* Get item count from response */
    override fun getItemCount() = coinsResponse.data.coins.size

    /* Create view holder */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        CoinsViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.recyclerview_coin,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: CoinsViewHolder, position: Int) {
        holder.recyclerviewcoinBinding.coin = coinsResponse.data.coins[position]
    }

    inner class CoinsViewHolder(
        val recyclerviewcoinBinding : RecyclerviewCoinBinding
    ) : RecyclerView.ViewHolder(recyclerviewcoinBinding.root)

}