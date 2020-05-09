package com.demo.azureService

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class MainApplication

fun main(args: Array<String>) {
        SpringApplication.run(MainApplication::class.java, *args)
}
