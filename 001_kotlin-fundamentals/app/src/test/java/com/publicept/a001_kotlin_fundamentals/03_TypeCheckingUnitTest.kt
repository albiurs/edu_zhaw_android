package com.publicept.a001_kotlin_fundamentals

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class `03_TypeCheckingUnitTest` {

    @Test
    fun addition_isCorrect() {

        /**
         * Type Checking and Castingn with is-operator
         */
        // is-operator will check the type of an instance
        // and automatically cast to String
        var obj : String = "Hello Object"

        if (obj is String) {                            // is-operator
            println("object.length = " + obj.length)    // = 'object.length = 12'
        }

        if (obj is String && obj.length == 12) {        // is-operator
            println(obj)                                // = 'Hello Object'
        }
        println()

        open class A {
            fun getX() : String {return "X"}
        }

        // B is child of A (inheritance)
        class B : A() {
            fun getY() : String {return "Y"}
        }

        var a8 = A()        // a8 is instance of A
        var b8 : A = B()    // b8 is static instance of A, but dynamic instance of with B

        // b8.getY()    // error -> method cannot be accessed without is-operator

        if (a8 is A) {          // is-operator
            println("a is A")
        }

        if (b8 is B) {          // is-operator
            println("b is B")
            println(b8.getY())  // correctly compiles due to type casting inside the block
        }

    }
}