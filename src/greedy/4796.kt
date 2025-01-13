package greedy

import java.io.StreamTokenizer
import kotlin.math.min

fun main() = with(StreamTokenizer(System.`in`.bufferedReader())){
    fun nextInt() : Int { nextToken(); return nval.toInt() }

    var cnt = 0
    while(true){
        val l = nextInt(); val p = nextInt(); val v = nextInt()
        if(l == 0 && p == 0 && v == 0){
            break
        }
        cnt++
        val tmp = (v / p) * l
        val remain = min(v % p, l)
        val ans = tmp + remain
        println("Case $cnt: $ans")
    }
}