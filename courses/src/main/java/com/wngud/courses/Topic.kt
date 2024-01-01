package com.wngud.courses

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val courseNum: Int,
    @DrawableRes val imageResourceId: Int
)

