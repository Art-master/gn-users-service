package com.genappline.gnusersservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.web.reactive.config.EnableWebFlux

@SpringBootApplication
@EnableWebFlux
@EnableConfigurationProperties
class Application

fun main(args: Array<String>) {
	SpringApplication.run(Application::class.java, *args)
}
