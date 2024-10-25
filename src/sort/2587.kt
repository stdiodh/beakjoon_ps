package sort

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val arr = IntArray(5) { nextInt() }.sortedArray()
    println("${arr.average().toInt()}")
    println("${arr[2]}")
}