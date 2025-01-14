package greedy

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt(); val l = nextInt()
    val pipe = Array(n) { nextInt() }.sortedArray()

    var now = 0
    var cnt = 0
    for(i in 0 until n) {
        if(pipe[i] > now) {
            cnt++
            now = pipe[i] + l - 1
        }
    }
    print(cnt)
}