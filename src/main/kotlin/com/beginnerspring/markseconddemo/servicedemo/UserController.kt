package com.beginnerspring.markseconddemo.servicedemo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/users1")
class UserController @Autowired constructor(private val userService: UserService) {
    // autowired means binding the controller to a service called userService impl of UserService interface

    data class User(val id: Long, val name: String, val surname: String, val birthDay: Date)

    @GetMapping("/execute") // access this thru localhost:9095/users/execute
    fun executeEndpoint(): String {
        userService.someMethod() // access this thru localhost:9095/users/execute
      return show()
    }

    fun show(): String = "IT IS EXECUTED"
}