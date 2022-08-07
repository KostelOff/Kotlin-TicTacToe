import org.junit.Test

import org.junit.Assert.*

class RulesClassTest {

    @Test
    fun motionX() {
        val x = "X"
        val result = RulesClass().motion(x)

        val expected = RulesClass().motion("X")

        assertEquals(expected.toString(), result.toString())
    }

    @Test
    fun motionY() {
        val x = "Y"
        val result = RulesClass().motion(x)

        val expected = RulesClass().motion("Y")

        assertEquals(expected.toString(), result.toString())
    }


    @Test
    fun pictures() {
        val result = RulesClass().pictureFun()
        val expected = RulesClass().pictureFun()

        assertEquals(result, expected)
    }
}