package com.example.market.data.network.modules

import com.google.gson.annotations.SerializedName

data class ProductsRemoteModel(
    @SerializedName("home_store")
    val hotProductsList: List<HotProductsRemoteModel>,
    @SerializedName("best_seller")
    val bestProductsList: List<BestProductsRemoteModel>,
    )


