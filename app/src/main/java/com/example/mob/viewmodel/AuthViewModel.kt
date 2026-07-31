package com.example.mob.viewmodel

import androidx.lifecycle.ViewModel
import com.example.mob.data.UserRepository

class AuthViewModel : ViewModel() {

    private val repository = UserRepository()

    fun register(
        name: String,
        email: String,
        password: String,
        onSuccess: () -> Unit
    ) {
        repository.register(
            name, email, password
        )

        onSuccess()
    }

    fun login(
        email: String,
        password: String,
        onSuccess: () -> Unit
    ) {
        val isValid = repository.login(
            email, password
        )

        if(isValid) {
            onSuccess()
        }

    }

}