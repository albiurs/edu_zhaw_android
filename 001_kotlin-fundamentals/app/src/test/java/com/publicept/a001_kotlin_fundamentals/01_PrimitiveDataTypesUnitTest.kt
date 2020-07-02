package com.publicept.a001_kotlin_fundamentals

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class `01_PrimitiveDataTypesUnitTest` {

    @Test
    fun primitiveTypesTest() {

        /**
         * Integer
         */
        // Int
        var i = 1
        println("result = " + (i+1))    // = result = 2
        println()


        /**
         * Casting / conversion of data types
         */
        // casting int.toDouble
        var d = i.toDouble()
        d *= 0.45
        println(d)  // = 0.45
        println()

        // casting int.toDouble 2
        var x = 10
        var y = 6
        var z = x.toDouble()    // z is 10.0 now
        x /= y      // int /= int = int -> no implicit conversion to double!
        println(x)  // = 1
        z /= y      // double /= int = double
        println(z)  // = 1.6666666666666667
        println()

        // casting int.toString
        var s = i.toString()
        s += s      // String concatenation
        println(s)  // = 11
        println()



        /**
         * Strings
         */
        // strings = char sequences
        s = "Hello World"
        println(s[1])   // = e -> 2nd character of the string
        // s[1] = 'c'      // error 'Unresolved Reference' -> strings are immutable in Kotlin
        println()

        // strings 2
        var s2 : String = "Hallo"
        var l : Int = s2.length      // = 5
        var c : Char = s2.get(0)     // = H
        var sc : String = s2 + s2     // = HalloHallo
        var su : CharSequence = s2.subSequence(0,2)  // = Ha
        // note that subSequence() returns a CharSequence
        // use .toString() to convert a CharSequence to a String
        println(s2)
        println(l)
        println(c)
        println(sc)
        println(su)
        val t = "Hallo"
        var b = s2 == t     // = true (no isEqual like Java)
        println(b)
        println()

        // string 3 - templates in Kotlin
        val i3 = 99
        var s3 : String = "Johnny ${i3}"  // or short $i
        println(s3)     // = Johnny 99
        // mask the $ with '' quotes if you need one:
        println("${'$'}123")    // = $123
        // templates also work with expressions:
        println("s3.length = ${s3.length}")  // = 's3.length = 9'
        // note that the template is compiled when the string is created:
        var i31 = 2
        var s31 = "Hello World ${i31}"
        i31 = 4
        println(s31)    // = 'Hello World 2' (not Hello World 4)
        println()

        // strings 4 - Triple-Double-Quotes
        // -> includes new lines (equals \n in Java):
        val tripleString = """
            Hello World!
            I'm getting introduced
            into Kotlin.
        """.trimIndent()
        println(tripleString)
        println()


        /**
         * Kotlin       vs.     Java        primitive data types
         */
        // Kotlin               Java
        // Int, Int?            int, Integer
        // Boolean, Boolean?    boolean, Boolean
        // Double, Double?      double, Double
        // String?              String


    }
}