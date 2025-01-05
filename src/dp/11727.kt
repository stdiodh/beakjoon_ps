package dp

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt()
    val dp = IntArray(1001) { 0 }

    dp[1] = 1
    dp[2] = 3
    for(x in 3..n){
        dp[x] = (dp[x-1] + dp[x-2] * 2) % 10007
    }
    print(dp[n])
}