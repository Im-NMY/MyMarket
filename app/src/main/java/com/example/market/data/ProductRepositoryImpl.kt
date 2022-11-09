package com.example.market.data

import com.example.market.data.network.*
import com.example.market.domain.*

class ProductRepositoryImpl(private val source: ProductRemoteSource): ProductRepository {

//    override suspend fun getHotProducts(): List<HotProductsModel> {
//        return source.getProducts().hotProductsList.map {
//            it.hotToDomain()
//        }
//    }
//
//    override suspend fun getBestProducts(): List<BestProductsModel> {
//        return source.getProducts().bestProductsList.map {
//            it.bestToDomain()
//        }
//    }

    override suspend fun getProducts(): ProductsModel {

        val list1 = source.getProducts().hotProductsList.map {
            it.hotToDomain()
        }
        val list2 = source.getProducts().bestProductsList.map {
            it.bestToDomain()
        }
        return ProductsModel(list1, list2)
    }

    override suspend fun getBasket(): List<BasketProductsModel> {
        val list = mutableListOf<BasketProductsModel>()
        val list1 = source.getBasket().basketList.map {
            it.basketToDomain()
        }
        list.add(
           BasketProductsModel(
                list1,
               delivery = source.getBasket().delivery,
               id = source.getBasket().id,
               total = source.getBasket().total
            )
        )
        return list
    }

    override suspend fun getDetails(): DetailsProductModel {
        return source.getDetails().detailsToDomain()
    }
}