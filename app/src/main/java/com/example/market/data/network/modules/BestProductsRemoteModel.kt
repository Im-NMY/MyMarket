package com.example.market.data.network.modules

import com.google.gson.annotations.SerializedName

data class BestProductsRemoteModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("is_favorites")
    val isFavorites: Boolean,
    @SerializedName("price_without_discount")
    val price: Int,
    @SerializedName("discount_price")
    val discount: Int,
    @SerializedName("picture")
    val picture: String
)