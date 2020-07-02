package com.publicept.a001_kotlin_fundamentals

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class `12_LambdaUnitTest` {

    /**
     * Lambda
     */
    //Lambdas can be used in Kotlin in the same way as in other //programming languages
    // Kotlin forEach definition:
    // inline fun IntArray.forEach(action: (Int) -> Unit)
    // the (Int) -> Unit is called function type (forEach expects
    // a function)
    // you can provide a lambda for the function type (Unit meaning //nothing). Therefore, the lambda accepts an Int and returns //nothing.
    // You can use forEach with or without an explicit definition:
    //      intList.forEach {e-> print(e)}
    //      intList.forEach {print(it)}
    //"it" is the default name

    @Test
    fun testLambda() {
        var intList = MutableList<Int>(10) {1}
        // lambda
        intList.forEach { e
            -> print(e)     // 1111111111
        }
        println()

        // same with filter (to filter elements from the list)
        var strList : MutableList<String> = mutableListOf("A", "BB", "CCC", "DD", "EEEE")
        val filteredList = strList.filter { it.length <= 2 }
        println(filteredList)                     // [A, BB, DD]

        val starList = filteredList.map {"*$it*"}
        print(starList)                           // [*A*, *BB*, *DD*]

        println()
    }


    /**
     * Function as a parameter
     */
    // we define a function as parameter
    fun filterEMails(emails : List<String>, predicate : (String) -> (Boolean)) : List<String> {
        return emails.filter(predicate)
    }

    @Test
    fun testLambda3() {

        val listOfUsers = mutableListOf(
            "peter.muster@zhaw.ch",
            "paul.muster@google.com"
        )

        val filteredMails = filterEMails(listOfUsers) { value ->
            value.endsWith("@zhaw.ch")
        }

        println(filteredMails)      // [peter.muster@zhaw.ch]
    }
}