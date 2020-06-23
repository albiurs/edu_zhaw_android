package ch.zhaw.a0012_kotlin_loops

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
    fun loopTest() {

        /**
         * if and else
         */
        // if and else is similar to Java, but "if" is an expression
        // (last expression of a block is returned)
        // example 1
        var a = 1
        var b = 2
        var minimum = if (a < b) a else b
        println("minimum = ${minimum}")
        println()

        // example 2
        var error = 0
        var result = if (error == 1) {
            "No Connection"
        } else {
            null
        }
        println(result)


        /**
         * Comparision Operators
         */
        // ==, !=           equality operators -> translated to calls of equals() for non-primitive types
        // <, >, >=, <=     -> translated to compareTo for non-primitive types
        // [,]              indexed access operator -> translated to calls of get and set
        // ===, !==         referential equality operators


        /**
         * for-loops
         */
        // iterator based
        // similar to C# or Python

        //for (item in collection) print(item)

        // create your own range if you need an index
        for (i in 0..5) {
            print(i)        // 012345 -> start AND stop index!
        }
        println()

        // use a range expression to iterate
        // over integers (start..stop)
        //for (i in range 1..3) {print(i)}    // should print 123 -> doesn't work!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        // use negative steps
        for (i in 8 downTo 1) {print(i)}    // 87654321
        println()

        // add both with a step if needed
        for (i in 5 downTo 1 step 2) {print(i)} // 531
        println()
        println()


        /**
         * while-loops
         */
        // while and do-while as in Java
        var i : Int = 5
        while(i>0) {
            print(i)        // 54321
            i--
        }
        println()
        println()


        /**
         * when-switches
         */
        var api = 24
        when (api) {
            in 1..13 -> println("too old")
            24,25 -> println("Nougat")      // Nougat
            26 -> println("Oreo 8.0")
            27 -> println("Oreo 8.1")
            28 -> println("P")
            else -> {
                println("API level not found!")
            }
        }



    }
}