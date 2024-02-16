package com.beginnerspring.markseconddemo.httpverbslogback

import com.beginnerspring.markseconddemo.servicedemo.UserController
import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.stereotype.Service
import java.util.*


@Service
class SecondUserServiceImpl : SecondUsersService {
    private val log = KotlinLogging.logger {}

    override fun getUser(name: String): UserController.User =
            UserController.User(1, name, "wifek", Date("2000/02/23"))

    override fun addUser(user: SecondController.User) =
            log.info { "${user.name},added!!!" }


    override fun updateUser(name: String, user: SecondController.User) =
            log.info { "$name,updated!!!" }


    override fun deleteUser(name: String) =
            log.info { "$name,deleted!!!" }

}