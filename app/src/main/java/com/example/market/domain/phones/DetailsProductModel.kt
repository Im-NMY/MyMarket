package com.example.market.domain.phones

data class DetailsProductModel(
    val cpu: String = "",
    val camera: String = "",
    val capacity: List<String> = emptyList(),
    val color: List<String> = emptyList(),
    val id: Int = 0,
    val images: List<String> = emptyList(),
    val isFavorites: Boolean = true,
    val price: Int = 0,
    val rating: Float = 0.0f,
    val sd: String = "",
    val ssd: String = "",
    )



