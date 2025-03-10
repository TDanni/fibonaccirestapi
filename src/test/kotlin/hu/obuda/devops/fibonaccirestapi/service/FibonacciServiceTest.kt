package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn0WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(1, result)
    }

    @Test
    fun `should return 0 when fibonacci is called with 0`() {
        val result = underTest.fibonacci(0)
        assertEquals(0, result)
    }

    @Test
    fun `should return 1 when fibonacci is called with 1`() {
        val result = underTest.fibonacci(1)
        assertEquals(1, result)
    }

    @Test
    fun `should return 55 when fibonacci is called with 10`() {
        val result = underTest.fibonacci(10)
        assertEquals(55, result)
    }

    @Test
    fun `should return 832040 when fibonacci is called with 30`() {
        val result = underTest.fibonacci(30)
        assertEquals(832040, result)
    }

    // TODO - Test with greater numbers and test edge cases
}