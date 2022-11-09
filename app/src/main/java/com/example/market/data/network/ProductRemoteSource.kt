package com.example.market.data.network

import com.example.market.data.network.modules.BasketRemoteModel
import com.example.market.data.network.modules.DetailsRemoteModel
import com.example.market.data.network.modules.ProductsRemoteModel

class ProductRemoteSource(private val api: MarketApi) {

    suspend fun getProducts(): ProductsRemoteModel =  api.getProducts()

    suspend fun getBasket(): BasketRemoteModel = api.getBasket()

    suspend fun getDetails(): DetailsRemoteModel = api.getDetails()
}