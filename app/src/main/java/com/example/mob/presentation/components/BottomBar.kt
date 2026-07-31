package com.example.mob.presentation.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun BottomBar() {

    NavigationBar {

    NavigationBarItem(
        selected = true,
        onClick = {},
        icon = {
            Icon(
                Icons.Default.Home,
                contentDescription = null
            )
        },
        label = {
            Text(text = "Home")
        }
    )

        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    Icons.Default.Person,
                    contentDescription = null
                )
            },
            label = {
                Text(text = "Profile")
            }
        )

        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    Icons.Default.Bookmark,
                    contentDescription = null
                )
            },
            label = {
                Text(text = "Saved")
            }
        )

        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    Icons.Default.Settings,
                    contentDescription = null
                )
            },
            label = {
                Text(text = "Settings")
            }
        )


    }

}