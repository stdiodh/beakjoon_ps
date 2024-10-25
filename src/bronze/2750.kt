package bronze

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val n = nextInt()
    val arr = IntArray(n) {nextInt()}.sortedArray()
    arr.forEach { println(it) }
}