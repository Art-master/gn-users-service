package com.genappline.gnusersservice.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("users/")
class UsersController {

    @GetMapping
    suspend fun getOne() {

    }
}