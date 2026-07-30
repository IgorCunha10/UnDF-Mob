package com.example.mob.presentation.components

import android.R.attr.contentDescription
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mob.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Carousel() {
    data class CarouselItem(
        val id: Int,
        @DrawableRes val imageResId: Int,
        val contentDescription: String
    )

    val items = remember {
        listOf(
            CarouselItem(0, R.drawable.bannertwo,
                "Art-Banner"),
            CarouselItem(1, R.drawable.bannerthree,
                "Linguistcs-Banner"),
            CarouselItem(2, R.drawable.bannerone,
                "Banner-One"),
            CarouselItem(3, R.drawable.bannerfive, "Banner-Two")
        )
    }

    HorizontalMultiBrowseCarousel(
        state = rememberCarouselState{ items.count() },
        modifier = Modifier.fillMaxWidth()
            .wrapContentHeight()
            .padding(top = 48.dp, bottom = 16.dp),
        preferredItemWidth = 400.dp,
        itemSpacing = 8.dp,
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        i ->
        val item = items[i]

        Image(
            modifier = Modifier
                .height(205.dp)
                .maskClip(MaterialTheme.shapes.extraLarge),
            painter = painterResource(id = item.imageResId),
            contentDescription = item.contentDescription,
            contentScale = ContentScale.Crop
        )
    }
}