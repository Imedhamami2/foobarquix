package com.kata.foobarquix.services

import org.springframework.stereotype.Component

@Component
class FooBarQuixService {
    private val divisors = mapOf(3 to "Foo", 5 to "Bar", 7 to "Quix")

    fun convertNumber(inputNumber: Int): String {

        for (key in divisors.keys) {
            if (inputNumber % key == 0) {
                return divisors[key].toString()
            }
        }

        return inputNumber.toString()
    }

}