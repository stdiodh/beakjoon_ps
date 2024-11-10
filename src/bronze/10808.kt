package bronze

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextString() : String{ nextToken(); return sval}

    val input = nextString()
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val alphaArr = Array(26) { 0 }
    input.forEach { for(x in alphabet.indices) {if (it == alphabet[x]) { alphaArr[x]++ } } }
    val result = alphaArr.joinToString(" ")
    println(result)
}