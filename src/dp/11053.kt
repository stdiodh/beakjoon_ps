package dp

import java.io.StreamTokenizer
import kotlin.math.max

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt()
    val arr = IntArray(n){ nextInt() }
    val dp = IntArray(n) { 1 }

    for(x in 0 ..< n){
        for(y in 0 ..< x){
            if(arr[x] > arr[y]){
                dp[x] = max(dp[x], dp[y] + 1)
            }
        }
    }
    print(dp.max())
}