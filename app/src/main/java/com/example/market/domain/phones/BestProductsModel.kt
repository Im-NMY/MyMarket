package com.example.market.domain.phones

import com.example.market.base.Item

data class BestProductsModel(
    val id: Int = 0,
    val title: String = "",
    val isFavorites: Boolean = true,
    val price: Int = 0,
    val discount: Int = 0,
    val picture: String = ""
): Item