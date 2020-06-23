package ch.zhaw.helloworld

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testKotlin() {

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
         * Null Safety (optional values = nullable reference)
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