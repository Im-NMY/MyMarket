package com.example.market.domain

import com.example.market.base.Item

data class CategoriesModel(
    val category: List<CategoryModules.CategoriesItem>
    ): Item
