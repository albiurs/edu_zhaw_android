package com.publicept.a001_kotlin_fundamentals

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class `05_ListsUnitTest` {

    /**
     * Mutable List
     */
    @Test
    fun testList() {
        //there are powerful collection classes. This is an example
        // of a Kotlin mutable list
        var stringList : MutableList<String> = mutableListOf("a", "b", "c")

        /*
        stringList.add()
         */
        stringList.add("d")

        println(stringList[2]) //prints "c"
        println(stringList[3]) //prints "d"

        /*
        stringList.removeAt( index )
         */
        stringList.removeAt(0) //removes "a"

        println(stringList)
        println()
    }

    @Test
    fun testList2() {
        var strList: MutableList<String> = mutableListOf("A", "BB", "CCC", "DD", "EEEE")

        /*
        mutableList.filter { iterable.length <= x }
         */
        println(strList.filter { it.length <= 2 })  // [A, BB, DD]

        /*
        mutableList.removeAt()
         */
        strList.removeAt(0)
        println(strList[0])                         // BB

        /*
        mutableList.contains()
         */
        if (strList.contains("CCC")) {
            println("contains CCC")                 // contains CCC
        } else {
            println("doesn't contain CCC")
        }


    }

    /**
     * Immutable List
     */
    fun testImmutableList() {
        // there is also an immutable list
        var immutableList = listOf("Hallo", "Welt")

        //immutableList.add("xxx") //won't compile

        println(immutableList)
        println()
    }


    /**
     * List References
     */
    @Test
    fun testListReference() {
        var l1 = mutableListOf<Int>(1, 2, 3, 4, 5)
        var l2 = l1
        val l3 = l1
        l1[0] = 7

        println(l1)     // [7, 2, 3, 4, 5]
        println(l2)     // [7, 2, 3, 4, 5]
        println(l3)     // [7, 2, 3, 4, 5]
        println()
    }
}