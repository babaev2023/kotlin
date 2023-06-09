import kotlin.test.Test
import kotlin.test.assertEquals

class TestGreet {

    @Test
    fun greetSvetaIvanova() =
        //Sveta Ivanova -> Hello, Sveta Ivanova

        assertEquals(expected = "Hello, Sveta Ivanova", actual = greeting("Sveta","Ivanova"))

}