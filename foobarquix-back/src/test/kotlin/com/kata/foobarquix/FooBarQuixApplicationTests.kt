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

	@Test
	fun should_foo_when_input_is_divisible_by_3(){
		assertEquals("Foo", fooBarQuixService.convertNumber(6));
	}

	@Test
	fun should_foo_when_input_is_divisible_by_5(){
		assertEquals("Bar", fooBarQuixService.convertNumber(10));
	}

	@Test
	fun should_foo_when_input_is_divisible_by_7(){
		assertEquals("Quix", fooBarQuixService.convertNumber(14));
	}

	@Test
	fun should_return_combination_of_foo_bar_qix(){
		assertEquals("FooBar",fooBarQuixService.convertNumber(3*5));
		assertEquals("BarQuix", fooBarQuixService.convertNumber(5*7));
		assertEquals("FooBarQuix", fooBarQuixService.convertNumber(3*5*7));
	}

	@Test
	fun should_replace_3_by_foo(){
		assertEquals("Foo", fooBarQuixService.convertNumber(13));

	}

	@Test
	fun should_replace_5_by_Bar(){
		assertEquals("Bar", fooBarQuixService.convertNumber(51));

	}

}
