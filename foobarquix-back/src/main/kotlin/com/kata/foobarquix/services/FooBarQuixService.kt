package com.kata.foobarquix.services

import org.springframework.stereotype.Component

@Component
class FooBarQuixService {
    private val divisors = mapOf(3 to "Foo", 5 to "Bar", 7 to "Quix")

    fun convertNumber(inputNumber: Int): String {
        val result = StringBuilder()

        for (key in divisors.keys) {
            if (inputNumber % key == 0 ) {
                result.append( divisors[key])
            }
        }
        val  numbers = inputNumber.toString().split("");
        for( number in numbers){
            if(number.equals("3")) return "Foo";
            if(number.equals("5")) return "Bar";
            if(number.equals("7")) return "Qix";
        }

        if(isDivisible(result)) return inputNumber.toString()
        return result.toString()



    }

    private fun isDivisible(result: StringBuilder) = ("").equals(result.toString())

}