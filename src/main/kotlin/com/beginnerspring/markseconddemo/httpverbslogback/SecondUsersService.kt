package com.beginnerspring.markseconddemo.httpverbslogback

import com.beginnerspring.markseconddemo.servicedemo.UserController

interface SecondUsersService {
    fun getUser(name: String): UserController.User
    fun addUser(user: SecondController.User)
    fun updateUser(name: String, user: SecondController.User)
    fun deleteUser(name: String)
}
