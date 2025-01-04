package dp

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }
    val t = nextInt()
    val dp = Array(15){ IntArray(15) { 0 } }

    for(x in 0 ..< 15){
        for(y in 0 ..< 15){
            if(x == 0 || y == 0){
                dp[x][y] = y + 1
            } else {
                dp[x][y] = dp[x-1][y] + dp[x][y-1]
            }
        }
    }
    for(i in 0 ..< t){
        val k = nextInt(); val n = nextInt()
        println(dp[k][n-1])
    }
}