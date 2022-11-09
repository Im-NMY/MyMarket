package com.example.market.domain

data class ProductsModel(
    val HotProductsList: List<HotProductsModel>,
    val BestProductsList: List<BestProductsModel>,
)
