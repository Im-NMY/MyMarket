package com.example.market.domain.phones

import com.example.market.base.Item

data class ProductsModel(
    val HotProductsList: List<HotProductsModel>,
    val BestProductsList: List<BestProductsModel>,
): Item