package com.example.market.domain

import com.example.market.base.attempt
import com.example.market.data.ProductRepository

class Interactions(private val repository: ProductRepository){

    suspend fun getProducts() = attempt { repository.getProducts() }

    suspend fun getBasket() = attempt { repository.getBasket() }

    suspend fun getDetails() = attempt { repository.getDetails() }

}