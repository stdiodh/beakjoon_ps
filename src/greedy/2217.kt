package greedy

import java.io.StreamTokenizer
import kotlin.math.max

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt()
    val arr = IntArray(n) { nextInt() }.sortedArrayDescending()

    var ans = 0
    var result = arr[0]
    for(x in 0..< n){
        ans = arr[x] * (x + 1)
        result = max(ans, result)
    }
    print(result)
}