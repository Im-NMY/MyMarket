package com.example.market.data.network.modules

import com.google.gson.annotations.SerializedName

data class BasketProductRemoteModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("images")
    val images: String,
    @SerializedName("price")
    val price: Int,
    @SerializedName("title")
    val title: String
)