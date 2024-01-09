package com.wngud.superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @StringRes val name: Int,
    @StringRes val content: Int,
    @DrawableRes val imageResourceId: Int,
)
