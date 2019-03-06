package henrique.course.casterio.junit

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class BeforeAndAfterEachTests {

    @BeforeEach fun beforeEachTest(){
        println("Called before each test")
    }

    @AfterEach fun afterEachTest(){
        println("Called after each test")
    }

    @Test fun test1(){
        println("Test one")
    }

    @Test fun test2(){
        println("Test two")
    }

    @Test fun test3(){
        println("Test three")
    }
}