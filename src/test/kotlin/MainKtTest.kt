import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun actions1() {
        val z = "1 1"
        val expected = actions(z)

        val x = "1 2"
        val result = actions(x)

        assertEquals(result, expected)
    }

    @Test
    fun actions2() {
        val z = "1 2"
        val expected = actions(z)

        val x = "1 1"
        val result = actions(x)

        assertEquals(result, expected)
    }

    @Test
    fun actions3() {
        val z = "1 3"
        val expected = actions(z)

        val x = "2 1"
        val result = actions(x)

        assertEquals(result, expected)
    }

    @Test
    fun actions4() {
        val z = "2 1"
        val expected = actions(z)

        val x = "1 3"
        val result = actions(x)

        assertEquals(result, expected)
    }

    @Test
    fun actions5() {
        val z = "2 2"
        val expected = actions(z)

        val x = "2 3"
        val result = actions(x)

        assertEquals(result, expected)
    }

    @Test
    fun actions6() {
        val z = "2 3"
        val expected = actions(z)

        val x = "2 2"
        val result = actions(x)

        assertEquals(result, expected)
    }

    @Test
    fun actions7() {
        val z = "3 1"
        val expected = actions(z)

        val x = "3 2"
        val result = actions(x)

        assertEquals(result, expected)
    }

    @Test
    fun actions8() {
        val z = "3 3"
        val expected = actions(z)

        val x = "3 3"
        val result = actions(x)

        assertEquals(result, expected)
    }

    @Test
    fun actions9() {
        val z = "2 1"
        val expected = actions(z)

        val x = "3 2"
        val result = actions(x)

        assertEquals(result, expected)
    }

    @Test
    fun actions10() {
        val z = "3 2"
        val expected = actions(z)

        val x = "2 1"
        val result = actions(x)

        assertEquals(result, expected)
    }

    @Test
    fun actions11() {
        val z = "2 2"
        val expected = actions(z)

        val x = "2 3"
        val result = actions(x)

        assertEquals(result, expected)
    }

    @Test
    fun firstActions1() {
        val z = "2 1"
        val expected = firstActions(z)

        val x = "3 2"
        val result = firstActions(x)

        assertEquals(result, expected)
    }

    @Test
    fun firstActions2() {
        val z = "3 3"
        val expected = firstActions(z)

        val x = "2 1"
        val result = firstActions(x)

        assertEquals(result, expected)
    }

    @Test
    fun firstActions3() {
        val z = "2 2"
        val expected = firstActions(z)

        val x = "2 3"
        val result = firstActions(x)

        assertEquals(result, expected)
    }

    @Test
    fun firstActions4() {
        val z = "1 1"
        val expected = firstActions(z)

        val x = "1 3"
        val result = firstActions(x)

        assertEquals(result, expected)
    }

    @Test
    fun firstActions5() {
        val z = "3 1"
        val expected = firstActions(z)

        val x = "3 3"
        val result = firstActions(x)

        assertEquals(result, expected)
    }
}