package com.kata.foobarquix.services

import org.springframework.stereotype.Component

@Component
class FooBarQuixService {
    private val divisors = mapOf(3 to "Foo", 5 to "Bar", 7 to "Quix")

    fun convertNumber(inputNumber: Int): String {
        val result = StringBuilder()

        val inputAsString: String = inputNumber.toString()

        divisible(inputNumber, result)

        contains(inputAsString, result)

        if(isDivisible(result)) return inputNumber.toString()
        return result.toString()



    }

    private fun divisible(inputNumber: Int, result: StringBuilder) {
        for (key in divisors.keys) {
            if (inputNumber % key == 0) {
                result.append(divisors[key])
            }
        }
    }

    private fun contains(inputAsString: String, result: StringBuilder) {
        for (element in inputAsString) {
            val digitAsString = element.toString()
            val key = Integer.valueOf(digitAsString)
            if (divisors.keys.contains(key)) {
                result.append(divisors[key])
            }
        }
    }

    private fun isDivisible(result: StringBuilder) = ("").equals(result.toString())

}