package com.beginnerspring.markseconddemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ControllerFile {
        //url: localhost:9095/try?name=kotlin
    @GetMapping("/try")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) = "Hello $name"

}