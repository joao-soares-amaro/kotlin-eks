package com.amaro.ecp.kotlin-eks.gateways.controllers

import org.springframework.web.bind.annotation.*
import org.springframework.http.HttpStatus

@RestController
@RequestMapping("hello")
class HelloWorldController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getHello() = "Hi! I am on air."
}