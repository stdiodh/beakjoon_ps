package silver

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    fun nextString() : String {
        nextToken()
        return sval
    }

    val n = nextInt()
    val arr = Array (n) {nextString()}.distinct().sorted().sortedWith(compareBy{it.length})
    arr.forEach { println(it) }
}