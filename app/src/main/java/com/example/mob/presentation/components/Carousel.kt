package com.example.mob.presentation.components

import android.R.attr.contentDescription
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
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
fun TopCarousel() {
    data class CarouselItem(
        val id: Int,
        @DrawableRes val imageResId: Int,
        val contentDescription: String
    )

    val items = remember {
        listOf(
            CarouselItem(0, R.drawable.bannerone,
                "Banner-One"),
            CarouselItem(1, R.drawable.bannerfive,
                "Banner-Two"),
            CarouselItem(2, R.drawable.bannerthree,
                "Linguistics-Banner"),
            CarouselItem(3, R.drawable.bannertwo,
                "Art-Banner")

        )
    }

    HorizontalMultiBrowseCarousel(
        state = rememberCarouselState{ items.count() },
        modifier = Modifier.fillMaxWidth()
            .wrapContentHeight()
            .padding(top = 50.dp, bottom = 16.dp),
        preferredItemWidth = 400.dp,
        itemSpacing = 8.dp,
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        i ->
        val item = items[i]

        Image(
            modifier = Modifier
                .height(210.dp)
                .maskClip(MaterialTheme.shapes.extraLarge),
            painter = painterResource(id = item.imageResId),
            contentDescription = item.contentDescription,
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun MidCarousel() {

    val items = remember {

    }

}