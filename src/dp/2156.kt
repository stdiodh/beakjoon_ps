package dp

import java.io.StreamTokenizer
import kotlin.math.max

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt()
    val arr = IntArray(n) { nextInt() }
    val dp = IntArray(n) { 0 }

    dp[0] = arr[0]

    if(n > 1){
        dp[1] = arr[0] + arr[1]
    }
    if(n > 2){
        dp[2] = max(arr[0] + arr[2], arr[1] + arr[2])
    }

    for(x in 3..< n){
        dp[x] = max(dp[x-3] + arr[x-1] + arr[x], dp[x-2] + arr[x])
    }

    print(dp.max())
}