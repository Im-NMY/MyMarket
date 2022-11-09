package com.example.market.ui

import com.example.market.base.Event
import com.example.market.domain.*

data class ViewState(
    val products: ProductsModel,
    val basketProducts: List<BasketProductsModel>,
    val detailsProduct: DetailsProductModel
)

sealed class DataEvent : Event {
    object LoadProducts : DataEvent()
    data class OnLoadProductSucceed(val prod: ProductsModel): DataEvent()
    data class OnLoadHotProductSucceed(val hotProd: List<HotProductsModel>): DataEvent()
    data class OnLoadBestProductSucceed(val BestProd: List<BestProductsModel>): DataEvent()
}
