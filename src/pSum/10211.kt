package pSum

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val sb = StringBuilder()
    val t = nextInt()
    repeat(t){
        val n = nextInt()
        val arr = IntArray(n) { nextInt() }

        var result = arr[0]
        var currentSum = arr[0]
        for (x in 1 ..< n){
            currentSum = maxOf(arr[x], currentSum + arr[x])
            result = maxOf(result, currentSum)
        }
        sb.appendLine(result)
    }
    print(sb)
}