package VerificandoAnagramas

class Anagramas {
    private var count: Int = 0

    fun VerificaAnagramas(s: String): Int {
        var count: Int = 0
        val substrings = hashMapOf<String, Int>()
        for(i in 0..s.length){
            for(j in i + 1..s.length){
                val substring = s.substring(i,j)
                //println(substring)
                //println(substrings)
                //println(sortedSubstring)
                val sortedSubstring = substring.toCharArray().sorted().joinToString("")
                substrings[sortedSubstring] = substrings[sortedSubstring]?.plus(1) ?: 1
                //println(substring)
                //println(substrings)
                //println(sortedSubstring)
            }
        }

        return substrings.values.sumBy { (it * (it - 1)) / 2}
        //println(substrings)
        //println(sortedSubstring)
    }


    fun isAnagram(s1: String, s2: String): Boolean {
        return s1.toCharArray().sorted().joinToString("").equals(
            s2.toCharArray().sorted().joinToString("")
        )

    }

}
