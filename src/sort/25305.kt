package sort

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val n = nextInt(); val k = nextInt()
    val arr = IntArray(n){nextInt()}.sortedArray()

    println(arr[n-k])
}