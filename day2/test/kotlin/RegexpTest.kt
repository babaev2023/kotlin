import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RegexpTest {
    @Test
    fun regexpTest()
    {
        assertTrue {
            date("12 ФЕВ 2023")
        }

        assertFalse { date("12 ZZZ 2023") }
    }

}