package com.publicept.a001_kotlin_fundamentals

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class `06_FunctionsUnitTest` {

    /**
     * Functions
     * -> Cannot be executed as a Test!
     */
    fun printString(message : String, tag : String) {
        println(tag + message)
    }

    @Test
    fun runPrintString() {
        //you have named parameters (works both):
        printString(message = "Hallo Welt", tag = "APP ")   // APP Hallo Welt
        printString(tag = "APP ", message = "Hallo Welt")   // APP Hallo Welt
        println()
    }

    /**
     * Function return type
     */
    //the default return type is Unit. You can define another
    fun concatStrings(s1 : String, s2 : String) : String {
        return s1 + s2
    }

    @Test
    fun runconcatStrings() {
        println(concatStrings(s1 = "Hallo ", s2 = "World!"))

    }


    /**
     * Additional Example
     */
    fun printString2(message: String, tag1: String, tag2: String = "XXX") {
        println(tag1 + tag2 + message)
    }

    @Test
    fun testFunctions() {

        //named parameters (works both):
        printString2(message = "Hallo Welt", tag1 = "APP")                  // APPXXXHallo Welt
        printString2(tag1 = "APP", message = "Hallo Welt")                  // APPXXXHallo Welt
        printString2(tag1 = "APP", tag2 = "APP", message = "Hallo Welt")    // APPAPPHallo Welt
        //not named parameters (Java Style)
        printString2("Hallo", "Welt")                       // WeltXXXHallo
    }

}