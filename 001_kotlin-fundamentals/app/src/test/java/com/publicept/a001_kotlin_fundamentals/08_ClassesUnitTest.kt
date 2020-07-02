package com.publicept.a001_kotlin_fundamentals

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class `08_ClassesUnitTest` {

    /**
     * Classes
     */
    class Product constructor(var name: String, price: Double) {
        var price: Double = price
            get() {
                return field * 0.91
            }
    }

    @Test
    fun testClasses() {
        val p1 = Product("Notepad 1A", 1200.0)
        var p2 = Product("Notepad 2A", 2100.0)
        p1.name = "xxx"
        println(p1.name + " " + p1.price)   // xxx 1092.0
        println(p2.name + " " + p2.price)   // Notepad 2A 1911.0
    }


    /**
     * Secondary Constructor
     */
    //You can add a secondary constructor if you like
    class Product2 constructor (name : String, price : Double) {
        val name = name
        val price = price
        //we add a third property "description". However, we need to //initialize it.
        var description = ""

        constructor(name: String, price: Double, description : String) : this(name, price) {
            //as we now change the value of "description", the
            // property must not be constant (val)
            this.description = description
        }
    }


    /**
     * Properties
     */
    //If you define your class with val parameters, you will
    // get properties automatically.
    class Product3 constructor (val name : String, val price : Double) {}

    @Test
    fun testProduct3() {
        println("Show Object Product3: " + Product3("Notepad 1A", 1200.0))
    }


    //getters and setters in Kotlin are done with accessors
    // accessors are get or set. Note that we need to define the
    // properties in our class
    class Customer constructor(var name: String, visitCounter : Int) {
        var visitCounter = visitCounter

        set(value) { //restrict visitCounter to positive values
            if (value >= 0) field = value //field references the backing field
        }

        get() = field
    }

    @Test
    fun testCustomer() {
        val customer = Customer("John Doe", 3)
        println("Customer Name: " + customer.name
                + ", Visit Counter : " + customer.visitCounter)     // vc = 3

        customer.visitCounter = 5
        println("Customer Name: " + customer.name
                + ", Visit Counter : " + customer.visitCounter)     // vc = 5

        customer.visitCounter = -2
        println("Customer Name: " + customer.name
                + ", Visit Counter : " + customer.visitCounter)     // vc = 5

    }
}