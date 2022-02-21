package VerificandoAnagramas

import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue


class TestadoAnagrama {

    @Test
    fun sampleTest() {
        val anagrams = Anagramas().VerificaAnagramas("ovo")
        assertEquals(2, anagrams)
    }

    @Test
    fun isAnagramTest(){
        assertTrue(Anagramas().isAnagram("ov", "vo"))
    }
}