package com.example.market.data.network

import com.example.market.data.network.modules.*
import com.example.market.domain.phones.*

fun HotProductsRemoteModel.hotToDomain() = HotProductsModel(
    id = id,
    isNew = isNew,
    title = title,
    subtitle = subtitle,
    picture = picture,
    isBuy = isBuy
)

fun BestProductsRemoteModel.bestToDomain() = BestProductsModel(
    id = id,
    title = title,
    isFavorites = isFavorites,
    price = price,
    discount = discount,
    picture = picture
)

fun BasketProductRemoteModel.basketToDomain() = ProductsInBasketModel(
    id = id,
    title = title,
    images = images,
    price = price
)

fun DetailsRemoteModel.detailsToDomain() = DetailsProductModel(
    cpu = cpu,
    camera = camera,
    capacity = capacity,
    color = color,
    id = id,
    images = images,
    isFavorites = isFavorites,
    price = price,
    rating = rating,
    sd = sd,
    ssd = ssd
)