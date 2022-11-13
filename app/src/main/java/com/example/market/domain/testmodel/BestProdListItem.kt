package com.example.market.domain.testmodel

import com.example.market.base.Item
import com.example.market.domain.phones.BestProductsModel

data class BestProdListItem(
    val BestProductsList: List<BestProductsModel>
): Item
