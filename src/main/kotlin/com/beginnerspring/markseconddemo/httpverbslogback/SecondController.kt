package com.beginnerspring.markseconddemo.httpverbslogback

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class SecondController @Autowired constructor(private val secondUsersService: SecondUsersService) {

    data class User(val id: Long, val name: String, val surname: String, val birthDay: Date)

    //url: localhost:9095/secondtry?name=kotlin
    @GetMapping("/secondtry")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) = "Hello $name"

    @GetMapping("/users2")
    fun getUser(@RequestParam(value = "name") name: String) =
            secondUsersService.getUser(name)


    @PostMapping("/users2")
    fun addUser(@RequestBody user: User) =
            secondUsersService.addUser(user)


    @PutMapping("/users2")
    fun updateUser(@RequestParam(value = "name") name: String, @RequestBody user: User) =
            secondUsersService.updateUser(name, user)


    @DeleteMapping("/users2")
    fun deleteUser(@RequestParam(value = "name") name: String) =
            secondUsersService.deleteUser(name)
}