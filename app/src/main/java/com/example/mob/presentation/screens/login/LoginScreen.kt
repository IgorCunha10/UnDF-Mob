package com.example.mob.presentation.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mob.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
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

        Spacer(modifier = Modifier.padding(40.dp))

            Text(
            text = "Login",
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center,
            fontSize = 32.sp
        )

        Spacer(modifier = Modifier.padding(35.dp))

        TextField(
            state = rememberTextFieldState(),
            lineLimits = TextFieldLineLimits.SingleLine,
            label = {Text("Usuário")},
            placeholder = {Text("usuario@undf.edu.br")},
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0xFFE9ECEF),
                unfocusedContainerColor = Color(0xFFE9ECEF)
            )

        )

        Spacer(modifier = Modifier.padding(10.dp))

        TextField(
            state = rememberTextFieldState(),
            lineLimits = TextFieldLineLimits.SingleLine,
            label = {Text("Senha")},
            placeholder = {Text("Senha")},
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color(0xFFE9ECEF),
                unfocusedContainerColor = Color(0xFFE9ECEF)
            )
        )

        Spacer(modifier = Modifier.padding(10.dp))

        Text(text = "Esqueceu a senha?")

        Spacer(modifier = Modifier.padding(20.dp))

        Button(onClick = {},
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF0077B6)
            ),
            modifier = Modifier.width(275.dp)
                .height(55.dp)) {
            Text(text = "Login")
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Text(text = "Não tem uma conta? Registre-se")


    }
}