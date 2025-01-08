package dp

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt()
    if(n == 0){
        print(0)
        return
    }

    val dp = LongArray(91) { 0 }
    dp[1] = 1
    dp[2] = 1

    for(x in 3..n){
        dp[x] = dp[x-1] + dp[x-2]
    }
    print(dp[n])
}