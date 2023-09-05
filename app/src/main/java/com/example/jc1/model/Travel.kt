package com.example.jc1.model

import androidx.annotation.DrawableRes

data class Travel(
    val title:String,
    val price:Int,
    @DrawableRes val img:Int
)
