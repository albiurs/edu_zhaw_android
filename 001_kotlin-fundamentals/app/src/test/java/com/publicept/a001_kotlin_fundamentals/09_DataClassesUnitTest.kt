package com.publicept.a001_kotlin_fundamentals

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class `09_DataClassesUnitTest` {

    /**
     * Data Classes
     */
    // if you define a class as data class,
    // you will get toString, equals, copy and hashCode automatically

    // some requirements:
    // the primary constructor needs to have at least one parameter
    //all primary constructor parameters need to be marked as val or var;
    // no abstract, open, sealed or inner data classes
    data class Customer(var name: String, var age: Int, var orders: MutableList<String>)

    @Test
    fun TestDataClasses() {
        val c1 = Customer("Peter Muster", 43, mutableListOf("Order 1", "Order 2"))
        println(c1.orders)          // [Order 1, Order 2]
        val c2 = c1.copy()
        c1.orders.add("Order 3")
        println(c2)                 // Customer(name=Peter Muster, age=43, orders=[Order 1, Order 2, Order 3])
    }


    //one problem with data classes is the custom getter/setter. As
    // the properties are generated automatically, you need to use a
    // backing field
    //Problem: using the underscore in the constructor isn't a good idea
    data class Customer2(val name: String, private var _age: Int) {
        var age: Int
        get() = _age
        set(value) {
            _age = value
        }
    }

    @Test
    fun testCustomer2() {
        var customer2 = Customer2("John", 25)
        println(customer2)      // Customer2(name=John, _age=25)

        customer2.age = 30
        println(customer2)      // Customer2(name=John, _age=30)
    }
}