package com.example.mob.presentation.screens.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mob.R

@Composable
fun HomeScreen() {

    Box(modifier = Modifier.fillMaxSize()
        .background(Color(0xFFFFFF))) {

        Box(modifier = Modifier.fillMaxWidth()
            .padding(top = 60.dp),
            ) {

            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically) {

                Icon(
                    painter = painterResource(id = R.drawable.profile ),
                    contentDescription = "User's Profile Picture",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(36.dp)
                )

                Spacer(modifier = Modifier.padding(5.dp))

                Text(text = "Bem vindo(a), Usuário.",
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp)

                Spacer(modifier = Modifier.padding(20.dp))

                Icon(
                    painter = painterResource(id = R.drawable.notification),
                    contentDescription = "Notification Icon",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(24.dp)


                )

            }
    }

    }

}