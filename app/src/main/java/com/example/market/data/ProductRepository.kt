package com.example.market.data

import com.example.market.domain.phones.BasketProductsModel
import com.example.market.domain.phones.DetailsProductModel
import com.example.market.domain.phones.ProductsModel

interface ProductRepository {

    suspend fun getProducts(): ProductsModel

    suspend fun getBasket(): List<BasketProductsModel>

    suspend fun getDetails(): DetailsProductModel

}