package com.example.market.data.network.modules

import com.google.gson.annotations.SerializedName

data class BasketRemoteModel(
    @SerializedName("basket")
    val basketList: List<BasketProductRemoteModel>,
    @SerializedName("delivery")
    val delivery: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("total")
    val total: Int
)
