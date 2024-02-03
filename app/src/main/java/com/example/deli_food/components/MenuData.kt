package com.example.deli_food.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter

data class DrawableStringPair(
    @DrawableRes val drawable : Int,
    @StringRes val text : Int

)
