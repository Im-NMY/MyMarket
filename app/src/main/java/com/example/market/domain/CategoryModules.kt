package com.example.market.domain

import androidx.annotation.DrawableRes
import com.example.market.base.Item
import com.example.market.domain.phones.BestProductsModel
import com.example.market.domain.phones.HotProductsModel
import com.example.market.domain.testmodel.CategoriesListItem

sealed class CategoryModules : Item {
    data class CategoriesItem (
        @DrawableRes val icon: Int
    ): CategoryModules()


//    data class Phones(val phones: PhonesModel) : CategoryModules()
//    data class Computers(val computers: String) : CategoryModules()
//    data class Health(val health: String) : CategoryModules()
//    data class Books(val books: String) : CategoryModules()
//    data class Tools(val tools: String) : CategoryModules()
}
