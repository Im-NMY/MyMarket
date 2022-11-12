package com.example.market.domain

import androidx.annotation.DrawableRes
import com.example.market.R
import com.example.market.base.Item

enum class Categories(
    @DrawableRes
    val value: Int
): Item{
    PHONES(R.layout.item_phones),
    COMPUTER(R.layout.item_computer),
    HEALTH(R.layout.item_health),
    BOOKS(R.layout.item_books),
    TOOLS(R.layout.item_tools),
}

