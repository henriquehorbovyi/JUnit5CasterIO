package henrique.course.casterio.junit

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class PerMethodApproach {

    @Test
    fun test1(){
        println("Running test 1. This: $this")
    }

    @Test
    fun test2(){
        println("Running test 2. This: $this")
    }

    @Test
    fun test3(){
        println("Running test 3. This: $this")
    }
}