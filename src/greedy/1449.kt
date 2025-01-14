package greedy

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt(); val l = nextInt()
    val pipe = Array(n) { nextInt() }.sortedArray()

    //테이프로 커버한 마지막 위치
    var now = 0
    //테이프 수
    var cnt = 0
    for(i in 0 until n) {
        //현재 테이프 범위를 벗어난 경우
        if(pipe[i] > now) {
            //테이프 사용 카운트 증가
            cnt++
            // 새로운 테이프를 붙이고 범위 갱신
            now = pipe[i] + l - 1
        }
    }
    print(cnt)
}