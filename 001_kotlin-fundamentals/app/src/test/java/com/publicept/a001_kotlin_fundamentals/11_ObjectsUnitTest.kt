package com.publicept.a001_kotlin_fundamentals

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class `11_ObjectsUnitTest` {

    //Kotlin supports Objects
    object SingletonObject {
        fun doThis() {
            print("Hello World")
        }
    }

    @Test
    fun testSingeltonObject() {
        var singletonObject = SingletonObject
        singletonObject.doThis()                // Hello World
    }
}