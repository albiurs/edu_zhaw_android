package com.publicept.a001_kotlin_fundamentals

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class `02_OptionalsNullSafetyUnitTest` {

    @Test
    fun addition_isCorrect() {
        /**
         * Optionals / Null Safety (optional values = nullable reference)
         */
        // Kotlin's type system distinguishes between references that can become null and
        // those that cannot.
        // A nullable reference must end with a question mark!
        //var s : String = null // won't compile, as s is of type String and therefore cannot be null
        var s5 : String? = null // compiles correctly = optional value = nullable reference
        println(s5)     // = null
        // If you have a nullable reference, use the
        // elvis operator (?.) to safely access properties
        //var l5 : Int = s5.length    // doesn't compile (null pointer exception in Java)
        var l5 : Int? = s5?.length  // s5 can or cannot be null (s5?.length returns null), hence also l5 can or cannot be null
        println(l5)     // = null

        // use the !! operator if you want an Int
        var s6 : String = "World"
        //var l6 : Int = s5!!.length    // throws an exception, as s5 is null (equals to Java)
        var l6 : Int = s6!!.length      // compiles correctly, as s6 is not null
        println("l6 = $l6")             // = 'l6 = 5'

        // save down-casting with 'as?'
        //var s7 String? = "Hello Hello"
        var s7 : String? = null
        var i7 = s7 as? CharSequence    // save down-casting
        // will return null if down-casting fails
        println(i7)                     // = Hello Hello or null
        println()
    }

    @Test
    fun testOptionals() {
        val a = 1
        val b: Int = 1
        var c = 5
        var d: String = "5"
        var e: Int?
        var f: Int? = 5
        //a = c
        c = a
        c = d.toInt()
        //c = e
        //c = e!!
        c = f!!
    }
}