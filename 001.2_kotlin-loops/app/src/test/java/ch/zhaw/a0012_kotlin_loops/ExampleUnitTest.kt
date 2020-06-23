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
        var a = 1
        var b = 2
        var minimum = if (a < b) a else b
        println("minimum = ${minimum}")


    }
}