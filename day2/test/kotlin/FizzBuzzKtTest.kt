import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FizzBuzzKtTest {
    @Test
    fun testFizzBuzz()
    {
        assertEquals("4:", fizzbuzz(4))
        assertEquals("3: Fizz", fizzbuzz(3))
        assertEquals("5: Buzz", fizzbuzz(5))
        assertEquals("15: FizzBuzz", fizzbuzz(15))
        assertEquals("100: Buzz", fizzbuzz(100))
    }
}