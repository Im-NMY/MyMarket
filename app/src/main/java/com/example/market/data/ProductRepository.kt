package com.example.market.data

import com.example.market.domain.*

interface ProductRepository {

    suspend fun getProducts(): ProductsModel

    suspend fun getBasket(): List<BasketProductsModel>

    suspend fun getDetails(): DetailsProductModel

}