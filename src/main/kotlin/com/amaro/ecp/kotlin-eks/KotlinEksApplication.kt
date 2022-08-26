package com.amaro.ecp.kotlin-eks

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.amaro.ecp.kotlin-eks")
class KotlinEksApplication

fun main(args: Array<String>) {
	runApplication<KotlinEksApplication>(*args)
}
