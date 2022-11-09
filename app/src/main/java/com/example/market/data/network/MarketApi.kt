package com.example.market.data.network

import com.example.market.data.network.modules.BasketRemoteModel
import com.example.market.data.network.modules.DetailsRemoteModel
import com.example.market.data.network.modules.ProductsRemoteModel
import com.example.market.di.API_KEY_BASKET
import com.example.market.di.API_KEY_DETAILS
import com.example.market.di.API_KEY_MAIN
import retrofit2.http.GET

interface MarketApi {

    @GET(API_KEY_MAIN)
    suspend fun getProducts(): ProductsRemoteModel

    @GET(API_KEY_BASKET)
    suspend fun getBasket(): BasketRemoteModel

    @GET(API_KEY_DETAILS)
    suspend fun getDetails(): DetailsRemoteModel
}