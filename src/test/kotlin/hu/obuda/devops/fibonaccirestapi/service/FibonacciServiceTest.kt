package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn1WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(1, result)
    }

    @Test
    fun shouldReturn2WhenCall3(){
        var result: Int = underTest.fibonacci(3)
        Assertions.assertEquals(2, result)
    }

     @Test
     fun shouldReturn5WhenCall5(){
         var result: Int = underTest.fibonacci(5)
         Assertions.assertEquals(5, result)
     }

    @Test
    fun shouldReturn8WhenCall6(){
        var result: Int = underTest.fibonacci(6)
        Assertions.assertEquals(8, result)
    }

    // TODO - Test with greater numbers and test edge cases
}