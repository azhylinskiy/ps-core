package com.pscore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class PsCoreApplication

fun main(args: Array<String>) {
	runApplication<PsCoreApplication>(*args)
}

data class HelloMessage(val id: Int, val text: String)

@RestController
class Hello {
	@GetMapping
	fun index(): List<HelloMessage> = listOf(
		HelloMessage(1, "Hello"),
		HelloMessage(2, "World")
	)
}
