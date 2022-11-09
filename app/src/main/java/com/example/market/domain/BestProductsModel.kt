package com.example.market.domain

data class BestProductsModel(
    val id: Int = 0,
    val title: String = "",
    val isFavorites: Boolean = true,
    val price: Int = 0,
    val discount: Int = 0,
    val picture: String = ""
)