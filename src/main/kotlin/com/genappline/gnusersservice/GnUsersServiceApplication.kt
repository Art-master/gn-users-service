package com.genappline.gnusersservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.web.reactive.config.EnableWebFlux

@SpringBootApplication
@EnableWebFlux
@EnableConfigurationProperties
class TreeApplication

fun main(args: Array<String>) {
	SpringApplication.run(TreeApplication::class.java, *args)
}
