package com.example.market.domain

data class HotProductsModel(
    val id: Int = 0,
    val isNew: Boolean = true,
    val title: String = "",
    val subtitle: String = "",
    val picture: String = "",
    val isBuy: Boolean = true
)