package com.ksantd.microserviceKotlin

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<MicroserviceKotlinApplication>().with(TestcontainersConfiguration::class).run(*args)
}
