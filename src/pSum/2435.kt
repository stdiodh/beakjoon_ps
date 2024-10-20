package pSum

import java.io.StreamTokenizer
import kotlin.math.max

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int {
        nextToken()
        return nval.toInt()
    }

    val n = nextInt(); val m = nextInt()
    val arr = IntArray(n){ nextInt() }

    var ans = -10000

    repeat(n-m+1) {i ->
        ans = max(ans, arr.slice(i .. i+m-1).sumOf { it })
    }
    println(ans)
}