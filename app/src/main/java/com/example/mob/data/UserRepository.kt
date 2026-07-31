package com.example.mob.data

import com.example.mob.presentation.model.User

class UserRepository {

    private var user: User? = null

    fun register(name: String,
                 email: String,
                 password: String) {

        user = User(
            name,
            email,
            password
        )
    }

    fun login(email: String,
              password: String) : Boolean {

                  return user?.email == email &&
                          user?.password == password
    }

}