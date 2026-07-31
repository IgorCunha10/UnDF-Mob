package com.example.mob.presentation.screens.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mob.R
import com.example.mob.presentation.components.TopCarousel

@Composable
fun HomeScreen() {

    Column(modifier = Modifier.fillMaxWidth()
        .absolutePadding(top = 40.dp, left = 25.dp, right = 20.dp)) {

        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start) {

            Image(
                painter = painterResource(R.drawable.profile),
                contentDescription = "Profile Icon",
                modifier = Modifier.size(24.dp)
            )

            Spacer(modifier = Modifier.absolutePadding(right = 10.dp))

            Text(text = "Bem vindo, Usuário",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.absolutePadding(right = 150.dp))

            Image(
                painter = painterResource(R.drawable.notification),
                contentDescription = "Notification Icon",
                modifier = Modifier.size(32.dp)
            )
        }

        TopCarousel()

    }

//    Spacer(modifier = Modifier.padding(40.dp))

}