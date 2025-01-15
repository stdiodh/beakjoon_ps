package bronze

import java.io.StreamTokenizer

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    val n = nextInt()
    if(n == 1){
        print(1)
        return
    }
    var mod = 1
    var cnt = 1
    while(n > mod){
        mod += 6 * cnt
        cnt++
    }
    print(cnt)
}