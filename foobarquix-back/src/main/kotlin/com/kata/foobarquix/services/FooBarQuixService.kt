package com.kata.foobarquix.services

import org.springframework.stereotype.Component

@Component
class FooBarQuixService {

    fun convertNumber(inputNumber: Int): String {
        if(inputNumber%3==0) return "Foo";
        return inputNumber.toString();
    }

}