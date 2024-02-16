package com.beginnerspring.markseconddemo.servicedemo

import org.springframework.stereotype.Service

@Service        // this is like @injectable or @component
// this means that this is a service that can be injected and this is a singleton
class UserServiceImpl: UserService {
    override fun someMethod(){
        println("this method is executed")
    }

}