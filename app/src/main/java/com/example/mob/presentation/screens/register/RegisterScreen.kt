package com.example.mob.presentation.screens.register

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mob.R
import org.w3c.dom.Text


@OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun RegisterScreen() {

        var user by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmPassword by remember { mutableStateOf("") }

        Column(modifier = Modifier.fillMaxSize().padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {


            Image(
                painter = painterResource(id = R.drawable.undflogo),
                contentDescription = "UnDF Logo.",
                Modifier.size(200.dp)
            )

            Text(
                text = "Mob",
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Normal,
                textAlign = TextAlign.Center,
                fontSize = 32.sp
            )

            Spacer(modifier = Modifier.padding(30.dp))

            Text(
                text = "Registrar",
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Normal,
                textAlign = TextAlign.Center,
                fontSize = 32.sp
            )

            Spacer(modifier = Modifier.padding(35.dp))

            TextField(
                value = user,
                onValueChange = {user = it},
                label = {Text("Usuário")},
                placeholder = {Text("Usuário")},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFFE9ECEF),
                    unfocusedContainerColor = Color(0xFFE9ECEF)
                )

            )

            Spacer(modifier = Modifier.padding(10.dp))

            TextField(
                value = email,
                onValueChange = {email = it},
                label = {Text("Email")},
                placeholder = {Text("user@email.com")},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFFE9ECEF),
                    unfocusedContainerColor = Color(0xFFE9ECEF)
                )
            )

            Spacer(modifier = Modifier.padding(10.dp))

            TextField(
                value = password,
                onValueChange = {password = it},
                label = {Text("Senha")},
                placeholder = {Text("Senha")},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFFE9ECEF),
                    unfocusedContainerColor = Color(0xFFE9ECEF)
                )
            )

            Spacer(modifier = Modifier.padding(10.dp))

            TextField(
                value = confirmPassword,
                onValueChange = {confirmPassword = it},
                label = {Text("Repetir Senha")},
                placeholder = {Text("Repetir Senha")},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFFE9ECEF),
                    unfocusedContainerColor = Color(0xFFE9ECEF)
                )
            )

            Spacer(modifier = Modifier.padding(10.dp))

            Button(onClick = {},
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF0077B6)
                ),
                modifier = Modifier.width(275.dp)
                    .height(55.dp)) {
                Text(text = "Registrar")
            }

            Spacer(modifier = Modifier.padding(10.dp))


            Text(text = "Já possui uma conta? Entrar")


        }
    }
