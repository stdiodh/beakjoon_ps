package string2

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    fun nextString() : String { nextToken(); return sval }

    val n = nextInt(); val m = nextInt()
    val wordMap = mutableMapOf<String, Int>()

    repeat(n){
        val word = nextString()
        if(word.length >= m){
            wordMap[word] = wordMap.getOrDefault(word, 0) + 1
        }
    }

    val sortedWords = wordMap.toList().sortedWith(compareByDescending<Pair<String, Int>> { it.second }
        .thenBy { -it.first.length }
        .thenBy { it.first })

    val result = sortedWords.joinToString("\n") { it.first }
    println(result)
}