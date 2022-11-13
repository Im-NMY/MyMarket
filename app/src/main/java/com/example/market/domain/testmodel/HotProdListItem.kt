package com.example.market.domain.testmodel

import com.example.market.base.Item
import com.example.market.domain.phones.HotProductsModel

data class HotProdListItem (
    val HotProductsList: List<HotProductsModel>
    ): Item