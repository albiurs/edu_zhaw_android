package ch.zhaw.hallowelt

import androidx.annotation.IntegerRes
import org.junit.Test

import org.junit.Assert.*
import kotlin.random.Random

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    /**
     * prints the GOL grid
     */
    fun printGrid(grid: MutableList<MutableList<Int>>) {
        for (y in 1..grid.size - 2) {
            for (x in 1..grid[0].size - 2) {
                val e = grid[y][x]
                print(e)
            }
            println()
        }
        println()
    }

    @Test
    fun GOL() {
        val gridWidth = 10
        val gridHeight = 5
    /*
        //Long
        var grid : MutableList<MutableList<Int>> = mutableListOf()
        for (y in 1..gridHeight + 2) {
            var innerList : MutableList<Int> = mutableListOf()
            for (x in 1..gridWidth + 2) {
                //check for border...
                //index starts with 1!
                if (x == 1 || y == 1 || x == gridWidth + 2 || y == gridHeight + 2) {
                   innerList.add(0)
                }
                else
                   innerList.add(Random.nextInt(0, 2))
            }
            grid.add(innerList)
        }
    */

    //compact
    var grid =
        MutableList<MutableList<Int>>(gridHeight + 2) { y ->
            MutableList<Int>(gridWidth + 2) { x ->
                //check for border...
                //index starts with 0!
                if (x == 0 || y == 0 || x == gridWidth + 1 || y == gridHeight + 1) {
                    0
                }
                else
                    Random.nextInt(0, 2)
            }
        }




        printGrid(grid)

        var newGrid =
            MutableList<MutableList<Int>>(gridHeight + 2) { index -> MutableList<Int>(gridWidth + 2) { index -> 0 } }

        for (y in 1..gridHeight) {
            for (x in 1..gridWidth) {
                var e = grid[y][x]
                var numNeibours =
                        grid[y - 1][x - 1] + grid[y][x - 1] + +grid[y + 1][x - 1] +
                        grid[y - 1][x] + grid[y + 1][x] +
                        grid[y - 1][x + 1] + grid[y][x + 1] + +grid[y + 1][x + 1]
                if ((numNeibours == 2 || numNeibours == 3) && e == 1) {
                    newGrid[y][x] = 1
                }
                if (numNeibours == 3 && e == 0) {
                    newGrid[y][x] = 1
                }
            }
        }

        printGrid(newGrid)
    }

    @Test
    fun testList() {
        var strList: MutableList<String> =
            mutableListOf("A", "BB", "CCC", "DD", "EEEE")
        print(strList.filter { it.length <= 2 })

        strList.removeAt(0)
        print(strList[0])
        if (strList.contains("c"))
            print("contains c")

    }

    @Test
    fun testOptionals() {
        val a = 1
        val b: Int = 1
        var c = 5
        var d: String = "5"
        var e: Int?
        var f: Int? = 5
        //a = c
        c = a
        c = d.toInt()
        //c = e
        //c = e!!
        c = f!!
    }


    @Test
    fun testListReference() {
        var l1 = mutableListOf<Int>(1, 2, 3, 4, 5)
        val l2 = l1
        l1[0] = 7
        print(l2)

    }


    @Test
    fun testParse() {
        val input = "123"

        val a = try {
            input.toInt()
        } catch (e: NumberFormatException) {
            null
        }
        print(a)
    }

    fun printString(message: String, tag1: String, tag2: String = "XXX") {
        println(tag1 + tag2 + message)
    }

    @Test
    fun testFunctions() {

        //named parameters (works both):
        printString(message = "Hallo Welt", tag1 = "APP")
        printString(tag1 = "APP", message = "Hallo Welt")
        printString(tag1 = "APP", tag2 = "APP", message = "Hallo Welt")
        //not named parameters (Java Style)
        printString("Hallo", "Welt")
    }


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
        print(p2.price)
    }


    data class Customer(var name: String, var age: Int, var orders: MutableList<String>)

    @Test
    fun TestDataClasses() {
        val c1 = Customer("Peter Muster", 43, mutableListOf("Order 1", "Order 2"))
        print(c1.orders)
        val c2 = c1.copy()
        c1.orders.add("Order 3")
        print(c2)
    }

    @Test
    fun testLambda1() {
        var strList: MutableList<String> =
            mutableListOf("A", "BB", "CCC", "DD", "EEEE")
        val filteredList = strList.filter {
            it.length <= 2 }

        print(filteredList)

        val starList = filteredList.map {"*$it*"}
        print(starList)
    }

    fun filterEMails(emails : List<String>,
                     predicate : (String) -> (Boolean)) : List<String> {
        return emails.filter(predicate)
    }


    @Test
    fun testLambda3() {

        val listOfUsers = mutableListOf("peter.muster@zhaw.ch",
            "paul.muster@google.com")

        val filteredMails = filterEMails(listOfUsers) { value ->
            value.endsWith("@zhaw.ch")
        }
    }
}
