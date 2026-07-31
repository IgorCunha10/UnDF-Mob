package com.example.mob.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mob.presentation.screens.homescreen.HomeScreen
import com.example.mob.presentation.screens.login.LoginScreen
import com.example.mob.presentation.screens.register.RegisterScreen
import com.example.mob.viewmodel.AuthViewModel

@Composable
fun AppNavigation() {

    val navController = rememberNavController()
    val authViewModel: AuthViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") {
            LoginScreen(
                viewModel = authViewModel,

                onRegisterClick = {
                    navController.navigate("register")
                },
                onLoginSuccess = {
                    navController.navigate("home")
                }
            )
        }

        composable("register") {
            RegisterScreen(
                viewModel = authViewModel,
                onRegisterSuccess = {
                    navController.popBackStack()
                }
            )
        }

        composable("home") {
            HomeScreen()
        }
    }
}