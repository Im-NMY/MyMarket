package com.example.market.domain.phones

data class BasketProductsModel (
    val basketList: List<ProductsInBasketModel>,
    val delivery: String = "",
    val id: String = "",
    val total: Int = 0
)
