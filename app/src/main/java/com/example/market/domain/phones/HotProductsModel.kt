package com.example.market.domain.phones

import com.example.market.base.Item

data class HotProductsModel(
    val id: Int = 0,
    val isNew: Boolean = true,
    val title: String = "Phone",
    val subtitle: String = "Govno",
    val picture: String = "Tozhe govno",
    val isBuy: Boolean = true
): Item