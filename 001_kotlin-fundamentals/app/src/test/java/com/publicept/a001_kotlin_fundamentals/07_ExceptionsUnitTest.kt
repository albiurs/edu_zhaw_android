package com.publicept.a001_kotlin_fundamentals

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class `07_ExceptionsUnitTest` {

    /**
     * Try-Catch-Finally
     */
    @Test
    fun tryCatchFinally() {
        try {
            //your code that may throw an exception //comes here
        }
        catch(e: Exception) {
            //do something in case of an exception. As in Java,
            // all exceptions are descendants of Throwable
        }
        finally {
            //an optional final block that is executed in
            // any case
        }
    }


    /**
     * Parse
     */
    @Test
    fun testParse() {
        val input = "123"  // "xxx" -> null    // "123" -> 123

        val a = try {
            input.toInt()
        } catch (e: NumberFormatException) {
            null
        }
        println(a)          // "xxx" -> null    // "123" -> 123
        println()
    }


    @Test
    fun addition_isCorrect() {
        val input  = "xxx"  // "xxx" -> null    // "123" -> 123

        //However, there is one addition: try returns the last exception //or expression. You can use it in the following way:
        val a: Int? = try {
            Integer.parseInt(input)
        }
        catch (e: NumberFormatException) {
            null
        }
        println(a)          // "xxx" -> null    // "123" -> 123
        println()
    }


    //try
    //{
        //Kotlin does not have checked exceptions like Java:
        //public static int parseInt(String s)
        //    throws NumberFormatException

    //this will cause each usage of parseInt to either //catch the exception or rethrow it
}