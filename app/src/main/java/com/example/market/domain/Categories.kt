package com.example.market.domain

import androidx.annotation.DrawableRes
import androidx.annotation.LayoutRes
import com.example.market.R
import com.example.market.base.Item

enum class Categories(
    @DrawableRes
    val value: Int,
    val title:String
): Item{
    PHONES(R.drawable.ic_phone_24, "Phones"),
    COMPUTER(R.drawable.ic_compute_24, "Computer"),
    HEALTH(R.drawable.ic_health_1_24, "Health"),
    BOOKS(R.drawable.ic_book_24, "Books"),
    TOOLS(R.drawable.ic_tools_24, "Tools"),
}

