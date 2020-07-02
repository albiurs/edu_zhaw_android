package com.publicept.a001_kotlin_fundamentals

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class `10_InheritanceUnitTest` {

    /**
     * Inheritance
     */
    // by default, all classes are final. If you want to inherit use
    // the open keyword (or sealed if all childs are within the same file
    open class Product (val name : String, val price : Double) {

        open fun getCompletePrice() : Double {
            return this.price;
        }
    }

    // you can access the parent class methods and properties by using
    // the "super" keyword. Note that we do not use val/var in
    // this constructor as this would declare (and override) the existing
    // properties from the parent class.
    open class ExpensiveProduct(name : String, price : Double) : Product(name, price) {

        override fun getCompletePrice() : Double {
            return super.getCompletePrice() * 1.2
        }
    }

    @Test
    fun testProducts() {
        var product = Product("egg", 1.0)
        println(product.name + ": " + product.getCompletePrice())                   // egg: 1.0

        var expensiveProduct = ExpensiveProduct("egg", 1.0)
        println(expensiveProduct.name + ": " + expensiveProduct.getCompletePrice()) // egg: 1.2
    }
}