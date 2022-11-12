package com.example.market.domain

import androidx.annotation.DrawableRes
import androidx.annotation.LayoutRes
import com.example.market.R
import com.example.market.base.Item

enum class Categories(
    @DrawableRes
    val value: Int
): Item{
    PHONES(R.drawable.ic_phone_24),
    COMPUTER(R.drawable.ic_compute_24),
    HEALTH(R.drawable.ic_health_1_24),
    BOOKS(R.drawable.ic_book_24),
    TOOLS(R.drawable.ic_tools_24),
}

