package greedy

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextLong() : Long { nextToken(); return nval.toLong() }

    val n = nextLong()
    //자연수의 갯수를 세줄 카운트
    var cnt = 0
    //자연수들의 합을 넣어줄 변수
    var ans = 0L

    while (true){
        cnt++
        ans += cnt
        if(ans > n){
            cnt--
            break
        }
    }
    print(cnt)
}