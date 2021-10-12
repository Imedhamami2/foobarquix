package com.kata.foobarquix

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import com.kata.foobarquix.services.FooBarQuixService
import org.junit.jupiter.api.Assertions.assertEquals

@SpringBootTest
class FooBarQuixApplicationTests {

	val fooBarQuixService = FooBarQuixService();

	@Test
	fun contextLoads() {
	}

	@Test
	fun should_return_input_as_string() {
		assertEquals("1", fooBarQuixService.convertNumber(1))
		assertEquals("13", fooBarQuixService.convertNumber(13))

	}
}
