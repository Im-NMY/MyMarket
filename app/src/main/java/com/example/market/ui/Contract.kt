package com.example.market.ui

import com.example.market.base.Event
import com.example.market.base.Item
import com.example.market.domain.CategoryModules
import com.example.market.domain.phones.*

data class ViewState(
    val products: ProductsModel,
    val basketProducts: List<BasketProductsModel>,
    val detailsProduct: DetailsProductModel,
    val categories: List<CategoryModules.CategoriesItem>,
): Item

sealed class DataEvent : Event {
    object LoadProducts : DataEvent()
    data class OnLoadProductSucceed(val prod: ProductsModel): DataEvent()
    data class OnLoadHotProductSucceed(val hotProd: List<HotProductsModel>): DataEvent()
    data class OnLoadBestProductSucceed(val BestProd: List<BestProductsModel>): DataEvent()
}

sealed class UiEvent: Event {
    data class OnPhonesClicked(val index: Int) : UiEvent()
}
