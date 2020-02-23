package com.example.wongnaiandroidassignment.ui.main

/* Response data structure */

data class CoinsResponse(
    val `data`: Data,
    val status: String
) {
    data class Data(
        val base: Base,
        val coins: List<Coin>,
        val stats: Stats
    ) {
        data class Base(
            val sign: String,
            val symbol: String
        )

        data class Coin(
            val allTimeHigh: AllTimeHigh,
            val approvedSupply: Boolean,
            val change: Double,
            val circulatingSupply: Double,
            val color: String,
            val confirmedSupply: Boolean,
            val description: String,
            val firstSeen: Long,
            val history: List<String>,
            val iconType: String,
            val iconUrl: String,
            val id: Long,
            val links: List<Link>,
            val marketCap: Long,
            val name: String,
            val numberOfExchanges: Long,
            val numberOfMarkets: Long,
            val penalty: Boolean,
            val price: String,
            val rank: Long,
            val slug: String,
            val socials: List<Social>,
            val symbol: String,
            val totalSupply: Double,
            val type: String,
            val uuid: String,
            val volume: Long,
            val websiteUrl: String
        ) {
            data class AllTimeHigh(
                val price: String,
                val timestamp: Long
            )

            data class Link(
                val name: String,
                val type: String,
                val url: String
            )

            data class Social(
                val name: String,
                val type: String,
                val url: String
            )
        }

        data class Stats(
            val base: String,
            val limit: Long,
            val offset: Long,
            val order: String,
            val total: Long,
            val total24hVolume: Double,
            val totalExchanges: Long,
            val totalMarketCap: Double,
            val totalMarkets: Long
        )
    }
}