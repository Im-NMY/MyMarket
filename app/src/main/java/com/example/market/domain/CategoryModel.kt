package com.example.market.domain

import androidx.annotation.DrawableRes
import com.example.market.base.Item

data class CategoryModel(
   @DrawableRes val category: Int,
   val title:String
) : Item