package henrique.course.casterio.junit

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

/*
 * When this annotation (TestInstance and value PER_CLASS) is used you don't need to annotate the methods 'beforeAll' and 'afterAll'
 * as Static or put them inside a 'Companion Object'
 * */

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BeforeAndAfterAllTests {


    @BeforeAll
    fun beforeAll() {
        println("Called before all tests...")
    }

    @AfterAll
    fun afterAll() {
        println("Called after all tests...")
    }


    @Test
    fun test1() {
        println("Test one")
    }

    @Test
    fun test2() {
        println("Test two")
    }

    @Test
    fun test3() {
        println("Test three")
    }


}