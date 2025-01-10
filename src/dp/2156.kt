package dp

import java.io.StreamTokenizer
import kotlin.math.max

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt()
    val grape = IntArray(n+2) { 0 }
    val dp = IntArray(n+2) { 0 }

    // 헷갈리지 않기 위해 인덱스 1부터 시작
    grape[0] = 0

    // 포도주 잔 입력
    for(i in 1 .. n){
        grape[i] = nextInt()
    }

    //초기값 설정
    dp[1] = grape[1]
    dp[2] = grape[1] + grape[2]

    //점화식
    for(i in 3 .. n){
        // 1번째 와인을 마시는 경우 중 최대 값
        val max = max(dp[i-3] + grape[i-1] + grape[i], dp[i-2] + grape[i])
        // 1번쨔 와인을 마시는 or 안 마시는 경우 중 최대 값
        dp[i] = max(dp[i-1], max)
    }

    print(dp[n])
}