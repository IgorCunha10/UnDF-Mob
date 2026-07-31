package com.example.mob.presentation.model

import androidx.annotation.DrawableRes

data class Course(
    val id: Int,
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)
